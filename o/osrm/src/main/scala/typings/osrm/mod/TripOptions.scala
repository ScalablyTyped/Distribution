package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The trip plugin solves the Traveling Salesman Problem using a greedy heuristic (farthest-insertion algorithm).
  * The returned path does not have to be the fastest path, as TSP is NP-hard it is only an approximation.
  * Note that all input coordinates have to be connected for the trip service to work.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#trip
  */
trait TripOptions
  extends StObject
     with Options {
  
  /**
    * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
    * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
    */
  var annotations: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /**
    * Return route ends at any coordinate. Can also be last. (optional, default any)
    */
  var destination: js.UndefOr[String] = js.undefined
  
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[String] = js.undefined
  
  /**
    * Add overview geometry either full, simplified (optional, default simplified)
    */
  var overview: js.UndefOr[String] = js.undefined
  
  /**
    * Return route is a roundtrip. (optional, default true)
    */
  var roundtrip: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return route starts at any coordinate. Can also be first. (optional, default any)
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.undefined
}
object TripOptions {
  
  @scala.inline
  def apply(): TripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptions]
  }
  
  @scala.inline
  implicit class TripOptionsMutableBuilder[Self <: TripOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: Boolean | js.Array[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: String*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setGeometries(value: String): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    @scala.inline
    def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setRoundtrip(value: Boolean): Self = StObject.set(x, "roundtrip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundtripUndefined: Self = StObject.set(x, "roundtrip", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSteps(value: Boolean): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
