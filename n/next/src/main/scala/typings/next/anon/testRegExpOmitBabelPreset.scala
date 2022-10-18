package typings.next.anon

import typings.next.nextStrings.module
import typings.next.nextStrings.script
import typings.next.nextStrings.unambiguous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  test :std.RegExp} & std.Omit<next.next/dist/build/babel/preset.BabelPreset, 'overrides'> */
trait testRegExpOmitBabelPreset extends StObject {
  
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
  
  var test: js.RegExp
}
object testRegExpOmitBabelPreset {
  
  inline def apply(test: js.RegExp): testRegExpOmitBabelPreset = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[testRegExpOmitBabelPreset]
  }
  
  extension [Self <: testRegExpOmitBabelPreset](x: Self) {
    
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
    
    inline def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
