package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextConfig extends StObject {
  
  /** The transformations to apply to the detected data. */
  var transformations: js.UndefOr[js.Array[InfoTypeTransformation]] = js.undefined
}
object TextConfig {
  
  inline def apply(): TextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextConfig]
  }
  
  extension [Self <: TextConfig](x: Self) {
    
    inline def setTransformations(value: js.Array[InfoTypeTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
    
    inline def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
    
    inline def setTransformationsVarargs(value: InfoTypeTransformation*): Self = StObject.set(x, "transformations", js.Array(value :_*))
  }
}
