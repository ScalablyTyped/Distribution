package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefInterceptorConfigurationMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/InterceptorConfiguration", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with InterceptorConfiguration {
    
    /* CompleteClass */
    var afterScriptKeys: js.Array[Any] = js.native
    
    /* CompleteClass */
    var beforeScriptKeys: js.Array[Any] = js.native
    
    /* CompleteClass */
    var mimesTypes: js.Array[Any] = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/InterceptorConfiguration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait InterceptorConfiguration extends StObject {
    
    var afterScriptKeys: js.Array[Any]
    
    var beforeScriptKeys: js.Array[Any]
    
    var mimesTypes: js.Array[Any]
  }
  object InterceptorConfiguration {
    
    inline def apply(afterScriptKeys: js.Array[Any], beforeScriptKeys: js.Array[Any], mimesTypes: js.Array[Any]): InterceptorConfiguration = {
      val __obj = js.Dynamic.literal(afterScriptKeys = afterScriptKeys.asInstanceOf[js.Any], beforeScriptKeys = beforeScriptKeys.asInstanceOf[js.Any], mimesTypes = mimesTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterceptorConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterceptorConfiguration] (val x: Self) extends AnyVal {
      
      inline def setAfterScriptKeys(value: js.Array[Any]): Self = StObject.set(x, "afterScriptKeys", value.asInstanceOf[js.Any])
      
      inline def setAfterScriptKeysVarargs(value: Any*): Self = StObject.set(x, "afterScriptKeys", js.Array(value*))
      
      inline def setBeforeScriptKeys(value: js.Array[Any]): Self = StObject.set(x, "beforeScriptKeys", value.asInstanceOf[js.Any])
      
      inline def setBeforeScriptKeysVarargs(value: Any*): Self = StObject.set(x, "beforeScriptKeys", js.Array(value*))
      
      inline def setMimesTypes(value: js.Array[Any]): Self = StObject.set(x, "mimesTypes", value.asInstanceOf[js.Any])
      
      inline def setMimesTypesVarargs(value: Any*): Self = StObject.set(x, "mimesTypes", js.Array(value*))
    }
  }
}
