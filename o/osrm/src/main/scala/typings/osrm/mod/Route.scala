package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a route through (potentially multiple) waypoints.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#route-object
  */
@js.native
trait Route extends js.Object {
  
  /**
    * The distance traveled by the route, in float meters.
    */
  var distance: Double = js.native
  
  /**
    * The estimated travel time, in float number of seconds.
    */
  var duration: Double = js.native
  
  /**
    * The whole geometry of the route value depending on overview parameter, format depending on the geometries parameter. See RouteStep's geometry property for a parameter documentation.
    */
  var geometry: js.UndefOr[js.Any] = js.native
  
  /**
    * The legs between the given waypoints, an array of RouteLeg objects.
    */
  var legs: js.Array[RouteLeg] = js.native
  
  /**
    * The calculated weight of the route.
    */
  var weight: Double = js.native
  
  /**
    * The name of the weight profile used during extraction phase.
    */
  var weight_name: String = js.native
}
object Route {
  
  @scala.inline
  def apply(distance: Double, duration: Double, legs: js.Array[RouteLeg], weight: Double, weight_name: String): Route = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], legs = legs.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], weight_name = weight_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegsVarargs(value: RouteLeg*): Self = this.set("legs", js.Array(value :_*))
    
    @scala.inline
    def setLegs(value: js.Array[RouteLeg]): Self = this.set("legs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight_name(value: String): Self = this.set("weight_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: js.Any): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
  }
}
