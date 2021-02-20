package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotation of the whole route leg with fine-grained information about each segment or node id.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#annotation-object
  */
@js.native
trait Annotation extends StObject {
  
  /**
    * The index of the datasource for the speed between each pair of coordinates. 0 is the default profile, other values are supplied via --segment-speed-file to osrm-contract
    */
  var datasources: js.Array[Double] = js.native
  
  /**
    * The distance, in metres, between each pair of coordinates
    */
  var distance: js.Array[Double] = js.native
  
  /**
    * The duration between each pair of coordinates, in seconds. Does not include the duration of any turns.
    */
  var duration: js.Array[Double] = js.native
  
  /**
    * The OSM node ID for each coordinate along the route, excluding the first/last user-supplied coordinates
    */
  var nodes: js.Array[Double] = js.native
  
  /**
    * Convenience field, calculation of distance / duration rounded to one decimal place
    */
  var speed: js.Array[Double] = js.native
  
  /**
    * The weights between each pair of coordinates. Does not include any turn costs.
    */
  var weight: js.Array[Double] = js.native
}
object Annotation {
  
  @scala.inline
  def apply(
    datasources: js.Array[Double],
    distance: js.Array[Double],
    duration: js.Array[Double],
    nodes: js.Array[Double],
    speed: js.Array[Double],
    weight: js.Array[Double]
  ): Annotation = {
    val __obj = js.Dynamic.literal(datasources = datasources.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationMutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasources(value: js.Array[Double]): Self = StObject.set(x, "datasources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasourcesVarargs(value: Double*): Self = StObject.set(x, "datasources", js.Array(value :_*))
    
    @scala.inline
    def setDistance(value: js.Array[Double]): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceVarargs(value: Double*): Self = StObject.set(x, "distance", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: js.Array[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationVarargs(value: Double*): Self = StObject.set(x, "duration", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Double]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: Double*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setSpeed(value: js.Array[Double]): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedVarargs(value: Double*): Self = StObject.set(x, "speed", js.Array(value :_*))
    
    @scala.inline
    def setWeight(value: js.Array[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightVarargs(value: Double*): Self = StObject.set(x, "weight", js.Array(value :_*))
  }
}
