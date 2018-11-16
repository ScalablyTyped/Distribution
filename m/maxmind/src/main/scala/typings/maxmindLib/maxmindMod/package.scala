package typings
package maxmindLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object maxmindMod {
  type Response = CountryResponse | CityResponse | AnonymousIPResponse | AsnResponse | ConnectionTypeResponse | DomainResponse | IspResponse
  type openCb[T /* <: Response */] = js.Function2[/* err */ nodeLib.Error, /* cb */ Reader[T], scala.Unit]
}
