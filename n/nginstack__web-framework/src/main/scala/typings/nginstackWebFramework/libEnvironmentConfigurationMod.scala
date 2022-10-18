package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEnvironmentConfigurationMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/environment/Configuration", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Configuration {
    
    /* CompleteClass */
    var isNewJS: Boolean = js.native
    
    /* CompleteClass */
    var startInteractionName: Any = js.native
    
    /* CompleteClass */
    var startParameters: Any = js.native
    
    /* CompleteClass */
    var startProcessKey: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/environment/Configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Configuration extends StObject {
    
    var isNewJS: Boolean
    
    var startInteractionName: Any
    
    var startParameters: Any
    
    var startProcessKey: Any
  }
  object Configuration {
    
    inline def apply(isNewJS: Boolean, startInteractionName: Any, startParameters: Any, startProcessKey: Any): Configuration = {
      val __obj = js.Dynamic.literal(isNewJS = isNewJS.asInstanceOf[js.Any], startInteractionName = startInteractionName.asInstanceOf[js.Any], startParameters = startParameters.asInstanceOf[js.Any], startProcessKey = startProcessKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setIsNewJS(value: Boolean): Self = StObject.set(x, "isNewJS", value.asInstanceOf[js.Any])
      
      inline def setStartInteractionName(value: Any): Self = StObject.set(x, "startInteractionName", value.asInstanceOf[js.Any])
      
      inline def setStartParameters(value: Any): Self = StObject.set(x, "startParameters", value.asInstanceOf[js.Any])
      
      inline def setStartProcessKey(value: Any): Self = StObject.set(x, "startProcessKey", value.asInstanceOf[js.Any])
    }
  }
}
