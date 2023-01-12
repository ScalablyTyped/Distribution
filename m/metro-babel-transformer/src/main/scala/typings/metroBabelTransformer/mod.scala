package typings.metroBabelTransformer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait CustomTransformOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var __proto__ : Null
  }
  object CustomTransformOptions {
    
    inline def apply(__proto__ : Null): CustomTransformOptions = {
      val __obj = js.Dynamic.literal(__proto__ = __proto__.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomTransformOptions] (val x: Self) extends AnyVal {
      
      inline def set__proto__(value: Null): Self = StObject.set(x, "__proto__", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroBabelTransformer.metroBabelTransformerStrings.default
    - typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable`
    - typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary`
  */
  trait TransformProfile extends StObject
  object TransformProfile {
    
    inline def default: typings.metroBabelTransformer.metroBabelTransformerStrings.default = "default".asInstanceOf[typings.metroBabelTransformer.metroBabelTransformerStrings.default]
    
    inline def `hermes-canary`: typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary` = "hermes-canary".asInstanceOf[typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary`]
    
    inline def `hermes-stable`: typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable` = "hermes-stable".asInstanceOf[typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable`]
  }
}
