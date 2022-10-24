package typings.pdfjsDist

import typings.pdfjsDist.anon.Element
import typings.pdfjsDist.anon.TextDivs
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayXfaLayerMod {
  
  @JSImport("pdfjs-dist/types/src/display/xfa_layer", "XfaLayer")
  @js.native
  open class XfaLayer () extends StObject
  /* static members */
  object XfaLayer {
    
    @JSImport("pdfjs-dist/types/src/display/xfa_layer", "XfaLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Render the XFA layer.
      *
      * @param {XfaLayerParameters} parameters
      */
    inline def render(parameters: XfaLayerParameters): TextDivs = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(parameters.asInstanceOf[js.Any]).asInstanceOf[TextDivs]
    
    inline def setAttributes(param0: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAttributes")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setupStorage(html: Any, id: Any, element: Any, storage: Any, intent: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupStorage")(html.asInstanceOf[js.Any], id.asInstanceOf[js.Any], element.asInstanceOf[js.Any], storage.asInstanceOf[js.Any], intent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Update the XFA layer.
      *
      * @param {XfaLayerParameters} parameters
      */
    inline def update(parameters: XfaLayerParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type IPDFLinkService = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IPDFLinkService */ Any
  
  type PageViewport = typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport
  
  trait XfaLayerParameters extends StObject {
    
    var annotationStorage: js.UndefOr[Any] = js.undefined
    
    var div: HTMLDivElement
    
    /**
      * - (default value is 'display').
      */
    var intent: js.UndefOr[String] = js.undefined
    
    var linkService: IPDFLinkService
    
    var viewport: PageViewport
    
    var xfaHtml: js.Object
  }
  object XfaLayerParameters {
    
    inline def apply(div: HTMLDivElement, linkService: IPDFLinkService, viewport: PageViewport, xfaHtml: js.Object): XfaLayerParameters = {
      val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], linkService = linkService.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], xfaHtml = xfaHtml.asInstanceOf[js.Any])
      __obj.asInstanceOf[XfaLayerParameters]
    }
    
    extension [Self <: XfaLayerParameters](x: Self) {
      
      inline def setAnnotationStorage(value: Any): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setLinkService(value: IPDFLinkService): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setXfaHtml(value: js.Object): Self = StObject.set(x, "xfaHtml", value.asInstanceOf[js.Any])
    }
  }
}
