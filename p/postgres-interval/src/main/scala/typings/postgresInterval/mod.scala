package typings.postgresInterval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(raw: String): IPostgresInterval = ^.asInstanceOf[js.Dynamic].apply(raw.asInstanceOf[js.Any]).asInstanceOf[IPostgresInterval]
  
  @JSImport("postgres-interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IPostgresInterval extends StObject {
    
    var days: js.UndefOr[Double] = js.undefined
    
    var hours: js.UndefOr[Double] = js.undefined
    
    var milliseconds: js.UndefOr[Double] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var months: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[Double] = js.undefined
    
    def toISO(): String
    
    def toISOString(): String
    
    def toPostgres(): String
    
    var years: js.UndefOr[Double] = js.undefined
  }
  object IPostgresInterval {
    
    @scala.inline
    def apply(toISO: () => String, toISOString: () => String, toPostgres: () => String): IPostgresInterval = {
      val __obj = js.Dynamic.literal(toISO = js.Any.fromFunction0(toISO), toISOString = js.Any.fromFunction0(toISOString), toPostgres = js.Any.fromFunction0(toPostgres))
      __obj.asInstanceOf[IPostgresInterval]
    }
    
    @scala.inline
    implicit class IPostgresIntervalMutableBuilder[Self <: IPostgresInterval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      @scala.inline
      def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      @scala.inline
      def setToISO(value: () => String): Self = StObject.set(x, "toISO", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToISOString(value: () => String): Self = StObject.set(x, "toISOString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToPostgres(value: () => String): Self = StObject.set(x, "toPostgres", js.Any.fromFunction0(value))
      
      @scala.inline
      def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
}
