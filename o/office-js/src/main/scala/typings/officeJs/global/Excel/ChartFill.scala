package typings.officeJs.global.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientRequestContext
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
     with typings.officeJs.Excel.ChartFill {
  
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
  var context_ChartFill: typings.officeJs.Excel.RequestContext = js.native
  
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
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  /* CompleteClass */
  override def toJSON(): StringDictionary[String] = js.native
}
