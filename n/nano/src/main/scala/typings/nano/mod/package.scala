package typings.nano

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[R] = js.Function3[/* error */ js.Any, /* response */ R, /* headers */ js.UndefOr[js.Any], scala.Unit]
  
  // -------------------------------------
  // View
  // -------------------------------------
  type DocumentInfer[D] = js.Function1[/* doc */ D with typings.nano.mod.Document, scala.Unit]
  
  type MangoSelector = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in nano.nano.MangoOperator | string ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nano.nano.MangoSelector * / object | std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias nano.nano.MangoSelector * / object> | nano.nano.MangoValue | std.Array<nano.nano.MangoValue>}
    */ typings.nano.nanoStrings.MangoSelector with org.scalablytyped.runtime.TopLevel[js.Any]
  
  // http://docs.couchdb.org/en/latest/api/database/find.html#selector-syntax
  type MangoValue = scala.Double | java.lang.String | typings.std.Date | scala.Boolean | js.Object | scala.Null
  
  // http://docs.couchdb.org/en/latest/api/database/find.html#sort-syntax
  type SortOrder = java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[typings.nano.nanoStrings.asc | typings.nano.nanoStrings.desc])
}
