package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.ISQExpr
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataViewValueColumns
  extends StObject
     with Array[DataViewValueColumn] {
  
  /** Returns an array that groups the columns in this group together. */
  def grouped(): js.Array[DataViewValueColumnGroup] = js.native
  
  /** The set of expressions that define the identity for instances of the value group.  This must match items in the DataViewScopeIdentity in the grouped items result. */
  var identityFields: js.UndefOr[js.Array[ISQExpr]] = js.native
  
  var source: js.UndefOr[DataViewMetadataColumn] = js.native
}
