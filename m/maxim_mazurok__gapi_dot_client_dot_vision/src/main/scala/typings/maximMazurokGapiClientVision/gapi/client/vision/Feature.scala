package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Feature extends StObject {
  
  /** Maximum number of results of this type. Does not apply to `TEXT_DETECTION`, `DOCUMENT_TEXT_DETECTION`, or `CROP_HINTS`. */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /** Model to use for the feature. Supported values: "builtin/stable" (the default if unset) and "builtin/latest". */
  var model: js.UndefOr[String] = js.undefined
  
  /** The feature type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Feature {
  
  @scala.inline
  def apply(): Feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feature]
  }
  
  @scala.inline
  implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
