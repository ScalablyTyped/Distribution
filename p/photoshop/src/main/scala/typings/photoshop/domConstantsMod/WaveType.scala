package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WaveType extends StObject
@JSImport("photoshop/dom/Constants", "WaveType")
@js.native
object WaveType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WaveType & String] = js.native
  
  @js.native
  sealed trait SINE
    extends StObject
       with WaveType
  /* "waveSine" */ val SINE: typings.photoshop.domConstantsMod.WaveType.SINE & String = js.native
  
  @js.native
  sealed trait SQUARE
    extends StObject
       with WaveType
  /* "waveSquare" */ val SQUARE: typings.photoshop.domConstantsMod.WaveType.SQUARE & String = js.native
  
  @js.native
  sealed trait TRIANGULAR
    extends StObject
       with WaveType
  /* "waveTriangle" */ val TRIANGULAR: typings.photoshop.domConstantsMod.WaveType.TRIANGULAR & String = js.native
}
