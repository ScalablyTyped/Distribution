package typings.microsoftteams.microsoftTeams

import typings.microsoftteams.microsoftteamsStrings.macos
import typings.microsoftteams.microsoftteamsStrings.windows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents OS locale info used for formatting date and time data
  */
trait LocaleInfo extends StObject {
  
  var longDate: String
  
  var longTime: String
  
  var platform: windows | macos
  
  var regionalFormat: String
  
  var shortDate: String
  
  var shortTime: String
}
object LocaleInfo {
  
  inline def apply(
    longDate: String,
    longTime: String,
    platform: windows | macos,
    regionalFormat: String,
    shortDate: String,
    shortTime: String
  ): LocaleInfo = {
    val __obj = js.Dynamic.literal(longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], regionalFormat = regionalFormat.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocaleInfo] (val x: Self) extends AnyVal {
    
    inline def setLongDate(value: String): Self = StObject.set(x, "longDate", value.asInstanceOf[js.Any])
    
    inline def setLongTime(value: String): Self = StObject.set(x, "longTime", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: windows | macos): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setRegionalFormat(value: String): Self = StObject.set(x, "regionalFormat", value.asInstanceOf[js.Any])
    
    inline def setShortDate(value: String): Self = StObject.set(x, "shortDate", value.asInstanceOf[js.Any])
    
    inline def setShortTime(value: String): Self = StObject.set(x, "shortTime", value.asInstanceOf[js.Any])
  }
}
