package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceColumn extends StObject {
  
  /** The formula of the calculated column. */
  var formula: js.UndefOr[String] = js.undefined
  
  /** The column reference. */
  var reference: js.UndefOr[DataSourceColumnReference] = js.undefined
}
object DataSourceColumn {
  
  @scala.inline
  def apply(): DataSourceColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceColumn]
  }
  
  @scala.inline
  implicit class DataSourceColumnMutableBuilder[Self <: DataSourceColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setReference(value: DataSourceColumnReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
