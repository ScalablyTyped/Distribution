package typings.pdfjsDist.mod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFRenderParams extends StObject {
  
  var canvasContext: CanvasRenderingContext2D
  
  var continueCallback: js.UndefOr[js.Function1[/* _continue */ js.Function0[Unit], Unit]] = js.undefined
  
  var imageLayer: js.UndefOr[PDFRenderImageLayer] = js.undefined
  
  var renderInteractiveForms: js.UndefOr[Boolean] = js.undefined
  
  var textLayer: js.UndefOr[PDFRenderTextLayer] = js.undefined
  
  var viewport: js.UndefOr[PDFPageViewport] = js.undefined
}
object PDFRenderParams {
  
  @scala.inline
  def apply(canvasContext: CanvasRenderingContext2D): PDFRenderParams = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRenderParams]
  }
  
  @scala.inline
  implicit class PDFRenderParamsMutableBuilder[Self <: PDFRenderParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "canvasContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinueCallback(value: /* _continue */ js.Function0[Unit] => Unit): Self = StObject.set(x, "continueCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContinueCallbackUndefined: Self = StObject.set(x, "continueCallback", js.undefined)
    
    @scala.inline
    def setImageLayer(value: PDFRenderImageLayer): Self = StObject.set(x, "imageLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLayerUndefined: Self = StObject.set(x, "imageLayer", js.undefined)
    
    @scala.inline
    def setRenderInteractiveForms(value: Boolean): Self = StObject.set(x, "renderInteractiveForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderInteractiveFormsUndefined: Self = StObject.set(x, "renderInteractiveForms", js.undefined)
    
    @scala.inline
    def setTextLayer(value: PDFRenderTextLayer): Self = StObject.set(x, "textLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLayerUndefined: Self = StObject.set(x, "textLayer", js.undefined)
    
    @scala.inline
    def setViewport(value: PDFPageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
