package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ejsonMod {
  type EJSON = typings.meteor.ejsonMod.EJSONable
  type EJSONable = org.scalablytyped.runtime.StringDictionary[typings.meteor.ejsonMod.EJSONableProperty]
  type EJSONableProperty = js.UndefOr[
    scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | typings.std.Date | typings.std.Uint8Array | typings.meteor.ejsonMod.EJSONableCustomType | scala.Null
  ]
  type JSONable = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | scala.Null
    ]
  ]
}
