package typings.postmark.anon

import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkClickLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickLocation extends StObject {
  
  var ClickLocation: LinkClickLocation
  
  var Link: String
  
  var Summary: String
}
object ClickLocation {
  
  inline def apply(ClickLocation: LinkClickLocation, Link: String, Summary: String): ClickLocation = {
    val __obj = js.Dynamic.literal(ClickLocation = ClickLocation.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickLocation] (val x: Self) extends AnyVal {
    
    inline def setClickLocation(value: LinkClickLocation): Self = StObject.set(x, "ClickLocation", value.asInstanceOf[js.Any])
    
    inline def setLink(value: String): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
