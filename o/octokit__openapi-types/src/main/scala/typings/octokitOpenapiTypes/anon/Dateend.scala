package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dateend extends StObject {
  
  /** A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events before this cursor. */
  var date_end: js.UndefOr[String] = js.undefined
  
  /** A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for events after this cursor. */
  var date_start: js.UndefOr[String] = js.undefined
}
object Dateend {
  
  inline def apply(): Dateend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dateend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dateend] (val x: Self) extends AnyVal {
    
    inline def setDate_end(value: String): Self = StObject.set(x, "date_end", value.asInstanceOf[js.Any])
    
    inline def setDate_endUndefined: Self = StObject.set(x, "date_end", js.undefined)
    
    inline def setDate_start(value: String): Self = StObject.set(x, "date_start", value.asInstanceOf[js.Any])
    
    inline def setDate_startUndefined: Self = StObject.set(x, "date_start", js.undefined)
  }
}
