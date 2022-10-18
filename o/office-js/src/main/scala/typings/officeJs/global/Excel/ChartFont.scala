package typings.officeJs.global.Excel

import typings.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents the font attributes (such as font name, font size, and color) for a chart object.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartFont")
@js.native
open class ChartFont ()
  extends StObject
     with typings.officeJs.Excel.ChartFont {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
}
