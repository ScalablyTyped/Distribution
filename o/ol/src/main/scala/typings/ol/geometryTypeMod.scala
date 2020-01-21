package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/GeometryType", JSImport.Namespace)
@js.native
object geometryTypeMod extends js.Object {
  @js.native
  sealed trait GeometryType extends js.Object
  
  @js.native
  object GeometryType extends js.Object {
    @js.native
    sealed trait CIRCLE extends GeometryType
    
    @js.native
    sealed trait GEOMETRY_COLLECTION extends GeometryType
    
    @js.native
    sealed trait LINEAR_RING extends GeometryType
    
    @js.native
    sealed trait LINE_STRING extends GeometryType
    
    @js.native
    sealed trait MULTI_LINE_STRING extends GeometryType
    
    @js.native
    sealed trait MULTI_POINT extends GeometryType
    
    @js.native
    sealed trait MULTI_POLYGON extends GeometryType
    
    @js.native
    sealed trait POINT extends GeometryType
    
    @js.native
    sealed trait POLYGON extends GeometryType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "Circle" */ val CIRCLE: typings.ol.geometryTypeMod.GeometryType.CIRCLE with String = js.native
    /* "GeometryCollection" */ val GEOMETRY_COLLECTION: typings.ol.geometryTypeMod.GeometryType.GEOMETRY_COLLECTION with String = js.native
    /* "LinearRing" */ val LINEAR_RING: typings.ol.geometryTypeMod.GeometryType.LINEAR_RING with String = js.native
    /* "LineString" */ val LINE_STRING: typings.ol.geometryTypeMod.GeometryType.LINE_STRING with String = js.native
    /* "MultiLineString" */ val MULTI_LINE_STRING: typings.ol.geometryTypeMod.GeometryType.MULTI_LINE_STRING with String = js.native
    /* "MultiPoint" */ val MULTI_POINT: typings.ol.geometryTypeMod.GeometryType.MULTI_POINT with String = js.native
    /* "MultiPolygon" */ val MULTI_POLYGON: typings.ol.geometryTypeMod.GeometryType.MULTI_POLYGON with String = js.native
    /* "Point" */ val POINT: typings.ol.geometryTypeMod.GeometryType.POINT with String = js.native
    /* "Polygon" */ val POLYGON: typings.ol.geometryTypeMod.GeometryType.POLYGON with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GeometryType with String] = js.native
  }
  
}

