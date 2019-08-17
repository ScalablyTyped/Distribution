package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mssql {
  import typings.node.Buffer
  import typings.std.Date

  type IIsolationLevel = Double
  type IRow = js.Array[js.UndefOr[String | Double | Boolean | Date | Buffer]]
}
