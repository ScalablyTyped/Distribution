package typings.mssql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type IColumnMetadata = org.scalablytyped.runtime.StringDictionary[typings.mssql.anon.CaseSensitive]
  
  type IIsolationLevel = scala.Double
  
  type IRequestParameters = org.scalablytyped.runtime.StringDictionary[typings.mssql.anon.Io]
  
  type IRow = js.Array[
    js.UndefOr[
      java.lang.String | scala.Double | scala.Boolean | typings.std.Date | typings.node.Buffer
    ]
  ]
}
