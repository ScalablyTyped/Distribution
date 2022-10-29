package typings.pixiDisplay

import typings.pixiCore.mod.Filter
import typings.pixiCore.mod.MaskData
import typings.pixiCore.mod.Matrix
import typings.pixiCore.mod.ObservablePoint
import typings.pixiCore.mod.Rectangle
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.Transform
import typings.pixiCore.mod.utils.EventEmitter
import typings.pixiDisplay.libBoundsMod.Bounds
import typings.pixiDisplay.libContainerMod.Container
import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayObjectMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.DisplayObject * / any, keyof @pixi/core.@pixi/core.utils.EventEmitter<@pixi/display.@pixi/display/lib/DisplayObject.DisplayObjectEvents, any>> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.DisplayObject * / any[P]} */ /* note: abstract class */ @JSImport("@pixi/display/lib/DisplayObject", "DisplayObject")
  @js.native
  open class DisplayObject () extends EventEmitter[DisplayObjectEvents, Any] {
    
    /** The bounds object, this is used to calculate and store the bounds of the displayObject. */
    var _bounds: Bounds = js.native
    
    /** Flags the cached bounds as dirty. */
    /* protected */ var _boundsID: Double = js.native
    
    /** Cache of this display-object's bounds-rectangle. */
    /* protected */ var _boundsRect: Rectangle = js.native
    
    /** If the object has been destroyed via destroy(). If true, it should not be used. */
    /* protected */ var _destroyed: Boolean = js.native
    
    /**
      * Currently enabled filters.
      * @protected
      */
    /* protected */ var _enabledFilters: js.Array[Filter] = js.native
    
    /**
      * Which index in the children array the display component was before the previous zIndex sort.
      * Used by containers to help sort objects with the same zIndex, by using previous array index as the decider.
      * @protected
      */
    var _lastSortedIndex: Double = js.native
    
    /** Local bounds object, swapped with `_bounds` when using `getLocalBounds()`. */
    var _localBounds: Bounds = js.native
    
    /** Cache of this display-object's local-bounds rectangle. */
    /* protected */ var _localBoundsRect: Rectangle = js.native
    
    /**
      * The original, cached mask of the object.
      * @protected
      */
    var _mask: Container[DisplayObject] | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: TemporaryDisplayObject = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    /** Recalculates the bounds of the display object. */
    def calculateBounds(): Unit = js.native
    
    /**
      * If set, this shape is used for culling instead of the bounds of this object.
      * It can improve the culling performance of objects with many children.
      * The culling area is defined in local space.
      */
    var cullArea: Rectangle = js.native
    
    /**
      * Should this object be rendered if the bounds of this object are out of frame?
      *
      * Culling has no effect on whether updateTransform is called.
      */
    var cullable: Boolean = js.native
    
    /**
      * Base destroy method for generic display objects. This will automatically
      * remove the display object from its parent Container as well as remove
      * all current event listeners and internal references. Do not use a DisplayObject
      * after calling `destroy()`.
      * @param _options
      */
    def destroy(): Unit = js.native
    def destroy(_options: Boolean): Unit = js.native
    def destroy(_options: IDestroyOptions): Unit = js.native
    
    /**
      * Fired when this DisplayObject is added to a Container.
      * @instance
      * @event added
      * @param {PIXI.Container} container - The container added to.
      */
    /**
      * Fired when this DisplayObject is removed from a Container.
      * @instance
      * @event removed
      * @param {PIXI.Container} container - The container removed from.
      */
    /**
      * Fired when this DisplayObject is destroyed. This event is emitted once
      * destroy is finished.
      * @instance
      * @event destroyed
      */
    /** Readonly flag for destroyed display objects. */
    def destroyed: Boolean = js.native
    
    /**
      * Pair method for `enableTempParent`
      * @param cacheParent - Actual parent of element
      */
    def disableTempParent(cacheParent: Container[DisplayObject]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root.
      *
      * ```js
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - Current parent
      */
    def enableTempParent(): Container[DisplayObject] = js.native
    
    /**
      * The area the filter is applied to. This is used as more of an optimization
      * rather than figuring out the dimensions of the displayObject each frame you can set this rectangle.
      *
      * Also works as an interaction mask.
      */
    var filterArea: Rectangle = js.native
    
    /**
      * Sets the filters for the displayObject.
      * IMPORTANT: This is a WebGL only feature and will be ignored by the canvas renderer.
      * To remove filters simply set this property to `'null'`.
      */
    var filters: js.Array[Filter] | Null = js.native
    
    /**
      * Calculates and returns the (world) bounds of the display object as a [Rectangle]{@link PIXI.Rectangle}.
      *
      * This method is expensive on containers with a large subtree (like the stage). This is because the bounds
      * of a container depend on its children's bounds, which recursively causes all bounds in the subtree to
      * be recalculated. The upside, however, is that calling `getBounds` once on a container will indeed update
      * the bounds of all children (the whole subtree, in fact). This side effect should be exploited by using
      * `displayObject._bounds.getRectangle()` when traversing through all the bounds in a scene graph. Otherwise,
      * calling `getBounds` on each object in a subtree will cause the total cost to increase quadratically as
      * its height increases.
      *
      * The transforms of all objects in a container's **subtree** and of all **ancestors** are updated.
      * The world bounds of all display objects in a container's **subtree** will also be recalculated.
      *
      * The `_bounds` object stores the last calculation of the bounds. You can use to entirely skip bounds
      * calculation if needed.
      *
      * ```js
      * const lastCalculatedBounds = displayObject._bounds.getRectangle(optionalRect);
      * ```
      *
      * Do know that usage of `getLocalBounds` can corrupt the `_bounds` of children (the whole subtree, actually). This
      * is a known issue that has not been solved. See [getLocalBounds]{@link PIXI.DisplayObject#getLocalBounds} for more
      * details.
      *
      * `getBounds` should be called with `skipUpdate` equal to `true` in a render() call. This is because the transforms
      * are guaranteed to be update-to-date. In fact, recalculating inside a render() call may cause corruption in certain
      * cases.
      * @param skipUpdate - Setting to `true` will stop the transforms of the scene graph from
      *  being updated. This means the calculation returned MAY be out of date BUT will give you a
      *  nice performance boost.
      * @param rect - Optional rectangle to store the result of the bounds calculation.
      * @returns - The minimum axis-aligned rectangle in world space that fits around this object.
      */
    def getBounds(): Rectangle = js.native
    def getBounds(skipUpdate: Boolean): Rectangle = js.native
    def getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle = js.native
    def getBounds(skipUpdate: Unit, rect: Rectangle): Rectangle = js.native
    
    /**
      * Retrieves the local bounds of the displayObject as a rectangle object.
      * @param rect - Optional rectangle to store the result of the bounds calculation.
      * @returns - The rectangular bounding area.
      */
    def getLocalBounds(): Rectangle = js.native
    def getLocalBounds(rect: Rectangle): Rectangle = js.native
    
    /** Does any other displayObject use this object as a mask? */
    var isMask: Boolean = js.native
    
    /** Used to fast check if a sprite is.. a sprite! */
    var isSprite: Boolean = js.native
    
    /**
      * Current transform of the object based on local factors: position, scale, other stuff.
      * @readonly
      */
    def localTransform: Matrix = js.native
    
    /**
      * Sets a mask for the displayObject. A mask is an object that limits the visibility of an
      * object to the shape of the mask applied to it. In PixiJS a regular mask must be a
      * {@link PIXI.Graphics} or a {@link PIXI.Sprite} object. This allows for much faster masking in canvas as it
      * utilities shape clipping. Furthermore, a mask of an object must be in the subtree of its parent.
      * Otherwise, `getLocalBounds` may calculate incorrect bounds, which makes the container's width and height wrong.
      * To remove a mask, set this property to `null`.
      *
      * For sprite mask both alpha and red channel are used. Black mask is the same as transparent mask.
      * @example
      * import { Graphics, Sprite } from 'pixi.js';
      *
      * const graphics = new Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, CanvasRenderer doesn't support Sprite as mask.
      */
    def mask: Container[DisplayObject] | MaskData | Null = js.native
    def mask_=(value: Container[DisplayObject] | MaskData | Null): Unit = js.native
    
    /** The display object container that contains this display object. */
    var parent: Container[DisplayObject] = js.native
    
    /**
      * The center of rotation, scaling, and skewing for this display object in its local space. The `position`
      * is the projection of `pivot` in the parent's local space.
      *
      * By default, the pivot is the origin (0, 0).
      * @since 4.0.0
      */
    def pivot: ObservablePoint[Any] = js.native
    def pivot_=(value: IPointData): Unit = js.native
    
    /**
      * The coordinate of the object relative to the local coordinates of the parent.
      * @since 4.0.0
      */
    def position: ObservablePoint[Any] = js.native
    def position_=(value: IPointData): Unit = js.native
    
    def removeChild(child: DisplayObject): Unit = js.native
    
    /** Remove the DisplayObject from its parent Container. If the DisplayObject has no parent, do nothing. */
    def removeFromParent(): Unit = js.native
    
    /**
      * Renders the object using the WebGL renderer.
      * @param renderer - The renderer.
      */
    def render(renderer: Renderer): Unit = js.native
    
    /**
      * Can this object be rendered, if false the object will not be drawn but the updateTransform
      * methods will still be called.
      *
      * Only affects recursive calls from parent. You can ask for bounds manually.
      */
    var renderable: Boolean = js.native
    
    /**
      * The rotation of the object in radians.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def rotation: Double = js.native
    def rotation_=(value: Double): Unit = js.native
    
    /**
      * The scale factors of this object along the local coordinate axes.
      *
      * The default scale is (1, 1).
      * @since 4.0.0
      */
    def scale: ObservablePoint[Any] = js.native
    def scale_=(value: IPointData): Unit = js.native
    
    /**
      * Set the parent Container of this DisplayObject.
      * @param container - The Container to add this DisplayObject to.
      * @returns - The Container that this DisplayObject was added to.
      */
    def setParent(container: Container[DisplayObject]): Container[DisplayObject] = js.native
    
    /**
      * Convenience function to set the position, scale, skew and pivot at once.
      * @param x - The X position
      * @param y - The Y position
      * @param scaleX - The X scale value
      * @param scaleY - The Y scale value
      * @param rotation - The rotation
      * @param skewX - The X skew value
      * @param skewY - The Y skew value
      * @param pivotX - The X pivot value
      * @param pivotY - The Y pivot value
      * @returns - The DisplayObject instance
      */
    def setTransform(
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      scaleX: js.UndefOr[Double],
      scaleY: js.UndefOr[Double],
      rotation: js.UndefOr[Double],
      skewX: js.UndefOr[Double],
      skewY: js.UndefOr[Double],
      pivotX: js.UndefOr[Double],
      pivotY: js.UndefOr[Double]
    ): this.type = js.native
    
    /**
      * The skew factor for the object in radians.
      * @since 4.0.0
      */
    def skew: ObservablePoint[Any] = js.native
    def skew_=(value: IPointData): Unit = js.native
    
    var sortDirty: Boolean = js.native
    
    /* private */ var tempDisplayObjectParent: Any = js.native
    
    /**
      * Calculates the global position of the display object.
      * @param position - The world origin to calculate from.
      * @param point - A Point object in which to store the value, optional
      *  (otherwise will create a new Point).
      * @param skipUpdate - Should we skip the update transform.
      * @returns - A point object representing the position of this object.
      */
    def toGlobal[P /* <: IPointData */](position: IPointData): P = js.native
    def toGlobal[P /* <: IPointData */](position: IPointData, point: P): P = js.native
    def toGlobal[P /* <: IPointData */](position: IPointData, point: P, skipUpdate: Boolean): P = js.native
    def toGlobal[P /* <: IPointData */](position: IPointData, point: Unit, skipUpdate: Boolean): P = js.native
    
    /**
      * Calculates the local position of the display object relative to another point.
      * @param position - The world origin to calculate from.
      * @param from - The DisplayObject to calculate the global position from.
      * @param point - A Point object in which to store the value, optional
      *  (otherwise will create a new Point).
      * @param skipUpdate - Should we skip the update transform
      * @returns - A point object representing the position of this object
      */
    def toLocal[P /* <: IPointData */](position: IPointData): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: Unit, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: Unit, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: Unit, point: Unit, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObject, point: Unit, skipUpdate: Boolean): P = js.native
    
    /**
      * World transform and local transform of this object.
      * This will become read-only later, please do not assign anything there unless you know what are you doing.
      */
    var transform: Transform = js.native
    
    /** Updates the object transform for rendering. TODO - Optimization pass! */
    def updateTransform(): Unit = js.native
    
    /**
      * The visibility of the object. If false the object will not be drawn, and
      * the updateTransform function will not be called.
      *
      * Only affects recursive calls from parent. You can ask for bounds or call updateTransform manually.
      */
    var visible: Boolean = js.native
    
    /**
      * The multiplied alpha of the displayObject.
      * @readonly
      */
    var worldAlpha: Double = js.native
    
    /**
      * Current transform of the object based on world (parent) factors.
      * @readonly
      */
    def worldTransform: Matrix = js.native
    
    /**
      * Indicates if the object is globally visible.
      * @readonly
      */
    def worldVisible: Boolean = js.native
    
    /**
      * The position of the displayObject on the x axis relative to the local coordinates of the parent.
      * An alias to position.x
      */
    def x: Double = js.native
    def x_=(value: Double): Unit = js.native
    
    /**
      * The position of the displayObject on the y axis relative to the local coordinates of the parent.
      * An alias to position.y
      */
    def y: Double = js.native
    def y_=(value: Double): Unit = js.native
    
    /**
      * The zIndex of the displayObject.
      *
      * If a container has the sortableChildren property set to true, children will be automatically
      * sorted by zIndex value; a higher value will mean it will be moved towards the end of the array,
      * and thus rendered on top of other display objects within the same container.
      * @see PIXI.Container#sortableChildren
      */
    def zIndex: Double = js.native
    def zIndex_=(value: Double): Unit = js.native
  }
  /* static members */
  object DisplayObject {
    
    @JSImport("@pixi/display/lib/DisplayObject", "DisplayObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Mixes all enumerable properties and methods from a source object to DisplayObject.
      * @param source - The source of properties and methods to mix in.
      */
    inline def mixin(source: Dict[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@pixi/display/lib/DisplayObject", "TemporaryDisplayObject")
  @js.native
  open class TemporaryDisplayObject () extends DisplayObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.DisplayObjectEvents * / any */ trait DisplayObjectEvents extends StObject {
    
    var added: js.Array[Container[DisplayObject]]
    
    var childAdded: js.Tuple3[DisplayObject, Container[DisplayObject], Double]
    
    var childRemoved: js.Tuple3[DisplayObject, Container[DisplayObject], Double]
    
    var destroyed: js.Array[Any]
    
    var removed: js.Array[Container[DisplayObject]]
    
    var removedFrom: js.Tuple3[DisplayObject, Container[DisplayObject], Double]
  }
  object DisplayObjectEvents {
    
    inline def apply(
      added: js.Array[Container[DisplayObject]],
      childAdded: js.Tuple3[DisplayObject, Container[DisplayObject], Double],
      childRemoved: js.Tuple3[DisplayObject, Container[DisplayObject], Double],
      destroyed: js.Array[Any],
      removed: js.Array[Container[DisplayObject]],
      removedFrom: js.Tuple3[DisplayObject, Container[DisplayObject], Double]
    ): DisplayObjectEvents = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], childAdded = childAdded.asInstanceOf[js.Any], childRemoved = childRemoved.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], removedFrom = removedFrom.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayObjectEvents]
    }
    
    extension [Self <: DisplayObjectEvents](x: Self) {
      
      inline def setAdded(value: js.Array[Container[DisplayObject]]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: Container[DisplayObject]*): Self = StObject.set(x, "added", js.Array(value*))
      
      inline def setChildAdded(value: js.Tuple3[DisplayObject, Container[DisplayObject], Double]): Self = StObject.set(x, "childAdded", value.asInstanceOf[js.Any])
      
      inline def setChildRemoved(value: js.Tuple3[DisplayObject, Container[DisplayObject], Double]): Self = StObject.set(x, "childRemoved", value.asInstanceOf[js.Any])
      
      inline def setDestroyed(value: js.Array[Any]): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setDestroyedVarargs(value: Any*): Self = StObject.set(x, "destroyed", js.Array(value*))
      
      inline def setRemoved(value: js.Array[Container[DisplayObject]]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedFrom(value: js.Tuple3[DisplayObject, Container[DisplayObject], Double]): Self = StObject.set(x, "removedFrom", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: Container[DisplayObject]*): Self = StObject.set(x, "removed", js.Array(value*))
    }
  }
  
  trait IDestroyOptions extends StObject {
    
    var baseTexture: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Boolean] = js.undefined
    
    var texture: js.UndefOr[Boolean] = js.undefined
  }
  object IDestroyOptions {
    
    inline def apply(): IDestroyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDestroyOptions]
    }
    
    extension [Self <: IDestroyOptions](x: Self) {
      
      inline def setBaseTexture(value: Boolean): Self = StObject.set(x, "baseTexture", value.asInstanceOf[js.Any])
      
      inline def setBaseTextureUndefined: Self = StObject.set(x, "baseTexture", js.undefined)
      
      inline def setChildren(value: Boolean): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTexture(value: Boolean): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    }
  }
}
