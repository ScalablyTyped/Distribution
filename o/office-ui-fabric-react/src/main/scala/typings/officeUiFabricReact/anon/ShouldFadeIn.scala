package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldFadeIn extends StObject {
  
  var shouldFadeIn: Boolean
}
object ShouldFadeIn {
  
  inline def apply(shouldFadeIn: Boolean): ShouldFadeIn = {
    val __obj = js.Dynamic.literal(shouldFadeIn = shouldFadeIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldFadeIn]
  }
  
  extension [Self <: ShouldFadeIn](x: Self) {
    
    inline def setShouldFadeIn(value: Boolean): Self = StObject.set(x, "shouldFadeIn", value.asInstanceOf[js.Any])
  }
}
