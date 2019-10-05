package typings.polymer.polymerMod.Global.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var hasNativeCSSProperties: Boolean
  var hasNativeImports: Boolean
  var hasShadow: Boolean
  var nativeShadow: Boolean
  var useNativeCSSProperties: Boolean
  var useNativeCustomElements: Boolean
  var useNativeImports: Boolean
  var useNativeShadow: Boolean
  var usePolyfillProto: Boolean
  var useShadow: Boolean
  var wantShadow: Boolean
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
    val __obj = js.Dynamic.literal(hasNativeCSSProperties = hasNativeCSSProperties, hasNativeImports = hasNativeImports, hasShadow = hasShadow, nativeShadow = nativeShadow, useNativeCSSProperties = useNativeCSSProperties, useNativeCustomElements = useNativeCustomElements, useNativeImports = useNativeImports, useNativeShadow = useNativeShadow, usePolyfillProto = usePolyfillProto, useShadow = useShadow, wantShadow = wantShadow)
  
    __obj.asInstanceOf[Settings]
  }
}

