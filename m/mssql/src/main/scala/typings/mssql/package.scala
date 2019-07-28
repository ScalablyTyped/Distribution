package typings

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mssql {
  type IIsolationLevel = Double
  type IRow = js.Array[js.UndefOr[String | Double | Boolean | Date | Buffer]]
}
