package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBridgeIcon extends StObject {
  
  var depth: String = js.native
  
  var height: String = js.native
  
  var mimetype: String = js.native
  
  var url: String = js.native
  
  var width: String = js.native
}
object IBridgeIcon {
  
  @scala.inline
  def apply(depth: String, height: String, mimetype: String, url: String, width: String): IBridgeIcon = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeIcon]
  }
  
  @scala.inline
  implicit class IBridgeIconMutableBuilder[Self <: IBridgeIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
