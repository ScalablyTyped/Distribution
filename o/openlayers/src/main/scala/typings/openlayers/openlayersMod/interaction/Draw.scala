package typings.openlayers.openlayersMod.interaction

import typings.openlayers.openlayersMod.DrawGeometryFunctionType
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.olx.interaction.DrawOptions
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
@JSImport("openlayers", "interaction.Draw")
@js.native
class Draw protected () extends Pointer {
  /**
    * @classdesc
    * Interaction for drawing feature geometries.
    *
    * @fires ol.interaction.DrawEvent
    * @param options Options.
    * @api stable
    */
  def this(options: DrawOptions) = this()
  /**
    * Extend an existing geometry by adding additional points. This only works
    * on features with `LineString` geometries, where the interaction will
    * extend lines by adding points to the end of the coordinates array.
    * @param feature Feature to be extended.
    * @api
    */
  def extend(feature: Feature): Unit = js.native
  /**
    * Stop drawing and add the sketch feature to the target layer.
    * The {@link ol.interaction.DrawEventType.DRAWEND} event is dispatched before
    * inserting the feature.
    * @api
    */
  def finishDrawing(): Unit = js.native
  /**
    * Remove last point of the feature currently being drawn.
    * @api
    */
  def removeLastPoint(): Unit = js.native
}

/* static members */
@JSImport("openlayers", "interaction.Draw")
@js.native
object Draw extends js.Object {
  /**
    * @classdesc
    * Events emitted by {@link ol.interaction.Draw} instances are instances of
    * this type.
    *
    * @param type Type.
    * @param feature The feature drawn.
    */
  @js.native
  class Event protected ()
    extends typings.openlayers.openlayersMod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Draw} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param feature The feature drawn.
      */
    def this(`type`: DrawEventType, feature: Feature) = this()
    /**
      * The feature being drawn.
      * @api stable
      */
    var feature: Feature = js.native
  }
  
  /**
    * Create a `geometryFunction` that will create a box-shaped polygon (aligned
    * with the coordinate system axes).  Use this with the draw interaction and
    * `type: 'Circle'` to return a box instead of a circle geometry.
    * @return Function that draws a box-shaped polygon.
    * @api
    */
  def createBox(): DrawGeometryFunctionType = js.native
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
  def createRegularPolygon(): DrawGeometryFunctionType = js.native
  def createRegularPolygon(opt_sides: Double): DrawGeometryFunctionType = js.native
  def createRegularPolygon(opt_sides: Double, opt_angle: Double): DrawGeometryFunctionType = js.native
}

