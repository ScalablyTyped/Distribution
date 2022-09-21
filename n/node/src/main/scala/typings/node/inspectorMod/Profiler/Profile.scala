package typings.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Profile.
  */
trait Profile extends StObject {
  
  /**
    * Profiling end timestamp in microseconds.
    */
  var endTime: Double
  
  /**
    * The list of profile nodes. First item is the root node.
    */
  var nodes: js.Array[ProfileNode]
  
  /**
    * Ids of samples top nodes.
    */
  var samples: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Profiling start timestamp in microseconds.
    */
  var startTime: Double
  
  /**
    * Time intervals between adjacent samples in microseconds. The first delta is relative to the profile startTime.
    */
  var timeDeltas: js.UndefOr[js.Array[Double]] = js.undefined
}
object Profile {
  
  inline def apply(endTime: Double, nodes: js.Array[ProfileNode], startTime: Double): Profile = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[ProfileNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: ProfileNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setSamples(value: js.Array[Double]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setSamplesVarargs(value: Double*): Self = StObject.set(x, "samples", js.Array(value*))
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTimeDeltas(value: js.Array[Double]): Self = StObject.set(x, "timeDeltas", value.asInstanceOf[js.Any])
    
    inline def setTimeDeltasUndefined: Self = StObject.set(x, "timeDeltas", js.undefined)
    
    inline def setTimeDeltasVarargs(value: Double*): Self = StObject.set(x, "timeDeltas", js.Array(value*))
  }
}
