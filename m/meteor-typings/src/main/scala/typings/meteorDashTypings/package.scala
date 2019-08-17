package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteorDashTypings {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Date
  import typings.std.Uint8Array

  type EJSON = EJSONable
  type EJSONable = StringDictionary[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Date | Uint8Array | EJSONableCustomType
  ]
  type Header = StringDictionary[String]
  type JSONable = StringDictionary[Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String])]
}
