package typings.momentBusinessTime

import typings.moment.mod.unitOfTime.Base
import typings.momentBusinessTime.momentBusinessTimeStrings.close
import typings.momentBusinessTime.momentBusinessTimeStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object momentMod {
  
  trait LocaleSpecification extends StObject {
    
    var holidays: js.UndefOr[js.Array[String]] = js.undefined
    
    var workinghours: js.UndefOr[WorkingHoursMap] = js.undefined
  }
  object LocaleSpecification {
    
    inline def apply(): LocaleSpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleSpecification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
      
      inline def setHolidays(value: js.Array[String]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
      
      inline def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
      
      inline def setHolidaysVarargs(value: String*): Self = StObject.set(x, "holidays", js.Array(value*))
      
      inline def setWorkinghours(value: WorkingHoursMap): Self = StObject.set(x, "workinghours", value.asInstanceOf[js.Any])
      
      inline def setWorkinghoursUndefined: Self = StObject.set(x, "workinghours", js.undefined)
    }
  }
  
  @js.native
  trait Moment extends StObject {
    
    def addWorkingTime(args: (Double | Base)*): Moment = js.native
    
    def isWorkingDay(): Boolean = js.native
    
    def isWorkingTime(): Boolean = js.native
    
    /**
      * Returns a new object with moment and transition properties representing
      * the most recent moment when the business transitioned between 'open' and 'closed' states.
      */
    def lastTransitionTime(): TransitionTime = js.native
    
    def lastWorkingDay(): Moment = js.native
    
    def lastWorkingTime(): Moment = js.native
    
    /**
      * Returns a new object with moment and transition properties representing
      * the next moment when the business will transition between 'open' and 'closed' states.
      */
    def nextTransitionTime(): TransitionTime = js.native
    
    def nextWorkingDay(): Moment = js.native
    
    def nextWorkingTime(): Moment = js.native
    
    def subtractWorkingTime(args: (Double | Base)*): Moment = js.native
    
    def workingDiff(moment: Moment, unit: Base): Double = js.native
    def workingDiff(moment: Moment, unit: Base, fractions: Boolean): Double = js.native
  }
  
  trait TransitionTime extends StObject {
    
    var moment: Moment
    
    var transition: open | close
  }
  object TransitionTime {
    
    inline def apply(moment: Moment, transition: open | close): TransitionTime = {
      val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitionTime] (val x: Self) extends AnyVal {
      
      inline def setMoment(value: Moment): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: open | close): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkingHoursMap extends StObject {
    
    var `0`: js.Array[String] | Null
    
    var `1`: js.Array[String] | Null
    
    var `2`: js.Array[String] | Null
    
    var `3`: js.Array[String] | Null
    
    var `4`: js.Array[String] | Null
    
    var `5`: js.Array[String] | Null
    
    var `6`: js.Array[String] | Null
  }
  object WorkingHoursMap {
    
    inline def apply(): WorkingHoursMap = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(null)
      __obj.updateDynamic("1")(null)
      __obj.updateDynamic("2")(null)
      __obj.updateDynamic("3")(null)
      __obj.updateDynamic("4")(null)
      __obj.updateDynamic("5")(null)
      __obj.updateDynamic("6")(null)
      __obj.asInstanceOf[WorkingHoursMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WorkingHoursMap] (val x: Self) extends AnyVal {
      
      inline def set0(value: js.Array[String]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set0Null: Self = StObject.set(x, "0", null)
      
      inline def set0Varargs(value: String*): Self = StObject.set(x, "0", js.Array(value*))
      
      inline def set1(value: js.Array[String]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set1Null: Self = StObject.set(x, "1", null)
      
      inline def set1Varargs(value: String*): Self = StObject.set(x, "1", js.Array(value*))
      
      inline def set2(value: js.Array[String]): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set2Null: Self = StObject.set(x, "2", null)
      
      inline def set2Varargs(value: String*): Self = StObject.set(x, "2", js.Array(value*))
      
      inline def set3(value: js.Array[String]): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set3Null: Self = StObject.set(x, "3", null)
      
      inline def set3Varargs(value: String*): Self = StObject.set(x, "3", js.Array(value*))
      
      inline def set4(value: js.Array[String]): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set4Null: Self = StObject.set(x, "4", null)
      
      inline def set4Varargs(value: String*): Self = StObject.set(x, "4", js.Array(value*))
      
      inline def set5(value: js.Array[String]): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set5Null: Self = StObject.set(x, "5", null)
      
      inline def set5Varargs(value: String*): Self = StObject.set(x, "5", js.Array(value*))
      
      inline def set6(value: js.Array[String]): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set6Null: Self = StObject.set(x, "6", null)
      
      inline def set6Varargs(value: String*): Self = StObject.set(x, "6", js.Array(value*))
    }
  }
}
