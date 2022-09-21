package typings.maximMazurokGapiClientDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelField extends StObject {
  
  /** Only present if valueType is dateString. RFC 3339 formatted date: YYYY-MM-DD. */
  var dateString: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The identifier of this field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Only present if valueType is integer. */
  var integer: js.UndefOr[js.Array[String]] = js.undefined
  
  /** This is always drive#labelField. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Only present if valueType is selection. */
  var selection: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Only present if valueType is text. */
  var text: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Only present if valueType is user. */
  var user: js.UndefOr[js.Array[User]] = js.undefined
  
  /**
    * The field type. While new values may be supported in the future, the following are currently allowed:
    * - dateString
    * - integer
    * - selection
    * - text
    * - user
    */
  var valueType: js.UndefOr[String] = js.undefined
}
object LabelField {
  
  inline def apply(): LabelField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelField]
  }
  
  extension [Self <: LabelField](x: Self) {
    
    inline def setDateString(value: js.Array[String]): Self = StObject.set(x, "dateString", value.asInstanceOf[js.Any])
    
    inline def setDateStringUndefined: Self = StObject.set(x, "dateString", js.undefined)
    
    inline def setDateStringVarargs(value: String*): Self = StObject.set(x, "dateString", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInteger(value: js.Array[String]): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    inline def setIntegerVarargs(value: String*): Self = StObject.set(x, "integer", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelection(value: js.Array[String]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionVarargs(value: String*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setUser(value: js.Array[User]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUserVarargs(value: User*): Self = StObject.set(x, "user", js.Array(value*))
    
    inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
  }
}
