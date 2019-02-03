package typings
package olLib.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Interaction for drawing feature geometries.
  *
  * @fires ol.interaction.DrawEvent
  * @param options Options.
  * @api stable
  */
@JSImport("ol/interaction/draw", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.interactionNs.Draw {
  /**
    * @classdesc
    * Interaction for drawing feature geometries.
    *
    * @fires ol.interaction.DrawEvent
    * @param options Options.
    * @api stable
    */
  def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.DrawOptions) = this()
}

/* static members */
@JSImport("ol/interaction/draw", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Create a `geometryFunction` that will create a box-shaped polygon (aligned
    * with the coordinate system axes).  Use this with the draw interaction and
    * `type: 'Circle'` to return a box instead of a circle geometry.
    * @return Function that draws a box-shaped polygon.
    * @api
    */
  def createBox(): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
  /**
    * Create a `geometryFunction` for `mode: 'Circle'` that will create a regular
    * polygon with a user specified number of sides and start angle instead of an
    * `ol.geom.Circle` geometry.
    * @param opt_sides Number of sides of the regular polygon. Default is
    *     32.
    * @param opt_angle Angle of the first point in radians. 0 means East.
    *     Default is the angle defined by the heading from the center of the
    *     regular polygon to the current pointer position.
    * @return Function that draws a
    *     polygon.
    * @api
    */
  def createRegularPolygon(): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
  def createRegularPolygon(opt_sides: scala.Double): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
  def createRegularPolygon(opt_sides: scala.Double, opt_angle: scala.Double): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
}

