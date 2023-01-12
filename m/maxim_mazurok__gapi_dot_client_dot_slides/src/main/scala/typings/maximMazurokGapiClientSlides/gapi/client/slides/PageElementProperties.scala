package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageElementProperties extends StObject {
  
  /** The object ID of the page where the element is located. */
  var pageObjectId: js.UndefOr[String] = js.undefined
  
  /** The size of the element. */
  var size: js.UndefOr[Size] = js.undefined
  
  /** The transform for the element. */
  var transform: js.UndefOr[AffineTransform] = js.undefined
}
object PageElementProperties {
  
  inline def apply(): PageElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageElementProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageElementProperties] (val x: Self) extends AnyVal {
    
    inline def setPageObjectId(value: String): Self = StObject.set(x, "pageObjectId", value.asInstanceOf[js.Any])
    
    inline def setPageObjectIdUndefined: Self = StObject.set(x, "pageObjectId", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTransform(value: AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
