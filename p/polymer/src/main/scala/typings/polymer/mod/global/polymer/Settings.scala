package typings.polymer.mod.global.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  var hasNativeCSSProperties: Boolean = js.native
  
  var hasNativeImports: Boolean = js.native
  
  var hasShadow: Boolean = js.native
  
  var nativeShadow: Boolean = js.native
  
  var useNativeCSSProperties: Boolean = js.native
  
  var useNativeCustomElements: Boolean = js.native
  
  var useNativeImports: Boolean = js.native
  
  var useNativeShadow: Boolean = js.native
  
  var usePolyfillProto: Boolean = js.native
  
  var useShadow: Boolean = js.native
  
  var wantShadow: Boolean = js.native
}
object Settings {
  
  @scala.inline
  def apply(
    hasNativeCSSProperties: Boolean,
    hasNativeImports: Boolean,
    hasShadow: Boolean,
    nativeShadow: Boolean,
    useNativeCSSProperties: Boolean,
    useNativeCustomElements: Boolean,
    useNativeImports: Boolean,
    useNativeShadow: Boolean,
    usePolyfillProto: Boolean,
    useShadow: Boolean,
    wantShadow: Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(hasNativeCSSProperties = hasNativeCSSProperties.asInstanceOf[js.Any], hasNativeImports = hasNativeImports.asInstanceOf[js.Any], hasShadow = hasShadow.asInstanceOf[js.Any], nativeShadow = nativeShadow.asInstanceOf[js.Any], useNativeCSSProperties = useNativeCSSProperties.asInstanceOf[js.Any], useNativeCustomElements = useNativeCustomElements.asInstanceOf[js.Any], useNativeImports = useNativeImports.asInstanceOf[js.Any], useNativeShadow = useNativeShadow.asInstanceOf[js.Any], usePolyfillProto = usePolyfillProto.asInstanceOf[js.Any], useShadow = useShadow.asInstanceOf[js.Any], wantShadow = wantShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasNativeCSSProperties(value: Boolean): Self = this.set("hasNativeCSSProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNativeImports(value: Boolean): Self = this.set("hasNativeImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasShadow(value: Boolean): Self = this.set("hasShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeShadow(value: Boolean): Self = this.set("nativeShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeCSSProperties(value: Boolean): Self = this.set("useNativeCSSProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeCustomElements(value: Boolean): Self = this.set("useNativeCustomElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeImports(value: Boolean): Self = this.set("useNativeImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeShadow(value: Boolean): Self = this.set("useNativeShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePolyfillProto(value: Boolean): Self = this.set("usePolyfillProto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseShadow(value: Boolean): Self = this.set("useShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantShadow(value: Boolean): Self = this.set("wantShadow", value.asInstanceOf[js.Any])
  }
}
