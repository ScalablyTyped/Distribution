package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentTargetInfo extends StObject {
  
  /**
    * The information for the targets within a nested component. This shares the same structure with the `oComponentTargetInfo`
    * parameter.
    */
  var componentTargetInfo: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The parameters for the route. See the documentation of the `oParameters`.
    */
  var parameters: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The name of the route which should be matched after this navTo call.
    */
  var route: js.UndefOr[String] = js.undefined
}
object ComponentTargetInfo {
  
  inline def apply(): ComponentTargetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentTargetInfo]
  }
  
  extension [Self <: ComponentTargetInfo](x: Self) {
    
    inline def setComponentTargetInfo(value: js.Object): Self = StObject.set(x, "componentTargetInfo", value.asInstanceOf[js.Any])
    
    inline def setComponentTargetInfoUndefined: Self = StObject.set(x, "componentTargetInfo", js.undefined)
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
  }
}
