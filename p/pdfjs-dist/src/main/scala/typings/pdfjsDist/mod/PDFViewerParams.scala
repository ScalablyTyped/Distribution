package typings.pdfjsDist.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerParams extends StObject {
  
  var container: HTMLElement
  
  var viewer: js.UndefOr[HTMLElement] = js.undefined
}
object PDFViewerParams {
  
  inline def apply(container: HTMLElement): PDFViewerParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerParams]
  }
  
  extension [Self <: PDFViewerParams](x: Self) {
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setViewer(value: HTMLElement): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    
    inline def setViewerUndefined: Self = StObject.set(x, "viewer", js.undefined)
  }
}
