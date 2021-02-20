package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageDetails extends StObject {
  
  /**
    * The date and time the resource was last accessed by the user. The timestamp represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * 2014-01-01T00:00:00Z. Read-only.
    */
  var lastAccessedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The date and time the resource was last modified by the user. The timestamp represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * 2014-01-01T00:00:00Z. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object UsageDetails {
  
  @scala.inline
  def apply(): UsageDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageDetails]
  }
  
  @scala.inline
  implicit class UsageDetailsMutableBuilder[Self <: UsageDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastAccessedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastAccessedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedDateTimeNull: Self = StObject.set(x, "lastAccessedDateTime", null)
    
    @scala.inline
    def setLastAccessedDateTimeUndefined: Self = StObject.set(x, "lastAccessedDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
