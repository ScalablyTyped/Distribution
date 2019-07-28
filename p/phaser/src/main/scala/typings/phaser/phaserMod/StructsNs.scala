package typings.phaser.phaserMod

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Structs")
@js.native
object StructsNs extends js.Object {
  /**
    * List is a generic implementation of an ordered list which contains utility methods for retrieving, manipulating, and iterating items.
    */
  @js.native
  class List[T] protected ()
    extends typings.phaser.PhaserNs.StructsNs.List[T] {
    /**
      * 
      * @param parent The parent of this list.
      */
    def this(parent: js.Any) = this()
  }
  
  /**
    * The keys of a Map can be arbitrary values.
    * 
    * ```javascript
    * var map = new Map([
    *    [ 1, 'one' ],
    *    [ 2, 'two' ],
    *    [ 3, 'three' ]
    * ]);
    * ```
    */
  @js.native
  class Map[K, V] protected ()
    extends typings.phaser.PhaserNs.StructsNs.Map[K, V] {
    /**
      * 
      * @param elements An optional array of key-value pairs to populate this Map with.
      */
    def this(elements: js.Array[V]) = this()
  }
  
  /**
    * A Process Queue maintains three internal lists.
    * 
    * The `pending` list is a selection of items which are due to be made 'active' in the next update.
    * The `active` list is a selection of items which are considered active and should be updated.
    * The `destroy` list is a selection of items that were active and are awaiting being destroyed in the next update.
    * 
    * When new items are added to a Process Queue they are put in the pending list, rather than being added
    * immediately the active list. Equally, items that are removed are put into the destroy list, rather than
    * being destroyed immediately. This allows the Process Queue to carefully process each item at a specific, fixed
    * time, rather than at the time of the request from the API.
    */
  @js.native
  class ProcessQueue[T] ()
    extends typings.phaser.PhaserNs.StructsNs.ProcessQueue[T]
  
  /**
    * RBush is a high-performance JavaScript library for 2D spatial indexing of points and rectangles.
    * It's based on an optimized R-tree data structure with bulk insertion support.
    * 
    * Spatial index is a special data structure for points and rectangles that allows you to perform queries like
    * "all items within this bounding box" very efficiently (e.g. hundreds of times faster than looping over all items).
    * 
    * This version of RBush uses a fixed min/max accessor structure of `[ '.left', '.top', '.right', '.bottom' ]`.
    * This is to avoid the eval like function creation that the original library used, which caused CSP policy violations.
    * 
    * rbush is forked from https://github.com/mourner/rbush by Vladimir Agafonkin
    */
  @js.native
  class RTree ()
    extends typings.phaser.PhaserNs.StructsNs.RTree
  
  /**
    * A Set is a collection of unique elements.
    */
  @js.native
  /**
    * 
    * @param elements An optional array of elements to insert into this Set.
    */
  class Set[T] ()
    extends typings.phaser.PhaserNs.StructsNs.Set[T] {
    def this(elements: js.Array[T]) = this()
  }
  
  /**
    * The Size component allows you to set `width` and `height` properties and define the relationship between them.
    * 
    * The component can automatically maintain the aspect ratios between the two values, and clamp them
    * to a defined min-max range. You can also control the dominant axis. When dimensions are given to the Size component
    * that would cause it to exceed its min-max range, the dimensions are adjusted based on the dominant axis.
    */
  @js.native
  /**
    * 
    * @param width The width of the Size component. Default 0.
    * @param height The height of the Size component. If not given, it will use the `width`. Default width.
    * @param aspectMode The aspect mode of the Size component. Defaults to 0, no mode. Default 0.
    * @param parent The parent of this Size component. Can be any object with public `width` and `height` properties. Dimensions are clamped to keep them within the parent bounds where possible. Default null.
    */
  class Size ()
    extends typings.phaser.PhaserNs.StructsNs.Size {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, aspectMode: integer) = this()
    def this(width: Double, height: Double, aspectMode: integer, parent: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object Size extends js.Object {
    /**
      * The width and height are automatically adjusted to make the size cover the entire target area while keeping the aspect ratio. This may extend further out than the target size.
      */
    val ENVELOP: integer = js.native
    /**
      * The width and height are automatically adjusted to fit inside the given target area, while keeping the aspect ratio. Depending on the aspect ratio there may be some space inside the area which is not covered.
      */
    val FIT: integer = js.native
    /**
      * The width is automatically adjusted based on the height.
      */
    val HEIGHT_CONTROLS_WIDTH: integer = js.native
    /**
      * Do not make the size fit the aspect ratio. Change the ratio when the size changes.
      */
    val NONE: integer = js.native
    /**
      * The height is automatically adjusted based on the width.
      */
    val WIDTH_CONTROLS_HEIGHT: integer = js.native
  }
  
}

