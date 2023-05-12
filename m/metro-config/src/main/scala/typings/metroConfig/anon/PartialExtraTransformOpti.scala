package typings.metroConfig.anon

import org.scalablytyped.runtime.StringDictionary
import typings.metroConfig.metroConfigBooleans.`false`
import typings.metroConfig.metroConfigBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<metro-config.metro-config/src/configTypes.ExtraTransformOptions> */
trait PartialExtraTransformOpti extends StObject {
  
  var preloadedModules: js.UndefOr[StringDictionary[`true`] | `false`] = js.undefined
  
  var ramGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  var transform: js.UndefOr[ReadonlyexperimentalImpor] = js.undefined
}
object PartialExtraTransformOpti {
  
  inline def apply(): PartialExtraTransformOpti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialExtraTransformOpti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialExtraTransformOpti] (val x: Self) extends AnyVal {
    
    inline def setPreloadedModules(value: StringDictionary[`true`] | `false`): Self = StObject.set(x, "preloadedModules", value.asInstanceOf[js.Any])
    
    inline def setPreloadedModulesUndefined: Self = StObject.set(x, "preloadedModules", js.undefined)
    
    inline def setRamGroups(value: js.Array[String]): Self = StObject.set(x, "ramGroups", value.asInstanceOf[js.Any])
    
    inline def setRamGroupsUndefined: Self = StObject.set(x, "ramGroups", js.undefined)
    
    inline def setRamGroupsVarargs(value: String*): Self = StObject.set(x, "ramGroups", js.Array(value*))
    
    inline def setTransform(value: ReadonlyexperimentalImpor): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
