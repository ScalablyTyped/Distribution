package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateEmail extends StObject {
  
  /**
    * Format: date-time
    * @description Indicates when this commit was authored (or committed). This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /** @description The email of the author (or committer) of the commit */
  var email: js.UndefOr[String] = js.undefined
  
  /** @description The name of the author (or committer) of the commit */
  var name: js.UndefOr[String] = js.undefined
}
object DateEmail {
  
  inline def apply(): DateEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateEmail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateEmail] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
