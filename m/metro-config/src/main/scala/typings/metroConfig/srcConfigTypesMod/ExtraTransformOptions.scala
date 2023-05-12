package typings.metroConfig.srcConfigTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.metroConfig.anon.ReadonlyexperimentalImpor
import typings.metroConfig.metroConfigBooleans.`false`
import typings.metroConfig.metroConfigBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraTransformOptions extends StObject {
  
  val preloadedModules: StringDictionary[`true`] | `false`
  
  val ramGroups: js.Array[String]
  
  val transform: ReadonlyexperimentalImpor
}
object ExtraTransformOptions {
  
  inline def apply(
    preloadedModules: StringDictionary[`true`] | `false`,
    ramGroups: js.Array[String],
    transform: ReadonlyexperimentalImpor
  ): ExtraTransformOptions = {
    val __obj = js.Dynamic.literal(preloadedModules = preloadedModules.asInstanceOf[js.Any], ramGroups = ramGroups.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraTransformOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtraTransformOptions] (val x: Self) extends AnyVal {
    
    inline def setPreloadedModules(value: StringDictionary[`true`] | `false`): Self = StObject.set(x, "preloadedModules", value.asInstanceOf[js.Any])
    
    inline def setRamGroups(value: js.Array[String]): Self = StObject.set(x, "ramGroups", value.asInstanceOf[js.Any])
    
    inline def setRamGroupsVarargs(value: String*): Self = StObject.set(x, "ramGroups", js.Array(value*))
    
    inline def setTransform(value: ReadonlyexperimentalImpor): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
