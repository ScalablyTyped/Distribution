package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Totalms extends StObject {
  
  var total_ms: js.UndefOr[Double] = js.undefined
}
object Totalms {
  
  inline def apply(): Totalms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Totalms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Totalms] (val x: Self) extends AnyVal {
    
    inline def setTotal_ms(value: Double): Self = StObject.set(x, "total_ms", value.asInstanceOf[js.Any])
    
    inline def setTotal_msUndefined: Self = StObject.set(x, "total_ms", js.undefined)
  }
}
