package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devtools extends StObject {
  
  var devtools: Boolean
  
  var reload: Boolean
  
  var reloadIgnoringCache: Boolean
  
  var zoom: Boolean
}
object Devtools {
  
  @scala.inline
  def apply(devtools: Boolean, reload: Boolean, reloadIgnoringCache: Boolean, zoom: Boolean): Devtools = {
    val __obj = js.Dynamic.literal(devtools = devtools.asInstanceOf[js.Any], reload = reload.asInstanceOf[js.Any], reloadIgnoringCache = reloadIgnoringCache.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devtools]
  }
  
  @scala.inline
  implicit class DevtoolsMutableBuilder[Self <: Devtools] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadIgnoringCache(value: Boolean): Self = StObject.set(x, "reloadIgnoringCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
