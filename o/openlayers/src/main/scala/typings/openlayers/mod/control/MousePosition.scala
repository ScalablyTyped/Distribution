package typings.openlayers.mod.control

import typings.openlayers.mod.CoordinateFormatType
import typings.openlayers.mod.MapEvent
import typings.openlayers.mod.olx.control.MousePositionOptions
import typings.openlayers.mod.proj.Projection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A control to show the 2D coordinates of the mouse cursor. By default, these
  * are in the view projection, but can be in any supported projection.
  * By default the control is shown in the top right corner of the map, but this
  * can be changed by using the css selector `.ol-mouse-position`.
  *
  * @param opt_options Mouse position
  *     options.
  * @api stable
  */
@JSImport("openlayers", "control.MousePosition")
@js.native
/**
  * @classdesc
  * A control to show the 2D coordinates of the mouse cursor. By default, these
  * are in the view projection, but can be in any supported projection.
  * By default the control is shown in the top right corner of the map, but this
  * can be changed by using the css selector `.ol-mouse-position`.
  *
  * @param opt_options Mouse position
  *     options.
  * @api stable
  */
class MousePosition () extends Control {
  def this(opt_options: MousePositionOptions) = this()
  /**
    * Return the coordinate format type used to render the current position or
    * undefined.
    * @return The format to render the current
    *     position in.
    * @observable
    * @api stable
    */
  def getCoordinateFormat(): CoordinateFormatType = js.native
  /**
    * Return the projection that is used to report the mouse position.
    * @return The projection to report mouse
    *     position in.
    * @observable
    * @api stable
    */
  def getProjection(): Projection = js.native
  /**
    * Set the coordinate format type used to render the current position.
    * @param format The format to render the current
    *     position in.
    * @observable
    * @api stable
    */
  def setCoordinateFormat(format: CoordinateFormatType): Unit = js.native
  /**
    * Set the projection that is used to report the mouse position.
    * @param projection The projection to report mouse
    *     position in.
    * @observable
    * @api stable
    */
  def setProjection(projection: Projection): Unit = js.native
}

/* static members */
@JSImport("openlayers", "control.MousePosition")
@js.native
object MousePosition extends js.Object {
  /**
    * Update the mouseposition element.
    * @param mapEvent Map event.
    * @api
    */
  def render(mapEvent: MapEvent): Unit = js.native
}

