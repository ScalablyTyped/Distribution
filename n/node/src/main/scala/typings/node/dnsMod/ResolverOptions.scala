package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverOptions extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * @default 4
    */
  var tries: js.UndefOr[Double] = js.undefined
}
object ResolverOptions {
  
  inline def apply(): ResolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolverOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTries(value: Double): Self = StObject.set(x, "tries", value.asInstanceOf[js.Any])
    
    inline def setTriesUndefined: Self = StObject.set(x, "tries", js.undefined)
  }
}
