package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteor {
  type EJSON = typings.meteor.EJSONable
  type EJSONable = org.scalablytyped.runtime.StringDictionary[typings.meteor.EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | typings.std.Date | typings.std.Uint8Array | typings.meteor.EJSONableCustomType | scala.Null
  ]
  type Header = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type JSONable = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | scala.Null
    ]
  ]
  type UnionOmit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type globalError = typings.std.Error
}
