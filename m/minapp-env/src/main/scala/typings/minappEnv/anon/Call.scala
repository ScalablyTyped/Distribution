package typings.minappEnv.anon

import org.scalablytyped.runtime.Instantiable2
import typings.minappEnv.DB.GeoPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends Instantiable2[/* longitude */ Double, /* latitide */ Double, GeoPoint] {
  def apply(longitude: Double, latitide: Double): GeoPoint = js.native
}

