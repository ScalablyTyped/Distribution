package typings.minappEnv.DB

import typings.minappEnv.AnonCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geo extends js.Object {
  @JSName("Point")
  var Point_Original: AnonCall = js.native
  def Point(longitude: Double, latitide: Double): GeoPoint = js.native
}

