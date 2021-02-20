package typings.oracleOraclejet

import typings.oracleOraclejet.anon.LinkDefaults
import typings.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojdiagramUtilsMod {
  
  @JSImport("@oracle/oraclejet/ojdiagram-utils", "getLayout")
  @js.native
  def getLayout(obj: LinkDefaults): js.Function1[/* context */ DvtDiagramLayoutContext, Unit] = js.native
  
  @js.native
  trait LabelLayout extends StObject {
    
    var angle: Double = js.native
    
    var halign: String = js.native
    
    var rotationPointX: Double = js.native
    
    var rotationPointY: Double = js.native
    
    var valign: String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object LabelLayout {
    
    @scala.inline
    def apply(
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
    implicit class LabelLayoutMutableBuilder[Self <: LabelLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalign(value: String): Self = StObject.set(x, "halign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationPointX(value: Double): Self = StObject.set(x, "rotationPointX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationPointY(value: Double): Self = StObject.set(x, "rotationPointY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValign(value: String): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
