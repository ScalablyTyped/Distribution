package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageElement extends StObject {
  
  /** The description of the page element. Combined with title to display alt text. The field is not supported for Group elements. */
  var description: js.UndefOr[String] = js.native
  
  /** A collection of page elements joined as a single unit. */
  var elementGroup: js.UndefOr[Group] = js.native
  
  /** An image page element. */
  var image: js.UndefOr[Image] = js.native
  
  /** A line page element. */
  var line: js.UndefOr[Line] = js.native
  
  /** The object ID for this page element. Object IDs used by google.apps.slides.v1.Page and google.apps.slides.v1.PageElement share the same namespace. */
  var objectId: js.UndefOr[String] = js.native
  
  /** A generic shape. */
  var shape: js.UndefOr[Shape] = js.native
  
  /** A linked chart embedded from Google Sheets. Unlinked charts are represented as images. */
  var sheetsChart: js.UndefOr[SheetsChart] = js.native
  
  /** The size of the page element. */
  var size: js.UndefOr[Size] = js.native
  
  /** A table page element. */
  var table: js.UndefOr[Table] = js.native
  
  /** The title of the page element. Combined with description to display alt text. The field is not supported for Group elements. */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The transform of the page element. The visual appearance of the page element is determined by its absolute transform. To compute the absolute transform, preconcatenate a page
    * element's transform with the transforms of all of its parent groups. If the page element is not in a group, its absolute transform is the same as the value in this field. The
    * initial transform for the newly created Group is always the identity transform.
    */
  var transform: js.UndefOr[AffineTransform] = js.native
  
  /** A video page element. */
  var video: js.UndefOr[Video] = js.native
  
  /** A word art page element. */
  var wordArt: js.UndefOr[WordArt] = js.native
}
object PageElement {
  
  @scala.inline
  def apply(): PageElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageElement]
  }
  
  @scala.inline
  implicit class PageElementMutableBuilder[Self <: PageElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setElementGroup(value: Group): Self = StObject.set(x, "elementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementGroupUndefined: Self = StObject.set(x, "elementGroup", js.undefined)
    
    @scala.inline
    def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSheetsChart(value: SheetsChart): Self = StObject.set(x, "sheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsChartUndefined: Self = StObject.set(x, "sheetsChart", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransform(value: AffineTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setVideo(value: Video): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    @scala.inline
    def setWordArt(value: WordArt): Self = StObject.set(x, "wordArt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordArtUndefined: Self = StObject.set(x, "wordArt", js.undefined)
  }
}
