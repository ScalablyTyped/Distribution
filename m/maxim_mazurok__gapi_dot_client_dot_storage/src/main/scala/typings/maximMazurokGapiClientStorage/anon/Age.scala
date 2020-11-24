package typings.maximMazurokGapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Age extends js.Object {
  
  /** Age of an object (in days). This condition is satisfied when an object reaches the specified age. */
  var age: js.UndefOr[Double] = js.native
  
  /**
    * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when an object is created before midnight of the specified
    * date in UTC.
    */
  var createdBefore: js.UndefOr[String] = js.native
  
  /** A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when the custom time on an object is before this date in UTC. */
  var customTimeBefore: js.UndefOr[String] = js.native
  
  /**
    * Number of days elapsed since the user-specified timestamp set on an object. The condition is satisfied if the days elapsed is at least this number. If no custom
    * timestamp is specified on an object, the condition does not apply.
    */
  var daysSinceCustomTime: js.UndefOr[Double] = js.native
  
  /**
    * Number of days elapsed since the noncurrent timestamp of an object. The condition is satisfied if the days elapsed is at least this number. This condition is relevant
    * only for versioned objects. The value of the field must be a nonnegative integer. If it's zero, the object version will become eligible for Lifecycle action as soon as
    * it becomes noncurrent.
    */
  var daysSinceNoncurrentTime: js.UndefOr[Double] = js.native
  
  /** Relevant only for versioned objects. If the value is true, this condition matches live objects; if the value is false, it matches archived objects. */
  var isLive: js.UndefOr[Boolean] = js.native
  
  /**
    * A regular expression that satisfies the RE2 syntax. This condition is satisfied when the name of the object matches the RE2 pattern. Note: This feature is currently in
    * the "Early Access" launch stage and is only available to a whitelisted set of users; that means that this feature may be changed in backward-incompatible ways and that
    * it is not guaranteed to be released.
    */
  var matchesPattern: js.UndefOr[String] = js.native
  
  /**
    * Objects having any of the storage classes specified by this condition will be matched. Values include MULTI_REGIONAL, REGIONAL, NEARLINE, COLDLINE, ARCHIVE, STANDARD,
    * and DURABLE_REDUCED_AVAILABILITY.
    */
  var matchesStorageClass: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A date in RFC 3339 format with only the date part (for instance, "2013-01-15"). This condition is satisfied when the noncurrent time on an object is before this date in
    * UTC. This condition is relevant only for versioned objects.
    */
  var noncurrentTimeBefore: js.UndefOr[String] = js.native
  
  /**
    * Relevant only for versioned objects. If the value is N, this condition is satisfied when there are at least N versions (including the live version) newer than this
    * version of the object.
    */
  var numNewerVersions: js.UndefOr[Double] = js.native
}
object Age {
  
  @scala.inline
  def apply(): Age = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Age]
  }
  
  @scala.inline
  implicit class AgeOps[Self <: Age] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAge(value: Double): Self = this.set("age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    
    @scala.inline
    def setCreatedBefore(value: String): Self = this.set("createdBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBefore: Self = this.set("createdBefore", js.undefined)
    
    @scala.inline
    def setCustomTimeBefore(value: String): Self = this.set("customTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTimeBefore: Self = this.set("customTimeBefore", js.undefined)
    
    @scala.inline
    def setDaysSinceCustomTime(value: Double): Self = this.set("daysSinceCustomTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysSinceCustomTime: Self = this.set("daysSinceCustomTime", js.undefined)
    
    @scala.inline
    def setDaysSinceNoncurrentTime(value: Double): Self = this.set("daysSinceNoncurrentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysSinceNoncurrentTime: Self = this.set("daysSinceNoncurrentTime", js.undefined)
    
    @scala.inline
    def setIsLive(value: Boolean): Self = this.set("isLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLive: Self = this.set("isLive", js.undefined)
    
    @scala.inline
    def setMatchesPattern(value: String): Self = this.set("matchesPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchesPattern: Self = this.set("matchesPattern", js.undefined)
    
    @scala.inline
    def setMatchesStorageClassVarargs(value: String*): Self = this.set("matchesStorageClass", js.Array(value :_*))
    
    @scala.inline
    def setMatchesStorageClass(value: js.Array[String]): Self = this.set("matchesStorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchesStorageClass: Self = this.set("matchesStorageClass", js.undefined)
    
    @scala.inline
    def setNoncurrentTimeBefore(value: String): Self = this.set("noncurrentTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentTimeBefore: Self = this.set("noncurrentTimeBefore", js.undefined)
    
    @scala.inline
    def setNumNewerVersions(value: Double): Self = this.set("numNewerVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumNewerVersions: Self = this.set("numNewerVersions", js.undefined)
  }
}
