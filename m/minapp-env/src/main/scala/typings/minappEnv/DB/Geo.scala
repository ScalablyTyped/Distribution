package typings.minappEnv.DB

import typings.minappEnv.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geo extends js.Object {
  @JSName("Point")
  var Point_Original: Call = js.native
  def Point(longitude: Double, latitide: Double): GeoPoint = js.native
}

