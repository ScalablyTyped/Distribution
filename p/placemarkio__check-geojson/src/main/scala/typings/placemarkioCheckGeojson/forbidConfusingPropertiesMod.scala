package typings.placemarkioCheckGeojson

import typings.placemarkioCheckGeojson.typesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object forbidConfusingPropertiesMod {
  
  @JSImport("@placemarkio/check-geojson/dist/forbid_confusing_properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forbidConfusingProperties(
    ctx: Ctx,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectNode */ Any,
    propertiesFrom: PropertiesFrom
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidConfusingProperties")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], propertiesFrom.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature
    - typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.FeatureCollection
    - typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Geometry
  */
  trait PropertiesFrom extends StObject
  object PropertiesFrom {
    
    inline def Feature: typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature = "Feature".asInstanceOf[typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature]
    
    inline def FeatureCollection: typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.FeatureCollection = "FeatureCollection".asInstanceOf[typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.FeatureCollection]
    
    inline def Geometry: typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Geometry = "Geometry".asInstanceOf[typings.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Geometry]
  }
}
