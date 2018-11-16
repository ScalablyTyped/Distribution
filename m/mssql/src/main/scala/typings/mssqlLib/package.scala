package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mssqlLib {
  type IIsolationLevel = scala.Double
  type IRow = js.Array[
    js.UndefOr[java.lang.String | scala.Double | scala.Boolean | stdLib.Date | nodeLib.Buffer]
  ]
}
