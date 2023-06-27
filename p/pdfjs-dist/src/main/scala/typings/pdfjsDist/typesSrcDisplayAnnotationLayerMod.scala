package typings.pdfjsDist

import org.scalablytyped.runtime.StringDictionary
import typings.pdfjsDist.typesSrcDisplayAnnotationStorageMod.AnnotationStorage
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayAnnotationLayerMod {
  
  @JSImport("pdfjs-dist/types/src/display/annotation_layer", "AnnotationLayer")
  @js.native
  open class AnnotationLayer () extends StObject
  /* static members */
  object AnnotationLayer {
    
    @JSImport("pdfjs-dist/types/src/display/annotation_layer", "AnnotationLayer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def `__Numbersign29@NumbersignappendElement`(element: Any, id: Any, div: Any, accessibilityManager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#29@#appendElement")(element.asInstanceOf[js.Any], id.asInstanceOf[js.Any], div.asInstanceOf[js.Any], accessibilityManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `__Numbersign29@NumbersignsetAnnotationCanvasMap`(div: Any, annotationCanvasMap: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#29@#setAnnotationCanvasMap")(div.asInstanceOf[js.Any], annotationCanvasMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Render a new annotation layer with all annotation elements.
      *
      * @param {AnnotationLayerParameters} params
      * @memberof AnnotationLayer
      */
    inline def render(params: AnnotationLayerParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Update the annotation elements on existing annotation layer.
      *
      * @param {AnnotationLayerParameters} params
      * @memberof AnnotationLayer
      */
    inline def update(params: AnnotationLayerParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait AnnotationElementParameters extends StObject {
    
    var annotationStorage: js.UndefOr[AnnotationStorage] = js.undefined
    
    var data: js.Object
    
    var downloadManager: Any
    
    var enableScripting: js.UndefOr[Boolean] = js.undefined
    
    var fieldObjects: js.UndefOr[js.Object] = js.undefined
    
    var hasJSActions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - Path for image resources, mainly
      * for annotation icons. Include trailing slash.
      */
    var imageResourcesPath: js.UndefOr[String] = js.undefined
    
    var layer: HTMLDivElement
    
    var linkService: IPDFLinkService
    
    var page: PDFPageProxy
    
    var renderForms: Boolean
    
    var svgFactory: js.Object
    
    var viewport: PageViewport
  }
  object AnnotationElementParameters {
    
    inline def apply(
      data: js.Object,
      downloadManager: Any,
      layer: HTMLDivElement,
      linkService: IPDFLinkService,
      page: PDFPageProxy,
      renderForms: Boolean,
      svgFactory: js.Object,
      viewport: PageViewport
    ): AnnotationElementParameters = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], downloadManager = downloadManager.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], linkService = linkService.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], renderForms = renderForms.asInstanceOf[js.Any], svgFactory = svgFactory.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationElementParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationElementParameters] (val x: Self) extends AnyVal {
      
      inline def setAnnotationStorage(value: AnnotationStorage): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDownloadManager(value: Any): Self = StObject.set(x, "downloadManager", value.asInstanceOf[js.Any])
      
      inline def setEnableScripting(value: Boolean): Self = StObject.set(x, "enableScripting", value.asInstanceOf[js.Any])
      
      inline def setEnableScriptingUndefined: Self = StObject.set(x, "enableScripting", js.undefined)
      
      inline def setFieldObjects(value: js.Object): Self = StObject.set(x, "fieldObjects", value.asInstanceOf[js.Any])
      
      inline def setFieldObjectsUndefined: Self = StObject.set(x, "fieldObjects", js.undefined)
      
      inline def setHasJSActions(value: Boolean): Self = StObject.set(x, "hasJSActions", value.asInstanceOf[js.Any])
      
      inline def setHasJSActionsUndefined: Self = StObject.set(x, "hasJSActions", js.undefined)
      
      inline def setImageResourcesPath(value: String): Self = StObject.set(x, "imageResourcesPath", value.asInstanceOf[js.Any])
      
      inline def setImageResourcesPathUndefined: Self = StObject.set(x, "imageResourcesPath", js.undefined)
      
      inline def setLayer(value: HTMLDivElement): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLinkService(value: IPDFLinkService): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
      
      inline def setPage(value: PDFPageProxy): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRenderForms(value: Boolean): Self = StObject.set(x, "renderForms", value.asInstanceOf[js.Any])
      
      inline def setSvgFactory(value: js.Object): Self = StObject.set(x, "svgFactory", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnnotationLayerParameters extends StObject {
    
    var accessibilityManager: js.UndefOr[Any] = js.undefined
    
    var annotationCanvasMap: js.UndefOr[Map[String, HTMLCanvasElement]] = js.undefined
    
    var annotationStorage: js.UndefOr[AnnotationStorage] = js.undefined
    
    var annotations: js.Array[Any]
    
    var div: HTMLDivElement
    
    var downloadManager: Any
    
    /**
      * - Enable embedded script execution.
      */
    var enableScripting: js.UndefOr[Boolean] = js.undefined
    
    var fieldObjects: js.UndefOr[StringDictionary[js.Array[js.Object]] | Null] = js.undefined
    
    /**
      * - Some fields have JS actions.
      * The default value is `false`.
      */
    var hasJSActions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * - Path for image resources, mainly
      * for annotation icons. Include trailing slash.
      */
    var imageResourcesPath: js.UndefOr[String] = js.undefined
    
    var linkService: IPDFLinkService
    
    var page: PDFPageProxy
    
    var renderForms: Boolean
    
    var viewport: PageViewport
  }
  object AnnotationLayerParameters {
    
    inline def apply(
      annotations: js.Array[Any],
      div: HTMLDivElement,
      downloadManager: Any,
      linkService: IPDFLinkService,
      page: PDFPageProxy,
      renderForms: Boolean,
      viewport: PageViewport
    ): AnnotationLayerParameters = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], downloadManager = downloadManager.asInstanceOf[js.Any], linkService = linkService.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], renderForms = renderForms.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationLayerParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationLayerParameters] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityManager(value: Any): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityManagerUndefined: Self = StObject.set(x, "accessibilityManager", js.undefined)
      
      inline def setAnnotationCanvasMap(value: Map[String, HTMLCanvasElement]): Self = StObject.set(x, "annotationCanvasMap", value.asInstanceOf[js.Any])
      
      inline def setAnnotationCanvasMapUndefined: Self = StObject.set(x, "annotationCanvasMap", js.undefined)
      
      inline def setAnnotationStorage(value: AnnotationStorage): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
      
      inline def setAnnotations(value: js.Array[Any]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsVarargs(value: Any*): Self = StObject.set(x, "annotations", js.Array(value*))
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setDownloadManager(value: Any): Self = StObject.set(x, "downloadManager", value.asInstanceOf[js.Any])
      
      inline def setEnableScripting(value: Boolean): Self = StObject.set(x, "enableScripting", value.asInstanceOf[js.Any])
      
      inline def setEnableScriptingUndefined: Self = StObject.set(x, "enableScripting", js.undefined)
      
      inline def setFieldObjects(value: StringDictionary[js.Array[js.Object]]): Self = StObject.set(x, "fieldObjects", value.asInstanceOf[js.Any])
      
      inline def setFieldObjectsNull: Self = StObject.set(x, "fieldObjects", null)
      
      inline def setFieldObjectsUndefined: Self = StObject.set(x, "fieldObjects", js.undefined)
      
      inline def setHasJSActions(value: Boolean): Self = StObject.set(x, "hasJSActions", value.asInstanceOf[js.Any])
      
      inline def setHasJSActionsUndefined: Self = StObject.set(x, "hasJSActions", js.undefined)
      
      inline def setImageResourcesPath(value: String): Self = StObject.set(x, "imageResourcesPath", value.asInstanceOf[js.Any])
      
      inline def setImageResourcesPathUndefined: Self = StObject.set(x, "imageResourcesPath", js.undefined)
      
      inline def setLinkService(value: IPDFLinkService): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
      
      inline def setPage(value: PDFPageProxy): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRenderForms(value: Boolean): Self = StObject.set(x, "renderForms", value.asInstanceOf[js.Any])
      
      inline def setViewport(value: PageViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
  
  type IDownloadManager = Any
  
  type IPDFLinkService = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interfaces.IPDFLinkService */ Any
  
  type PDFPageProxy = typings.pdfjsDist.typesSrcDisplayApiMod.PDFPageProxy
  
  type PageViewport = typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport
}
