package typings.nextBizDate

import typings.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("next-biz-date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FindBizDate(candidateDate: Moment, holidaysArray: js.Array[String]): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindBizDate")(candidateDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def FindBizDate(candidateDate: Moment, holidaysArray: js.Array[String], direction: Direction): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindBizDate")(candidateDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  inline def FindNextBizDate(baseDate: String, holidaysArray: js.Array[String]): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindNextBizDate")(baseDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def FindNextBizDate(baseDate: String, holidaysArray: js.Array[String], countTarget: Double): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindNextBizDate")(baseDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any], countTarget.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def FindNextBizDate(baseDate: String, holidaysArray: js.Array[String], countTarget: Double, direction: Direction): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindNextBizDate")(baseDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any], countTarget.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Moment]
  inline def FindNextBizDate(baseDate: String, holidaysArray: js.Array[String], countTarget: Unit, direction: Direction): Moment = (^.asInstanceOf[js.Dynamic].applyDynamic("FindNextBizDate")(baseDate.asInstanceOf[js.Any], holidaysArray.asInstanceOf[js.Any], countTarget.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Moment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextBizDate.nextBizDateStrings.FORWARD
    - typings.nextBizDate.nextBizDateStrings.BACKWARDS
  */
  trait Direction extends StObject
  object Direction {
    
    inline def BACKWARDS: typings.nextBizDate.nextBizDateStrings.BACKWARDS = "BACKWARDS".asInstanceOf[typings.nextBizDate.nextBizDateStrings.BACKWARDS]
    
    inline def FORWARD: typings.nextBizDate.nextBizDateStrings.FORWARD = "FORWARD".asInstanceOf[typings.nextBizDate.nextBizDateStrings.FORWARD]
  }
}
