package typings.nodeDashGeocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashGeocoderMod {
  type Options = BaseOptions with (GenericOptions | HereOptions | OpenStreetMapOptions | OpenDataFranceOptions | AgolOptions | SmartyStreetsOptions | GoogleOptions)
}
