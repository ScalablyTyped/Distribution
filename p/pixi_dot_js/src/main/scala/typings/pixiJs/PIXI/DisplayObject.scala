package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.interaction.InteractionEvent
import typings.pixiJs.PIXI.interaction.InteractionEventTypes
import typings.pixiJs.PIXI.utils.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for all objects that are rendered on the screen.
  *
  * This is an abstract class and should not be used on its own; rather it should be extended.
  *
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@js.native
trait DisplayObject extends EventEmitter {
  /**
    * @member {boolean}
    * @memberof PIXI.DisplayObject#
    * @todo Needs docs.
    */
  var _accessibleActive: Boolean = js.native
  /**
    * @member {boolean}
    * @memberof PIXI.DisplayObject#
    * @todo Needs docs.
    */
  var _accessibleDiv: Boolean = js.native
  /**
    * The bounds object, this is used to calculate and store the bounds of the displayObject.
    *
    * @member {PIXI.Bounds} PIXI.DisplayObject#_bounds
    * @protected
    */
  var _bounds: Bounds = js.native
  /**
    * If the object has been destroyed via destroy(). If true, it should not be used.
    *
    * @member {boolean} PIXI.DisplayObject#_destroyed
    * @protected
    */
  var _destroyed: Boolean = js.native
  /**
    * Which index in the children array the display component was before the previous zIndex sort.
    * Used by containers to help sort objects with the same zIndex, by using previous array index as the decider.
    *
    * @member {number} PIXI.DisplayObject#_lastSortedIndex
    * @protected
    */
  var _lastSortedIndex: Double = js.native
  /**
    * The original, cached mask of the object.
    *
    * @member {PIXI.Graphics|PIXI.Sprite|null} PIXI.DisplayObject#_mask
    * @protected
    */
  var _mask: Graphics | Sprite | Null = js.native
  /**
    * @protected
    * @member {PIXI.DisplayObject}
    */
  var _tempDisplayObjectParent: DisplayObject = js.native
  /**
    * The zIndex of the displayObject.
    * A higher value will mean it will be rendered on top of other displayObjects within the same container.
    *
    * @member {number} PIXI.DisplayObject#_zIndex
    * @protected
    */
  var _zIndex: Double = js.native
  /**
    *  Flag for if the object is accessible. If true AccessibilityManager will overlay a
    *   shadow div with attributes set
    *
    * @member {boolean}
    * @memberof PIXI.DisplayObject#
    */
  var accessible: Boolean = js.native
  /**
    * Setting to false will prevent any children inside this container to
    * be accessible. Defaults to true.
    *
    * @member {boolean}
    * @memberof PIXI.DisplayObject#
    * @default true
    */
  var accessibleChildren: Boolean = js.native
  /**
    * Sets the aria-label attribute of the shadow div
    *
    * @member {string}
    * @memberof PIXI.DisplayObject#
    */
  var accessibleHint: String = js.native
  /**
    * Specify the pointer-events the accessible div will use
    * Defaults to auto.
    *
    * @member {string}
    * @memberof PIXI.DisplayObject#
    * @default 'auto'
    */
  var accessiblePointerEvents: String = js.native
  /**
    * Sets the title attribute of the shadow div
    * If accessibleTitle AND accessibleHint has not been this will default to 'displayObject [tabIndex]'
    *
    * @member {?string}
    * @memberof PIXI.DisplayObject#
    */
  var accessibleTitle: String = js.native
  /**
    * Specify the type of div the accessible layer is. Screen readers treat the element differently
    * depending on this type. Defaults to button.
    *
    * @member {string}
    * @memberof PIXI.DisplayObject#
    * @default 'button'
    */
  var accessibleType: String = js.native
  /**
    * The opacity of the object.
    *
    * @member {number} PIXI.DisplayObject#alpha
    */
  var alpha: Double = js.native
  /**
    * The angle of the object in degrees.
    * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
    *
    * @member {number}
    */
  var angle: Double = js.native
  /**
    * If enabled, the mouse cursor use the pointer behavior when hovered over the displayObject if it is interactive
    * Setting this changes the 'cursor' property to `'pointer'`.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.buttonMode = true;
    * @member {boolean}
    * @memberof PIXI.DisplayObject#
    */
  var buttonMode: Boolean = js.native
  /**
    * Set this to true if you want this display object to be cached as a bitmap.
    * This basically takes a snap shot of the display object as it is at that moment. It can
    * provide a performance benefit for complex static displayObjects.
    * To remove simply set this property to `false`
    *
    * IMPORTANT GOTCHA - Make sure that all your textures are preloaded BEFORE setting this property to true
    * as it will take a snapshot of what is currently there. If the textures have not loaded then they will not appear.
    *
    * @member {boolean}
    * @memberof PIXI.DisplayObject#
    */
  var cacheAsBitmap: Boolean = js.native
  /**
    * This defines what cursor mode is used when the mouse cursor
    * is hovered over the displayObject.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.cursor = 'wait';
    * @see https://developer.mozilla.org/en/docs/Web/CSS/cursor
    *
    * @member {string}
    * @memberof PIXI.DisplayObject#
    */
  var cursor: String = js.native
  /**
    * The area the filter is applied to. This is used as more of an optimization
    * rather than figuring out the dimensions of the displayObject each frame you can set this rectangle.
    *
    * Also works as an interaction mask.
    *
    * @member {?PIXI.Rectangle} PIXI.DisplayObject#filterArea
    */
  var filterArea: Rectangle = js.native
  /**
    * Sets the filters for the displayObject.
    * * IMPORTANT: This is a WebGL only feature and will be ignored by the canvas renderer.
    * To remove filters simply set this property to `'null'`.
    *
    * @member {?PIXI.Filter[]} PIXI.DisplayObject#filters
    */
  var filters: js.Array[Filter] = js.native
  /**
    * Interaction shape. Children will be hit first, then this shape will be checked.
    * Setting this will cause this shape to be checked in hit tests rather than the displayObject's bounds.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.hitArea = new PIXI.Rectangle(0, 0, 100, 100);
    * @member {PIXI.IHitArea}
    * @memberof PIXI.DisplayObject#
    */
  var hitArea: IHitArea = js.native
  /**
    * Enable interaction events for the DisplayObject. Touch, pointer and mouse
    * events will not be emitted unless `interactive` is set to `true`.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.interactive = true;
    * sprite.on('tap', (event) => {
    *    //handle event
    * });
    * @member {boolean}
    * @memberof PIXI.DisplayObject#
    */
  var interactive: Boolean = js.native
  /**
    * Does any other displayObject use this object as a mask?
    * @member {boolean} PIXI.DisplayObject#isMask
    */
  var isMask: Boolean = js.native
  /**
    * used to fast check if a sprite is.. a sprite!
    * @member {boolean} PIXI.DisplayObject#isSprite
    */
  var isSprite: Boolean = js.native
  /**
    * Current transform of the object based on local factors: position, scale, other stuff.
    *
    * @member {PIXI.Matrix}
    * @readonly
    */
  val localTransform: Matrix = js.native
  /**
    * Sets a mask for the displayObject. A mask is an object that limits the visibility of an
    * object to the shape of the mask applied to it. In PixiJS a regular mask must be a
    * {@link PIXI.Graphics} or a {@link PIXI.Sprite} object. This allows for much faster masking in canvas as it
    * utilities shape clipping. To remove a mask, set this property to `null`.
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
    *
    * @member {PIXI.Container|PIXI.MaskData}
    */
  var mask: Container | MaskData = js.native
  /**
    * The instance name of the object.
    *
    * @memberof PIXI.DisplayObject#
    * @member {string} name
    */
  var name: String = js.native
  /**
    * The display object container that contains this display object.
    *
    * @member {PIXI.Container} PIXI.DisplayObject#parent
    * @readonly
    */
  val parent: Container = js.native
  /**
    * The pivot point of the displayObject that it rotates around.
    * Assignment by value since pixi-v4.
    *
    * @member {PIXI.IPoint}
    */
  var pivot: IPoint = js.native
  /**
    * The coordinate of the object relative to the local coordinates of the parent.
    * Assignment by value since pixi-v4.
    *
    * @member {PIXI.IPoint}
    */
  var position: IPoint = js.native
  /**
    * Can this object be rendered, if false the object will not be drawn but the updateTransform
    * methods will still be called.
    *
    * Only affects recursive calls from parent. You can ask for bounds manually.
    *
    * @member {boolean} PIXI.DisplayObject#renderable
    */
  var renderable: Boolean = js.native
  /**
    * The rotation of the object in radians.
    * 'rotation' and 'angle' have the same effect on a display object; rotation is in radians, angle is in degrees.
    *
    * @member {number}
    */
  var rotation: Double = js.native
  /**
    * The scale factor of the object.
    * Assignment by value since pixi-v4.
    *
    * @member {PIXI.IPoint}
    */
  var scale: IPoint = js.native
  /**
    * The skew factor for the object in radians.
    * Assignment by value since pixi-v4.
    *
    * @member {PIXI.ObservablePoint}
    */
  var skew: ObservablePoint = js.native
  /**
    * World transform and local transform of this object.
    * This will become read-only later, please do not assign anything there unless you know what are you doing.
    *
    * @member {PIXI.Transform} PIXI.DisplayObject#transform
    */
  var transform: Transform = js.native
  /**
    * The visibility of the object. If false the object will not be drawn, and
    * the updateTransform function will not be called.
    *
    * Only affects recursive calls from parent. You can ask for bounds or call updateTransform manually.
    *
    * @member {boolean} PIXI.DisplayObject#visible
    */
  var visible: Boolean = js.native
  /**
    * The multiplied alpha of the displayObject.
    *
    * @member {number} PIXI.DisplayObject#worldAlpha
    * @readonly
    */
  val worldAlpha: Double = js.native
  /**
    * Current transform of the object based on world (parent) factors.
    *
    * @member {PIXI.Matrix}
    * @readonly
    */
  val worldTransform: Matrix = js.native
  /**
    * Indicates if the object is globally visible.
    *
    * @member {boolean}
    * @readonly
    */
  val worldVisible: Boolean = js.native
  /**
    * The position of the displayObject on the x axis relative to the local coordinates of the parent.
    * An alias to position.x
    *
    * @member {number}
    */
  var x: Double = js.native
  /**
    * The position of the displayObject on the y axis relative to the local coordinates of the parent.
    * An alias to position.y
    *
    * @member {number}
    */
  var y: Double = js.native
  /**
    * The zIndex of the displayObject.
    * If a container has the sortableChildren property set to true, children will be automatically
    * sorted by zIndex value; a higher value will mean it will be moved towards the end of the array,
    * and thus rendered on top of other displayObjects within the same container.
    *
    * @member {number}
    */
  var zIndex: Double = js.native
  /**
    * Recursively updates transform of all objects from the root to this one
    * internal function for toLocal()
    */
  def _recursivePostUpdateTransform(): Unit = js.native
  def addListener(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def addListener(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  /**
    * Recalculates the bounds of the display object.
    *
    * Does nothing by default and can be overwritten in a parent class.
    */
  def calculateBounds(): Unit = js.native
  /**
    * Base destroy method for generic display objects. This will automatically
    * remove the display object from its parent Container as well as remove
    * all current event listeners and internal references. Do not use a DisplayObject
    * after calling `destroy()`.
    *
    */
  def destroy(): Unit = js.native
  /**
    * DisplayObject default updateTransform, does not update children of container.
    * Will crash if there's no parent element.
    *
    * @memberof PIXI.DisplayObject#
    * @function displayObjectUpdateTransform
    */
  def displayObjectUpdateTransform(): Unit = js.native
  /**
    * Retrieves the bounds of the displayObject as a rectangle object.
    *
    * @param {boolean} [skipUpdate] - Setting to `true` will stop the transforms of the scene graph from
    *  being updated. This means the calculation returned MAY be out of date BUT will give you a
    *  nice performance boost.
    * @param {PIXI.Rectangle} [rect] - Optional rectangle to store the result of the bounds calculation.
    * @return {PIXI.Rectangle} The rectangular bounding area.
    */
  def getBounds(): Rectangle = js.native
  def getBounds(skipUpdate: Boolean): Rectangle = js.native
  def getBounds(skipUpdate: Boolean, rect: Rectangle): Rectangle = js.native
  /**
    * Returns the global position of the displayObject. Does not depend on object scale, rotation and pivot.
    *
    * @method getGlobalPosition
    * @memberof PIXI.DisplayObject#
    * @param {PIXI.Point} [point=new PIXI.Point()] - The point to write the global value to.
    * @param {boolean} [skipUpdate=false] - Setting to true will stop the transforms of the scene graph from
    *  being updated. This means the calculation returned MAY be out of date BUT will give you a
    *  nice performance boost.
    * @return {PIXI.Point} The updated point.
    */
  def getGlobalPosition(): Point = js.native
  def getGlobalPosition(point: Point): Point = js.native
  def getGlobalPosition(point: Point, skipUpdate: Boolean): Point = js.native
  /**
    * Retrieves the local bounds of the displayObject as a rectangle object.
    *
    * @param {PIXI.Rectangle} [rect] - Optional rectangle to store the result of the bounds calculation.
    * @return {PIXI.Rectangle} The rectangular bounding area.
    */
  def getLocalBounds(): Rectangle = js.native
  def getLocalBounds(rect: Rectangle): Rectangle = js.native
  def off(event: InteractionEventTypes): this.type = js.native
  def off(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def off(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  def on(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def on(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  def once(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def once(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  def removeAllListeners(event: InteractionEventTypes): this.type = js.native
  def removeListener(event: InteractionEventTypes): this.type = js.native
  def removeListener(event: InteractionEventTypes, fn: js.Function1[/* event */ InteractionEvent, Unit]): this.type = js.native
  def removeListener(
    event: InteractionEventTypes,
    fn: js.Function1[/* event */ InteractionEvent, Unit],
    context: js.Any
  ): this.type = js.native
  /**
    * Renders the object using the WebGL renderer.
    *
    * @param {PIXI.Renderer} renderer - The renderer.
    */
  def render(renderer: Renderer): Unit = js.native
  /**
    * Set the parent Container of this DisplayObject.
    *
    * @param {PIXI.Container} container - The Container to add this DisplayObject to.
    * @return {PIXI.Container} The Container that this DisplayObject was added to.
    */
  def setParent(container: Container): Container = js.native
  /**
    * Convenience function to set the position, scale, skew and pivot at once.
    *
    * @param {number} [x=0] - The X position
    * @param {number} [y=0] - The Y position
    * @param {number} [scaleX=1] - The X scale value
    * @param {number} [scaleY=1] - The Y scale value
    * @param {number} [rotation=0] - The rotation
    * @param {number} [skewX=0] - The X skew value
    * @param {number} [skewY=0] - The Y skew value
    * @param {number} [pivotX=0] - The X pivot value
    * @param {number} [pivotY=0] - The Y pivot value
    * @return {PIXI.DisplayObject} The DisplayObject instance
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
  ): DisplayObject = js.native
  /**
    * Calculates the global position of the display object.
    *
    * @param {PIXI.IPoint} position - The world origin to calculate from.
    * @param {PIXI.IPoint} [point] - A Point object in which to store the value, optional
    *  (otherwise will create a new Point).
    * @param {boolean} [skipUpdate=false] - Should we skip the update transform.
    * @return {PIXI.IPoint} A point object representing the position of this object.
    */
  def toGlobal(position: IPoint): IPoint = js.native
  def toGlobal(position: IPoint, point: IPoint): IPoint = js.native
  def toGlobal(position: IPoint, point: IPoint, skipUpdate: Boolean): IPoint = js.native
  /**
    * Calculates the local position of the display object relative to another point.
    *
    * @param {PIXI.IPoint} position - The world origin to calculate from.
    * @param {PIXI.DisplayObject} [from] - The DisplayObject to calculate the global position from.
    * @param {PIXI.IPoint} [point] - A Point object in which to store the value, optional
    *  (otherwise will create a new Point).
    * @param {boolean} [skipUpdate=false] - Should we skip the update transform
    * @return {PIXI.IPoint} A point object representing the position of this object
    */
  def toLocal(position: IPoint): IPoint = js.native
  def toLocal(position: IPoint, from: DisplayObject): IPoint = js.native
  def toLocal(position: IPoint, from: DisplayObject, point: IPoint): IPoint = js.native
  def toLocal(position: IPoint, from: DisplayObject, point: IPoint, skipUpdate: Boolean): IPoint = js.native
  /**
    * Updates the object transform for rendering.
    *
    * TODO - Optimization pass!
    */
  def updateTransform(): Unit = js.native
}

