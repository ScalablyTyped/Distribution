package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomGeometryTypeMod {
  
  @JSImport("ol/geom/GeometryType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GeometryType & String] = js.native
    
    /* "Circle" */ val CIRCLE: typings.ol.geomGeometryTypeMod.GeometryType.CIRCLE & String = js.native
    
    /* "GeometryCollection" */ val GEOMETRY_COLLECTION: typings.ol.geomGeometryTypeMod.GeometryType.GEOMETRY_COLLECTION & String = js.native
    
    /* "LinearRing" */ val LINEAR_RING: typings.ol.geomGeometryTypeMod.GeometryType.LINEAR_RING & String = js.native
    
    /* "LineString" */ val LINE_STRING: typings.ol.geomGeometryTypeMod.GeometryType.LINE_STRING & String = js.native
    
    /* "MultiLineString" */ val MULTI_LINE_STRING: typings.ol.geomGeometryTypeMod.GeometryType.MULTI_LINE_STRING & String = js.native
    
    /* "MultiPoint" */ val MULTI_POINT: typings.ol.geomGeometryTypeMod.GeometryType.MULTI_POINT & String = js.native
    
    /* "MultiPolygon" */ val MULTI_POLYGON: typings.ol.geomGeometryTypeMod.GeometryType.MULTI_POLYGON & String = js.native
    
    /* "Point" */ val POINT: typings.ol.geomGeometryTypeMod.GeometryType.POINT & String = js.native
    
    /* "Polygon" */ val POLYGON: typings.ol.geomGeometryTypeMod.GeometryType.POLYGON & String = js.native
  }
  
  @js.native
  sealed trait GeometryType extends StObject
  @JSImport("ol/geom/GeometryType", "GeometryType")
  @js.native
  object GeometryType extends StObject {
    
    @js.native
    sealed trait CIRCLE
      extends StObject
         with GeometryType
    
    @js.native
    sealed trait GEOMETRY_COLLECTION
      extends StObject
         with GeometryType
    
    @js.native
    sealed trait LINEAR_RING
      extends StObject
         with GeometryType
    
    @js.native
    sealed trait LINE_STRING
      extends StObject
         with GeometryType
    
    @js.native
    sealed trait MULTI_LINE_STRING
      extends StObject
         with GeometryType
    
    @js.native
    sealed trait MULTI_POINT
      extends StObject
         with GeometryType
    
    @js.native
    sealed trait MULTI_POLYGON
      extends StObject
         with GeometryType
    
    @js.native
    sealed trait POINT
      extends StObject
         with GeometryType
    
    @js.native
    sealed trait POLYGON
      extends StObject
         with GeometryType
  }
}
