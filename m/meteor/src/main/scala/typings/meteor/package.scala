package typings

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteor {
  type EJSON = EJSONable
  type EJSONable = StringDictionary[EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Date | Uint8Array | EJSONableCustomType | Null
  ]
  type Header = StringDictionary[String]
  type JSONable = StringDictionary[
    js.UndefOr[
      Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Null
    ]
  ]
  type global_Error = Error
}
