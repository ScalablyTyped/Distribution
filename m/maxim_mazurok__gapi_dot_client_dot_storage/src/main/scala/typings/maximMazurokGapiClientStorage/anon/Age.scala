package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Age extends StObject {
  
  /** Age of an object (in days). This condition is satisfied when an object reaches the specified age. */
  var age: js.UndefOr[Double] = js.undefined
  
  /**
    * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when an object is created before midnight of the specified
    * date in UTC.
    */
  var createdBefore: js.UndefOr[String] = js.undefined
  
  /** A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when the custom time on an object is before this date in UTC. */
  var customTimeBefore: js.UndefOr[String] = js.undefined
  
  /**
    * Number of days elapsed since the user-specified timestamp set on an object. The condition is satisfied if the days elapsed is at least this number. If no custom
    * timestamp is specified on an object, the condition does not apply.
    */
  var daysSinceCustomTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of days elapsed since the noncurrent timestamp of an object. The condition is satisfied if the days elapsed is at least this number. This condition is relevant
    * only for versioned objects. The value of the field must be a nonnegative integer. If it's zero, the object version will become eligible for Lifecycle action as soon as
    * it becomes noncurrent.
    */
  var daysSinceNoncurrentTime: js.UndefOr[Double] = js.undefined
  
  /** Relevant only for versioned objects. If the value is true, this condition matches live objects; if the value is false, it matches archived objects. */
  var isLive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A regular expression that satisfies the RE2 syntax. This condition is satisfied when the name of the object matches the RE2 pattern. Note: This feature is currently in
    * the "Early Access" launch stage and is only available to a whitelisted set of users; that means that this feature may be changed in backward-incompatible ways and that
    * it is not guaranteed to be released.
    */
  var matchesPattern: js.UndefOr[String] = js.undefined
  
  /** List of object name prefixes. This condition will be satisfied when at least one of the prefixes exactly matches the beginning of the object name. */
  var matchesPrefix: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Objects having any of the storage classes specified by this condition will be matched. Values include MULTI_REGIONAL, REGIONAL, NEARLINE, COLDLINE, ARCHIVE, STANDARD,
    * and DURABLE_REDUCED_AVAILABILITY.
    */
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of object name suffixes. This condition will be satisfied when at least one of the suffixes exactly matches the end of the object name. */
  var matchesSuffix: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when the noncurrent time on an object is before this date in
    * UTC. This condition is relevant only for versioned objects.
    */
  var noncurrentTimeBefore: js.UndefOr[String] = js.undefined
  
  /**
    * Relevant only for versioned objects. If the value is N, this condition is satisfied when there are at least N versions (including the live version) newer than this
    * version of the object.
    */
  var numNewerVersions: js.UndefOr[Double] = js.undefined
}
object Age {
  
  inline def apply(): Age = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Age]
  }
  
  extension [Self <: Age](x: Self) {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setCreatedBefore(value: String): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setCustomTimeBefore(value: String): Self = StObject.set(x, "customTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCustomTimeBeforeUndefined: Self = StObject.set(x, "customTimeBefore", js.undefined)
    
    inline def setDaysSinceCustomTime(value: Double): Self = StObject.set(x, "daysSinceCustomTime", value.asInstanceOf[js.Any])
    
    inline def setDaysSinceCustomTimeUndefined: Self = StObject.set(x, "daysSinceCustomTime", js.undefined)
    
    inline def setDaysSinceNoncurrentTime(value: Double): Self = StObject.set(x, "daysSinceNoncurrentTime", value.asInstanceOf[js.Any])
    
    inline def setDaysSinceNoncurrentTimeUndefined: Self = StObject.set(x, "daysSinceNoncurrentTime", js.undefined)
    
    inline def setIsLive(value: Boolean): Self = StObject.set(x, "isLive", value.asInstanceOf[js.Any])
    
    inline def setIsLiveUndefined: Self = StObject.set(x, "isLive", js.undefined)
    
    inline def setMatchesPattern(value: String): Self = StObject.set(x, "matchesPattern", value.asInstanceOf[js.Any])
    
    inline def setMatchesPatternUndefined: Self = StObject.set(x, "matchesPattern", js.undefined)
    
    inline def setMatchesPrefix(value: js.Array[String]): Self = StObject.set(x, "matchesPrefix", value.asInstanceOf[js.Any])
    
    inline def setMatchesPrefixUndefined: Self = StObject.set(x, "matchesPrefix", js.undefined)
    
    inline def setMatchesPrefixVarargs(value: String*): Self = StObject.set(x, "matchesPrefix", js.Array(value*))
    
    inline def setMatchesStorageClass(value: js.Array[String]): Self = StObject.set(x, "matchesStorageClass", value.asInstanceOf[js.Any])
    
    inline def setMatchesStorageClassUndefined: Self = StObject.set(x, "matchesStorageClass", js.undefined)
    
    inline def setMatchesStorageClassVarargs(value: String*): Self = StObject.set(x, "matchesStorageClass", js.Array(value*))
    
    inline def setMatchesSuffix(value: js.Array[String]): Self = StObject.set(x, "matchesSuffix", value.asInstanceOf[js.Any])
    
    inline def setMatchesSuffixUndefined: Self = StObject.set(x, "matchesSuffix", js.undefined)
    
    inline def setMatchesSuffixVarargs(value: String*): Self = StObject.set(x, "matchesSuffix", js.Array(value*))
    
    inline def setNoncurrentTimeBefore(value: String): Self = StObject.set(x, "noncurrentTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentTimeBeforeUndefined: Self = StObject.set(x, "noncurrentTimeBefore", js.undefined)
    
    inline def setNumNewerVersions(value: Double): Self = StObject.set(x, "numNewerVersions", value.asInstanceOf[js.Any])
    
    inline def setNumNewerVersionsUndefined: Self = StObject.set(x, "numNewerVersions", js.undefined)
  }
}
