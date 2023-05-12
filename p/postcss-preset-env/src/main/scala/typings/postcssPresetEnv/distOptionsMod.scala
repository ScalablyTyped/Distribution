package typings.postcssPresetEnv

import typings.autoprefixer.mod.Options
import typings.postcssPresetEnv.anon.BlockDirection
import typings.postcssPresetEnv.distPluginsPluginsOptionsMod.pluginsOptions
import typings.postcssPresetEnv.postcssPresetEnvBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionsMod {
  
  @js.native
  sealed trait DirectionFlow extends StObject
  @JSImport("postcss-preset-env/dist/options", "DirectionFlow")
  @js.native
  object DirectionFlow extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DirectionFlow & String] = js.native
    
    @js.native
    sealed trait BottomToTop
      extends StObject
         with DirectionFlow
    /* "bottom-to-top" */ val BottomToTop: typings.postcssPresetEnv.distOptionsMod.DirectionFlow.BottomToTop & String = js.native
    
    @js.native
    sealed trait LeftToRight
      extends StObject
         with DirectionFlow
    /* "left-to-right" */ val LeftToRight: typings.postcssPresetEnv.distOptionsMod.DirectionFlow.LeftToRight & String = js.native
    
    @js.native
    sealed trait RightToLeft
      extends StObject
         with DirectionFlow
    /* "right-to-left" */ val RightToLeft: typings.postcssPresetEnv.distOptionsMod.DirectionFlow.RightToLeft & String = js.native
    
    @js.native
    sealed trait TopToBottom
      extends StObject
         with DirectionFlow
    /* "top-to-bottom" */ val TopToBottom: typings.postcssPresetEnv.distOptionsMod.DirectionFlow.TopToBottom & String = js.native
  }
  
  trait pluginOptions extends StObject {
    
    /**
      * [Configure autoprefixer](https://github.com/postcss/autoprefixer#options)
      */
    var autoprefixer: js.UndefOr[Options] = js.undefined
    
    /**
      * PostCSS Preset Env supports any standard browserslist configuration,
      * which can be a `.browserslistrc` file,
      * a `browserslist` key in `package.json`,
      * or `browserslist` environment variables.
      *
      * The `browsers` option should only be used when a standard browserslist configuration is not available.
      */
    var browsers: js.UndefOr[String | js.Array[String] | Null] = js.undefined
    
    /**
      * Enable debugging messages to stdout giving insights into which features have been enabled/disabled and why.
      * default: false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable any feature that would need an extra browser library to be loaded into the page for it to work.
      * default: false
      */
    var enableClientSidePolyfills: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable specific polyfills by ID.
      * Passing `true` to a specific [feature ID](https://github.com/csstools/postcss-plugins/blob/main/plugin-packs/postcss-preset-env/FEATURES.md) will enable its polyfill,
      * while passing `false` will disable it.
      *
      * Passing an object to a specific feature ID will both enable and configure it.
      */
    var features: js.UndefOr[pluginsOptions] = js.undefined
    
    /**
      * The `insertAfter` key allows you to insert other PostCSS plugins into the chain.
      * This is only useful if you are also using sugary PostCSS plugins that must execute after certain polyfills.
      * `insertAfter` supports chaining one or multiple plugins.
      */
    var insertAfter: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * The `insertBefore` key allows you to insert other PostCSS plugins into the chain.
      * This is only useful if you are also using sugary PostCSS plugins that must execute before certain polyfills.
      * `insertBefore` supports chaining one or multiple plugins.
      */
    var insertBefore: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * The `logical` object allows to configure all plugins related to logical document flow at once.
      * It accepts the same options as each plugin: `inlineDirection` and `blockDirection`.
      */
    var logical: js.UndefOr[BlockDirection] = js.undefined
    
    /**
      * Determine which CSS features to polyfill,
      * based their implementation status.
      * default: 0
      */
    var minimumVendorImplementations: js.UndefOr[Double] = js.undefined
    
    /**
      * Determine whether all plugins should receive a `preserve` option,
      * which may preserve or remove the original and now polyfilled CSS.
      * Each plugin has it's own default, some true, others false.
      * default: _not set_
      */
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determine which CSS features to polyfill,
      * based upon their process in becoming web standards.
      * default: 2
      */
    var stage: js.UndefOr[Double | `false`] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoprefixer(value: Options): Self = StObject.set(x, "autoprefixer", value.asInstanceOf[js.Any])
      
      inline def setAutoprefixerUndefined: Self = StObject.set(x, "autoprefixer", js.undefined)
      
      inline def setBrowsers(value: String | js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersNull: Self = StObject.set(x, "browsers", null)
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEnableClientSidePolyfills(value: Boolean): Self = StObject.set(x, "enableClientSidePolyfills", value.asInstanceOf[js.Any])
      
      inline def setEnableClientSidePolyfillsUndefined: Self = StObject.set(x, "enableClientSidePolyfills", js.undefined)
      
      inline def setFeatures(value: pluginsOptions): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setInsertAfter(value: Record[String, Any]): Self = StObject.set(x, "insertAfter", value.asInstanceOf[js.Any])
      
      inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      inline def setInsertBefore(value: Record[String, Any]): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
      
      inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      inline def setLogical(value: BlockDirection): Self = StObject.set(x, "logical", value.asInstanceOf[js.Any])
      
      inline def setLogicalUndefined: Self = StObject.set(x, "logical", js.undefined)
      
      inline def setMinimumVendorImplementations(value: Double): Self = StObject.set(x, "minimumVendorImplementations", value.asInstanceOf[js.Any])
      
      inline def setMinimumVendorImplementationsUndefined: Self = StObject.set(x, "minimumVendorImplementations", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setStage(value: Double | `false`): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
}
