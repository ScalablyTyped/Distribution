package typings.oracleOraclejet

import typings.oracleOraclejet.anon.LinkDefaults
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojdiagramUtilsMod {
  
  @JSImport("@oracle/oraclejet/ojdiagram-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLayout(obj: LinkDefaults): js.Function1[/* context */ DvtDiagramLayoutContext, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayout")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* context */ DvtDiagramLayoutContext, Unit]]
  
  trait LabelLayout extends StObject {
    
    var angle: Double
    
    var halign: String
    
    var rotationPointX: Double
    
    var rotationPointY: Double
    
    var valign: String
    
    var x: Double
    
    var y: Double
  }
  object LabelLayout {
    
    inline def apply(
      angle: Double,
      halign: String,
      rotationPointX: Double,
      rotationPointY: Double,
      valign: String,
      x: Double,
      y: Double
    ): LabelLayout = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], rotationPointX = rotationPointX.asInstanceOf[js.Any], rotationPointY = rotationPointY.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelLayout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelLayout] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setHalign(value: String): Self = StObject.set(x, "halign", value.asInstanceOf[js.Any])
      
      inline def setRotationPointX(value: Double): Self = StObject.set(x, "rotationPointX", value.asInstanceOf[js.Any])
      
      inline def setRotationPointY(value: Double): Self = StObject.set(x, "rotationPointY", value.asInstanceOf[js.Any])
      
      inline def setValign(value: String): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
