package typings.pixiDisplay

import typings.pixiCore.mod.Rectangle
import typings.pixiCore.mod.Renderer
import typings.pixiDisplay.libDisplayObjectMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Container * / any */ @JSImport("@pixi/display/lib/Container", "Container")
  @js.native
  open class Container[T /* <: DisplayObject */] () extends DisplayObject {
    
    /**
      * Recalculates the content bounds of this object. This should be overriden to
      * calculate the bounds of this specific object (not including children).
      * @protected
      */
    /* protected */ def _calculateBounds(): Unit = js.native
    
    /* protected */ var _height: Double = js.native
    
    /**
      * To be overridden by the subclasses.
      * @param _renderer - The renderer
      */
    /* protected */ def _render(_renderer: Renderer): Unit = js.native
    
    /**
      * Renders this object and its children with culling.
      * @protected
      * @param {PIXI.Renderer} renderer - The renderer
      */
    /* protected */ def _renderWithCulling(renderer: Renderer): Unit = js.native
    
    /* protected */ var _width: Double = js.native
    
    /**
      * Adds one or more children to the container.
      *
      * Multiple items can be added like so: `myContainer.addChild(thingOne, thingTwo, thingThree)`
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to add to the container
      * @returns {PIXI.DisplayObject} - The first child that was added.
      */
    def addChild[U /* <: js.Array[T] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown
      * @param {PIXI.DisplayObject} child - The child to add
      * @param {number} index - The index to place the child in
      * @returns {PIXI.DisplayObject} The child that was added.
      */
    def addChildAt[U /* <: T */](child: U, index: Double): U = js.native
    
    /**
      * The array of children of this container.
      * @readonly
      */
    val children: js.Array[T] = js.native
    
    def containerUpdateTransform(): Unit = js.native
    
    /**
      * Returns the child at the specified index
      * @param index - The index to get the child at
      * @returns - The child at the given index, if any.
      */
    def getChildAt(index: Double): T = js.native
    
    /**
      * Returns the index position of a child DisplayObject instance
      * @param child - The DisplayObject instance to identify
      * @returns - The index position of the child display object to identify
      */
    def getChildIndex(child: T): Double = js.native
    
    def getLocalBounds(rect: Unit, skipChildrenUpdate: Boolean): Rectangle = js.native
    def getLocalBounds(rect: Rectangle, skipChildrenUpdate: Boolean): Rectangle = js.native
    
    /** The height of the Container, setting this will actually modify the scale to achieve the value set. */
    def height: Double = js.native
    def height_=(value: Double): Unit = js.native
    
    /**
      * Overridable method that can be used by Container subclasses whenever the children array is modified.
      * @param _length
      */
    /* protected */ def onChildrenChange(): Unit = js.native
    /* protected */ def onChildrenChange(_length: Double): Unit = js.native
    
    /**
      * Removes one or more children from the container.
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to remove
      * @returns {PIXI.DisplayObject} The first child that was removed.
      */
    def removeChild[U /* <: js.Array[T] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Removes a child from the specified index position.
      * @param index - The index to get the child from
      * @returns The child that was removed.
      */
    def removeChildAt(index: Double): T = js.native
    
    /**
      * Removes all children from this container that are within the begin and end indexes.
      * @param beginIndex - The beginning position.
      * @param endIndex - The ending position. Default value is size of the container.
      * @returns - List of removed children
      */
    def removeChildren(): js.Array[T] = js.native
    def removeChildren(beginIndex: Double): js.Array[T] = js.native
    def removeChildren(beginIndex: Double, endIndex: Double): js.Array[T] = js.native
    def removeChildren(beginIndex: Unit, endIndex: Double): js.Array[T] = js.native
    
    /**
      * Render the object using the WebGL renderer and advanced features.
      * @param renderer - The renderer
      */
    /* protected */ def renderAdvanced(renderer: Renderer): Unit = js.native
    
    /**
      * Changes the position of an existing child in the display object container
      * @param child - The child DisplayObject instance for which you want to change the index number
      * @param index - The resulting index number for the child display object
      */
    def setChildIndex(child: T, index: Double): Unit = js.native
    
    /** Sorts children by zIndex. Previous order is maintained for 2 children with the same zIndex. */
    def sortChildren(): Unit = js.native
    
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
      * @see PIXI.settings.SORTABLE_CHILDREN
      */
    var sortableChildren: Boolean = js.native
    
    /**
      * Swaps the position of 2 Display Objects within this container.
      * @param child - First display object to swap
      * @param child2 - Second display object to swap
      */
    def swapChildren(child: T, child2: T): Unit = js.native
    
    /** The width of the Container, setting this will actually modify the scale to achieve the value set. */
    def width: Double = js.native
    def width_=(value: Double): Unit = js.native
  }
}
