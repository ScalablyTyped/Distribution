package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalRobotsProps extends StObject {
  
  var maxImagePreview: js.UndefOr[ImagePrevSize] = js.undefined
  
  var maxSnippet: js.UndefOr[Double] = js.undefined
  
  var maxVideoPreview: js.UndefOr[Double] = js.undefined
  
  var noarchive: js.UndefOr[Boolean] = js.undefined
  
  var noimageindex: js.UndefOr[Boolean] = js.undefined
  
  var nosnippet: js.UndefOr[Boolean] = js.undefined
  
  var notranslate: js.UndefOr[Boolean] = js.undefined
  
  var unavailableAfter: js.UndefOr[String] = js.undefined
}
object AdditionalRobotsProps {
  
  inline def apply(): AdditionalRobotsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalRobotsProps]
  }
  
  extension [Self <: AdditionalRobotsProps](x: Self) {
    
    inline def setMaxImagePreview(value: ImagePrevSize): Self = StObject.set(x, "maxImagePreview", value.asInstanceOf[js.Any])
    
    inline def setMaxImagePreviewUndefined: Self = StObject.set(x, "maxImagePreview", js.undefined)
    
    inline def setMaxSnippet(value: Double): Self = StObject.set(x, "maxSnippet", value.asInstanceOf[js.Any])
    
    inline def setMaxSnippetUndefined: Self = StObject.set(x, "maxSnippet", js.undefined)
    
    inline def setMaxVideoPreview(value: Double): Self = StObject.set(x, "maxVideoPreview", value.asInstanceOf[js.Any])
    
    inline def setMaxVideoPreviewUndefined: Self = StObject.set(x, "maxVideoPreview", js.undefined)
    
    inline def setNoarchive(value: Boolean): Self = StObject.set(x, "noarchive", value.asInstanceOf[js.Any])
    
    inline def setNoarchiveUndefined: Self = StObject.set(x, "noarchive", js.undefined)
    
    inline def setNoimageindex(value: Boolean): Self = StObject.set(x, "noimageindex", value.asInstanceOf[js.Any])
    
    inline def setNoimageindexUndefined: Self = StObject.set(x, "noimageindex", js.undefined)
    
    inline def setNosnippet(value: Boolean): Self = StObject.set(x, "nosnippet", value.asInstanceOf[js.Any])
    
    inline def setNosnippetUndefined: Self = StObject.set(x, "nosnippet", js.undefined)
    
    inline def setNotranslate(value: Boolean): Self = StObject.set(x, "notranslate", value.asInstanceOf[js.Any])
    
    inline def setNotranslateUndefined: Self = StObject.set(x, "notranslate", js.undefined)
    
    inline def setUnavailableAfter(value: String): Self = StObject.set(x, "unavailableAfter", value.asInstanceOf[js.Any])
    
    inline def setUnavailableAfterUndefined: Self = StObject.set(x, "unavailableAfter", js.undefined)
  }
}
