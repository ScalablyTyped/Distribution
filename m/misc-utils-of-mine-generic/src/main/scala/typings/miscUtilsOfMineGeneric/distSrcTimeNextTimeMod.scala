package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTimeNextTimeMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/time/nextTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nextTime(config: NextTimeConfig): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTime")(config.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  trait NextTimeConfig extends StObject {
    
    /** the date from which to obtain next date according to given step */
    var from: js.Date
    
    var startingDate: js.UndefOr[js.Date] = js.undefined
    
    /** interval length in ms */
    var step: Double
  }
  object NextTimeConfig {
    
    inline def apply(from: js.Date, step: Double): NextTimeConfig = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextTimeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NextTimeConfig] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setStartingDate(value: js.Date): Self = StObject.set(x, "startingDate", value.asInstanceOf[js.Any])
      
      inline def setStartingDateUndefined: Self = StObject.set(x, "startingDate", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
