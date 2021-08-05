package typings.nodeMailjet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigOptions extends StObject {
  
  val output: js.UndefOr[String] = js.undefined
  
  val perform_api_call: js.UndefOr[Boolean] = js.undefined
  
  val secured: js.UndefOr[Boolean] = js.undefined
  
  val url: js.UndefOr[String] = js.undefined
  
  val version: js.UndefOr[String] = js.undefined
}
object ConfigOptions {
  
  inline def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  extension [Self <: ConfigOptions](x: Self) {
    
    inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setPerform_api_call(value: Boolean): Self = StObject.set(x, "perform_api_call", value.asInstanceOf[js.Any])
    
    inline def setPerform_api_callUndefined: Self = StObject.set(x, "perform_api_call", js.undefined)
    
    inline def setSecured(value: Boolean): Self = StObject.set(x, "secured", value.asInstanceOf[js.Any])
    
    inline def setSecuredUndefined: Self = StObject.set(x, "secured", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
