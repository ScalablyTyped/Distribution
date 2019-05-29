package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object meteorDashTypingsLib {
  type EJSON = EJSONable
  type EJSONable = org.scalablytyped.runtime.StringDictionary[
    scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String]) | stdLib.Date | stdLib.Uint8Array | EJSONableCustomType
  ]
  type Header = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type JSONable = org.scalablytyped.runtime.StringDictionary[
    scala.Double | java.lang.String | scala.Boolean | js.Object | (js.Array[scala.Double | js.Object | java.lang.String])
  ]
}
