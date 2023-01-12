package typings.npmcliArborist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditOptions
  extends StObject
     with BuildIdealTreeOptions {
  
  var fix: js.UndefOr[Boolean] = js.undefined
  
  var omit: js.UndefOr[js.Array[String]] = js.undefined
}
object AuditOptions {
  
  inline def apply(): AuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditOptions] (val x: Self) extends AnyVal {
    
    inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    
    inline def setOmit(value: js.Array[String]): Self = StObject.set(x, "omit", value.asInstanceOf[js.Any])
    
    inline def setOmitUndefined: Self = StObject.set(x, "omit", js.undefined)
    
    inline def setOmitVarargs(value: String*): Self = StObject.set(x, "omit", js.Array(value*))
  }
}
