package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initialize extends StObject {
  
  var initialize: js.UndefOr[Boolean] = js.native
  
  var showNativeScrollbars: js.UndefOr[Boolean] = js.native
}
object Initialize {
  
  @scala.inline
  def apply(): Initialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialize]
  }
  
  @scala.inline
  implicit class InitializeMutableBuilder[Self <: Initialize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialize(value: Boolean): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    @scala.inline
    def setShowNativeScrollbars(value: Boolean): Self = StObject.set(x, "showNativeScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNativeScrollbarsUndefined: Self = StObject.set(x, "showNativeScrollbars", js.undefined)
  }
}
