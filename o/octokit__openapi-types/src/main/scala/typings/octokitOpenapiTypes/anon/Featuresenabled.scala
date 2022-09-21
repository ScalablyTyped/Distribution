package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Featuresenabled extends StObject {
  
  var features_enabled: js.UndefOr[js.Array[String]] = js.undefined
}
object Featuresenabled {
  
  inline def apply(): Featuresenabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Featuresenabled]
  }
  
  extension [Self <: Featuresenabled](x: Self) {
    
    inline def setFeatures_enabled(value: js.Array[String]): Self = StObject.set(x, "features_enabled", value.asInstanceOf[js.Any])
    
    inline def setFeatures_enabledUndefined: Self = StObject.set(x, "features_enabled", js.undefined)
    
    inline def setFeatures_enabledVarargs(value: String*): Self = StObject.set(x, "features_enabled", js.Array(value*))
  }
}
