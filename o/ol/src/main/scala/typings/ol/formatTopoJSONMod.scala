package typings.ol

import typings.ol.projMod.ProjectionLike
import typings.topojsonSpecification.mod.GeometryCollection
import typings.topojsonSpecification.mod.GeometryObject
import typings.topojsonSpecification.mod.LineString
import typings.topojsonSpecification.mod.MultiLineString
import typings.topojsonSpecification.mod.MultiPoint
import typings.topojsonSpecification.mod.MultiPolygon
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Point
import typings.topojsonSpecification.mod.Polygon
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTopoJSONMod {
  
  @JSImport("ol/format/TopoJSON", JSImport.Default)
  @js.native
  open class default () extends TopoJSON {
    def this(opt_options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var layerName: js.UndefOr[String] = js.undefined
    
    var layers: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
      
      inline def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
      
      inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: String*): Self = StObject.set(x, "layers", js.Array(value*))
    }
  }
  
  @js.native
  trait TopoJSON
    extends typings.ol.formatJsonfeatureMod.default
  
  type TopoJSONGeometry = GeometryObject[js.Object]
  
  type TopoJSONGeometryCollection = GeometryCollection[js.Object]
  
  type TopoJSONLineString = LineString[js.Object]
  
  type TopoJSONMultiLineString = MultiLineString[js.Object]
  
  type TopoJSONMultiPoint = MultiPoint[js.Object]
  
  type TopoJSONMultiPolygon = MultiPolygon[js.Object]
  
  type TopoJSONPoint = Point[js.Object]
  
  type TopoJSONPolygon = Polygon[js.Object]
  
  type TopoJSONTopology = Topology[Objects[Properties]]
}
