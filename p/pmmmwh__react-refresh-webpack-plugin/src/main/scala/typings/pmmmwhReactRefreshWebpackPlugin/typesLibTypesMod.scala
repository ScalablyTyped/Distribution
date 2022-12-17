package typings.pmmmwhReactRefreshWebpackPlugin

import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginBooleans.`false`
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.http
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.https
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wds
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.whm
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wps
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.ws
import typings.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginStrings.wss
import typings.typeFest.sourceLiteralUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibTypesMod {
  
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
    var sockIntegration: js.UndefOr[LiteralUnion[`false` | wds | whm | wps, String]] = js.undefined
    
    /**
      * The socket path to use (WDS only).
      */
    var sockPath: js.UndefOr[String] = js.undefined
    
    /**
      * The socket port to use (WDS only).
      */
    var sockPort: js.UndefOr[Double] = js.undefined
    
    /**
      * The socket protocol to use (WDS only).
      */
    var sockProtocol: js.UndefOr[http | https | ws | wss] = js.undefined
    
    /**
      * Uses a polyfill for the DOM URL API (WDS only).
      */
    var useURLPolyfill: js.UndefOr[Boolean] = js.undefined
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
      
      inline def setSockIntegration(value: LiteralUnion[`false` | wds | whm | wps, String]): Self = StObject.set(x, "sockIntegration", value.asInstanceOf[js.Any])
      
      inline def setSockIntegrationUndefined: Self = StObject.set(x, "sockIntegration", js.undefined)
      
      inline def setSockPath(value: String): Self = StObject.set(x, "sockPath", value.asInstanceOf[js.Any])
      
      inline def setSockPathUndefined: Self = StObject.set(x, "sockPath", js.undefined)
      
      inline def setSockPort(value: Double): Self = StObject.set(x, "sockPort", value.asInstanceOf[js.Any])
      
      inline def setSockPortUndefined: Self = StObject.set(x, "sockPort", js.undefined)
      
      inline def setSockProtocol(value: http | https | ws | wss): Self = StObject.set(x, "sockProtocol", value.asInstanceOf[js.Any])
      
      inline def setSockProtocolUndefined: Self = StObject.set(x, "sockProtocol", js.undefined)
      
      inline def setUseURLPolyfill(value: Boolean): Self = StObject.set(x, "useURLPolyfill", value.asInstanceOf[js.Any])
      
      inline def setUseURLPolyfillUndefined: Self = StObject.set(x, "useURLPolyfill", js.undefined)
    }
  }
  
  /* Inlined type-fest.type-fest.SetRequired<@pmmmwh/react-refresh-webpack-plugin.@pmmmwh/react-refresh-webpack-plugin/types/lib/types.ErrorOverlayOptions, 'entry' | 'module' | 'sockIntegration'> */
  trait NormalizedErrorOverlayOptions extends StObject {
    
    var entry: js.UndefOr[String | `false`] = js.undefined
    
    var module: js.UndefOr[String | `false`] = js.undefined
    
    var sockHost: js.UndefOr[String] = js.undefined
    
    var sockIntegration: js.UndefOr[LiteralUnion[`false` | wds | whm | wps, String]] = js.undefined
    
    var sockPath: js.UndefOr[String] = js.undefined
    
    var sockPort: js.UndefOr[Double] = js.undefined
    
    var sockProtocol: js.UndefOr[http | https | ws | wss] = js.undefined
    
    var useURLPolyfill: js.UndefOr[Boolean] = js.undefined
  }
  object NormalizedErrorOverlayOptions {
    
    inline def apply(): NormalizedErrorOverlayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizedErrorOverlayOptions]
    }
    
    extension [Self <: NormalizedErrorOverlayOptions](x: Self) {
      
      inline def setEntry(value: String | `false`): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      inline def setModule(value: String | `false`): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setSockHost(value: String): Self = StObject.set(x, "sockHost", value.asInstanceOf[js.Any])
      
      inline def setSockHostUndefined: Self = StObject.set(x, "sockHost", js.undefined)
      
      inline def setSockIntegration(value: LiteralUnion[`false` | wds | whm | wps, String]): Self = StObject.set(x, "sockIntegration", value.asInstanceOf[js.Any])
      
      inline def setSockIntegrationUndefined: Self = StObject.set(x, "sockIntegration", js.undefined)
      
      inline def setSockPath(value: String): Self = StObject.set(x, "sockPath", value.asInstanceOf[js.Any])
      
      inline def setSockPathUndefined: Self = StObject.set(x, "sockPath", js.undefined)
      
      inline def setSockPort(value: Double): Self = StObject.set(x, "sockPort", value.asInstanceOf[js.Any])
      
      inline def setSockPortUndefined: Self = StObject.set(x, "sockPort", js.undefined)
      
      inline def setSockProtocol(value: http | https | ws | wss): Self = StObject.set(x, "sockProtocol", value.asInstanceOf[js.Any])
      
      inline def setSockProtocolUndefined: Self = StObject.set(x, "sockProtocol", js.undefined)
      
      inline def setUseURLPolyfill(value: Boolean): Self = StObject.set(x, "useURLPolyfill", value.asInstanceOf[js.Any])
      
      inline def setUseURLPolyfillUndefined: Self = StObject.set(x, "useURLPolyfill", js.undefined)
    }
  }
  
  /* Inlined type-fest.type-fest.SetRequired<type-fest.type-fest.Except<@pmmmwh/react-refresh-webpack-plugin.@pmmmwh/react-refresh-webpack-plugin/types/lib/types.ReactRefreshPluginOptions, 'overlay'>, 'exclude' | 'include'> & @pmmmwh/react-refresh-webpack-plugin.@pmmmwh/react-refresh-webpack-plugin/types/lib/types.OverlayOverrides */
  trait NormalizedPluginOptions extends StObject {
    
    var esModule: js.UndefOr[
        Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ESModuleOptions */ Any)
      ] = js.undefined
    
    var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var forceEnable: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    var library: js.UndefOr[String] = js.undefined
    
    /**
      * Modifies how the error overlay integration works in the plugin.
      */
    var overlay: js.UndefOr[Boolean | ErrorOverlayOptions] = js.undefined
  }
  object NormalizedPluginOptions {
    
    inline def apply(): NormalizedPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizedPluginOptions]
    }
    
    extension [Self <: NormalizedPluginOptions](x: Self) {
      
      inline def setEsModule(
        value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ESModuleOptions */ Any)
      ): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
      
      inline def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
      
      inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setForceEnable(value: Boolean): Self = StObject.set(x, "forceEnable", value.asInstanceOf[js.Any])
      
      inline def setForceEnableUndefined: Self = StObject.set(x, "forceEnable", js.undefined)
      
      inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
      
      inline def setOverlay(value: Boolean | ErrorOverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
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
      * Enables strict ES Modules compatible runtime.
      */
    var esModule: js.UndefOr[
        Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ESModuleOptions */ Any)
      ] = js.undefined
    
    /**
      * Files to explicitly exclude from processing.
      */
    var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
      * Enables the plugin forcefully.
      */
    var forceEnable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Files to explicitly include for processing.
      */
    var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
    
    /**
      * Name of the library bundle.
      */
    var library: js.UndefOr[String] = js.undefined
    
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
      
      inline def setEsModule(
        value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_types.ESModuleOptions */ Any)
      ): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
      
      inline def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
      
      inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setForceEnable(value: Boolean): Self = StObject.set(x, "forceEnable", value.asInstanceOf[js.Any])
      
      inline def setForceEnableUndefined: Self = StObject.set(x, "forceEnable", js.undefined)
      
      inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
      
      inline def setOverlay(value: Boolean | ErrorOverlayOptions): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    }
  }
}
