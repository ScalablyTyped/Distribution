package typings.pixiDisplay

import typings.eventemitter3.mod.EventArgs
import typings.eventemitter3.mod.EventListener
import typings.eventemitter3.mod.EventNames
import typings.pixiCore.mod.Filter
import typings.pixiCore.mod.MaskData
import typings.pixiCore.mod.Renderer
import typings.pixiDisplay.mod.Bounds
import typings.pixiDisplay.mod.Container
import typings.pixiDisplay.mod.IDestroyOptions
import typings.pixiMath.mod.IPointData
import typings.pixiMath.mod.Matrix
import typings.pixiMath.mod.ObservablePoint
import typings.pixiMath.mod.Rectangle
import typings.pixiMath.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @pixi/display.@pixi/display.Container<@pixi/display.@pixi/display.DisplayObject> */
  @js.native
  trait ContainerDisplayObject extends StObject {
    
    /** The bounds object, this is used to calculate and store the bounds of the displayObject. */
    var _bounds: Bounds = js.native
    
    /** Flags the cached bounds as dirty. */
    /* protected */ var _boundsID: Double = js.native
    
    /** Cache of this display-object's bounds-rectangle. */
    /* protected */ var _boundsRect: Rectangle = js.native
    
    /**
      * Recalculates the content bounds of this object. This should be overriden to
      * calculate the bounds of this specific object (not including children).
      * @protected
      */
    /* protected */ def _calculateBounds(): Unit = js.native
    
    /** If the object has been destroyed via destroy(). If true, it should not be used. */
    /* protected */ var _destroyed: Boolean = js.native
    
    /**
      * Currently enabled filters.
      * @protected
      */
    /* protected */ var _enabledFilters: js.Array[Filter] = js.native
    
    /* protected */ var _height: Double = js.native
    
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
    var _mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
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
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: TemporaryDisplayObject = js.native
    
    /* protected */ var _width: Double = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    /**
      * Adds one or more children to the container.
      *
      * Multiple items can be added like so: `myContainer.addChild(thingOne, thingTwo, thingThree)`
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to add to the container
      * @returns {PIXI.DisplayObject} - The first child that was added.
      */
    def addChild[U /* <: js.Array[typings.pixiDisplay.mod.DisplayObject] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown
      * @param {PIXI.DisplayObject} child - The child to add
      * @param {number} index - The index to place the child in
      * @returns {PIXI.DisplayObject} The child that was added.
      */
    def addChildAt[U /* <: typings.pixiDisplay.mod.DisplayObject */](child: U, index: Double): U = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    /**
      * Recalculates the bounds of the container.
      *
      * This implementation will automatically fit the children's bounds into the calculation. Each child's bounds
      * is limited to its mask's bounds or filterArea, if any is applied.
      */
    def calculateBounds(): Unit = js.native
    
    /**
      * The array of children of this container.
      * @readonly
      */
    val children: js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    def containerUpdateTransform(): Unit = js.native
    
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
      * Removes all internal references and listeners as well as removes children from the display list.
      * Do not use a Container after calling `destroy`.
      * @param options - Options parameter. A boolean will act as if all options
      *  have been set to that value
      * @param {boolean} [options.children=false] - if set to true, all the children will have their destroy
      *  method called as well. 'options' will be passed on to those calls.
      * @param {boolean} [options.texture=false] - Only used for child Sprites if options.children is set to true
      *  Should it destroy the texture of the child sprite
      * @param {boolean} [options.baseTexture=false] - Only used for child Sprites if options.children is set to true
      *  Should it destroy the base texture of the child sprite
      */
    def destroy(): Unit = js.native
    def destroy(options: Boolean): Unit = js.native
    def destroy(options: IDestroyOptions): Unit = js.native
    
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
    def disableTempParent(cacheParent: Container[typings.pixiDisplay.mod.DisplayObject]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Returns the child at the specified index
      * @param index - The index to get the child at
      * @returns - The child at the given index, if any.
      */
    def getChildAt(index: Double): typings.pixiDisplay.mod.DisplayObject = js.native
    
    /**
      * Returns the index position of a child DisplayObject instance
      * @param child - The DisplayObject instance to identify
      * @returns - The index position of the child display object to identify
      */
    def getChildIndex(child: typings.pixiDisplay.mod.DisplayObject): Double = js.native
    
    /**
      * Retrieves the local bounds of the displayObject as a rectangle object.
      *
      * Calling `getLocalBounds` may invalidate the `_bounds` of the whole subtree below. If using it inside a render()
      * call, it is advised to call `getBounds()` immediately after to recalculate the world bounds of the subtree.
      * @param rect - Optional rectangle to store the result of the bounds calculation.
      * @param skipChildrenUpdate - Setting to `true` will stop re-calculation of children transforms,
      *  it was default behaviour of pixi 4.0-5.2 and caused many problems to users.
      * @returns - The rectangular bounding area.
      */
    def getLocalBounds(): Rectangle = js.native
    def getLocalBounds(rect: Unit, skipChildrenUpdate: Boolean): Rectangle = js.native
    def getLocalBounds(rect: Rectangle): Rectangle = js.native
    def getLocalBounds(rect: Rectangle, skipChildrenUpdate: Boolean): Rectangle = js.native
    
    /** The height of the Container, setting this will actually modify the scale to achieve the value set. */
    def height: Double = js.native
    def height_=(value: Double): Unit = js.native
    
    /** Does any other displayObject use this object as a mask? */
    var isMask: Boolean = js.native
    
    /** Used to fast check if a sprite is.. a sprite! */
    var isSprite: Boolean = js.native
    
    /**
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null = js.native
    def mask_=(value: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Overridable method that can be used by Container subclasses whenever the children array is modified.
      * @param _length
      */
    /* protected */ def onChildrenChange(): Unit = js.native
    /* protected */ def onChildrenChange(_length: Double): Unit = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    var parent: Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    /**
      * Removes one or more children from the container.
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to remove
      * @returns {PIXI.DisplayObject} The first child that was removed.
      */
    def removeChild[U /* <: js.Array[typings.pixiDisplay.mod.DisplayObject] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Removes a child from the specified index position.
      * @param index - The index to get the child from
      * @returns The child that was removed.
      */
    def removeChildAt(index: Double): typings.pixiDisplay.mod.DisplayObject = js.native
    
    /**
      * Removes all children from this container that are within the begin and end indexes.
      * @param beginIndex - The beginning position.
      * @param endIndex - The ending position. Default value is size of the container.
      * @returns - List of removed children
      */
    def removeChildren(): js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    def removeChildren(beginIndex: Double): js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    def removeChildren(beginIndex: Double, endIndex: Double): js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    def removeChildren(beginIndex: Unit, endIndex: Double): js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Renders the object using the WebGL renderer.
      *
      * The [_render]{@link PIXI.Container#_render} method is be overriden for rendering the contents of the
      * container itself. This `render` method will invoke it, and also invoke the `render` methods of all
      * children afterward.
      *
      * If `renderable` or `visible` is false or if `worldAlpha` is not positive or if `cullable` is true and
      * the bounds of this object are out of frame, this implementation will entirely skip rendering.
      * See {@link PIXI.DisplayObject} for choosing between `renderable` or `visible`. Generally,
      * setting alpha to zero is not recommended for purely skipping rendering.
      *
      * When your scene becomes large (especially when it is larger than can be viewed in a single screen), it is
      * advised to employ **culling** to automatically skip rendering objects outside of the current screen.
      * See [cullable]{@link PIXI.DisplayObject#cullable} and [cullArea]{@link PIXI.DisplayObject#cullArea}.
      * Other culling methods might be better suited for a large number static objects; see
      * [@pixi-essentials/cull]{@link https://www.npmjs.com/package/@pixi-essentials/cull} and
      * [pixi-cull]{@link https://www.npmjs.com/package/pixi-cull}.
      *
      * The [renderAdvanced]{@link PIXI.Container#renderAdvanced} method is internally used when when masking or
      * filtering is applied on a container. This does, however, break batching and can affect performance when
      * masking and filtering is applied extensively throughout the scene graph.
      * @param renderer - The renderer
      */
    def render(renderer: Renderer): Unit = js.native
    
    /**
      * Render the object using the WebGL renderer and advanced features.
      * @param renderer - The renderer
      */
    /* protected */ def renderAdvanced(renderer: Renderer): Unit = js.native
    
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
      * Changes the position of an existing child in the display object container
      * @param child - The child DisplayObject instance for which you want to change the index number
      * @param index - The resulting index number for the child display object
      */
    def setChildIndex(child: typings.pixiDisplay.mod.DisplayObject, index: Double): Unit = js.native
    
    /**
      * Set the parent Container of this DisplayObject.
      * @param container - The Container to add this DisplayObject to.
      * @returns - The Container that this DisplayObject was added to.
      */
    def setParent(container: Container[typings.pixiDisplay.mod.DisplayObject]): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    
    /** Sorts children by zIndex. Previous order is maintained for 2 children with the same zIndex. */
    def sortChildren(): Unit = js.native
    
    /**
      * Should children be sorted by zIndex at the next updateTransform call.
      *
      * Will get automatically set to true if a new child is added, or if a child's zIndex changes.
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
      * @see PIXI.settings.SORTABLE_CHILDREN
      */
    var sortableChildren: Boolean = js.native
    
    /**
      * Swaps the position of 2 Display Objects within this container.
      * @param child - First display object to swap
      * @param child2 - Second display object to swap
      */
    def swapChildren(child: typings.pixiDisplay.mod.DisplayObject, child2: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](
      position: IPointData,
      from: typings.pixiDisplay.mod.DisplayObject,
      point: Unit,
      skipUpdate: Boolean
    ): P = js.native
    
    /**
      * World transform and local transform of this object.
      * This will become read-only later, please do not assign anything there unless you know what are you doing.
      */
    var transform: Transform = js.native
    
    /** Updates the transform on all children of this container for rendering. */
    def updateTransform(): Unit = js.native
    
    /**
      * The visibility of the object. If false the object will not be drawn, and
      * the updateTransform function will not be called.
      *
      * Only affects recursive calls from parent. You can ask for bounds or call updateTransform manually.
      */
    var visible: Boolean = js.native
    
    /** The width of the Container, setting this will actually modify the scale to achieve the value set. */
    def width: Double = js.native
    def width_=(value: Double): Unit = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.Container<@pixi/display.@pixi/display.DisplayObject> */
  @js.native
  trait ContainerDisplayObjectAddChild extends StObject {
    
    /** The bounds object, this is used to calculate and store the bounds of the displayObject. */
    var _bounds: Bounds = js.native
    
    /** Flags the cached bounds as dirty. */
    /* protected */ var _boundsID: Double = js.native
    
    /** Cache of this display-object's bounds-rectangle. */
    /* protected */ var _boundsRect: Rectangle = js.native
    
    /**
      * Recalculates the content bounds of this object. This should be overriden to
      * calculate the bounds of this specific object (not including children).
      * @protected
      */
    /* protected */ def _calculateBounds(): Unit = js.native
    
    /** If the object has been destroyed via destroy(). If true, it should not be used. */
    /* protected */ var _destroyed: Boolean = js.native
    
    /**
      * Currently enabled filters.
      * @protected
      */
    /* protected */ var _enabledFilters: js.Array[Filter] = js.native
    
    /* protected */ var _height: Double = js.native
    
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
    var _mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
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
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: typings.pixiDisplay.mod.TemporaryDisplayObject = js.native
    
    /* protected */ var _width: Double = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    /**
      * Adds one or more children to the container.
      *
      * Multiple items can be added like so: `myContainer.addChild(thingOne, thingTwo, thingThree)`
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to add to the container
      * @returns {PIXI.DisplayObject} - The first child that was added.
      */
    def addChild[U /* <: js.Array[typings.pixiDisplay.mod.DisplayObject] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown
      * @param {PIXI.DisplayObject} child - The child to add
      * @param {number} index - The index to place the child in
      * @returns {PIXI.DisplayObject} The child that was added.
      */
    def addChildAt[U /* <: typings.pixiDisplay.mod.DisplayObject */](child: U, index: Double): U = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    /**
      * Recalculates the bounds of the container.
      *
      * This implementation will automatically fit the children's bounds into the calculation. Each child's bounds
      * is limited to its mask's bounds or filterArea, if any is applied.
      */
    def calculateBounds(): Unit = js.native
    
    /**
      * The array of children of this container.
      * @readonly
      */
    val children: js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    def containerUpdateTransform(): Unit = js.native
    
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
      * Removes all internal references and listeners as well as removes children from the display list.
      * Do not use a Container after calling `destroy`.
      * @param options - Options parameter. A boolean will act as if all options
      *  have been set to that value
      * @param {boolean} [options.children=false] - if set to true, all the children will have their destroy
      *  method called as well. 'options' will be passed on to those calls.
      * @param {boolean} [options.texture=false] - Only used for child Sprites if options.children is set to true
      *  Should it destroy the texture of the child sprite
      * @param {boolean} [options.baseTexture=false] - Only used for child Sprites if options.children is set to true
      *  Should it destroy the base texture of the child sprite
      */
    def destroy(): Unit = js.native
    def destroy(options: Boolean): Unit = js.native
    def destroy(options: IDestroyOptions): Unit = js.native
    
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
    def disableTempParent(cacheParent: Container[typings.pixiDisplay.mod.DisplayObject]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Returns the child at the specified index
      * @param index - The index to get the child at
      * @returns - The child at the given index, if any.
      */
    def getChildAt(index: Double): typings.pixiDisplay.mod.DisplayObject = js.native
    
    /**
      * Returns the index position of a child DisplayObject instance
      * @param child - The DisplayObject instance to identify
      * @returns - The index position of the child display object to identify
      */
    def getChildIndex(child: typings.pixiDisplay.mod.DisplayObject): Double = js.native
    
    /**
      * Retrieves the local bounds of the displayObject as a rectangle object.
      *
      * Calling `getLocalBounds` may invalidate the `_bounds` of the whole subtree below. If using it inside a render()
      * call, it is advised to call `getBounds()` immediately after to recalculate the world bounds of the subtree.
      * @param rect - Optional rectangle to store the result of the bounds calculation.
      * @param skipChildrenUpdate - Setting to `true` will stop re-calculation of children transforms,
      *  it was default behaviour of pixi 4.0-5.2 and caused many problems to users.
      * @returns - The rectangular bounding area.
      */
    def getLocalBounds(): Rectangle = js.native
    def getLocalBounds(rect: Unit, skipChildrenUpdate: Boolean): Rectangle = js.native
    def getLocalBounds(rect: Rectangle): Rectangle = js.native
    def getLocalBounds(rect: Rectangle, skipChildrenUpdate: Boolean): Rectangle = js.native
    
    /** The height of the Container, setting this will actually modify the scale to achieve the value set. */
    def height: Double = js.native
    def height_=(value: Double): Unit = js.native
    
    /** Does any other displayObject use this object as a mask? */
    var isMask: Boolean = js.native
    
    /** Used to fast check if a sprite is.. a sprite! */
    var isSprite: Boolean = js.native
    
    /**
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null = js.native
    def mask_=(value: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Overridable method that can be used by Container subclasses whenever the children array is modified.
      * @param _length
      */
    /* protected */ def onChildrenChange(): Unit = js.native
    /* protected */ def onChildrenChange(_length: Double): Unit = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    var parent: Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    /**
      * Removes one or more children from the container.
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to remove
      * @returns {PIXI.DisplayObject} The first child that was removed.
      */
    def removeChild[U /* <: js.Array[typings.pixiDisplay.mod.DisplayObject] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Removes a child from the specified index position.
      * @param index - The index to get the child from
      * @returns The child that was removed.
      */
    def removeChildAt(index: Double): typings.pixiDisplay.mod.DisplayObject = js.native
    
    /**
      * Removes all children from this container that are within the begin and end indexes.
      * @param beginIndex - The beginning position.
      * @param endIndex - The ending position. Default value is size of the container.
      * @returns - List of removed children
      */
    def removeChildren(): js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    def removeChildren(beginIndex: Double): js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    def removeChildren(beginIndex: Double, endIndex: Double): js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    def removeChildren(beginIndex: Unit, endIndex: Double): js.Array[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Renders the object using the WebGL renderer.
      *
      * The [_render]{@link PIXI.Container#_render} method is be overriden for rendering the contents of the
      * container itself. This `render` method will invoke it, and also invoke the `render` methods of all
      * children afterward.
      *
      * If `renderable` or `visible` is false or if `worldAlpha` is not positive or if `cullable` is true and
      * the bounds of this object are out of frame, this implementation will entirely skip rendering.
      * See {@link PIXI.DisplayObject} for choosing between `renderable` or `visible`. Generally,
      * setting alpha to zero is not recommended for purely skipping rendering.
      *
      * When your scene becomes large (especially when it is larger than can be viewed in a single screen), it is
      * advised to employ **culling** to automatically skip rendering objects outside of the current screen.
      * See [cullable]{@link PIXI.DisplayObject#cullable} and [cullArea]{@link PIXI.DisplayObject#cullArea}.
      * Other culling methods might be better suited for a large number static objects; see
      * [@pixi-essentials/cull]{@link https://www.npmjs.com/package/@pixi-essentials/cull} and
      * [pixi-cull]{@link https://www.npmjs.com/package/pixi-cull}.
      *
      * The [renderAdvanced]{@link PIXI.Container#renderAdvanced} method is internally used when when masking or
      * filtering is applied on a container. This does, however, break batching and can affect performance when
      * masking and filtering is applied extensively throughout the scene graph.
      * @param renderer - The renderer
      */
    def render(renderer: Renderer): Unit = js.native
    
    /**
      * Render the object using the WebGL renderer and advanced features.
      * @param renderer - The renderer
      */
    /* protected */ def renderAdvanced(renderer: Renderer): Unit = js.native
    
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
      * Changes the position of an existing child in the display object container
      * @param child - The child DisplayObject instance for which you want to change the index number
      * @param index - The resulting index number for the child display object
      */
    def setChildIndex(child: typings.pixiDisplay.mod.DisplayObject, index: Double): Unit = js.native
    
    /**
      * Set the parent Container of this DisplayObject.
      * @param container - The Container to add this DisplayObject to.
      * @returns - The Container that this DisplayObject was added to.
      */
    def setParent(container: Container[typings.pixiDisplay.mod.DisplayObject]): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    
    /** Sorts children by zIndex. Previous order is maintained for 2 children with the same zIndex. */
    def sortChildren(): Unit = js.native
    
    /**
      * Should children be sorted by zIndex at the next updateTransform call.
      *
      * Will get automatically set to true if a new child is added, or if a child's zIndex changes.
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
      * @see PIXI.settings.SORTABLE_CHILDREN
      */
    var sortableChildren: Boolean = js.native
    
    /**
      * Swaps the position of 2 Display Objects within this container.
      * @param child - First display object to swap
      * @param child2 - Second display object to swap
      */
    def swapChildren(child: typings.pixiDisplay.mod.DisplayObject, child2: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](
      position: IPointData,
      from: typings.pixiDisplay.mod.DisplayObject,
      point: Unit,
      skipUpdate: Boolean
    ): P = js.native
    
    /**
      * World transform and local transform of this object.
      * This will become read-only later, please do not assign anything there unless you know what are you doing.
      */
    var transform: Transform = js.native
    
    /** Updates the transform on all children of this container for rendering. */
    def updateTransform(): Unit = js.native
    
    /**
      * The visibility of the object. If false the object will not be drawn, and
      * the updateTransform function will not be called.
      *
      * Only affects recursive calls from parent. You can ask for bounds or call updateTransform manually.
      */
    var visible: Boolean = js.native
    
    /** The width of the Container, setting this will actually modify the scale to achieve the value set. */
    def width: Double = js.native
    def width_=(value: Double): Unit = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.Container<@pixi/display.@pixi/display.DisplayObject> */
  @js.native
  trait ContainerDisplayObjectAddChildAt extends StObject {
    
    /** The bounds object, this is used to calculate and store the bounds of the displayObject. */
    var _bounds: Bounds = js.native
    
    /** Flags the cached bounds as dirty. */
    /* protected */ var _boundsID: Double = js.native
    
    /** Cache of this display-object's bounds-rectangle. */
    /* protected */ var _boundsRect: Rectangle = js.native
    
    /**
      * Recalculates the content bounds of this object. This should be overriden to
      * calculate the bounds of this specific object (not including children).
      * @protected
      */
    /* protected */ def _calculateBounds(): Unit = js.native
    
    /** If the object has been destroyed via destroy(). If true, it should not be used. */
    /* protected */ var _destroyed: Boolean = js.native
    
    /**
      * Currently enabled filters.
      * @protected
      */
    /* protected */ var _enabledFilters: js.Array[Filter] = js.native
    
    /* protected */ var _height: Double = js.native
    
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
    var _mask: Container[DisplayObjectAddListener] | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
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
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: TemporaryDisplayObjectAlpha = js.native
    
    /* protected */ var _width: Double = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    /**
      * Adds one or more children to the container.
      *
      * Multiple items can be added like so: `myContainer.addChild(thingOne, thingTwo, thingThree)`
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to add to the container
      * @returns {PIXI.DisplayObject} - The first child that was added.
      */
    def addChild[U /* <: js.Array[DisplayObjectAddListener] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown
      * @param {PIXI.DisplayObject} child - The child to add
      * @param {number} index - The index to place the child in
      * @returns {PIXI.DisplayObject} The child that was added.
      */
    def addChildAt[U /* <: DisplayObjectAddListener */](child: U, index: Double): U = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    /**
      * Recalculates the bounds of the container.
      *
      * This implementation will automatically fit the children's bounds into the calculation. Each child's bounds
      * is limited to its mask's bounds or filterArea, if any is applied.
      */
    def calculateBounds(): Unit = js.native
    
    /**
      * The array of children of this container.
      * @readonly
      */
    val children: js.Array[DisplayObjectAddListener] = js.native
    
    def containerUpdateTransform(): Unit = js.native
    
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
      * Removes all internal references and listeners as well as removes children from the display list.
      * Do not use a Container after calling `destroy`.
      * @param options - Options parameter. A boolean will act as if all options
      *  have been set to that value
      * @param {boolean} [options.children=false] - if set to true, all the children will have their destroy
      *  method called as well. 'options' will be passed on to those calls.
      * @param {boolean} [options.texture=false] - Only used for child Sprites if options.children is set to true
      *  Should it destroy the texture of the child sprite
      * @param {boolean} [options.baseTexture=false] - Only used for child Sprites if options.children is set to true
      *  Should it destroy the base texture of the child sprite
      */
    def destroy(): Unit = js.native
    def destroy(options: Boolean): Unit = js.native
    def destroy(options: IDestroyOptions): Unit = js.native
    
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
    def disableTempParent(cacheParent: Container[DisplayObjectAddListener]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): Container[DisplayObjectAddListener] = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Returns the child at the specified index
      * @param index - The index to get the child at
      * @returns - The child at the given index, if any.
      */
    def getChildAt(index: Double): DisplayObjectAddListener = js.native
    
    /**
      * Returns the index position of a child DisplayObject instance
      * @param child - The DisplayObject instance to identify
      * @returns - The index position of the child display object to identify
      */
    def getChildIndex(child: DisplayObjectAddListener): Double = js.native
    
    /**
      * Retrieves the local bounds of the displayObject as a rectangle object.
      *
      * Calling `getLocalBounds` may invalidate the `_bounds` of the whole subtree below. If using it inside a render()
      * call, it is advised to call `getBounds()` immediately after to recalculate the world bounds of the subtree.
      * @param rect - Optional rectangle to store the result of the bounds calculation.
      * @param skipChildrenUpdate - Setting to `true` will stop re-calculation of children transforms,
      *  it was default behaviour of pixi 4.0-5.2 and caused many problems to users.
      * @returns - The rectangular bounding area.
      */
    def getLocalBounds(): Rectangle = js.native
    def getLocalBounds(rect: Unit, skipChildrenUpdate: Boolean): Rectangle = js.native
    def getLocalBounds(rect: Rectangle): Rectangle = js.native
    def getLocalBounds(rect: Rectangle, skipChildrenUpdate: Boolean): Rectangle = js.native
    
    /** The height of the Container, setting this will actually modify the scale to achieve the value set. */
    def height: Double = js.native
    def height_=(value: Double): Unit = js.native
    
    /** Does any other displayObject use this object as a mask? */
    var isMask: Boolean = js.native
    
    /** Used to fast check if a sprite is.. a sprite! */
    var isSprite: Boolean = js.native
    
    /**
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: Container[DisplayObjectAddListener] | MaskData | Null = js.native
    def mask_=(value: Container[DisplayObjectAddListener] | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Overridable method that can be used by Container subclasses whenever the children array is modified.
      * @param _length
      */
    /* protected */ def onChildrenChange(): Unit = js.native
    /* protected */ def onChildrenChange(_length: Double): Unit = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    var parent: Container[DisplayObjectAddListener] = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: DisplayObjectAddListener): Unit = js.native
    /**
      * Removes one or more children from the container.
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to remove
      * @returns {PIXI.DisplayObject} The first child that was removed.
      */
    def removeChild[U /* <: js.Array[DisplayObjectAddListener] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Removes a child from the specified index position.
      * @param index - The index to get the child from
      * @returns The child that was removed.
      */
    def removeChildAt(index: Double): DisplayObjectAddListener = js.native
    
    /**
      * Removes all children from this container that are within the begin and end indexes.
      * @param beginIndex - The beginning position.
      * @param endIndex - The ending position. Default value is size of the container.
      * @returns - List of removed children
      */
    def removeChildren(): js.Array[DisplayObjectAddListener] = js.native
    def removeChildren(beginIndex: Double): js.Array[DisplayObjectAddListener] = js.native
    def removeChildren(beginIndex: Double, endIndex: Double): js.Array[DisplayObjectAddListener] = js.native
    def removeChildren(beginIndex: Unit, endIndex: Double): js.Array[DisplayObjectAddListener] = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Renders the object using the WebGL renderer.
      *
      * The [_render]{@link PIXI.Container#_render} method is be overriden for rendering the contents of the
      * container itself. This `render` method will invoke it, and also invoke the `render` methods of all
      * children afterward.
      *
      * If `renderable` or `visible` is false or if `worldAlpha` is not positive or if `cullable` is true and
      * the bounds of this object are out of frame, this implementation will entirely skip rendering.
      * See {@link PIXI.DisplayObject} for choosing between `renderable` or `visible`. Generally,
      * setting alpha to zero is not recommended for purely skipping rendering.
      *
      * When your scene becomes large (especially when it is larger than can be viewed in a single screen), it is
      * advised to employ **culling** to automatically skip rendering objects outside of the current screen.
      * See [cullable]{@link PIXI.DisplayObject#cullable} and [cullArea]{@link PIXI.DisplayObject#cullArea}.
      * Other culling methods might be better suited for a large number static objects; see
      * [@pixi-essentials/cull]{@link https://www.npmjs.com/package/@pixi-essentials/cull} and
      * [pixi-cull]{@link https://www.npmjs.com/package/pixi-cull}.
      *
      * The [renderAdvanced]{@link PIXI.Container#renderAdvanced} method is internally used when when masking or
      * filtering is applied on a container. This does, however, break batching and can affect performance when
      * masking and filtering is applied extensively throughout the scene graph.
      * @param renderer - The renderer
      */
    def render(renderer: Renderer): Unit = js.native
    
    /**
      * Render the object using the WebGL renderer and advanced features.
      * @param renderer - The renderer
      */
    /* protected */ def renderAdvanced(renderer: Renderer): Unit = js.native
    
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
      * Changes the position of an existing child in the display object container
      * @param child - The child DisplayObject instance for which you want to change the index number
      * @param index - The resulting index number for the child display object
      */
    def setChildIndex(child: DisplayObjectAddListener, index: Double): Unit = js.native
    
    /**
      * Set the parent Container of this DisplayObject.
      * @param container - The Container to add this DisplayObject to.
      * @returns - The Container that this DisplayObject was added to.
      */
    def setParent(container: Container[DisplayObjectAddListener]): Container[DisplayObjectAddListener] = js.native
    
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
    
    /** Sorts children by zIndex. Previous order is maintained for 2 children with the same zIndex. */
    def sortChildren(): Unit = js.native
    
    /**
      * Should children be sorted by zIndex at the next updateTransform call.
      *
      * Will get automatically set to true if a new child is added, or if a child's zIndex changes.
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
      * @see PIXI.settings.SORTABLE_CHILDREN
      */
    var sortableChildren: Boolean = js.native
    
    /**
      * Swaps the position of 2 Display Objects within this container.
      * @param child - First display object to swap
      * @param child2 - Second display object to swap
      */
    def swapChildren(child: DisplayObjectAddListener, child2: DisplayObjectAddListener): Unit = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAddListener): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAddListener, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAddListener, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAddListener, point: Unit, skipUpdate: Boolean): P = js.native
    
    /**
      * World transform and local transform of this object.
      * This will become read-only later, please do not assign anything there unless you know what are you doing.
      */
    var transform: Transform = js.native
    
    /** Updates the transform on all children of this container for rendering. */
    def updateTransform(): Unit = js.native
    
    /**
      * The visibility of the object. If false the object will not be drawn, and
      * the updateTransform function will not be called.
      *
      * Only affects recursive calls from parent. You can ask for bounds or call updateTransform manually.
      */
    var visible: Boolean = js.native
    
    /** The width of the Container, setting this will actually modify the scale to achieve the value set. */
    def width: Double = js.native
    def width_=(value: Double): Unit = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.Container<@pixi/display.@pixi/display.DisplayObject> */
  @js.native
  trait ContainerDisplayObjectAddListener extends StObject {
    
    /** The bounds object, this is used to calculate and store the bounds of the displayObject. */
    var _bounds: Bounds = js.native
    
    /** Flags the cached bounds as dirty. */
    /* protected */ var _boundsID: Double = js.native
    
    /** Cache of this display-object's bounds-rectangle. */
    /* protected */ var _boundsRect: Rectangle = js.native
    
    /**
      * Recalculates the content bounds of this object. This should be overriden to
      * calculate the bounds of this specific object (not including children).
      * @protected
      */
    /* protected */ def _calculateBounds(): Unit = js.native
    
    /** If the object has been destroyed via destroy(). If true, it should not be used. */
    /* protected */ var _destroyed: Boolean = js.native
    
    /**
      * Currently enabled filters.
      * @protected
      */
    /* protected */ var _enabledFilters: js.Array[Filter] = js.native
    
    /* protected */ var _height: Double = js.native
    
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
    var _mask: Container[DisplayObjectAlpha] | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
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
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: typings.pixiDisplay.mod.TemporaryDisplayObject = js.native
    
    /* protected */ var _width: Double = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    /**
      * Adds one or more children to the container.
      *
      * Multiple items can be added like so: `myContainer.addChild(thingOne, thingTwo, thingThree)`
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to add to the container
      * @returns {PIXI.DisplayObject} - The first child that was added.
      */
    def addChild[U /* <: js.Array[DisplayObjectAlpha] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Adds a child to the container at a specified index. If the index is out of bounds an error will be thrown
      * @param {PIXI.DisplayObject} child - The child to add
      * @param {number} index - The index to place the child in
      * @returns {PIXI.DisplayObject} The child that was added.
      */
    def addChildAt[U /* <: DisplayObjectAlpha */](child: U, index: Double): U = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    /**
      * Recalculates the bounds of the container.
      *
      * This implementation will automatically fit the children's bounds into the calculation. Each child's bounds
      * is limited to its mask's bounds or filterArea, if any is applied.
      */
    def calculateBounds(): Unit = js.native
    
    /**
      * The array of children of this container.
      * @readonly
      */
    val children: js.Array[DisplayObjectAlpha] = js.native
    
    def containerUpdateTransform(): Unit = js.native
    
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
      * Removes all internal references and listeners as well as removes children from the display list.
      * Do not use a Container after calling `destroy`.
      * @param options - Options parameter. A boolean will act as if all options
      *  have been set to that value
      * @param {boolean} [options.children=false] - if set to true, all the children will have their destroy
      *  method called as well. 'options' will be passed on to those calls.
      * @param {boolean} [options.texture=false] - Only used for child Sprites if options.children is set to true
      *  Should it destroy the texture of the child sprite
      * @param {boolean} [options.baseTexture=false] - Only used for child Sprites if options.children is set to true
      *  Should it destroy the base texture of the child sprite
      */
    def destroy(): Unit = js.native
    def destroy(options: Boolean): Unit = js.native
    def destroy(options: IDestroyOptions): Unit = js.native
    
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
    def disableTempParent(cacheParent: Container[DisplayObjectAlpha]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): Container[DisplayObjectAlpha] = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Returns the child at the specified index
      * @param index - The index to get the child at
      * @returns - The child at the given index, if any.
      */
    def getChildAt(index: Double): DisplayObjectAlpha = js.native
    
    /**
      * Returns the index position of a child DisplayObject instance
      * @param child - The DisplayObject instance to identify
      * @returns - The index position of the child display object to identify
      */
    def getChildIndex(child: DisplayObjectAlpha): Double = js.native
    
    /**
      * Retrieves the local bounds of the displayObject as a rectangle object.
      *
      * Calling `getLocalBounds` may invalidate the `_bounds` of the whole subtree below. If using it inside a render()
      * call, it is advised to call `getBounds()` immediately after to recalculate the world bounds of the subtree.
      * @param rect - Optional rectangle to store the result of the bounds calculation.
      * @param skipChildrenUpdate - Setting to `true` will stop re-calculation of children transforms,
      *  it was default behaviour of pixi 4.0-5.2 and caused many problems to users.
      * @returns - The rectangular bounding area.
      */
    def getLocalBounds(): Rectangle = js.native
    def getLocalBounds(rect: Unit, skipChildrenUpdate: Boolean): Rectangle = js.native
    def getLocalBounds(rect: Rectangle): Rectangle = js.native
    def getLocalBounds(rect: Rectangle, skipChildrenUpdate: Boolean): Rectangle = js.native
    
    /** The height of the Container, setting this will actually modify the scale to achieve the value set. */
    def height: Double = js.native
    def height_=(value: Double): Unit = js.native
    
    /** Does any other displayObject use this object as a mask? */
    var isMask: Boolean = js.native
    
    /** Used to fast check if a sprite is.. a sprite! */
    var isSprite: Boolean = js.native
    
    /**
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: Container[DisplayObjectAlpha] | MaskData | Null = js.native
    def mask_=(value: Container[DisplayObjectAlpha] | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Overridable method that can be used by Container subclasses whenever the children array is modified.
      * @param _length
      */
    /* protected */ def onChildrenChange(): Unit = js.native
    /* protected */ def onChildrenChange(_length: Double): Unit = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    var parent: Container[DisplayObjectAlpha] = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: DisplayObjectAlpha): Unit = js.native
    /**
      * Removes one or more children from the container.
      * @param {...PIXI.DisplayObject} children - The DisplayObject(s) to remove
      * @returns {PIXI.DisplayObject} The first child that was removed.
      */
    def removeChild[U /* <: js.Array[DisplayObjectAlpha] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param children because its type U is not an array type */ children: U
    ): /* import warning: importer.ImportType#apply Failed type conversion: U[0] */ js.Any = js.native
    
    /**
      * Removes a child from the specified index position.
      * @param index - The index to get the child from
      * @returns The child that was removed.
      */
    def removeChildAt(index: Double): DisplayObjectAlpha = js.native
    
    /**
      * Removes all children from this container that are within the begin and end indexes.
      * @param beginIndex - The beginning position.
      * @param endIndex - The ending position. Default value is size of the container.
      * @returns - List of removed children
      */
    def removeChildren(): js.Array[DisplayObjectAlpha] = js.native
    def removeChildren(beginIndex: Double): js.Array[DisplayObjectAlpha] = js.native
    def removeChildren(beginIndex: Double, endIndex: Double): js.Array[DisplayObjectAlpha] = js.native
    def removeChildren(beginIndex: Unit, endIndex: Double): js.Array[DisplayObjectAlpha] = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Renders the object using the WebGL renderer.
      *
      * The [_render]{@link PIXI.Container#_render} method is be overriden for rendering the contents of the
      * container itself. This `render` method will invoke it, and also invoke the `render` methods of all
      * children afterward.
      *
      * If `renderable` or `visible` is false or if `worldAlpha` is not positive or if `cullable` is true and
      * the bounds of this object are out of frame, this implementation will entirely skip rendering.
      * See {@link PIXI.DisplayObject} for choosing between `renderable` or `visible`. Generally,
      * setting alpha to zero is not recommended for purely skipping rendering.
      *
      * When your scene becomes large (especially when it is larger than can be viewed in a single screen), it is
      * advised to employ **culling** to automatically skip rendering objects outside of the current screen.
      * See [cullable]{@link PIXI.DisplayObject#cullable} and [cullArea]{@link PIXI.DisplayObject#cullArea}.
      * Other culling methods might be better suited for a large number static objects; see
      * [@pixi-essentials/cull]{@link https://www.npmjs.com/package/@pixi-essentials/cull} and
      * [pixi-cull]{@link https://www.npmjs.com/package/pixi-cull}.
      *
      * The [renderAdvanced]{@link PIXI.Container#renderAdvanced} method is internally used when when masking or
      * filtering is applied on a container. This does, however, break batching and can affect performance when
      * masking and filtering is applied extensively throughout the scene graph.
      * @param renderer - The renderer
      */
    def render(renderer: Renderer): Unit = js.native
    
    /**
      * Render the object using the WebGL renderer and advanced features.
      * @param renderer - The renderer
      */
    /* protected */ def renderAdvanced(renderer: Renderer): Unit = js.native
    
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
      * Changes the position of an existing child in the display object container
      * @param child - The child DisplayObject instance for which you want to change the index number
      * @param index - The resulting index number for the child display object
      */
    def setChildIndex(child: DisplayObjectAlpha, index: Double): Unit = js.native
    
    /**
      * Set the parent Container of this DisplayObject.
      * @param container - The Container to add this DisplayObject to.
      * @returns - The Container that this DisplayObject was added to.
      */
    def setParent(container: Container[DisplayObjectAlpha]): Container[DisplayObjectAlpha] = js.native
    
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
    
    /** Sorts children by zIndex. Previous order is maintained for 2 children with the same zIndex. */
    def sortChildren(): Unit = js.native
    
    /**
      * Should children be sorted by zIndex at the next updateTransform call.
      *
      * Will get automatically set to true if a new child is added, or if a child's zIndex changes.
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
      * @see PIXI.settings.SORTABLE_CHILDREN
      */
    var sortableChildren: Boolean = js.native
    
    /**
      * Swaps the position of 2 Display Objects within this container.
      * @param child - First display object to swap
      * @param child2 - Second display object to swap
      */
    def swapChildren(child: DisplayObjectAlpha, child2: DisplayObjectAlpha): Unit = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAlpha): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAlpha, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAlpha, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAlpha, point: Unit, skipUpdate: Boolean): P = js.native
    
    /**
      * World transform and local transform of this object.
      * This will become read-only later, please do not assign anything there unless you know what are you doing.
      */
    var transform: Transform = js.native
    
    /** Updates the transform on all children of this container for rendering. */
    def updateTransform(): Unit = js.native
    
    /**
      * The visibility of the object. If false the object will not be drawn, and
      * the updateTransform function will not be called.
      *
      * Only affects recursive calls from parent. You can ask for bounds or call updateTransform manually.
      */
    var visible: Boolean = js.native
    
    /** The width of the Container, setting this will actually modify the scale to achieve the value set. */
    def width: Double = js.native
    def width_=(value: Double): Unit = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.DisplayObject */
  @js.native
  trait DisplayObject extends StObject {
    
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
    var _mask: ContainerDisplayObject | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: TemporaryDisplayObjectAddListener = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
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
    def disableTempParent(cacheParent: ContainerDisplayObject): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): ContainerDisplayObject = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: ContainerDisplayObject | MaskData | Null = js.native
    def mask_=(value: ContainerDisplayObject | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The display object container that contains this display object. */
    var parent: ContainerDisplayObject = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
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
    def setParent(container: ContainerDisplayObject): ContainerDisplayObject = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](
      position: IPointData,
      from: typings.pixiDisplay.mod.DisplayObject,
      point: Unit,
      skipUpdate: Boolean
    ): P = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.DisplayObject */
  @js.native
  trait DisplayObjectAddListener extends StObject {
    
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
    var _mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData = js.native
    
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
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
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
    def disableTempParent(cacheParent: Container[typings.pixiDisplay.mod.DisplayObject]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null = js.native
    def mask_=(value: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The display object container that contains this display object. */
    var parent: Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
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
    def setParent(container: Container[typings.pixiDisplay.mod.DisplayObject]): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](
      position: IPointData,
      from: typings.pixiDisplay.mod.DisplayObject,
      point: Unit,
      skipUpdate: Boolean
    ): P = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.DisplayObject */
  @js.native
  trait DisplayObjectAlpha extends StObject {
    
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
    var _mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: typings.pixiDisplay.mod.TemporaryDisplayObject = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
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
    def disableTempParent(cacheParent: Container[typings.pixiDisplay.mod.DisplayObject]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null = js.native
    def mask_=(value: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The display object container that contains this display object. */
    var parent: Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
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
    def setParent(container: Container[typings.pixiDisplay.mod.DisplayObject]): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](
      position: IPointData,
      from: typings.pixiDisplay.mod.DisplayObject,
      point: Unit,
      skipUpdate: Boolean
    ): P = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.DisplayObject */
  @js.native
  trait DisplayObjectAngle extends StObject {
    
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
    var _mask: ContainerDisplayObjectAddChild | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: typings.pixiDisplay.mod.TemporaryDisplayObject = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
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
    def disableTempParent(cacheParent: ContainerDisplayObjectAddChild): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): ContainerDisplayObjectAddChild = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: ContainerDisplayObjectAddChild | MaskData | Null = js.native
    def mask_=(value: ContainerDisplayObjectAddChild | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The display object container that contains this display object. */
    var parent: ContainerDisplayObjectAddChild = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
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
    def setParent(container: ContainerDisplayObjectAddChild): ContainerDisplayObjectAddChild = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](
      position: IPointData,
      from: typings.pixiDisplay.mod.DisplayObject,
      point: Unit,
      skipUpdate: Boolean
    ): P = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.TemporaryDisplayObject */
  @js.native
  trait TemporaryDisplayObject extends StObject {
    
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
    var _mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: typings.pixiDisplay.mod.TemporaryDisplayObject = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    def calculateBounds(): Null = js.native
    /** Recalculates the bounds of the display object. */
    @JSName("calculateBounds")
    def calculateBounds_Unit(): Unit = js.native
    
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
    def disableTempParent(cacheParent: Container[typings.pixiDisplay.mod.DisplayObject]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null = js.native
    def mask_=(value: Container[typings.pixiDisplay.mod.DisplayObject] | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The display object container that contains this display object. */
    var parent: Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: typings.pixiDisplay.mod.DisplayObject): Null = js.native
    @JSName("removeChild")
    def removeChild_Unit(child: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    def render(renderer: Renderer): Null = js.native
    /**
      * Renders the object using the WebGL renderer.
      * @param renderer - The renderer.
      */
    @JSName("render")
    def render_Unit(renderer: Renderer): Unit = js.native
    
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
    def setParent(container: Container[typings.pixiDisplay.mod.DisplayObject]): Container[typings.pixiDisplay.mod.DisplayObject] = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](
      position: IPointData,
      from: typings.pixiDisplay.mod.DisplayObject,
      point: Unit,
      skipUpdate: Boolean
    ): P = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.TemporaryDisplayObject */
  @js.native
  trait TemporaryDisplayObjectAddListener extends StObject {
    
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
    var _mask: ContainerDisplayObjectAddChild | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: typings.pixiDisplay.mod.TemporaryDisplayObject = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    def calculateBounds(): Null = js.native
    /** Recalculates the bounds of the display object. */
    @JSName("calculateBounds")
    def calculateBounds_Unit(): Unit = js.native
    
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
    def disableTempParent(cacheParent: ContainerDisplayObjectAddChild): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): ContainerDisplayObjectAddChild = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: ContainerDisplayObjectAddChild | MaskData | Null = js.native
    def mask_=(value: ContainerDisplayObjectAddChild | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The display object container that contains this display object. */
    var parent: ContainerDisplayObjectAddChild = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: typings.pixiDisplay.mod.DisplayObject): Null = js.native
    @JSName("removeChild")
    def removeChild_Unit(child: typings.pixiDisplay.mod.DisplayObject): Unit = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    def render(renderer: Renderer): Null = js.native
    /**
      * Renders the object using the WebGL renderer.
      * @param renderer - The renderer.
      */
    @JSName("render")
    def render_Unit(renderer: Renderer): Unit = js.native
    
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
    def setParent(container: ContainerDisplayObjectAddChild): ContainerDisplayObjectAddChild = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: typings.pixiDisplay.mod.DisplayObject, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](
      position: IPointData,
      from: typings.pixiDisplay.mod.DisplayObject,
      point: Unit,
      skipUpdate: Boolean
    ): P = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.TemporaryDisplayObject */
  @js.native
  trait TemporaryDisplayObjectAlpha extends StObject {
    
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
    var _mask: Container[DisplayObjectAlpha] | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: typings.pixiDisplay.mod.TemporaryDisplayObject = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    def calculateBounds(): Null = js.native
    /** Recalculates the bounds of the display object. */
    @JSName("calculateBounds")
    def calculateBounds_Unit(): Unit = js.native
    
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
    def disableTempParent(cacheParent: Container[DisplayObjectAlpha]): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): Container[DisplayObjectAlpha] = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: Container[DisplayObjectAlpha] | MaskData | Null = js.native
    def mask_=(value: Container[DisplayObjectAlpha] | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The display object container that contains this display object. */
    var parent: Container[DisplayObjectAlpha] = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: DisplayObjectAlpha): Null = js.native
    @JSName("removeChild")
    def removeChild_Unit(child: DisplayObjectAlpha): Unit = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    def render(renderer: Renderer): Null = js.native
    /**
      * Renders the object using the WebGL renderer.
      * @param renderer - The renderer.
      */
    @JSName("render")
    def render_Unit(renderer: Renderer): Unit = js.native
    
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
    def setParent(container: Container[DisplayObjectAlpha]): Container[DisplayObjectAlpha] = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAlpha): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAlpha, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAlpha, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAlpha, point: Unit, skipUpdate: Boolean): P = js.native
    
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
  
  /* Inlined @pixi/display.@pixi/display.TemporaryDisplayObject */
  @js.native
  trait TemporaryDisplayObjectAngle extends StObject {
    
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
    var _mask: ContainerDisplayObjectAddListener | MaskData = js.native
    
    /** The number of times this object is used as a mask by another object. */
    /* private */ var _maskRefCount: Any = js.native
    
    /** Recursively updates transform of all objects from the root to this one internal function for toLocal() */
    /* protected */ def _recursivePostUpdateTransform(): Unit = js.native
    
    /**
      * @protected
      * @member {PIXI.Container}
      */
    def _tempDisplayObjectParent: typings.pixiDisplay.mod.TemporaryDisplayObject = js.native
    
    /**
      * The zIndex of the displayObject.
      * A higher value will mean it will be rendered on top of other displayObjects within the same container.
      * @protected
      */
    /* protected */ var _zIndex: Double = js.native
    
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def addListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The opacity of the object. */
    var alpha: Double = js.native
    
    /**
      * The angle of the object in degrees.
      * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    def calculateBounds(): Null = js.native
    /** Recalculates the bounds of the display object. */
    @JSName("calculateBounds")
    def calculateBounds_Unit(): Unit = js.native
    
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
    def disableTempParent(cacheParent: ContainerDisplayObjectAddListener): Unit = js.native
    
    def displayObjectUpdateTransform(): Unit = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      */
    def emit[T /* <: EventNames[String | js.Symbol] */](
      event: T,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventEmitter.EventArgs<EventTypes, T> is not an array type */ args: EventArgs[String | js.Symbol, T]
    ): Boolean = js.native
    
    /**
      * Used in Renderer, cacheAsBitmap and other places where you call an `updateTransform` on root
      *
      * ```
      * const cacheParent = elem.enableTempParent();
      * elem.updateTransform();
      * elem.disableTempParent(cacheParent);
      * ```
      * @returns - current parent
      */
    def enableTempParent(): ContainerDisplayObjectAddListener = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered
      * listeners.
      */
    def eventNames(): js.Array[EventNames[String | js.Symbol]] = js.native
    
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
      * Return the number of listeners listening to a given event.
      */
    def listenerCount(event: EventNames[String | js.Symbol]): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      */
    def listeners[T /* <: EventNames[String | js.Symbol] */](event: T): js.Array[EventListener[String | js.Symbol, T]] = js.native
    
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
      * const graphics = new PIXI.Graphics();
      * graphics.beginFill(0xFF3300);
      * graphics.drawRect(50, 250, 100, 100);
      * graphics.endFill();
      *
      * const sprite = new PIXI.Sprite(texture);
      * sprite.mask = graphics;
      * @todo At the moment, PIXI.CanvasRenderer doesn't support PIXI.Sprite as mask.
      */
    def mask: ContainerDisplayObjectAddListener | MaskData | Null = js.native
    def mask_=(value: ContainerDisplayObjectAddListener | MaskData | Null): Unit = js.native
    
    def off[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def off[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      */
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def on[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      */
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def once[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    
    /** The display object container that contains this display object. */
    var parent: ContainerDisplayObjectAddListener = js.native
    
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
    
    /**
      * Remove all listeners, or those of the specified event.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: EventNames[String | js.Symbol]): this.type = js.native
    
    def removeChild(child: DisplayObjectAngle): Null = js.native
    @JSName("removeChild")
    def removeChild_Unit(child: DisplayObjectAngle): Unit = js.native
    
    /**
      * Remove the listeners of a given event.
      */
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: Unit, context: Unit, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T]): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Any, once: Boolean): this.type = js.native
    def removeListener[T /* <: EventNames[String | js.Symbol] */](event: T, fn: EventListener[String | js.Symbol, T], context: Unit, once: Boolean): this.type = js.native
    
    def render(renderer: Renderer): Null = js.native
    /**
      * Renders the object using the WebGL renderer.
      * @param renderer - The renderer.
      */
    @JSName("render")
    def render_Unit(renderer: Renderer): Unit = js.native
    
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
    def setParent(container: ContainerDisplayObjectAddListener): ContainerDisplayObjectAddListener = js.native
    
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
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAngle): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAngle, point: P): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAngle, point: P, skipUpdate: Boolean): P = js.native
    def toLocal[P /* <: IPointData */](position: IPointData, from: DisplayObjectAngle, point: Unit, skipUpdate: Boolean): P = js.native
    
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
}
