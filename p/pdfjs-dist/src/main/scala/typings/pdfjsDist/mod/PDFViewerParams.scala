package typings.pdfjsDist.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFViewerParams extends StObject {
  
  var container: HTMLElement = js.native
  
  var viewer: js.UndefOr[HTMLElement] = js.native
}
object PDFViewerParams {
  
  @scala.inline
  def apply(container: HTMLElement): PDFViewerParams = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerParams]
  }
  
  @scala.inline
  implicit class PDFViewerParamsMutableBuilder[Self <: PDFViewerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer(value: HTMLElement): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerUndefined: Self = StObject.set(x, "viewer", js.undefined)
  }
}
