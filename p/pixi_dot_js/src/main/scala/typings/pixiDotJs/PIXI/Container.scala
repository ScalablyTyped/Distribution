package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.interaction.InteractionEvent
import typings.pixiDotJs.pixiDotJsStrings.added
import typings.pixiDotJs.pixiDotJsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Container represents a collection of display objects.
  *
  * It is the base class of all display objects that act as a container for other objects.
  *
  * ```js
  *  let container = new PIXI.Container();
  *  container.addChild(sprite);
  *  ```
  */
@JSGlobal("PIXI.Container")
@js.native
class Container () extends DisplayObject {
  // end extras.getChildByName
  var children: js.Array[DisplayObject] = js.native
  var height: Double = js.native
  var width: Double = js.native
  /**
    * Recalculates the bounds of the object. Override this to
    * calculate the bounds of the specific object (not including children).
    *
    */
  /* protected */ def _calculateBounds(): Unit = js.native
  /* protected */ def _renderCanvas(renderer: CanvasRenderer): Unit = js.native
  /* protected */ def _renderWebGL(renderer: WebGLRenderer): Unit = js.native
  def addChild[T /* <: DisplayObject */](children: T*): T = js.native
  /**
    * Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown
    *
    * @param child - The child to add
    * @param index - The index to place the child in
    * @return The child that was added.
    */
  def addChildAt[T /* <: DisplayObject */](child: T, index: Double): T = js.native
  /**
    * Recalculates the bounds of the container.
    */
  def calculateBounds(): Unit = js.native
  /* protected */ def containerUpdateTransform(): Unit = js.native
  def destroy(options: Boolean): Unit = js.native
  def destroy(options: DestroyOptions): Unit = js.native
  /**
    * Returns the child at the specified index
    *
    * @param index - The index to get the child at
    * @return The child at the given index, if any.
    */
  def getChildAt[T /* <: DisplayObject */](index: Double): T = js.native
  // begin extras.getChildByName
  /**
    * Returns the display object in the container
    *
    * @param name - instance name
    * @return The child with the specified name.
    */
  def getChildByName[T /* <: DisplayObject */](name: String): T = js.native
  /**
    * Returns the index position of a child DisplayObject instance
    *
    * @param child - The DisplayObject instance to identify
    * @return The index position of the child display object to identify
    */
  def getChildIndex(child: DisplayObject): Double = js.native
  @JSName("off")
  def off_added(event: added): this.type = js.native
  @JSName("off")
  def off_added(event: added, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_added(event: added, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  @JSName("off")
  def off_removed(event: removed): this.type = js.native
  @JSName("off")
  def off_removed(event: removed, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  @JSName("off")
  def off_removed(event: removed, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
  /* protected */ def onChildrenChange(args: js.Any*): Unit = js.native
  @JSName("on")
  def on_added(event: added, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_added(event: added, fn: js.Function1[/* event */ InteractionEvent, Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_removed(event: removed, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  @JSName("on")
  def on_removed(event: removed, fn: js.Function1[/* event */ InteractionEvent, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_added(event: added, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_added(event: added, fn: js.Function1[/* event */ InteractionEvent, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_removed(event: removed, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_removed(event: removed, fn: js.Function1[/* event */ InteractionEvent, Unit], context: js.Any): this.type = js.native
  def removeChild[T /* <: DisplayObject */](child: DisplayObject): T = js.native
  /**
    * Removes a child from the specified index position.
    *
    * @param index - The index to get the child from
    * @return The child that was removed.
    */
  def removeChildAt[T /* <: DisplayObject */](index: Double): T = js.native
  /**
    * Removes all children from this container that are within the begin and end indexes.
    *
    * @param [beginIndex=0] - The beginning position.
    * @param [endIndex=this.children.length] - The ending position. Default value is size of the container.
    * @returns List of removed children
    */
  def removeChildren[T /* <: DisplayObject */](): js.Array[T] = js.native
  def removeChildren[T /* <: DisplayObject */](beginIndex: Double): js.Array[T] = js.native
  def removeChildren[T /* <: DisplayObject */](beginIndex: Double, endIndex: Double): js.Array[T] = js.native
  def renderAdvancedWebGL(renderer: WebGLRenderer): Unit = js.native
  /**
    * Changes the position of an existing child in the display object container
    *
    * @param child - The child DisplayObject instance for which you want to change the index number
    * @param index - The resulting index number for the child display object
    */
  def setChildIndex(child: DisplayObject, index: Double): Unit = js.native
  /**
    * Swaps the position of 2 Display Objects within this container.
    *
    * @param child - First display object to swap
    * @param child2 - Second display object to swap
    */
  def swapChildren(child: DisplayObject, child2: DisplayObject): Unit = js.native
}

