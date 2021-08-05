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
  
  inline def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  
  extension [Self <: Response](x: Self) {
    
    inline def setCreateImage(value: CreateImageResponse): Self = StObject.set(x, "createImage", value.asInstanceOf[js.Any])
    
    inline def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
    
    inline def setCreateLine(value: CreateLineResponse): Self = StObject.set(x, "createLine", value.asInstanceOf[js.Any])
    
    inline def setCreateLineUndefined: Self = StObject.set(x, "createLine", js.undefined)
    
    inline def setCreateShape(value: CreateShapeResponse): Self = StObject.set(x, "createShape", value.asInstanceOf[js.Any])
    
    inline def setCreateShapeUndefined: Self = StObject.set(x, "createShape", js.undefined)
    
    inline def setCreateSheetsChart(value: CreateSheetsChartResponse): Self = StObject.set(x, "createSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setCreateSheetsChartUndefined: Self = StObject.set(x, "createSheetsChart", js.undefined)
    
    inline def setCreateSlide(value: CreateSlideResponse): Self = StObject.set(x, "createSlide", value.asInstanceOf[js.Any])
    
    inline def setCreateSlideUndefined: Self = StObject.set(x, "createSlide", js.undefined)
    
    inline def setCreateTable(value: CreateTableResponse): Self = StObject.set(x, "createTable", value.asInstanceOf[js.Any])
    
    inline def setCreateTableUndefined: Self = StObject.set(x, "createTable", js.undefined)
    
    inline def setCreateVideo(value: CreateVideoResponse): Self = StObject.set(x, "createVideo", value.asInstanceOf[js.Any])
    
    inline def setCreateVideoUndefined: Self = StObject.set(x, "createVideo", js.undefined)
    
    inline def setDuplicateObject(value: DuplicateObjectResponse): Self = StObject.set(x, "duplicateObject", value.asInstanceOf[js.Any])
    
    inline def setDuplicateObjectUndefined: Self = StObject.set(x, "duplicateObject", js.undefined)
    
    inline def setGroupObjects(value: GroupObjectsResponse): Self = StObject.set(x, "groupObjects", value.asInstanceOf[js.Any])
    
    inline def setGroupObjectsUndefined: Self = StObject.set(x, "groupObjects", js.undefined)
    
    inline def setReplaceAllShapesWithImage(value: ReplaceAllShapesWithImageResponse): Self = StObject.set(x, "replaceAllShapesWithImage", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllShapesWithImageUndefined: Self = StObject.set(x, "replaceAllShapesWithImage", js.undefined)
    
    inline def setReplaceAllShapesWithSheetsChart(value: ReplaceAllShapesWithSheetsChartResponse): Self = StObject.set(x, "replaceAllShapesWithSheetsChart", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllShapesWithSheetsChartUndefined: Self = StObject.set(x, "replaceAllShapesWithSheetsChart", js.undefined)
    
    inline def setReplaceAllText(value: ReplaceAllTextResponse): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
  }
}
