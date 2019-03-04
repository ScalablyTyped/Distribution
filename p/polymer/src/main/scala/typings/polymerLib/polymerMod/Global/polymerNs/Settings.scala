package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var hasNativeCSSProperties: scala.Boolean
  var hasNativeImports: scala.Boolean
  var hasShadow: scala.Boolean
  var nativeShadow: scala.Boolean
  var useNativeCSSProperties: scala.Boolean
  var useNativeCustomElements: scala.Boolean
  var useNativeImports: scala.Boolean
  var useNativeShadow: scala.Boolean
  var usePolyfillProto: scala.Boolean
  var useShadow: scala.Boolean
  var wantShadow: scala.Boolean
}

object Settings {
  @scala.inline
  def apply(
    hasNativeCSSProperties: scala.Boolean,
    hasNativeImports: scala.Boolean,
    hasShadow: scala.Boolean,
    nativeShadow: scala.Boolean,
    useNativeCSSProperties: scala.Boolean,
    useNativeCustomElements: scala.Boolean,
    useNativeImports: scala.Boolean,
    useNativeShadow: scala.Boolean,
    usePolyfillProto: scala.Boolean,
    useShadow: scala.Boolean,
    wantShadow: scala.Boolean
  ): Settings = {
    val __obj = js.Dynamic.literal(hasNativeCSSProperties = hasNativeCSSProperties, hasNativeImports = hasNativeImports, hasShadow = hasShadow, nativeShadow = nativeShadow, useNativeCSSProperties = useNativeCSSProperties, useNativeCustomElements = useNativeCustomElements, useNativeImports = useNativeImports, useNativeShadow = useNativeShadow, usePolyfillProto = usePolyfillProto, useShadow = useShadow, wantShadow = wantShadow)
  
    __obj.asInstanceOf[Settings]
  }
}

