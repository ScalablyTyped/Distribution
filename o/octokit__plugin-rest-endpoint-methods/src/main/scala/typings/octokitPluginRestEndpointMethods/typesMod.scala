package typings.octokitPluginRestEndpointMethods

import org.scalablytyped.runtime.StringDictionary
import typings.octokitPluginRestEndpointMethods.methodTypesMod.RestEndpointMethods
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type Api = RestEndpointMethods
  
  trait EndpointDecorations extends StObject {
    
    var deprecated: js.UndefOr[String] = js.undefined
    
    var mapToData: js.UndefOr[String] = js.undefined
    
    var renamed: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var renamedParameters: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object EndpointDecorations {
    
    inline def apply(): EndpointDecorations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointDecorations]
    }
    
    extension [Self <: EndpointDecorations](x: Self) {
      
      inline def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setMapToData(value: String): Self = StObject.set(x, "mapToData", value.asInstanceOf[js.Any])
      
      inline def setMapToDataUndefined: Self = StObject.set(x, "mapToData", js.undefined)
      
      inline def setRenamed(value: js.Tuple2[String, String]): Self = StObject.set(x, "renamed", value.asInstanceOf[js.Any])
      
      inline def setRenamedParameters(value: StringDictionary[String]): Self = StObject.set(x, "renamedParameters", value.asInstanceOf[js.Any])
      
      inline def setRenamedParametersUndefined: Self = StObject.set(x, "renamedParameters", js.undefined)
      
      inline def setRenamedUndefined: Self = StObject.set(x, "renamed", js.undefined)
    }
  }
  
  type EndpointsDefaultsAndDecorations = StringDictionary[
    StringDictionary[js.Tuple3[Route, js.UndefOr[RequestParameters], js.UndefOr[EndpointDecorations]]]
  ]
}
