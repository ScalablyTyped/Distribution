package typings.momentBusinessTime

import typings.moment.mod.unitOfTime.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ Here, declare the same module as the one you imported above */
/* augmented module */
object mod {
  
  @js.native
  trait LocaleSpecification extends StObject {
    
    var holidays: js.UndefOr[js.Array[String]] = js.native
    
    var workinghours: js.UndefOr[WorkingHoursMap] = js.native
  }
  object LocaleSpecification {
    
    @scala.inline
    def apply(): LocaleSpecification = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleSpecification]
    }
    
    @scala.inline
    implicit class LocaleSpecificationMutableBuilder[Self <: LocaleSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHolidays(value: js.Array[String]): Self = StObject.set(x, "holidays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolidaysUndefined: Self = StObject.set(x, "holidays", js.undefined)
      
      @scala.inline
      def setHolidaysVarargs(value: String*): Self = StObject.set(x, "holidays", js.Array(value :_*))
      
      @scala.inline
      def setWorkinghours(value: WorkingHoursMap): Self = StObject.set(x, "workinghours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkinghoursUndefined: Self = StObject.set(x, "workinghours", js.undefined)
    }
  }
  
  @js.native
  trait Moment extends StObject {
    
    def addWorkingTime(args: (Double | Base)*): Moment = js.native
    
    def isWorkingDay(): Boolean = js.native
    
    def isWorkingTime(): Boolean = js.native
    
    def lastWorkingDay(): Moment = js.native
    
    def lastWorkingTime(): Moment = js.native
    
    def nextWorkingDay(): Moment = js.native
    
    def nextWorkingTime(): Moment = js.native
    
    def subtractWorkingTime(args: (Double | Base)*): Moment = js.native
    
    def workingDiff(moment: Moment, unit: Base): Double = js.native
    def workingDiff(moment: Moment, unit: Base, fractions: Boolean): Double = js.native
  }
  
  @js.native
  trait WorkingHoursMap extends StObject {
    
    var `0`: js.Array[String] | Null = js.native
    
    var `1`: js.Array[String] | Null = js.native
    
    var `2`: js.Array[String] | Null = js.native
    
    var `3`: js.Array[String] | Null = js.native
    
    var `4`: js.Array[String] | Null = js.native
    
    var `5`: js.Array[String] | Null = js.native
    
    var `6`: js.Array[String] | Null = js.native
  }
  object WorkingHoursMap {
    
    @scala.inline
    def apply(): WorkingHoursMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkingHoursMap]
    }
    
    @scala.inline
    implicit class WorkingHoursMapMutableBuilder[Self <: WorkingHoursMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set0(value: js.Array[String]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set0Null: Self = StObject.set(x, "0", null)
      
      @scala.inline
      def set0Varargs(value: String*): Self = StObject.set(x, "0", js.Array(value :_*))
      
      @scala.inline
      def set1(value: js.Array[String]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1Null: Self = StObject.set(x, "1", null)
      
      @scala.inline
      def set1Varargs(value: String*): Self = StObject.set(x, "1", js.Array(value :_*))
      
      @scala.inline
      def set2(value: js.Array[String]): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2Null: Self = StObject.set(x, "2", null)
      
      @scala.inline
      def set2Varargs(value: String*): Self = StObject.set(x, "2", js.Array(value :_*))
      
      @scala.inline
      def set3(value: js.Array[String]): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3Null: Self = StObject.set(x, "3", null)
      
      @scala.inline
      def set3Varargs(value: String*): Self = StObject.set(x, "3", js.Array(value :_*))
      
      @scala.inline
      def set4(value: js.Array[String]): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4Null: Self = StObject.set(x, "4", null)
      
      @scala.inline
      def set4Varargs(value: String*): Self = StObject.set(x, "4", js.Array(value :_*))
      
      @scala.inline
      def set5(value: js.Array[String]): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set5Null: Self = StObject.set(x, "5", null)
      
      @scala.inline
      def set5Varargs(value: String*): Self = StObject.set(x, "5", js.Array(value :_*))
      
      @scala.inline
      def set6(value: js.Array[String]): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set6Null: Self = StObject.set(x, "6", null)
      
      @scala.inline
      def set6Varargs(value: String*): Self = StObject.set(x, "6", js.Array(value :_*))
    }
  }
}
