package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamState extends StObject {
  
  var localClose: js.UndefOr[Double] = js.undefined
  
  var localWindowSize: js.UndefOr[Double] = js.undefined
  
  var remoteClose: js.UndefOr[Double] = js.undefined
  
  var state: js.UndefOr[Double] = js.undefined
  
  var sumDependencyWeight: js.UndefOr[Double] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object StreamState {
  
  inline def apply(): StreamState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamState]
  }
  
  extension [Self <: StreamState](x: Self) {
    
    inline def setLocalClose(value: Double): Self = StObject.set(x, "localClose", value.asInstanceOf[js.Any])
    
    inline def setLocalCloseUndefined: Self = StObject.set(x, "localClose", js.undefined)
    
    inline def setLocalWindowSize(value: Double): Self = StObject.set(x, "localWindowSize", value.asInstanceOf[js.Any])
    
    inline def setLocalWindowSizeUndefined: Self = StObject.set(x, "localWindowSize", js.undefined)
    
    inline def setRemoteClose(value: Double): Self = StObject.set(x, "remoteClose", value.asInstanceOf[js.Any])
    
    inline def setRemoteCloseUndefined: Self = StObject.set(x, "remoteClose", js.undefined)
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSumDependencyWeight(value: Double): Self = StObject.set(x, "sumDependencyWeight", value.asInstanceOf[js.Any])
    
    inline def setSumDependencyWeightUndefined: Self = StObject.set(x, "sumDependencyWeight", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
