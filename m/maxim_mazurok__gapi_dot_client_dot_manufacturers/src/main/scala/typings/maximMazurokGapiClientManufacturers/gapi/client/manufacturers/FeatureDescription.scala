package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureDescription extends StObject {
  
  /** A short description of the feature. */
  var headline: js.UndefOr[String] = js.undefined
  
  /** An optional image describing the feature. */
  var image: js.UndefOr[Image] = js.undefined
  
  /** A detailed description of the feature. */
  var text: js.UndefOr[String] = js.undefined
}
object FeatureDescription {
  
  inline def apply(): FeatureDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureDescription]
  }
  
  extension [Self <: FeatureDescription](x: Self) {
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
