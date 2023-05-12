package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SampleSize extends StObject
@JSImport("photoshop/dom/Constants", "SampleSize")
@js.native
object SampleSize extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SampleSize & Double] = js.native
  
  @js.native
  sealed trait POINTSAMPLE
    extends StObject
       with SampleSize
  /* 0 */ val POINTSAMPLE: typings.photoshop.domConstantsMod.SampleSize.POINTSAMPLE & Double = js.native
  
  @js.native
  sealed trait SAMPLE101X101
    extends StObject
       with SampleSize
  /* 50 */ val SAMPLE101X101: typings.photoshop.domConstantsMod.SampleSize.SAMPLE101X101 & Double = js.native
  
  @js.native
  sealed trait SAMPLE11X11
    extends StObject
       with SampleSize
  /* 5 */ val SAMPLE11X11: typings.photoshop.domConstantsMod.SampleSize.SAMPLE11X11 & Double = js.native
  
  @js.native
  sealed trait SAMPLE31X31
    extends StObject
       with SampleSize
  /* 15 */ val SAMPLE31X31: typings.photoshop.domConstantsMod.SampleSize.SAMPLE31X31 & Double = js.native
  
  @js.native
  sealed trait SAMPLE3X3
    extends StObject
       with SampleSize
  /* 1 */ val SAMPLE3X3: typings.photoshop.domConstantsMod.SampleSize.SAMPLE3X3 & Double = js.native
  
  @js.native
  sealed trait SAMPLE51X51
    extends StObject
       with SampleSize
  /* 25 */ val SAMPLE51X51: typings.photoshop.domConstantsMod.SampleSize.SAMPLE51X51 & Double = js.native
  
  @js.native
  sealed trait SAMPLE5X5
    extends StObject
       with SampleSize
  /* 2 */ val SAMPLE5X5: typings.photoshop.domConstantsMod.SampleSize.SAMPLE5X5 & Double = js.native
}
