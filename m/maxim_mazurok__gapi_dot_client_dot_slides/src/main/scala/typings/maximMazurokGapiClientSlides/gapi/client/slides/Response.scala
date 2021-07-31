package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response extends StObject {
  
  /** The result of creating an image. */
  var createImage: js.UndefOr[CreateImageResponse] = js.undefined
  
  /** The result of creating a line. */
  var createLine: js.UndefOr[CreateLineResponse] = js.undefined
  
  /** The result of creating a shape. */
  var createShape: js.UndefOr[CreateShapeResponse] = js.undefined
  
  /** The result of creating a Google Sheets chart. */
  var createSheetsChart: js.UndefOr[CreateSheetsChartResponse] = js.undefined
  
  /** The result of creating a slide. */
  var createSlide: js.UndefOr[CreateSlideResponse] = js.undefined
  
  /** The result of creating a table. */
  var createTable: js.UndefOr[CreateTableResponse] = js.undefined
  
  /** The result of creating a video. */
  var createVideo: js.UndefOr[CreateVideoResponse] = js.undefined
  
  /** The result of duplicating an object. */
  var duplicateObject: js.UndefOr[DuplicateObjectResponse] = js.undefined
  
  /** The result of grouping objects. */
  var groupObjects: js.UndefOr[GroupObjectsResponse] = js.undefined
  
  /** The result of replacing all shapes matching some criteria with an image. */
  var replaceAllShapesWithImage: js.UndefOr[ReplaceAllShapesWithImageResponse] = js.undefined
  
  /** The result of replacing all shapes matching some criteria with a Google Sheets chart. */
  var replaceAllShapesWithSheetsChart: js.UndefOr[ReplaceAllShapesWithSheetsChartResponse] = js.undefined
  
  /** The result of replacing text. */
  var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.undefined
}
object Response {
  
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateImage(value: CreateImageResponse): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
    
    @scala.inline
    def setCreateLine(value: CreateLineResponse): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
    
    @scala.inline
    def setCreateShape(value: CreateShapeResponse): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
    
    @scala.inline
    def setCreateSheetsChart(value: CreateSheetsChartResponse): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
    
    @scala.inline
    def setCreateSlide(value: CreateSlideResponse): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
    
    @scala.inline
    def setCreateTable(value: CreateTableResponse): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
    
    @scala.inline
    def setCreateVideo(value: CreateVideoResponse): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
    
    @scala.inline
    def setDuplicateObject(value: DuplicateObjectResponse): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
    
    @scala.inline
    def setGroupObjects(value: GroupObjectsResponse): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageResponse): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
    
    @scala.inline
    def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartResponse): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: ReplaceAllTextResponse): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
  }
}
