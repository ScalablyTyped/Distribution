package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupLifecyclePolicy extends Entity {
  
  /**
    * List of email address to send notifications for groups without owners. Multiple email address can be defined by
    * separating email address with a semicolon.
    */
  var alternateNotificationEmails: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Number of days before a group expires and needs to be renewed. Once renewed, the group expiration is extended by the
    * number of days defined.
    */
  var groupLifetimeInDays: js.UndefOr[NullableOption[Double]] = js.native
  
  // The group type for which the expiration policy applies. Possible values are All, Selected or None.
  var managedGroupTypes: js.UndefOr[NullableOption[String]] = js.native
}
object GroupLifecyclePolicy {
  
  @scala.inline
  def apply(): GroupLifecyclePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLifecyclePolicy]
  }
  
  @scala.inline
  implicit class GroupLifecyclePolicyMutableBuilder[Self <: GroupLifecyclePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateNotificationEmails(value: NullableOption[String]): Self = StObject.set(x, "alternateNotificationEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateNotificationEmailsNull: Self = StObject.set(x, "alternateNotificationEmails", null)
    
    @scala.inline
    def setAlternateNotificationEmailsUndefined: Self = StObject.set(x, "alternateNotificationEmails", js.undefined)
    
    @scala.inline
    def setGroupLifetimeInDays(value: NullableOption[Double]): Self = StObject.set(x, "groupLifetimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupLifetimeInDaysNull: Self = StObject.set(x, "groupLifetimeInDays", null)
    
    @scala.inline
    def setGroupLifetimeInDaysUndefined: Self = StObject.set(x, "groupLifetimeInDays", js.undefined)
    
    @scala.inline
    def setManagedGroupTypes(value: NullableOption[String]): Self = StObject.set(x, "managedGroupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedGroupTypesNull: Self = StObject.set(x, "managedGroupTypes", null)
    
    @scala.inline
    def setManagedGroupTypesUndefined: Self = StObject.set(x, "managedGroupTypes", js.undefined)
  }
}
