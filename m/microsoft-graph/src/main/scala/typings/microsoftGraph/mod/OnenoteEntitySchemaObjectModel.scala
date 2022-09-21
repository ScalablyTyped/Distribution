package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenoteEntitySchemaObjectModel
  extends StObject
     with OnenoteEntityBaseModel {
  
  /**
    * The date and time when the page was created. The timestamp represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnenoteEntitySchemaObjectModel {
  
  inline def apply(): OnenoteEntitySchemaObjectModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteEntitySchemaObjectModel]
  }
  
  extension [Self <: OnenoteEntitySchemaObjectModel](x: Self) {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
  }
}
