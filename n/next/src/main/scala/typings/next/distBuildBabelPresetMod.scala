package typings.next

import typings.next.anon.Babeltest
import typings.next.anon.testRegExpOmitBabelPreset
import typings.next.nextStrings.module
import typings.next.nextStrings.script
import typings.next.nextStrings.unambiguous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildBabelPresetMod {
  
  @JSImport("next/dist/build/babel/preset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(api: Any): BabelPreset = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(api.asInstanceOf[js.Any]).asInstanceOf[BabelPreset]
  inline def default(api: Any, options: NextBabelPresetOptions): BabelPreset = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BabelPreset]
  
  trait BabelPreset extends StObject {
    
    var overrides: js.UndefOr[js.Array[testRegExpOmitBabelPreset]] = js.undefined
    
    var plugins: js.UndefOr[
        (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginItem */ Any
        ]) | Null
      ] = js.undefined
    
    var presets: js.UndefOr[
        (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginItem */ Any
        ]) | Null
      ] = js.undefined
    
    var sourceType: js.UndefOr[script | module | unambiguous] = js.undefined
  }
  object BabelPreset {
    
    inline def apply(): BabelPreset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabelPreset]
    }
    
    extension [Self <: BabelPreset](x: Self) {
      
      inline def setOverrides(value: js.Array[testRegExpOmitBabelPreset]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setOverridesVarargs(value: testRegExpOmitBabelPreset*): Self = StObject.set(x, "overrides", js.Array(value*))
      
      inline def setPlugins(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginItem */ Any
            ]
      ): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginItem */ Any)*
      ): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPresets(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginItem */ Any
            ]
      ): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsNull: Self = StObject.set(x, "presets", null)
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPresetsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginItem */ Any)*
      ): Self = StObject.set(x, "presets", js.Array(value*))
      
      inline def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
  
  trait NextBabelPresetOptions extends StObject {
    
    var `class-properties`: js.UndefOr[Any] = js.undefined
    
    var `preset-env`: js.UndefOr[Any] = js.undefined
    
    var `preset-react`: js.UndefOr[Any] = js.undefined
    
    var `preset-typescript`: js.UndefOr[Any] = js.undefined
    
    var `styled-jsx`: js.UndefOr[StyledJsxBabelOptions] = js.undefined
    
    var `transform-runtime`: js.UndefOr[Any] = js.undefined
  }
  object NextBabelPresetOptions {
    
    inline def apply(): NextBabelPresetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextBabelPresetOptions]
    }
    
    extension [Self <: NextBabelPresetOptions](x: Self) {
      
      inline def `setClass-properties`(value: Any): Self = StObject.set(x, "class-properties", value.asInstanceOf[js.Any])
      
      inline def `setClass-propertiesUndefined`: Self = StObject.set(x, "class-properties", js.undefined)
      
      inline def `setPreset-env`(value: Any): Self = StObject.set(x, "preset-env", value.asInstanceOf[js.Any])
      
      inline def `setPreset-envUndefined`: Self = StObject.set(x, "preset-env", js.undefined)
      
      inline def `setPreset-react`(value: Any): Self = StObject.set(x, "preset-react", value.asInstanceOf[js.Any])
      
      inline def `setPreset-reactUndefined`: Self = StObject.set(x, "preset-react", js.undefined)
      
      inline def `setPreset-typescript`(value: Any): Self = StObject.set(x, "preset-typescript", value.asInstanceOf[js.Any])
      
      inline def `setPreset-typescriptUndefined`: Self = StObject.set(x, "preset-typescript", js.undefined)
      
      inline def `setStyled-jsx`(value: StyledJsxBabelOptions): Self = StObject.set(x, "styled-jsx", value.asInstanceOf[js.Any])
      
      inline def `setStyled-jsxUndefined`: Self = StObject.set(x, "styled-jsx", js.undefined)
      
      inline def `setTransform-runtime`(value: Any): Self = StObject.set(x, "transform-runtime", value.asInstanceOf[js.Any])
      
      inline def `setTransform-runtimeUndefined`: Self = StObject.set(x, "transform-runtime", js.undefined)
    }
  }
  
  type StyledJsxBabelOptions = js.UndefOr[Babeltest]
  
  type StyledJsxPlugin = (js.Tuple2[String, Any]) | String
}
