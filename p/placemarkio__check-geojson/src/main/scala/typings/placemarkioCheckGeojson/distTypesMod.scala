package typings.placemarkioCheckGeojson

import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.FeatureCollection
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.GeometryCollection
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.LineString
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.MultiLineString
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.MultiPoint
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.MultiPolygon
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Point
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Polygon
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.error
import typings.std.Node
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("@placemarkio/check-geojson/dist/types", "GEOJSON_FEATURE_TYPE")
  @js.native
  val GEOJSON_FEATURE_TYPE: Set[
    Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | Feature | FeatureCollection
  ] = js.native
  
  @JSImport("@placemarkio/check-geojson/dist/types", "GEOJSON_GEOMETRY_TYPES")
  @js.native
  val GEOJSON_GEOMETRY_TYPES: Set[
    Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | Feature | FeatureCollection
  ] = js.native
  
  @JSImport("@placemarkio/check-geojson/dist/types", "GEOJSON_GEOMETRY_TYPES_EX_GEOMETRY_COLLECTION")
  @js.native
  val GEOJSON_GEOMETRY_TYPES_EX_GEOMETRY_COLLECTION: Set[
    Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | Feature | FeatureCollection
  ] = js.native
  
  @JSImport("@placemarkio/check-geojson/dist/types", "GEOJSON_TYPES")
  @js.native
  val GEOJSON_TYPES: Set[
    Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | Feature | FeatureCollection
  ] = js.native
  
  trait Ctx extends StObject {
    
    var issues: js.Array[HintIssue]
    
    var valid: js.Array[js.UndefOr[js.Array[HintIssue]]]
  }
  object Ctx {
    
    inline def apply(issues: js.Array[HintIssue], valid: js.Array[js.UndefOr[js.Array[HintIssue]]]): Ctx = {
      val __obj = js.Dynamic.literal(issues = issues.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ctx]
    }
    
    extension [Self <: Ctx](x: Self) {
      
      inline def setIssues(value: js.Array[HintIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setIssuesVarargs(value: HintIssue*): Self = StObject.set(x, "issues", js.Array(value*))
      
      inline def setValid(value: js.Array[js.UndefOr[js.Array[HintIssue]]]): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidVarargs(value: js.UndefOr[js.Array[HintIssue]]*): Self = StObject.set(x, "valid", js.Array(value*))
    }
  }
  
  type GeoJSONTypeSet = Set[
    Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | Feature | FeatureCollection
  ]
  
  trait HintIssue extends StObject {
    
    var from: Double
    
    var message: String
    
    var node: js.UndefOr[Node] = js.undefined
    
    var severity: error
    
    var to: Double
  }
  object HintIssue {
    
    inline def apply(from: Double, message: String, to: Double): HintIssue = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = "error", to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[HintIssue]
    }
    
    extension [Self <: HintIssue](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setSeverity(value: error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
