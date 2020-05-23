package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialDomain
import typings.plotlyJs.anon.PartialMapboxCenter
import typings.plotlyJs.anon.PartialMapboxLayersCircle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapbox extends js.Object {
  var accesstoken: String
  var bearing: Double
  var center: PartialMapboxCenter
  var domain: PartialDomain
  var layers: js.Array[PartialMapboxLayersCircle]
  var pitch: Double
  var style: Double | String
  var uirevision: Double | String
  var zoom: Double
}

object Mapbox {
  @scala.inline
  def apply(
    accesstoken: String,
    bearing: Double,
    center: PartialMapboxCenter,
    domain: PartialDomain,
    layers: js.Array[PartialMapboxLayersCircle],
    pitch: Double,
    style: Double | String,
    uirevision: Double | String,
    zoom: Double
  ): Mapbox = {
    val __obj = js.Dynamic.literal(accesstoken = accesstoken.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapbox]
  }
}

