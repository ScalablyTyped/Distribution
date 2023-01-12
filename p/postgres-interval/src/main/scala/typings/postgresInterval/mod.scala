package typings.postgresInterval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse Postgres interval columns.
    *
    * ```js
    * var parse = require('postgres-interval')
    * var interval = parse('01:02:03')
    * // => { hours: 1, minutes: 2, seconds: 3 }
    * interval.toPostgres()
    * // 1 hour 2 minutes 3 seconds
    * interval.toISOString()
    * // P0Y0M0DT1H2M3S
    * interval.toISOStringShort()
    * // PT1H2M3S
    * ```
    *
    * @param raw A Postgres interval string.
    */
  inline def apply(raw: String): IPostgresInterval = ^.asInstanceOf[js.Dynamic].apply(raw.asInstanceOf[js.Any]).asInstanceOf[IPostgresInterval]
  
  @JSImport("postgres-interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IPostgresInterval extends StObject {
    
    var days: Double
    
    var hours: Double
    
    var milliseconds: Double
    
    var minutes: Double
    
    var months: Double
    
    var seconds: Double
    
    /**
      * Returns an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Durations) compliant string, for example P0Y0M0DT0H9M0S.
      *
      * Also available as {@link toISOString toISOString}.
      *
      * ```js
      * var parse = require('postgres-interval')
      * var interval = parse('01:02:03')
      * // => { hours: 1, minutes: 2, seconds: 3 }
      * interval.toISO()
      * // P0Y0M0DT1H2M3S
      * ```
      */
    def toISO(): String
    
    /**
      * Returns an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Durations) compliant string, for example P0Y0M0DT0H9M0S.
      *
      * Also available as {@link toISO toISO} for backwards compatibility.
      *
      * ```js
      * var parse = require('postgres-interval')
      * var interval = parse('01:02:03')
      * // => { hours: 1, minutes: 2, seconds: 3 }
      * interval.toISOString()
      * // P0Y0M0DT1H2M3S
      * ```
      */
    def toISOString(): String
    
    /**
      * Returns an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Durations) compliant string shortened to minimum length, for example `PT9M`.
      *
      * ```js
      * var parse = require('postgres-interval')
      * var interval = parse('01:02:03')
      * // => { hours: 1, minutes: 2, seconds: 3 }
      * interval.toISOStringShort()
      * // PT1H2M3S
      * ```
      */
    def toISOStringShort(): String
    
    /**
      * Returns an interval string. This allows the interval object to be passed into prepared statements.
      *
      * ```js
      * var parse = require('postgres-interval')
      * var interval = parse('01:02:03')
      * // => { hours: 1, minutes: 2, seconds: 3 }
      * interval.toPostgres()
      * // 1 hour 2 minutes 3 seconds
      * ```
      */
    def toPostgres(): String
    
    var years: Double
  }
  object IPostgresInterval {
    
    inline def apply(
      days: Double,
      hours: Double,
      milliseconds: Double,
      minutes: Double,
      months: Double,
      seconds: Double,
      toISO: () => String,
      toISOString: () => String,
      toISOStringShort: () => String,
      toPostgres: () => String,
      years: Double
    ): IPostgresInterval = {
      val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], toISO = js.Any.fromFunction0(toISO), toISOString = js.Any.fromFunction0(toISOString), toISOStringShort = js.Any.fromFunction0(toISOStringShort), toPostgres = js.Any.fromFunction0(toPostgres), years = years.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPostgresInterval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPostgresInterval] (val x: Self) extends AnyVal {
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setToISO(value: () => String): Self = StObject.set(x, "toISO", js.Any.fromFunction0(value))
      
      inline def setToISOString(value: () => String): Self = StObject.set(x, "toISOString", js.Any.fromFunction0(value))
      
      inline def setToISOStringShort(value: () => String): Self = StObject.set(x, "toISOStringShort", js.Any.fromFunction0(value))
      
      inline def setToPostgres(value: () => String): Self = StObject.set(x, "toPostgres", js.Any.fromFunction0(value))
      
      inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    }
  }
}
