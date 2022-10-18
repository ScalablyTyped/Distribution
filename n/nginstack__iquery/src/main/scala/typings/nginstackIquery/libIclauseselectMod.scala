package typings.nginstackIquery

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIclauseselectMod {
  
  inline def apply(iQuery: IQuery): Unit = ^.asInstanceOf[js.Dynamic].apply(iQuery.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IClauseSelect", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IClauseSelect {
    def this(iQuery: IQuery) = this()
  }
  @JSImport("@nginstack/iquery/lib/IClauseSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  @js.native
  trait IClauseSelect extends StObject {
    
    /* private */ var _aggregateColumns: Any = js.native
    
    /* private */ var _aggregateColumnsNames: Any = js.native
    
    /* private */ var _colsToHide: Any = js.native
    
    /* private */ var _columnCount: Any = js.native
    
    /* private */ var _columns: Any = js.native
    
    /* private */ var _columnsNames: Any = js.native
    
    /* private */ var _convertColumnsToSql: Any = js.native
    
    /* private */ var _convertObjectToColumn: Any = js.native
    
    /* private */ var _exprs: Any = js.native
    
    /* private */ var _generateAvgTerms: Any = js.native
    
    /* private */ var _getColumnFields: Any = js.native
    
    /* private */ var _iQuery: Any = js.native
    
    /* private */ var _joinManager: Any = js.native
    
    /* private */ var _splitExpressionTerms: Any = js.native
    
    /* private */ var _useDistinct: Any = js.native
    
    def column(fields: String): IClauseSelect = js.native
    def column(fields: Record[Any, Any]): IClauseSelect = js.native
    
    def columns(args: Any*): Unit = js.native
    
    var columnsCount: Double = js.native
    
    def columnsToSql(toGroupBy: Boolean): String = js.native
    
    def columnsToSqlArray(): js.Array[Any] = js.native
    
    def distinct(): IClauseSelect = js.native
    
    def execute(): DataSet = js.native
    
    /* private */ var explicitGroupBy_ : Any = js.native
    
    /* private */ var fetchGroupByArr_ : Any = js.native
    
    def getColumnByIndex(index: Double): typings.nginstackIquery.libIcolumnMod.^ = js.native
    
    def groupBy(fields: Any): IClauseSelect = js.native
    
    var iQuery: IQuery = js.native
    
    var isSubSelect: Boolean = js.native
    
    def toSql(): String = js.native
  }
  
  type IQuery = typings.nginstackIquery.libIqueryMod.^
}
