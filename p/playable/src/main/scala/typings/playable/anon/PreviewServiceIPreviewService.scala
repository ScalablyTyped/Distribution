package typings.playable.anon

import typings.playable.distSrcModulesUiPreviewServiceTypesMod.IPreviewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewServiceIPreviewService extends StObject {
  
  var previewService: IPreviewService
}
object PreviewServiceIPreviewService {
  
  inline def apply(previewService: IPreviewService): PreviewServiceIPreviewService = {
    val __obj = js.Dynamic.literal(previewService = previewService.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewServiceIPreviewService]
  }
  
  extension [Self <: PreviewServiceIPreviewService](x: Self) {
    
    inline def setPreviewService(value: IPreviewService): Self = StObject.set(x, "previewService", value.asInstanceOf[js.Any])
  }
}
