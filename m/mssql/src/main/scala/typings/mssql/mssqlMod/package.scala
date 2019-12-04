package typings.mssql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mssqlMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.mssql.Anon_CaseSensitive
  import typings.mssql.Anon_Io
  import typings.node.Buffer

  type IColumnMetadata = StringDictionary[Anon_CaseSensitive]
  type IIsolationLevel = Double
  type IRequestParameters = StringDictionary[Anon_Io]
  type IRow = js.Array[js.UndefOr[String | Double | Boolean | typings.std.Date | Buffer]]
}
