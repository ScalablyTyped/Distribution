package typings.placemarkioCheckGeojson

import typings.placemarkioCheckGeojson.enforcePositionArrayMod.PositionKind
import typings.placemarkioCheckGeojson.forbidConfusingPropertiesMod.PropertiesFrom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placemarkioCheckGeojsonStrings {
  
  @js.native
  sealed trait Feature
    extends StObject
       with PropertiesFrom
  inline def Feature: Feature = "Feature".asInstanceOf[Feature]
  
  @js.native
  sealed trait FeatureCollection
    extends StObject
       with PropertiesFrom
  inline def FeatureCollection: FeatureCollection = "FeatureCollection".asInstanceOf[FeatureCollection]
  
  @js.native
  sealed trait Geometry
    extends StObject
       with PropertiesFrom
  inline def Geometry: Geometry = "Geometry".asInstanceOf[Geometry]
  
  @js.native
  sealed trait GeometryCollection extends StObject
  inline def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  
  @js.native
  sealed trait LineString
    extends StObject
       with PositionKind
  inline def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait MultiLineString extends StObject
  inline def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @js.native
  sealed trait MultiPoint extends StObject
  inline def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @js.native
  sealed trait MultiPolygon extends StObject
  inline def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @js.native
  sealed trait Point extends StObject
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon
    extends StObject
       with PositionKind
  inline def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
}
