package typings.pmmmwhReactRefreshWebpackPlugin

import typings.pmmmwhReactRefreshWebpackPlugin.anon._empty
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginBooleans.`false`
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wds
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.whm
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wps
import typings.std.RegExp
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait ErrorOverlayOptions extends StObject {
    
    /**
      * Path to a JS file that sets up the error overlay integration.
      */
    var entry: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * The error overlay module to use.
      */
    var module: js.UndefOr[String | `false`] = js.undefined
    
    /**
      * The socket host to use (WDS only).
      */
    var sockHost: js.UndefOr[String] = js.undefined
    
    /**
      * Path to a JS file that sets up the Webpack socket integration.
      */
    var sockIntegration: js.UndefOr[`false` | (String & _empty) | wds | whm | wps] = js.undefined
    
    /**
      * The socket path to use (WDS only).
      */
    var sockPath: js.UndefOr[String] = js.undefined
    
    /**
      * The socket port to use (WDS only).
      */
    var sockPort: js.UndefOr[Double] = js.undefined
    
    /**
      * Uses a custom SocketJS implementation for older versions of webpack-dev-server.
      */
    var useLegacyWDSSockets: js.UndefOr[Boolean] = js.undefined
  }
  object ErrorOverlayOptions {
    
    inline def apply(): ErrorOverlayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorOverlayOptions]
    }
    
    extension [Self <: ErrorOverlayOptions](x: Self) {
      
      inline def setEntry(value: String | `false`): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      inline def setModule(value: String | `false`): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setSockHost(value: String): Self = StObject.set(x, "sockHost", value.asInstanceOf[js.Any])
      
      inline def setSockHostUndefined: Self = StObject.set(x, "sockHost", js.undefined)
      
      inline def setSockIntegration(value: `false` | (String & _empty) | wds | whm | wps): Self = StObject.set(x, "sockIntegration", value.asInstanceOf[js.Any])
      
      inline def setSockIntegrationUndefined: Self = StObject.set(x, "sockIntegration", js.undefined)
      
      inline def setSockPath(value: String): Self = StObject.set(x, "sockPath", value.asInstanceOf[js.Any])
      
      inline def setSockPathUndefined: Self = StObject.set(x, "sockPath", js.undefined)
      
      inline def setSockPort(value: Double): Self = StObject.set(x, "sockPort", value.asInstanceOf[js.Any])
      
      inline def setSockPortUndefined: Self = StObject.set(x, "sockPort", js.undefined)
      
      inline def setUseLegacyWDSSockets(value: Boolean): Self = StObject.set(x, "useLegacyWDSSockets", value.asInstanceOf[js.Any])
      
      inline def setUseLegacyWDSSocketsUndefined: Self = StObject.set(x, "useLegacyWDSSockets", js.undefined)
    }
  }
  
  trait NormalizedErrorOverlayOptions extends StObject {
    
    /**
      * Path to a JS file that sets up the error overlay integration.
      */
    var entry: String | `false`
    
    /**
      * The error overlay module to use.
      */
    var module: String | `false`
    
    /**
      * The socket host to use (WDS only).
      */
    var sockHost: js.UndefOr[String] = js.undefined
    
    /**
      * Path to a JS file that sets up the Webpack socket integration.
      */
    var sockIntegration: LiteralUnion[wds | whm | wps | `false`, String]
    
    /**
      * The socket path to use (WDS only).
      */
    var sockPath: js.UndefOr[String] = js.undefined
    
    /**
      * The socket port to use (WDS only).
      */
    var sockPort: js.UndefOr[Double] = js.undefined
    
    /**
      * Uses a custom SocketJS implementation for older versions of webpack-dev-server.
      */
    var useLegacyWDSSockets: js.UndefOr[Boolean] = js.undefined
  }
  object NormalizedErrorOverlayOptions {
    
    inline def apply(
      entry: String | `false`,
      module: String | `false`,
      sockIntegration: LiteralUnion[wds | whm | wps | `false`, String]
    ): NormalizedErrorOverlayOptions = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], sockIntegration = sockIntegration.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedErrorOverlayOptions]
    }
    
    extension [Self <: NormalizedErrorOverlayOptions](x: Self) {
      
      inline def setEntry(value: String | `false`): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setModule(value: String | `false`): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setSockHost(value: String): Self = StObject.set(x, "sockHost", value.asInstanceOf[js.Any])
      
      inline def setSockHostUndefined: Self = StObject.set(x, "sockHost", js.undefined)
      
      inline def setSockIntegration(value: LiteralUnion[wds | whm | wps | `false`, String]): Self = StObject.set(x, "sockIntegration", value.asInstanceOf[js.Any])
      
      inline def setSockPath(value: String): Self = StObject.set(x, "sockPath", value.asInstanceOf[js.Any])
      
      inline def setSockPathUndefined: Self = StObject.set(x, "sockPath", js.undefined)
      
      inline def setSockPort(value: Double): Self = StObject.set(x, "sockPort", value.asInstanceOf[js.Any])
      
      inline def setSockPortUndefined: Self = StObject.set(x, "sockPort", js.undefined)
      
      inline def setUseLegacyWDSSockets(value: Boolean): Self = StObject.set(x, "useLegacyWDSSockets", value.asInstanceOf[js.Any])
      
      inline def setUseLegacyWDSSocketsUndefined: Self = StObject.set(x, "useLegacyWDSSockets", js.undefined)
    }
  }
  
  /* Inlined std.Pick<{  forceEnable :boolean | undefined,   include :string | std.RegExp | std.Array<string | std.RegExp>,   exclude :string | std.RegExp | std.Array<string | std.RegExp>}, 'include' | 'exclude' | 'forceEnable'> & @pmmmwh/react-refresh-webpack-plugin.@pmmmwh/react-refresh-webpack-plugin/types/types.OverlayOverrides */
  trait NormalizedPluginOptions extends StObject {
    
    var exclude: String | RegExp | (js.Array[String | RegExp])
    
    var forceEnable: js.UndefOr[Boolean] = js.undefined
    
    var include: String | RegExp | (js.Array[String | RegExp])
    
    /**
      * Modifies how the error overlay integration works in the plugin.
      */
    var overlay: `false` | NormalizedErrorOverlayOptions
  }
  object NormalizedPluginOptions {
    
    inline def apply(
      exclude: String | RegExp | (js.Array[String | RegExp]),
      include: String | RegExp | (js.Array[String | RegExp]),
      overlay: `false` | NormalizedErrorOverlayOptions
    ): NormalizedPluginOptions = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedPluginOptions]
    }
    
    extension [Self <: NormalizedPluginOptions](x: Self) {
      
      inline def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setForceEnable(value: Boolean): Self = StObject.set(x, "forceEnable", value.asInstanceOf[js.Any])
      
      inline def setForceEnableUndefined: Self = StObject.set(x, "forceEnable", js.undefined)
      
      inline def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setOverlay(value: `false` | NormalizedErrorOverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverlayOverrides extends StObject {
    
    /**
      * Modifies how the error overlay integration works in the plugin.
      */
    var overlay: `false` | NormalizedErrorOverlayOptions
  }
  object OverlayOverrides {
    
    inline def apply(overlay: `false` | NormalizedErrorOverlayOptions): OverlayOverrides = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayOverrides]
    }
    
    extension [Self <: OverlayOverrides](x: Self) {
      
      inline def setOverlay(value: `false` | NormalizedErrorOverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReactRefreshPluginOptions extends StObject {
    
    /**
      * Disables detection of react-refresh's Babel plugin (Deprecated since v0.3.0).
      */
    var disableRefreshCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Files to explicitly exclude from processing.
      */
    var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
    
    /**
      * Enables the plugin forcefully.
      */
    var forceEnable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Files to explicitly include for processing.
      */
    var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
    
    /**
      * Modifies how the error overlay integration works in the plugin.
      */
    var overlay: js.UndefOr[Boolean | ErrorOverlayOptions] = js.undefined
  }
  object ReactRefreshPluginOptions {
    
    inline def apply(): ReactRefreshPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactRefreshPluginOptions]
    }
    
    extension [Self <: ReactRefreshPluginOptions](x: Self) {
      
      inline def setDisableRefreshCheck(value: Boolean): Self = StObject.set(x, "disableRefreshCheck", value.asInstanceOf[js.Any])
      
      inline def setDisableRefreshCheckUndefined: Self = StObject.set(x, "disableRefreshCheck", js.undefined)
      
      inline def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setForceEnable(value: Boolean): Self = StObject.set(x, "forceEnable", value.asInstanceOf[js.Any])
      
      inline def setForceEnableUndefined: Self = StObject.set(x, "forceEnable", js.undefined)
      
      inline def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setOverlay(value: Boolean | ErrorOverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
