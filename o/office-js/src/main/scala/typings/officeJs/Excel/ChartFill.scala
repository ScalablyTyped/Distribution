package typings.officeJs.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the fill formatting for a chart element.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait ChartFill
  extends StObject
     with ClientObject {
  
  /**
    * Clears the fill color of a chart element.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def clear(): Unit
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartFill: RequestContext
  
  /**
    * Gets the uniform color fill formatting of a chart element.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  def getSolidColor(): ClientResult[String]
  
  /**
    * Sets the fill formatting of a chart element to a uniform color.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param color HTML color code representing the color of the background, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    */
  def setSolidColor(color: String): Unit
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String]
}
object ChartFill {
  
  inline def apply(
    clear: () => Unit,
    context: RequestContext,
    getSolidColor: () => ClientResult[String],
    isNullObject: Boolean,
    setSolidColor: String => Unit,
    toJSON: () => StringDictionary[String]
  ): ChartFill = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), context = context.asInstanceOf[js.Any], getSolidColor = js.Any.fromFunction0(getSolidColor), isNullObject = isNullObject.asInstanceOf[js.Any], setSolidColor = js.Any.fromFunction1(setSolidColor), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ChartFill]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartFill] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setContext(value: RequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setGetSolidColor(value: () => ClientResult[String]): Self = StObject.set(x, "getSolidColor", js.Any.fromFunction0(value))
    
    inline def setSetSolidColor(value: String => Unit): Self = StObject.set(x, "setSolidColor", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => StringDictionary[String]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
