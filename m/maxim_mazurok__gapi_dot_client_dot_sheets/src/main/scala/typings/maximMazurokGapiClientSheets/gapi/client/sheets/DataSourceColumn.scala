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
  
  inline def apply(): DataSourceColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceColumn] (val x: Self) extends AnyVal {
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setReference(value: DataSourceColumnReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
