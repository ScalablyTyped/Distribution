package typings.phaser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Structs {
  
  object Events {
    
    /**
      * The Process Queue Add Event.
      * 
      * This event is dispatched by a Process Queue when a new item is successfully moved to its active list.
      * 
      * You will most commonly see this used by a Scene's Update List when a new Game Object has been added.
      * 
      * In that instance, listen to this event from within a Scene using: `this.sys.updateList.on('add', listener)`.
      */
    @JSImport("phaser", "Structs.Events.PROCESS_QUEUE_ADD")
    @js.native
    val PROCESS_QUEUE_ADD: String = js.native
    
    /**
      * The Process Queue Remove Event.
      * 
      * This event is dispatched by a Process Queue when a new item is successfully removed from its active list.
      * 
      * You will most commonly see this used by a Scene's Update List when a Game Object has been removed.
      * 
      * In that instance, listen to this event from within a Scene using: `this.sys.updateList.on('remove', listener)`.
      */
    @JSImport("phaser", "Structs.Events.PROCESS_QUEUE_REMOVE")
    @js.native
    val PROCESS_QUEUE_REMOVE: String = js.native
  }
  
  /**
    * List is a generic implementation of an ordered list which contains utility methods for retrieving, manipulating, and iterating items.
    */
  @JSImport("phaser", "Structs.List")
  @js.native
  open class List[T] protected ()
    extends StObject
       with typings.phaser.Phaser.Structs.List[T] {
    /**
      * 
      * @param parent The parent of this list.
      */
    def this(parent: Any) = this()
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
  @JSImport("phaser", "Structs.Map")
  @js.native
  open class Map[K, V] protected ()
    extends StObject
       with typings.phaser.Phaser.Structs.Map[K, V] {
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
  @JSImport("phaser", "Structs.ProcessQueue")
  @js.native
  open class ProcessQueue[T] ()
    extends StObject
       with typings.phaser.Phaser.Structs.ProcessQueue[T]
  
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
  @JSImport("phaser", "Structs.RTree")
  @js.native
  open class RTree ()
    extends StObject
       with typings.phaser.Phaser.Structs.RTree
  
  /**
    * A Set is a collection of unique elements.
    */
  @JSImport("phaser", "Structs.Set")
  @js.native
  /**
    * 
    * @param elements An optional array of elements to insert into this Set.
    */
  open class Set[T] ()
    extends StObject
       with typings.phaser.Phaser.Structs.Set[T] {
    def this(elements: js.Array[T]) = this()
  }
  
  /**
    * The Size component allows you to set `width` and `height` properties and define the relationship between them.
    * 
    * The component can automatically maintain the aspect ratios between the two values, and clamp them
    * to a defined min-max range. You can also control the dominant axis. When dimensions are given to the Size component
    * that would cause it to exceed its min-max range, the dimensions are adjusted based on the dominant axis.
    */
  @JSImport("phaser", "Structs.Size")
  @js.native
  /**
    * 
    * @param width The width of the Size component. Default 0.
    * @param height The height of the Size component. If not given, it will use the `width`. Default width.
    * @param aspectMode The aspect mode of the Size component. Defaults to 0, no mode. Default 0.
    * @param parent The parent of this Size component. Can be any object with public `width` and `height` properties. Dimensions are clamped to keep them within the parent bounds where possible. Default null.
    */
  open class Size ()
    extends StObject
       with typings.phaser.Phaser.Structs.Size {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
    def this(width: Double, height: Double, aspectMode: Double) = this()
    def this(width: Double, height: Unit, aspectMode: Double) = this()
    def this(width: Unit, height: Double, aspectMode: Double) = this()
    def this(width: Unit, height: Unit, aspectMode: Double) = this()
    def this(width: Double, height: Double, aspectMode: Double, parent: Any) = this()
    def this(width: Double, height: Double, aspectMode: Unit, parent: Any) = this()
    def this(width: Double, height: Unit, aspectMode: Double, parent: Any) = this()
    def this(width: Double, height: Unit, aspectMode: Unit, parent: Any) = this()
    def this(width: Unit, height: Double, aspectMode: Double, parent: Any) = this()
    def this(width: Unit, height: Double, aspectMode: Unit, parent: Any) = this()
    def this(width: Unit, height: Unit, aspectMode: Double, parent: Any) = this()
    def this(width: Unit, height: Unit, aspectMode: Unit, parent: Any) = this()
  }
  object Size {
    
    /**
      * The width and height are automatically adjusted to make the size cover the entire target area while keeping the aspect ratio. This may extend further out than the target size.
      */
    /* static member */
    @JSImport("phaser", "Structs.Size.ENVELOP")
    @js.native
    val ENVELOP: Double = js.native
    
    /**
      * The width and height are automatically adjusted to fit inside the given target area, while keeping the aspect ratio. Depending on the aspect ratio there may be some space inside the area which is not covered.
      */
    /* static member */
    @JSImport("phaser", "Structs.Size.FIT")
    @js.native
    val FIT: Double = js.native
    
    /**
      * The width is automatically adjusted based on the height.
      */
    /* static member */
    @JSImport("phaser", "Structs.Size.HEIGHT_CONTROLS_WIDTH")
    @js.native
    val HEIGHT_CONTROLS_WIDTH: Double = js.native
    
    /**
      * Do not make the size fit the aspect ratio. Change the ratio when the size changes.
      */
    /* static member */
    @JSImport("phaser", "Structs.Size.NONE")
    @js.native
    val NONE: Double = js.native
    
    /**
      * The height is automatically adjusted based on the width.
      */
    /* static member */
    @JSImport("phaser", "Structs.Size.WIDTH_CONTROLS_HEIGHT")
    @js.native
    val WIDTH_CONTROLS_HEIGHT: Double = js.native
  }
}
