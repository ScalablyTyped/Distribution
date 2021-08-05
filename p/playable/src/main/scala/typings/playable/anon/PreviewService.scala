package typings.playable.anon

import typings.playable.previewServiceTypesMod.IPreviewService
import typings.playable.rootContainerTypesMod.IRootContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewService extends StObject {
  
  var previewService: IPreviewService
  
  var rootContainer: IRootContainer
}
object PreviewService {
  
  inline def apply(previewService: IPreviewService, rootContainer: IRootContainer): PreviewService = {
    val __obj = js.Dynamic.literal(previewService = previewService.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewService]
  }
  
  extension [Self <: PreviewService](x: Self) {
    
    inline def setPreviewService(value: IPreviewService): Self = StObject.set(x, "previewService", value.asInstanceOf[js.Any])
    
    inline def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}
