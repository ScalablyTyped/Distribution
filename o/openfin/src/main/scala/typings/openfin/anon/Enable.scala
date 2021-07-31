package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enable extends StObject {
  
  var devtools: js.UndefOr[Boolean] = js.undefined
  
  var enable: Boolean
  
  var reload: js.UndefOr[Boolean] = js.undefined
}
object Enable {
  
  @scala.inline
  def apply(enable: Boolean): Enable = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
  
  @scala.inline
  implicit class EnableMutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
  }
}
