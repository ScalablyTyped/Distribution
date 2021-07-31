package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetStatusChecksProtectionResponseData extends StObject {
  
  var contexts: js.Array[String]
  
  var contexts_url: String
  
  var strict: Boolean
  
  var url: String
}
object ReposGetStatusChecksProtectionResponseData {
  
  @scala.inline
  def apply(contexts: js.Array[String], contexts_url: String, strict: Boolean, url: String): ReposGetStatusChecksProtectionResponseData = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], contexts_url = contexts_url.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetStatusChecksProtectionResponseData]
  }
  
  @scala.inline
  implicit class ReposGetStatusChecksProtectionResponseDataMutableBuilder[Self <: ReposGetStatusChecksProtectionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts_url(value: String): Self = StObject.set(x, "contexts_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
