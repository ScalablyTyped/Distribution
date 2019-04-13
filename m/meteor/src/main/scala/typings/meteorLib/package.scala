package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteorLib {
  type EJSON = EJSONable
  type EJSONable = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      scala.Double | java.lang.String | scala.Boolean | js.Object | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[js.Object] | stdLib.Date | stdLib.Uint8Array | EJSONableCustomType | scala.Null
    ]
  ]
  type Header = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type JSONable = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      scala.Double | java.lang.String | scala.Boolean | js.Object | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[js.Object] | scala.Null
    ]
  ]
}
