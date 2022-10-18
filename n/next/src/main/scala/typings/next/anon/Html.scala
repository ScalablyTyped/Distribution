package typings.next.anon

import typings.next.distServerRenderResultMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Html extends StObject {
  
  var html: default | Null
  
  var renderOpts: Any
}
object Html {
  
  inline def apply(renderOpts: Any): Html = {
    val __obj = js.Dynamic.literal(renderOpts = renderOpts.asInstanceOf[js.Any], html = null)
    __obj.asInstanceOf[Html]
  }
  
  extension [Self <: Html](x: Self) {
    
    inline def setHtml(value: default): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setRenderOpts(value: Any): Self = StObject.set(x, "renderOpts", value.asInstanceOf[js.Any])
  }
}
