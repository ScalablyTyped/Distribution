package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rejection extends StObject {
  
  var rejectReason: js.UndefOr[String] = js.undefined
}
object Rejection {
  
  inline def apply(): Rejection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rejection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rejection] (val x: Self) extends AnyVal {
    
    inline def setRejectReason(value: String): Self = StObject.set(x, "rejectReason", value.asInstanceOf[js.Any])
    
    inline def setRejectReasonUndefined: Self = StObject.set(x, "rejectReason", js.undefined)
  }
}
