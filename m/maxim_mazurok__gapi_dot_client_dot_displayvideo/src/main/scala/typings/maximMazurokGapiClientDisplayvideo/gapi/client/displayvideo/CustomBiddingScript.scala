package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomBiddingScript extends StObject {
  
  /** Output only. Whether the script is currently being used for scoring by the parent algorithm. */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The time when the script was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the custom bidding algorithm the script belongs to. */
  var customBiddingAlgorithmId: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique ID of the custom bidding script. */
  var customBiddingScriptId: js.UndefOr[String] = js.undefined
  
  /** Output only. Error details of a rejected custom bidding script. This field will only be populated when Script.state is REJECTED. */
  var errors: js.UndefOr[js.Array[ScriptError]] = js.undefined
  
  /** Output only. The resource name of the custom bidding script. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The reference to the uploaded script file. */
  var script: js.UndefOr[CustomBiddingScriptRef] = js.undefined
  
  /** Output only. The state of the custom bidding script. */
  var state: js.UndefOr[String] = js.undefined
}
object CustomBiddingScript {
  
  inline def apply(): CustomBiddingScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomBiddingScript]
  }
  
  extension [Self <: CustomBiddingScript](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCustomBiddingAlgorithmId(value: String): Self = StObject.set(x, "customBiddingAlgorithmId", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingAlgorithmIdUndefined: Self = StObject.set(x, "customBiddingAlgorithmId", js.undefined)
    
    inline def setCustomBiddingScriptId(value: String): Self = StObject.set(x, "customBiddingScriptId", value.asInstanceOf[js.Any])
    
    inline def setCustomBiddingScriptIdUndefined: Self = StObject.set(x, "customBiddingScriptId", js.undefined)
    
    inline def setErrors(value: js.Array[ScriptError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ScriptError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScript(value: CustomBiddingScriptRef): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
