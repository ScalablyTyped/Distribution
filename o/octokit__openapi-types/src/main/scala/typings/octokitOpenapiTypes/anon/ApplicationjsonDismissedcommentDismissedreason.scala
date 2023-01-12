package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDismissedcommentDismissedreason extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DismissedcommentDismissedreason
}
object ApplicationjsonDismissedcommentDismissedreason {
  
  inline def apply(applicationSlashjson: DismissedcommentDismissedreason): ApplicationjsonDismissedcommentDismissedreason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDismissedcommentDismissedreason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDismissedcommentDismissedreason] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DismissedcommentDismissedreason): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
