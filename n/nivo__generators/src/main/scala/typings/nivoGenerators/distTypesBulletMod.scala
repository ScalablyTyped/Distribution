package typings.nivoGenerators

import typings.nivoGenerators.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBulletMod {
  
  @JSImport("@nivo/generators/dist/types/bullet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateBulletData(id: String, max: Double): Id = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBulletData")(id.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Id]
  inline def generateBulletData(id: String, max: Double, param2: Options): Id = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBulletData")(id.asInstanceOf[js.Any], max.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Id]
  
  /* Inlined std.Partial<{  float :boolean,   markerCount :number,   measureCount :number,   rangeCount :number,   subtitle :string,   title :string}> */
  trait Options extends StObject {
    
    var float: js.UndefOr[Boolean] = js.undefined
    
    var markerCount: js.UndefOr[Double] = js.undefined
    
    var measureCount: js.UndefOr[Double] = js.undefined
    
    var rangeCount: js.UndefOr[Double] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setMarkerCount(value: Double): Self = StObject.set(x, "markerCount", value.asInstanceOf[js.Any])
      
      inline def setMarkerCountUndefined: Self = StObject.set(x, "markerCount", js.undefined)
      
      inline def setMeasureCount(value: Double): Self = StObject.set(x, "measureCount", value.asInstanceOf[js.Any])
      
      inline def setMeasureCountUndefined: Self = StObject.set(x, "measureCount", js.undefined)
      
      inline def setRangeCount(value: Double): Self = StObject.set(x, "rangeCount", value.asInstanceOf[js.Any])
      
      inline def setRangeCountUndefined: Self = StObject.set(x, "rangeCount", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
