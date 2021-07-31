package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedNotificationMessage
  extends StObject
     with Entity {
  
  /**
    * Flag to indicate whether or not this is the default locale for language fallback. This flag can only be set. To unset,
    * set this property to true on another Localized Notification Message.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  
  // The Locale for which this message is destined.
  var locale: js.UndefOr[String] = js.undefined
  
  // The Message Template content.
  var messageTemplate: js.UndefOr[String] = js.undefined
  
  // The Message Template Subject.
  var subject: js.UndefOr[String] = js.undefined
}
object LocalizedNotificationMessage {
  
  @scala.inline
  def apply(): LocalizedNotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalizedNotificationMessage]
  }
  
  @scala.inline
  implicit class LocalizedNotificationMessageMutableBuilder[Self <: LocalizedNotificationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMessageTemplate(value: String): Self = StObject.set(x, "messageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTemplateUndefined: Self = StObject.set(x, "messageTemplate", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
