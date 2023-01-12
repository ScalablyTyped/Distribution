package typings.nivoBullet

import typings.nivoBullet.anon.Data
import typings.nivoBullet.anon.Height
import typings.nivoBullet.anon.PickBulletRectsPropsdataC
import typings.nivoBullet.distTypesTypesMod.ComputedRangeDatum
import typings.nivoBullet.nivoBulletStrings.horizontal
import typings.nivoBullet.nivoBulletStrings.measures
import typings.nivoBullet.nivoBulletStrings.range
import typings.nivoBullet.nivoBulletStrings.vertical
import typings.nivoScales.distTypesTypesMod.ScaleLinear
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/bullet/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeRects(param0: PickBulletRectsPropsdataC): js.Array[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRects")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Data]]
  
  inline def getComputeRect(param0: ComputeRect): js.Function1[/* d */ ComputedRangeDatum, Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputeRect")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* d */ ComputedRangeDatum, Height]]
  
  inline def stackValues(
    values: js.Array[Double],
    scale: ScaleLinear[Double],
    colorScale: ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify getColorScale */ Any
    ],
    `type`: range | measures
  ): js.Array[ComputedRangeDatum] = (^.asInstanceOf[js.Dynamic].applyDynamic("stackValues")(values.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], colorScale.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedRangeDatum]]
  inline def stackValues(
    values: js.Array[Double],
    scale: ScaleLinear[Double],
    colorScale: ReturnType[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify getColorScale */ Any
    ],
    `type`: range | measures,
    useAverage: Boolean
  ): js.Array[ComputedRangeDatum] = (^.asInstanceOf[js.Dynamic].applyDynamic("stackValues")(values.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], colorScale.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], useAverage.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComputedRangeDatum]]
  
  /* Inlined std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.BulletRectsProps, 'layout' | 'reverse' | 'scale' | 'height'> */
  trait ComputeRect extends StObject {
    
    var height: Double
    
    var layout: horizontal | vertical
    
    var reverse: Boolean
    
    var scale: ScaleLinear[Double]
  }
  object ComputeRect {
    
    inline def apply(height: Double, layout: horizontal | vertical, reverse: Boolean, scale: ScaleLinear[Double]): ComputeRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeRect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setScale(value: ScaleLinear[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
}
