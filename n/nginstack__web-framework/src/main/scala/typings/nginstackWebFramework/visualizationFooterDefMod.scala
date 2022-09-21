package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualizationFooterDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFooterDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VisualizationFooterDef {
    
    /* CompleteClass */
    var complement: String = js.native
    
    /* CompleteClass */
    var image: Double | Null = js.native
    
    /* CompleteClass */
    var showPath: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFooterDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait VisualizationFooterDef extends StObject {
    
    var complement: String
    
    var image: Double | Null
    
    var showPath: Boolean
  }
  object VisualizationFooterDef {
    
    inline def apply(complement: String, showPath: Boolean): VisualizationFooterDef = {
      val __obj = js.Dynamic.literal(complement = complement.asInstanceOf[js.Any], showPath = showPath.asInstanceOf[js.Any], image = null)
      __obj.asInstanceOf[VisualizationFooterDef]
    }
    
    extension [Self <: VisualizationFooterDef](x: Self) {
      
      inline def setComplement(value: String): Self = StObject.set(x, "complement", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Double): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setShowPath(value: Boolean): Self = StObject.set(x, "showPath", value.asInstanceOf[js.Any])
    }
  }
}
