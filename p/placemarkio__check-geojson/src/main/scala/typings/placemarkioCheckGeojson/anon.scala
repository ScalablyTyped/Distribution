package typings.placemarkioCheckGeojson

import typings.geojson.mod.GeoJSON
import typings.placemarkioCheckGeojson.distTypesMod.HintIssue
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.FeatureCollection
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.GeometryCollection
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.LineString
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.MultiLineString
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.MultiPoint
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.MultiPolygon
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Point
import typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Feature extends StObject {
    
    var feature: Any
    
    var reasons: js.Array[HintIssue]
  }
  object Feature {
    
    inline def apply(feature: Any, reasons: js.Array[HintIssue]): Feature = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
      
      inline def setFeature(value: Any): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setReasons(value: js.Array[HintIssue]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
      
      inline def setReasonsVarargs(value: HintIssue*): Self = StObject.set(x, "reasons", js.Array(value*))
    }
  }
  
  trait ObjectNode extends StObject {
    
    var objectNode: Unit
    
    var `type`: Unit
  }
  object ObjectNode {
    
    inline def apply(objectNode: Unit, `type`: Unit): ObjectNode = {
      val __obj = js.Dynamic.literal(objectNode = objectNode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectNode] (val x: Self) extends AnyVal {
      
      inline def setObjectNode(value: Unit): Self = StObject.set(x, "objectNode", value.asInstanceOf[js.Any])
      
      inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rejected extends StObject {
    
    var rejected: js.Array[Feature]
    
    var result: GeoJSON
  }
  object Rejected {
    
    inline def apply(rejected: js.Array[Feature], result: GeoJSON): Rejected = {
      val __obj = js.Dynamic.literal(rejected = rejected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rejected]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rejected] (val x: Self) extends AnyVal {
      
      inline def setRejected(value: js.Array[Feature]): Self = StObject.set(x, "rejected", value.asInstanceOf[js.Any])
      
      inline def setRejectedVarargs(value: Feature*): Self = StObject.set(x, "rejected", js.Array(value*))
      
      inline def setResult(value: GeoJSON): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var objectNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_momoa.ObjectNode */ Any
    
    var `type`: Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature | FeatureCollection
  }
  object Type {
    
    inline def apply(
      objectNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_momoa.ObjectNode */ Any,
      `type`: Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature | FeatureCollection
    ): Type = {
      val __obj = js.Dynamic.literal(objectNode = objectNode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setObjectNode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_momoa.ObjectNode */ Any
      ): Self = StObject.set(x, "objectNode", value.asInstanceOf[js.Any])
      
      inline def setType(
        value: Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection | typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature | FeatureCollection
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
