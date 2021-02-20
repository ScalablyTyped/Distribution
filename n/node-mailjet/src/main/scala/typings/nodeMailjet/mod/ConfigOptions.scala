package typings.nodeMailjet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends StObject {
  
  val output: js.UndefOr[String] = js.native
  
  val perform_api_call: js.UndefOr[Boolean] = js.native
  
  val secured: js.UndefOr[Boolean] = js.native
  
  val url: js.UndefOr[String] = js.native
  
  val version: js.UndefOr[String] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setPerform_api_call(value: Boolean): Self = StObject.set(x, "perform_api_call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerform_api_callUndefined: Self = StObject.set(x, "perform_api_call", js.undefined)
    
    @scala.inline
    def setSecured(value: Boolean): Self = StObject.set(x, "secured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecuredUndefined: Self = StObject.set(x, "secured", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
