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
    
    @scala.inline
    def apply(): ErrorOverlayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorOverlayOptions]
    }
    
    @scala.inline
    implicit class ErrorOverlayOptionsMutableBuilder[Self <: ErrorOverlayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: String | `false`): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      @scala.inline
      def setModule(value: String | `false`): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setSockHost(value: String): Self = StObject.set(x, "sockHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockHostUndefined: Self = StObject.set(x, "sockHost", js.undefined)
      
      @scala.inline
      def setSockIntegration(value: `false` | (String & _empty) | wds | whm | wps): Self = StObject.set(x, "sockIntegration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockIntegrationUndefined: Self = StObject.set(x, "sockIntegration", js.undefined)
      
      @scala.inline
      def setSockPath(value: String): Self = StObject.set(x, "sockPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockPathUndefined: Self = StObject.set(x, "sockPath", js.undefined)
      
      @scala.inline
      def setSockPort(value: Double): Self = StObject.set(x, "sockPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockPortUndefined: Self = StObject.set(x, "sockPort", js.undefined)
      
      @scala.inline
      def setUseLegacyWDSSockets(value: Boolean): Self = StObject.set(x, "useLegacyWDSSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLegacyWDSSocketsUndefined: Self = StObject.set(x, "useLegacyWDSSockets", js.undefined)
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
    
    @scala.inline
    def apply(
      entry: String | `false`,
      module: String | `false`,
      sockIntegration: LiteralUnion[wds | whm | wps | `false`, String]
    ): NormalizedErrorOverlayOptions = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], sockIntegration = sockIntegration.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedErrorOverlayOptions]
    }
    
    @scala.inline
    implicit class NormalizedErrorOverlayOptionsMutableBuilder[Self <: NormalizedErrorOverlayOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntry(value: String | `false`): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: String | `false`): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockHost(value: String): Self = StObject.set(x, "sockHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockHostUndefined: Self = StObject.set(x, "sockHost", js.undefined)
      
      @scala.inline
      def setSockIntegration(value: LiteralUnion[wds | whm | wps | `false`, String]): Self = StObject.set(x, "sockIntegration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockPath(value: String): Self = StObject.set(x, "sockPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockPathUndefined: Self = StObject.set(x, "sockPath", js.undefined)
      
      @scala.inline
      def setSockPort(value: Double): Self = StObject.set(x, "sockPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockPortUndefined: Self = StObject.set(x, "sockPort", js.undefined)
      
      @scala.inline
      def setUseLegacyWDSSockets(value: Boolean): Self = StObject.set(x, "useLegacyWDSSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLegacyWDSSocketsUndefined: Self = StObject.set(x, "useLegacyWDSSockets", js.undefined)
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
    
    @scala.inline
    def apply(
      exclude: String | RegExp | (js.Array[String | RegExp]),
      include: String | RegExp | (js.Array[String | RegExp]),
      overlay: `false` | NormalizedErrorOverlayOptions
    ): NormalizedPluginOptions = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedPluginOptions]
    }
    
    @scala.inline
    implicit class NormalizedPluginOptionsMutableBuilder[Self <: NormalizedPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setForceEnable(value: Boolean): Self = StObject.set(x, "forceEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceEnableUndefined: Self = StObject.set(x, "forceEnable", js.undefined)
      
      @scala.inline
      def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setOverlay(value: `false` | NormalizedErrorOverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverlayOverrides extends StObject {
    
    /**
      * Modifies how the error overlay integration works in the plugin.
      */
    var overlay: `false` | NormalizedErrorOverlayOptions
  }
  object OverlayOverrides {
    
    @scala.inline
    def apply(overlay: `false` | NormalizedErrorOverlayOptions): OverlayOverrides = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayOverrides]
    }
    
    @scala.inline
    implicit class OverlayOverridesMutableBuilder[Self <: OverlayOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: `false` | NormalizedErrorOverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): ReactRefreshPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactRefreshPluginOptions]
    }
    
    @scala.inline
    implicit class ReactRefreshPluginOptionsMutableBuilder[Self <: ReactRefreshPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableRefreshCheck(value: Boolean): Self = StObject.set(x, "disableRefreshCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRefreshCheckUndefined: Self = StObject.set(x, "disableRefreshCheck", js.undefined)
      
      @scala.inline
      def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setForceEnable(value: Boolean): Self = StObject.set(x, "forceEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceEnableUndefined: Self = StObject.set(x, "forceEnable", js.undefined)
      
      @scala.inline
      def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setOverlay(value: Boolean | ErrorOverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
