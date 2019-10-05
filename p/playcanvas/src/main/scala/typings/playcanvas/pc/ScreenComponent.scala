package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.ScreenComponent
  * @extends pc.Component
  * @classdesc A ScreenComponent enables the Entity to render child {@link pc.ElementComponent}s using anchors and positions in the ScreenComponent's space.
  * @description Create a new ScreenComponent
  * @param {pc.ScreenComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @property {Boolean} screenSpace If true then the ScreenComponent will render its child {@link pc.ElementComponent}s in screen space instead of world space. Enable this to create 2D user interfaces.
  * @property {Boolean} cull If true then elements inside this screen will be not be rendered when outside of the screen (only valid when screenSpace is true)
  * @property {String} scaleMode Can either be {@link pc.SCALEMODE_NONE} or {@link pc.SCALEMODE_BLEND}. See the description of referenceResolution for more information.
  * @property {Number} scaleBlend A value between 0 and 1 that is used when scaleMode is equal to {@link pc.SCALEMODE_BLEND}. Scales the ScreenComponent with width as a reference (when value is 0), the height as a reference (when value is 1) or anything in between.
  * @property {pc.Vec2} resolution The width and height of the ScreenComponent. When screenSpace is true the resolution will always be equal to {@link pc.GraphicsDevice#width} x {@link pc.GraphicsDevice#height}.
  * @property {pc.Vec2} referenceResolution The resolution that the ScreenComponent is designed for. This is only taken into account when screenSpace is true and scaleMode is {@link pc.SCALEMODE_BLEND}. If the actual resolution is different then the ScreenComponent will be scaled according to the scaleBlend value.
  */
@JSGlobal("pc.ScreenComponent")
@js.native
class ScreenComponent protected () extends Component {
  def this(system: ScreenComponentSystem, entity: Entity) = this()
  /**
    * If true then elements inside this screen will be not be rendered when outside of the screen (only valid when screenSpace is true)
    */
  var cull: Boolean = js.native
  /**
    * The resolution that the ScreenComponent is designed for. This is only taken into account when screenSpace is true and scaleMode is {@link pc.SCALEMODE_BLEND}. If the actual resolution is different then the ScreenComponent will be scaled according to the scaleBlend value.
    */
  var referenceResolution: Vec2 = js.native
  /**
    * The width and height of the ScreenComponent. When screenSpace is true the resolution will always be equal to {@link pc.GraphicsDevice#width} x {@link pc.GraphicsDevice#height}.
    */
  var resolution: Vec2 = js.native
  /**
    * A value between 0 and 1 that is used when scaleMode is equal to {@link pc.SCALEMODE_BLEND}. Scales the ScreenComponent with width as a reference (when value is 0), the height as a reference (when value is 1) or anything in between.
    */
  var scaleBlend: Double = js.native
  /**
    * Can either be {@link pc.SCALEMODE_NONE} or {@link pc.SCALEMODE_BLEND}. See the description of referenceResolution for more information.
    */
  var scaleMode: String = js.native
  /**
    * If true then the ScreenComponent will render its child {@link pc.ElementComponent}s in screen space instead of world space. Enable this to create 2D user interfaces.
    */
  var screenSpace: Boolean = js.native
  /**
    * @function
    * @name pc.ScreenComponent#syncDrawOrder
    * @description Set the drawOrder of each child {@link pc.ElementComponent}
    * so that ElementComponents which are last in the hierarchy are rendered on top.
    * Draw Order sync is queued and will be updated by the next update loop.
    */
  def syncDrawOrder(): Unit = js.native
}

