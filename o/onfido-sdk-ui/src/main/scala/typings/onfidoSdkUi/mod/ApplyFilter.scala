package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyFilter extends StObject {
  
  var doc_type: js.UndefOr[String] = js.undefined
}
object ApplyFilter {
  
  inline def apply(): ApplyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyFilter] (val x: Self) extends AnyVal {
    
    inline def setDoc_type(value: String): Self = StObject.set(x, "doc_type", value.asInstanceOf[js.Any])
    
    inline def setDoc_typeUndefined: Self = StObject.set(x, "doc_type", js.undefined)
  }
}
