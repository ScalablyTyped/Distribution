package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaType extends StObject {
  
  var sha: String
  
  var `type`: String
  
  var url: String
}
object ShaType {
  
  @scala.inline
  def apply(sha: String, `type`: String, url: String): ShaType = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaType]
  }
  
  @scala.inline
  implicit class ShaTypeMutableBuilder[Self <: ShaType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
