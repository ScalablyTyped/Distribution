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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasNativeCSSProperties")(hasNativeCSSProperties)
    __obj.updateDynamic("hasNativeImports")(hasNativeImports)
    __obj.updateDynamic("hasShadow")(hasShadow)
    __obj.updateDynamic("nativeShadow")(nativeShadow)
    __obj.updateDynamic("useNativeCSSProperties")(useNativeCSSProperties)
    __obj.updateDynamic("useNativeCustomElements")(useNativeCustomElements)
    __obj.updateDynamic("useNativeImports")(useNativeImports)
    __obj.updateDynamic("useNativeShadow")(useNativeShadow)
    __obj.updateDynamic("usePolyfillProto")(usePolyfillProto)
    __obj.updateDynamic("useShadow")(useShadow)
    __obj.updateDynamic("wantShadow")(wantShadow)
    __obj.asInstanceOf[Settings]
  }
}

