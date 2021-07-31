package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaUrl extends StObject {
  
  var sha: String
  
  var url: String
}
object ShaUrl {
  
  @scala.inline
  def apply(sha: String, url: String): ShaUrl = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaUrl]
  }
  
  @scala.inline
  implicit class ShaUrlMutableBuilder[Self <: ShaUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
