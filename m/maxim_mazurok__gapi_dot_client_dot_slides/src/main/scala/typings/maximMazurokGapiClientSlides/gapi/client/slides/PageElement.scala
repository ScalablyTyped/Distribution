package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageElement extends StObject {
  
  /** The description of the page element. Combined with title to display alt text. The field is not supported for Group elements. */
  var description: js.UndefOr[String] = js.undefined
  
  /** A collection of page elements joined as a single unit. */
  var elementGroup: js.UndefOr[Group] = js.undefined
  
  /** An image page element. */
  var image: js.UndefOr[Image] = js.undefined
  
  /** A line page element. */
  var line: js.UndefOr[Line] = js.undefined
  
  /** The object ID for this page element. Object IDs used by google.apps.slides.v1.Page and google.apps.slides.v1.PageElement share the same namespace. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** A generic shape. */
  var shape: js.UndefOr[Shape] = js.undefined
  
  /** A linked chart embedded from Google Sheets. Unlinked charts are represented as images. */
  var sheetsChart: js.UndefOr[SheetsChart] = js.undefined
  
  /** The size of the page element. */
  var size: js.UndefOr[Size] = js.undefined
  
  /** A table page element. */
  var table: js.UndefOr[Table] = js.undefined
  
  /** The title of the page element. Combined with description to display alt text. The field is not supported for Group elements. */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The transform of the page element. The visual appearance of the page element is determined by its absolute transform. To compute the absolute transform, preconcatenate a page
    * element's transform with the transforms of all of its parent groups. If the page element is not in a group, its absolute transform is the same as the value in this field. The
    * initial transform for the newly created Group is always the identity transform.
    */
  var transform: js.UndefOr[AffineTransform] = js.undefined
  
  /** A video page element. */
  var video: js.UndefOr[Video] = js.undefined
  
  /** A word art page element. */
  var wordArt: js.UndefOr[WordArt] = js.undefined
}
object PageElement {
  
  inline def apply(): PageElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageElement] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setElementGroup(value: Group): Self = StObject.set(x, "elementGroup", value.asInstanceOf[js.Any])
    
    inline def setElementGroupUndefined: Self = StObject.set(x, "elementGroup", js.undefined)
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSheetsChart(value: SheetsChart): Self = StObject.set(x, "sheetsChart", value.asInstanceOf[js.Any])
    
    inline def setSheetsChartUndefined: Self = StObject.set(x, "sheetsChart", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransform(value: AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setVideo(value: Video): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    inline def setWordArt(value: WordArt): Self = StObject.set(x, "wordArt", value.asInstanceOf[js.Any])
    
    inline def setWordArtUndefined: Self = StObject.set(x, "wordArt", js.undefined)
  }
}
