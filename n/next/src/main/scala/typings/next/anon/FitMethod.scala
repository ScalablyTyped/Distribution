package typings.next.anon

import typings.next.nextBooleans.`true`
import typings.next.nextStrings.lanczos3
import typings.next.nextStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitMethod extends StObject {
  
  val fitMethod: stretch
  
  val linearRGB: `true`
  
  val method: lanczos3
  
  val premultiply: `true`
}
object FitMethod {
  
  inline def apply(): FitMethod = {
    val __obj = js.Dynamic.literal(fitMethod = "stretch", linearRGB = true, method = "lanczos3", premultiply = true)
    __obj.asInstanceOf[FitMethod]
  }
  
  extension [Self <: FitMethod](x: Self) {
    
    inline def setFitMethod(value: stretch): Self = StObject.set(x, "fitMethod", value.asInstanceOf[js.Any])
    
    inline def setLinearRGB(value: `true`): Self = StObject.set(x, "linearRGB", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: lanczos3): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPremultiply(value: `true`): Self = StObject.set(x, "premultiply", value.asInstanceOf[js.Any])
  }
}
