package typings.pdfjsDist.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnnotationsParameters extends StObject {
  
  /**
    * - Determines the annotations that are fetched,
    * can be 'display' (viewable annotations), 'print' (printable annotations),
    * or 'any' (all annotations). The default value is 'display'.
    */
  var intent: js.UndefOr[String] = js.undefined
}
object GetAnnotationsParameters {
  
  inline def apply(): GetAnnotationsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnnotationsParameters]
  }
  
  extension [Self <: GetAnnotationsParameters](x: Self) {
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
  }
}
