package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameCancelEdit
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var cancelEdit: js.Object
  
  var rowContext: js.Object
}
object DictpropNameCancelEdit {
  
  inline def apply(cancelEdit: js.Object, rowContext: js.Object): DictpropNameCancelEdit = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameCancelEdit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictpropNameCancelEdit] (val x: Self) extends AnyVal {
    
    inline def setCancelEdit(value: js.Object): Self = StObject.set(x, "cancelEdit", value.asInstanceOf[js.Any])
    
    inline def setRowContext(value: js.Object): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
  }
}
