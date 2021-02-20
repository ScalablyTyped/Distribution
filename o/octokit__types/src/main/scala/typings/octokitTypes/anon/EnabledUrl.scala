package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnabledUrl extends StObject {
  
  var enabled: Boolean = js.native
  
  var url: String = js.native
}
object EnabledUrl {
  
  @scala.inline
  def apply(enabled: Boolean, url: String): EnabledUrl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledUrl]
  }
  
  @scala.inline
  implicit class EnabledUrlMutableBuilder[Self <: EnabledUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
