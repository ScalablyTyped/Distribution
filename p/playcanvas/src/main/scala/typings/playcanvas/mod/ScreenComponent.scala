package typings.playcanvas.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ScreenComponent enables the Entity to render child {@link ElementComponent}s using anchors and
  * positions in the ScreenComponent's space.
  *
  * @augments Component
  */
@JSImport("playcanvas", "ScreenComponent")
@js.native
open class ScreenComponent protected () extends Component {
  /**
    * Create a new ScreenComponent.
    *
    * @param {import('./system.js').ScreenComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: ScreenComponentSystem, entity: Entity) = this()
  
  def _bindElement(element: Any): Unit = js.native
  
  def _calcProjectionMatrix(): Unit = js.native
  
  def _calcScale(resolution: Any, referenceResolution: Any): Double = js.native
  
  var _elements: Set[Any] = js.native
  
  def _onResize(width: Any, height: Any): Unit = js.native
  
  var _priority: Double = js.native
  
  def _processDrawOrderSync(): Unit = js.native
  
  def _recurseDrawOrderSync(e: Any, i: Any): Any = js.native
  
  var _referenceResolution: Vec2 = js.native
  
  var _resolution: Vec2 = js.native
  
  var _scaleBlend: Double = js.native
  
  var _scaleMode: String = js.native
  
  var _screenMatrix: Mat4 = js.native
  
  var _screenSpace: Boolean = js.native
  
  def _unbindElement(element: Any): Unit = js.native
  
  def _updateScale(): Unit = js.native
  
  /**
    * If true then elements inside this screen will be not be rendered when outside of the
    * screen (only valid when screenSpace is true).
    *
    * @type {boolean}
    */
  var cull: Boolean = js.native
  
  def onRemove(): Unit = js.native
  
  def priority: Double = js.native
  /**
    * Priority determines the order in which Screen components in the same layer are rendered.
    * Number must be an integer between 0 and 255. Priority is set into the top 8 bits of the
    * drawOrder property in an element.
    *
    * @type {number}
    */
  def priority_=(arg: Double): Unit = js.native
  
  def referenceResolution: Vec2 = js.native
  /**
    * The resolution that the ScreenComponent is designed for. This is only taken into account
    * when screenSpace is true and scaleMode is {@link SCALEMODE_BLEND}. If the actual resolution
    * is different then the ScreenComponent will be scaled according to the scaleBlend value.
    *
    * @type {Vec2}
    */
  def referenceResolution_=(arg: Vec2): Unit = js.native
  
  def resolution: Vec2 = js.native
  /**
    * The width and height of the ScreenComponent. When screenSpace is true the resolution will
    * always be equal to {@link GraphicsDevice#width} x {@link GraphicsDevice#height}.
    *
    * @type {Vec2}
    */
  def resolution_=(arg: Vec2): Unit = js.native
  
  var scale: Double = js.native
  
  def scaleBlend: Double = js.native
  /**
    * A value between 0 and 1 that is used when scaleMode is equal to {@link SCALEMODE_BLEND}.
    * Scales the ScreenComponent with width as a reference (when value is 0), the height as a
    * reference (when value is 1) or anything in between.
    *
    * @type {number}
    */
  def scaleBlend_=(arg: Double): Unit = js.native
  
  def scaleMode: String = js.native
  /**
    * Can either be {@link SCALEMODE_NONE} or {@link SCALEMODE_BLEND}. See the description of
    * referenceResolution for more information.
    *
    * @type {string}
    */
  def scaleMode_=(arg: String): Unit = js.native
  
  def screenSpace: Boolean = js.native
  /**
    * If true then the ScreenComponent will render its child {@link ElementComponent}s in screen
    * space instead of world space. Enable this to create 2D user interfaces.
    *
    * @type {boolean}
    */
  def screenSpace_=(arg: Boolean): Unit = js.native
  
  /**
    * Set the drawOrder of each child {@link ElementComponent} so that ElementComponents which are
    * last in the hierarchy are rendered on top. Draw Order sync is queued and will be updated by
    * the next update loop.
    */
  def syncDrawOrder(): Unit = js.native
}
