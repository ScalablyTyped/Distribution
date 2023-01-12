package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaType extends StObject {
  
  /**
    * @description SHA for the reference
    * @example 7638417db6d59f3c431d3e1f261cc637155684cd
    */
  var sha: String
  
  var `type`: String
  
  /** Format: uri */
  var url: String
}
object ShaType {
  
  inline def apply(sha: String, `type`: String, url: String): ShaType = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShaType] (val x: Self) extends AnyVal {
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
