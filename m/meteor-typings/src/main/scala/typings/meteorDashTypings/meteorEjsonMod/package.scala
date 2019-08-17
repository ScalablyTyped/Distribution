package typings.meteorDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteorEjsonMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Date
  import typings.std.Uint8Array

  type EJSON = typings.meteorDashTypings.meteorEjsonMod.EJSONable
  type EJSONable = StringDictionary[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Date | Uint8Array | typings.meteorDashTypings.meteorEjsonMod.EJSONableCustomType
  ]
  type JSONable = StringDictionary[Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String])]
}
