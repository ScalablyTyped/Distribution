package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /**
    * The name of the field. For reads, this is the column name. For SQL queries, it is the column alias (e.g., `"Word"` in the query `"SELECT 'hello' AS Word"`), or the column name
    * (e.g., `"ColName"` in the query `"SELECT ColName FROM Table"`). Some columns might have an empty name (e.g., `"SELECT UPPER(ColName)"`). Note that a query result can contain
    * multiple fields with the same name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The type of the field. */
  var `type`: js.UndefOr[Type] = js.undefined
}
object Field {
  
  @scala.inline
  def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
