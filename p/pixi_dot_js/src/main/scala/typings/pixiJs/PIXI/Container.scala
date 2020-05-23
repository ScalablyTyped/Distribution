package typings.pixiJs.PIXI

import typings.pixiJs.pixiJsStrings.added
import typings.pixiJs.pixiJsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Container represents a collection of display objects.
  *
  * It is the base class of all display objects that act as a container for other objects (like Sprites).
  *
  *```js
  * let container = new PIXI.Container();
  * container.addChild(sprite);
  * ```
  *
  * @class
  * @extends PIXI.DisplayObject
  * @memberof PIXI
  */
@js.native
trait Container extends DisplayObject {
  /**
    * The array of children of this container.
    *
    * @member {PIXI.DisplayObject[]} PIXI.Container#children
    * @readonly
    */
  val children: js.Array[DisplayObject] = js.native
  /**
    * The height of the Container, setting this will actually modify the scale to achieve the value set
    *
    * @member {number}
    */
  var height: Double = js.native
  /**
    * Determines if the children to the displayObject can be clicked/touched
    * Setting this to false allows PixiJS to bypass a recursive `hitTest` function
    *
    * @member {boolean}
    * @memberof PIXI.Container#
    */
  var interactiveChildren: Boolean = js.native
  /**
    * Should children be sorted by zIndex at the next updateTransform call.
    * Will get automatically set to true if a new child is added, or if a child's zIndex changes.
    *
    * @member {boolean} PIXI.Container#sortDirty
    */
  var sortDirty: Boolean = js.native
  /**
    * If set to true, the container will sort its children by zIndex value
    * when updateTransform() is called, or manually if sortChildren() is called.
    *
    * This actually changes the order of elements in the array, so should be treated
    * as a basic solution that is not performant compared to other solutions,
    * such as @link https://github.com/pixijs/pixi-display
    *
    * Also be aware of that this may not work nicely with the addChildAt() function,
    * as the zIndex sorting may cause the child to automatically sorted to another position.
    *
    * @see PIXI.settings.SORTABLE_CHILDREN
    *
    * @member {boolean} PIXI.Container#sortableChildren
    */
  var sortableChildren: Boolean = js.native
  /**
    * The width of the Container, setting this will actually modify the scale to achieve the value set
    *
    * @member {number}
    */
  var width: Double = js.native
  /**
    * Recalculates the bounds of the object. Override this to
    * calculate the bounds of the specific object (not including children).
    *
    * @protected
    */
  /* protected */ def _calculateBounds(): Unit = js.native
  /**
    * To be overridden by the subclasses.
    *
    * @protected
    * @param {PIXI.Renderer} renderer - The renderer
    */
  /* protected */ def _render(renderer: Renderer): Unit = js.native
  /**
    * Adds one or more children to the container.
    *
    * Multiple items can be added like so: `myContainer.addChild(thingOne, thingTwo, thingThree)`
    *
    * @param {...PIXI.DisplayObject} child - The DisplayObject(s) to add to the container
    * @return {PIXI.DisplayObject} The first child that was added.
    */
  def addChild[TChildren /* <: js.Array[DisplayObject] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param child because its type TChildren is not an array type */ child: TChildren
  ): /* import warning: importer.ImportType#apply Failed type conversion: TChildren[0] */ js.Any = js.native
  /**
    * Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown
    *
    * @param {PIXI.DisplayObject} child - The child to add
    * @param {number} index - The index to place the child in
    * @return {PIXI.DisplayObject} The child that was added.
    */
  def addChildAt[T /* <: DisplayObject */](child: T, index: Double): T = js.native
  def destroy(options: typings.pixiJs.anon.BaseTexture): Unit = js.native
  /**
    * Returns the child at the specified index
    *
    * @param {number} index - The index to get the child at
    * @return {PIXI.DisplayObject} The child at the given index, if any.
    */
  def getChildAt(index: Double): DisplayObject = js.native
  /**
    * Returns the display object in the container.
    *
    * @method getChildByName
    * @memberof PIXI.Container#
    * @param {string} name - Instance name.
    * @return {PIXI.DisplayObject} The child with the specified name.
    */
  def getChildByName(name: String): DisplayObject = js.native
  /**
    * Returns the index position of a child DisplayObject instance
    *
    * @param {PIXI.DisplayObject} child - The DisplayObject instance to identify
    * @return {number} The index position of the child display object to identify
    */
  def getChildIndex(child: DisplayObject): Double = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  @JSName("off")
  def off_added(event: added): this.type = js.native
  @JSName("off")
  def off_added(event: added, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_added(event: added, fn: js.Function, context: js.Any): this.type = js.native
  @JSName("off")
  def off_removed(event: removed): this.type = js.native
  @JSName("off")
  def off_removed(event: removed, fn: js.Function): this.type = js.native
  @JSName("off")
  def off_removed(event: removed, fn: js.Function, context: js.Any): this.type = js.native
  /**
    * Overridable method that can be used by Container subclasses whenever the children array is modified
    *
    * @protected
    */
  /* protected */ def onChildrenChange(): Unit = js.native
  @JSName("on")
  def on_added(event: added, fn: js.Function1[/* displayObject */ DisplayObject, Unit]): this.type = js.native
  @JSName("on")
  def on_added(event: added, fn: js.Function1[/* displayObject */ DisplayObject, Unit], context: js.Any): this.type = js.native
  @JSName("on")
  def on_removed(event: removed, fn: js.Function1[/* displayObject */ DisplayObject, Unit]): this.type = js.native
  @JSName("on")
  def on_removed(event: removed, fn: js.Function1[/* displayObject */ DisplayObject, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_added(event: added, fn: js.Function1[/* displayObject */ DisplayObject, Unit]): this.type = js.native
  @JSName("once")
  def once_added(event: added, fn: js.Function1[/* displayObject */ DisplayObject, Unit], context: js.Any): this.type = js.native
  @JSName("once")
  def once_removed(event: removed, fn: js.Function1[/* displayObject */ DisplayObject, Unit]): this.type = js.native
  @JSName("once")
  def once_removed(event: removed, fn: js.Function1[/* displayObject */ DisplayObject, Unit], context: js.Any): this.type = js.native
  /**
    * Removes one or more children from the container.
    *
    * @param {...PIXI.DisplayObject} child - The DisplayObject(s) to remove
    * @return {PIXI.DisplayObject} The first child that was removed.
    */
  def removeChild[TChildren /* <: js.Array[DisplayObject] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param child because its type TChildren is not an array type */ child: TChildren
  ): /* import warning: importer.ImportType#apply Failed type conversion: TChildren[0] */ js.Any = js.native
  /**
    * Removes a child from the specified index position.
    *
    * @param {number} index - The index to get the child from
    * @return {PIXI.DisplayObject} The child that was removed.
    */
  def removeChildAt(index: Double): DisplayObject = js.native
  /**
    * Removes all children from this container that are within the begin and end indexes.
    *
    * @param {number} [beginIndex=0] - The beginning position.
    * @param {number} [endIndex=this.children.length] - The ending position. Default value is size of the container.
    * @returns {PIXI.DisplayObject[]} List of removed children
    */
  def removeChildren(): js.Array[DisplayObject] = js.native
  def removeChildren(beginIndex: Double): js.Array[DisplayObject] = js.native
  def removeChildren(beginIndex: Double, endIndex: Double): js.Array[DisplayObject] = js.native
  /**
    * Render the object using the WebGL renderer and advanced features.
    *
    * @protected
    * @param {PIXI.Renderer} renderer - The renderer
    */
  /* protected */ def renderAdvanced(renderer: Renderer): Unit = js.native
  /**
    * Changes the position of an existing child in the display object container
    *
    * @param {PIXI.DisplayObject} child - The child DisplayObject instance for which you want to change the index number
    * @param {number} index - The resulting index number for the child display object
    */
  def setChildIndex(child: DisplayObject, index: Double): Unit = js.native
  /**
    * Sorts children by zIndex. Previous order is mantained for 2 children with the same zIndex.
    */
  def sortChildren(): Unit = js.native
  /**
    * Swaps the position of 2 Display Objects within this container.
    *
    * @param {PIXI.DisplayObject} child - First display object to swap
    * @param {PIXI.DisplayObject} child2 - Second display object to swap
    */
  def swapChildren(child: DisplayObject, child2: DisplayObject): Unit = js.native
}

