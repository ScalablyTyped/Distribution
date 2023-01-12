package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvalOptions
  extends StObject
     with CommandOperationOptions {
  
  var nolock: js.UndefOr[Boolean] = js.undefined
}
object EvalOptions {
  
  inline def apply(): EvalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvalOptions] (val x: Self) extends AnyVal {
    
    inline def setNolock(value: Boolean): Self = StObject.set(x, "nolock", value.asInstanceOf[js.Any])
    
    inline def setNolockUndefined: Self = StObject.set(x, "nolock", js.undefined)
  }
}
