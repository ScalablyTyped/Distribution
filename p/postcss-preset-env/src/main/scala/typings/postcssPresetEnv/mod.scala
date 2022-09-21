package typings.postcssPresetEnv

import org.scalablytyped.runtime.Shortcut
import typings.autoprefixer.mod.Options
import typings.postcss.mod.PluginCreator
import typings.postcssPresetEnv.mod.pluginOptions.features
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-preset-env", JSImport.Namespace)
  @js.native
  val ^ : PostcssPresetEnv = js.native
  
  type PostcssPresetEnv = PluginCreator[pluginOptions]
  
  type _To = PostcssPresetEnv
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PostcssPresetEnv = ^
  
  trait pluginOptions extends StObject {
    
    /**
      * PostCSS Preset Env includes
      * [autoprefixer](https://github.com/postcss/autoprefixer)
      * and `browsers` option will be passed to it automatically.
      *
      * Specifying the `autoprefixer` option enables passing
      * [additional options](https://github.com/postcss/autoprefixer#options)
      * into autoprefixer.
      *
      * Passing `autoprefixer: false` disables autoprefixer.
      */
    var autoprefixer: js.UndefOr[Boolean | Options] = js.undefined
    
    /**
      * The browsers option determines which polyfills are required based upon
      * the browsers you are supporting.
      *
      * PostCSS Preset Env supports any standard browserslist configuration,
      * which can be a `.browserslistrc` file, a `browserslist` key in
      * `package.json`, or `browserslist` environment variables.
      *
      * The `browsers` option should only be used when a standard browserslist
      * configuration is not available.
      *
      * @default default
      */
    var browsers: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The `exportTo` option specifies destinations where variables like
      * Custom Media, Custom Properties, Custom Selectors, and
      * Environment Variables can be exported to, which might be
      * CSS, JS, and JSON files, functions, and directly passed objects.
      */
    var exportTo: js.UndefOr[String | js.Array[Any]] = js.undefined
    
    /**
      * The features option enables or disables specific polyfills by ID.
      * Passing true to a specific feature ID will enable its polyfill,
      * while passing false will disable it.
      *
      * Passing an object to a specific feature ID will both enable and
      * configure it.
      *
      * Any polyfills not explicitly enabled or disabled through `features`
      * are determined by the `stage` option.
      */
    var features: js.UndefOr[features] = js.undefined
    
    /**
      * The `importFrom` option specifies sources where variables like
      * Custom Media, Custom Properties, Custom Selectors, and
      * Environment Variables can be imported from, which might be
      * CSS, JS, and JSON files, functions, and directly passed objects.
      */
    var importFrom: js.UndefOr[String | js.Array[Any]] = js.undefined
    
    /**
      * The `insertAfter` keys allow you to insert other PostCSS plugins
      * into the chain. This is only useful if you are also using sugary
      * PostCSS plugins that must execute before or after certain polyfills.
      * `insertAfter` support chaining one or multiple plugins.
      */
    var insertAfter: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The `insertBefore` keys allow you to insert other PostCSS plugins
      * into the chain. This is only useful if you are also using sugary
      * PostCSS plugins that must execute before or after certain polyfills.
      * `insertBefore` support chaining one or multiple plugins.
      */
    var insertBefore: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The `preserve` option determines whether all plugins should receive
      * a `preserve` option, which may preserve or remove otherwise-polyfilled CSS.
      * By default, this option is not configured.
      */
    var preserve: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The stage option determines which CSS features to polyfill,
      * based upon their stability in the process of becoming
      * implemented web standards.
      *
      * `postcssPresetEnv({ stage: 0 })`
      *
      * The `stage` can be `0` (experimental) through `4` (stable), or false.
      * Setting stage to false will disable every polyfill. Doing this would only
      * be useful if you intended to exclusively use the `features` option.
      *
      * Without any configuration options, PostCSS Preset Env enables
      * **Stage 2** features.
      */
    var stage: js.UndefOr[Double] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    trait features extends StObject {
      
      var `all-property`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `any-link-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `blank-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `break-properties`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `case-insensitive-attributes`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `color-functional-notation`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `color-mod-function`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `custom-media-queries`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `custom-properties`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `custom-selectors`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `dir-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `double-position-gradients`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `environment-variables`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `focus-visible-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `focus-within-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `font-variant-property`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `gap-properties`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `gray-function`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `has-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `hexadecimal-alpha-notation`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `image-set-function`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `lab-function`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `logical-properties-and-values`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `matches-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `media-query-ranges`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `nesting-rules`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `not-pseudo-class`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `overflow-property`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `overflow-wrap-property`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `place-properties`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `prefers-color-scheme-query`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `rebeccapurple-color`: js.UndefOr[Boolean | js.Object] = js.undefined
      
      var `system-ui-font-family`: js.UndefOr[Boolean | js.Object] = js.undefined
    }
    object features {
      
      inline def apply(): features = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[features]
      }
      
      extension [Self <: features](x: Self) {
        
        inline def `setAll-property`(value: Boolean | js.Object): Self = StObject.set(x, "all-property", value.asInstanceOf[js.Any])
        
        inline def `setAll-propertyUndefined`: Self = StObject.set(x, "all-property", js.undefined)
        
        inline def `setAny-link-pseudo-class`(value: Boolean | js.Object): Self = StObject.set(x, "any-link-pseudo-class", value.asInstanceOf[js.Any])
        
        inline def `setAny-link-pseudo-classUndefined`: Self = StObject.set(x, "any-link-pseudo-class", js.undefined)
        
        inline def `setBlank-pseudo-class`(value: Boolean | js.Object): Self = StObject.set(x, "blank-pseudo-class", value.asInstanceOf[js.Any])
        
        inline def `setBlank-pseudo-classUndefined`: Self = StObject.set(x, "blank-pseudo-class", js.undefined)
        
        inline def `setBreak-properties`(value: Boolean | js.Object): Self = StObject.set(x, "break-properties", value.asInstanceOf[js.Any])
        
        inline def `setBreak-propertiesUndefined`: Self = StObject.set(x, "break-properties", js.undefined)
        
        inline def `setCase-insensitive-attributes`(value: Boolean | js.Object): Self = StObject.set(x, "case-insensitive-attributes", value.asInstanceOf[js.Any])
        
        inline def `setCase-insensitive-attributesUndefined`: Self = StObject.set(x, "case-insensitive-attributes", js.undefined)
        
        inline def `setColor-functional-notation`(value: Boolean | js.Object): Self = StObject.set(x, "color-functional-notation", value.asInstanceOf[js.Any])
        
        inline def `setColor-functional-notationUndefined`: Self = StObject.set(x, "color-functional-notation", js.undefined)
        
        inline def `setColor-mod-function`(value: Boolean | js.Object): Self = StObject.set(x, "color-mod-function", value.asInstanceOf[js.Any])
        
        inline def `setColor-mod-functionUndefined`: Self = StObject.set(x, "color-mod-function", js.undefined)
        
        inline def `setCustom-media-queries`(value: Boolean | js.Object): Self = StObject.set(x, "custom-media-queries", value.asInstanceOf[js.Any])
        
        inline def `setCustom-media-queriesUndefined`: Self = StObject.set(x, "custom-media-queries", js.undefined)
        
        inline def `setCustom-properties`(value: Boolean | js.Object): Self = StObject.set(x, "custom-properties", value.asInstanceOf[js.Any])
        
        inline def `setCustom-propertiesUndefined`: Self = StObject.set(x, "custom-properties", js.undefined)
        
        inline def `setCustom-selectors`(value: Boolean | js.Object): Self = StObject.set(x, "custom-selectors", value.asInstanceOf[js.Any])
        
        inline def `setCustom-selectorsUndefined`: Self = StObject.set(x, "custom-selectors", js.undefined)
        
        inline def `setDir-pseudo-class`(value: Boolean | js.Object): Self = StObject.set(x, "dir-pseudo-class", value.asInstanceOf[js.Any])
        
        inline def `setDir-pseudo-classUndefined`: Self = StObject.set(x, "dir-pseudo-class", js.undefined)
        
        inline def `setDouble-position-gradients`(value: Boolean | js.Object): Self = StObject.set(x, "double-position-gradients", value.asInstanceOf[js.Any])
        
        inline def `setDouble-position-gradientsUndefined`: Self = StObject.set(x, "double-position-gradients", js.undefined)
        
        inline def `setEnvironment-variables`(value: Boolean | js.Object): Self = StObject.set(x, "environment-variables", value.asInstanceOf[js.Any])
        
        inline def `setEnvironment-variablesUndefined`: Self = StObject.set(x, "environment-variables", js.undefined)
        
        inline def `setFocus-visible-pseudo-class`(value: Boolean | js.Object): Self = StObject.set(x, "focus-visible-pseudo-class", value.asInstanceOf[js.Any])
        
        inline def `setFocus-visible-pseudo-classUndefined`: Self = StObject.set(x, "focus-visible-pseudo-class", js.undefined)
        
        inline def `setFocus-within-pseudo-class`(value: Boolean | js.Object): Self = StObject.set(x, "focus-within-pseudo-class", value.asInstanceOf[js.Any])
        
        inline def `setFocus-within-pseudo-classUndefined`: Self = StObject.set(x, "focus-within-pseudo-class", js.undefined)
        
        inline def `setFont-variant-property`(value: Boolean | js.Object): Self = StObject.set(x, "font-variant-property", value.asInstanceOf[js.Any])
        
        inline def `setFont-variant-propertyUndefined`: Self = StObject.set(x, "font-variant-property", js.undefined)
        
        inline def `setGap-properties`(value: Boolean | js.Object): Self = StObject.set(x, "gap-properties", value.asInstanceOf[js.Any])
        
        inline def `setGap-propertiesUndefined`: Self = StObject.set(x, "gap-properties", js.undefined)
        
        inline def `setGray-function`(value: Boolean | js.Object): Self = StObject.set(x, "gray-function", value.asInstanceOf[js.Any])
        
        inline def `setGray-functionUndefined`: Self = StObject.set(x, "gray-function", js.undefined)
        
        inline def `setHas-pseudo-class`(value: Boolean | js.Object): Self = StObject.set(x, "has-pseudo-class", value.asInstanceOf[js.Any])
        
        inline def `setHas-pseudo-classUndefined`: Self = StObject.set(x, "has-pseudo-class", js.undefined)
        
        inline def `setHexadecimal-alpha-notation`(value: Boolean | js.Object): Self = StObject.set(x, "hexadecimal-alpha-notation", value.asInstanceOf[js.Any])
        
        inline def `setHexadecimal-alpha-notationUndefined`: Self = StObject.set(x, "hexadecimal-alpha-notation", js.undefined)
        
        inline def `setImage-set-function`(value: Boolean | js.Object): Self = StObject.set(x, "image-set-function", value.asInstanceOf[js.Any])
        
        inline def `setImage-set-functionUndefined`: Self = StObject.set(x, "image-set-function", js.undefined)
        
        inline def `setLab-function`(value: Boolean | js.Object): Self = StObject.set(x, "lab-function", value.asInstanceOf[js.Any])
        
        inline def `setLab-functionUndefined`: Self = StObject.set(x, "lab-function", js.undefined)
        
        inline def `setLogical-properties-and-values`(value: Boolean | js.Object): Self = StObject.set(x, "logical-properties-and-values", value.asInstanceOf[js.Any])
        
        inline def `setLogical-properties-and-valuesUndefined`: Self = StObject.set(x, "logical-properties-and-values", js.undefined)
        
        inline def `setMatches-pseudo-class`(value: Boolean | js.Object): Self = StObject.set(x, "matches-pseudo-class", value.asInstanceOf[js.Any])
        
        inline def `setMatches-pseudo-classUndefined`: Self = StObject.set(x, "matches-pseudo-class", js.undefined)
        
        inline def `setMedia-query-ranges`(value: Boolean | js.Object): Self = StObject.set(x, "media-query-ranges", value.asInstanceOf[js.Any])
        
        inline def `setMedia-query-rangesUndefined`: Self = StObject.set(x, "media-query-ranges", js.undefined)
        
        inline def `setNesting-rules`(value: Boolean | js.Object): Self = StObject.set(x, "nesting-rules", value.asInstanceOf[js.Any])
        
        inline def `setNesting-rulesUndefined`: Self = StObject.set(x, "nesting-rules", js.undefined)
        
        inline def `setNot-pseudo-class`(value: Boolean | js.Object): Self = StObject.set(x, "not-pseudo-class", value.asInstanceOf[js.Any])
        
        inline def `setNot-pseudo-classUndefined`: Self = StObject.set(x, "not-pseudo-class", js.undefined)
        
        inline def `setOverflow-property`(value: Boolean | js.Object): Self = StObject.set(x, "overflow-property", value.asInstanceOf[js.Any])
        
        inline def `setOverflow-propertyUndefined`: Self = StObject.set(x, "overflow-property", js.undefined)
        
        inline def `setOverflow-wrap-property`(value: Boolean | js.Object): Self = StObject.set(x, "overflow-wrap-property", value.asInstanceOf[js.Any])
        
        inline def `setOverflow-wrap-propertyUndefined`: Self = StObject.set(x, "overflow-wrap-property", js.undefined)
        
        inline def `setPlace-properties`(value: Boolean | js.Object): Self = StObject.set(x, "place-properties", value.asInstanceOf[js.Any])
        
        inline def `setPlace-propertiesUndefined`: Self = StObject.set(x, "place-properties", js.undefined)
        
        inline def `setPrefers-color-scheme-query`(value: Boolean | js.Object): Self = StObject.set(x, "prefers-color-scheme-query", value.asInstanceOf[js.Any])
        
        inline def `setPrefers-color-scheme-queryUndefined`: Self = StObject.set(x, "prefers-color-scheme-query", js.undefined)
        
        inline def `setRebeccapurple-color`(value: Boolean | js.Object): Self = StObject.set(x, "rebeccapurple-color", value.asInstanceOf[js.Any])
        
        inline def `setRebeccapurple-colorUndefined`: Self = StObject.set(x, "rebeccapurple-color", js.undefined)
        
        inline def `setSystem-ui-font-family`(value: Boolean | js.Object): Self = StObject.set(x, "system-ui-font-family", value.asInstanceOf[js.Any])
        
        inline def `setSystem-ui-font-familyUndefined`: Self = StObject.set(x, "system-ui-font-family", js.undefined)
      }
    }
    
    extension [Self <: pluginOptions](x: Self) {
      
      inline def setAutoprefixer(value: Boolean | Options): Self = StObject.set(x, "autoprefixer", value.asInstanceOf[js.Any])
      
      inline def setAutoprefixerUndefined: Self = StObject.set(x, "autoprefixer", js.undefined)
      
      inline def setBrowsers(value: String | js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
      
      inline def setExportTo(value: String | js.Array[Any]): Self = StObject.set(x, "exportTo", value.asInstanceOf[js.Any])
      
      inline def setExportToUndefined: Self = StObject.set(x, "exportTo", js.undefined)
      
      inline def setExportToVarargs(value: Any*): Self = StObject.set(x, "exportTo", js.Array(value*))
      
      inline def setFeatures(value: features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setImportFrom(value: String | js.Array[Any]): Self = StObject.set(x, "importFrom", value.asInstanceOf[js.Any])
      
      inline def setImportFromUndefined: Self = StObject.set(x, "importFrom", js.undefined)
      
      inline def setImportFromVarargs(value: Any*): Self = StObject.set(x, "importFrom", js.Array(value*))
      
      inline def setInsertAfter(value: js.Object): Self = StObject.set(x, "insertAfter", value.asInstanceOf[js.Any])
      
      inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
      
      inline def setInsertBefore(value: js.Object): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
      
      inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setStage(value: Double): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
}
