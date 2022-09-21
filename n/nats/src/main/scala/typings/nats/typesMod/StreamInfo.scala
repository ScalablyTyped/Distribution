package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamInfo extends StObject {
  
  var alternates: js.UndefOr[js.Array[StreamAlternate]] = js.undefined
  
  var cluster: js.UndefOr[ClusterInfo] = js.undefined
  
  var config: StreamConfig
  
  var created: Double
  
  var mirror: js.UndefOr[StreamSourceInfo] = js.undefined
  
  var sources: js.UndefOr[js.Array[StreamSourceInfo]] = js.undefined
  
  var state: StreamState
}
object StreamInfo {
  
  inline def apply(config: StreamConfig, created: Double, state: StreamState): StreamInfo = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInfo]
  }
  
  extension [Self <: StreamInfo](x: Self) {
    
    inline def setAlternates(value: js.Array[StreamAlternate]): Self = StObject.set(x, "alternates", value.asInstanceOf[js.Any])
    
    inline def setAlternatesUndefined: Self = StObject.set(x, "alternates", js.undefined)
    
    inline def setAlternatesVarargs(value: StreamAlternate*): Self = StObject.set(x, "alternates", js.Array(value*))
    
    inline def setCluster(value: ClusterInfo): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setConfig(value: StreamConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setMirror(value: StreamSourceInfo): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    inline def setSources(value: js.Array[StreamSourceInfo]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: StreamSourceInfo*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setState(value: StreamState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
