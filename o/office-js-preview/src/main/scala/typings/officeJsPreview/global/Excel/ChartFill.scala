package typings.officeJsPreview.global.Excel

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import typings.officeJsPreview.OfficeExtension.ClientResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the fill formatting for a chart element.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartFill")
@js.native
open class ChartFill ()
  extends StObject
     with typings.officeJsPreview.Excel.ChartFill {
  
  /**
    * Clears the fill color of a chart element.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  /* CompleteClass */
  @JSName("context")
  var context_ChartFill: typings.officeJsPreview.Excel.RequestContext = js.native
  
  /**
    * Gets the uniform color fill formatting of a chart element.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  /* CompleteClass */
  override def getSolidColor(): ClientResult[String] = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
  
  /**
    * Sets the fill formatting of a chart element to a uniform color.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param color HTML color code representing the color of the background, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    */
  /* CompleteClass */
  override def setSolidColor(color: String): Unit = js.native
}
