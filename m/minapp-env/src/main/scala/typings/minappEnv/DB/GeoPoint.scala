package typings.minappEnv.DB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DB.GeoPoint")
@js.native
abstract class GeoPoint protected () extends js.Object {
  def this(longitude: Double, latitude: Double) = this()
  var latitude: Double = js.native
  var longitude: Double = js.native
  def toJSON(): js.Object = js.native
}

