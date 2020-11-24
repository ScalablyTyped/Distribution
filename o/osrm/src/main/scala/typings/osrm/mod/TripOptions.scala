package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The trip plugin solves the Traveling Salesman Problem using a greedy heuristic (farthest-insertion algorithm).
  * The returned path does not have to be the fastest path, as TSP is NP-hard it is only an approximation.
  * Note that all input coordinates have to be connected for the trip service to work.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#trip
  */
@js.native
trait TripOptions extends Options {
  
  /**
    * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
    * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
    */
  var annotations: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  /**
    * Return route ends at any coordinate. Can also be last. (optional, default any)
    */
  var destination: js.UndefOr[String] = js.native
  
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[String] = js.native
  
  /**
    * Add overview geometry either full, simplified (optional, default simplified)
    */
  var overview: js.UndefOr[String] = js.native
  
  /**
    * Return route is a roundtrip. (optional, default true)
    */
  var roundtrip: js.UndefOr[Boolean] = js.native
  
  /**
    * Return route starts at any coordinate. Can also be first. (optional, default any)
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.native
}
object TripOptions {
  
  @scala.inline
  def apply(): TripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptions]
  }
  
  @scala.inline
  implicit class TripOptionsOps[Self <: TripOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnotationsVarargs(value: String*): Self = this.set("annotations", js.Array(value :_*))
    
    @scala.inline
    def setAnnotations(value: Boolean | js.Array[String]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setGeometries(value: String): Self = this.set("geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    
    @scala.inline
    def setRoundtrip(value: Boolean): Self = this.set("roundtrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundtrip: Self = this.set("roundtrip", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSteps(value: Boolean): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
}
