package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameCancelEdit
  extends /* key */ StringDictionary[js.Any] {
  
  var cancelEdit: js.Object = js.native
  
  var rowContext: js.Object = js.native
}
object DictpropNameCancelEdit {
  
  @scala.inline
  def apply(cancelEdit: js.Object, rowContext: js.Object): DictpropNameCancelEdit = {
    val __obj = js.Dynamic.literal(cancelEdit = cancelEdit.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameCancelEdit]
  }
  
  @scala.inline
  implicit class DictpropNameCancelEditMutableBuilder[Self <: DictpropNameCancelEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelEdit(value: js.Object): Self = StObject.set(x, "cancelEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowContext(value: js.Object): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
  }
}
