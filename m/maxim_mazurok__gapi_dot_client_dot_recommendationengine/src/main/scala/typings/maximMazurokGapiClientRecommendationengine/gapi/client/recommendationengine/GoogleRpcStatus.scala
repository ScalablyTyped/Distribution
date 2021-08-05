package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleRpcStatus extends StObject {
  
  /** The status code, which should be an enum value of google.rpc.Code. */
  var code: js.UndefOr[Double] = js.undefined
  
  /** A list of messages that carry the error details. There is a common set of message types for APIs to use. */
  var details: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleRpcStatus & TopLevel[js.Any]
    ]
  ] = js.undefined
  
  /**
    * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the
    * client.
    */
  var message: js.UndefOr[String] = js.undefined
}
object GoogleRpcStatus {
  
  inline def apply(): GoogleRpcStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleRpcStatus]
  }
  
  extension [Self <: GoogleRpcStatus](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleRpcStatus & TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleRpcStatus & TopLevel[js.Any])*
    ): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
