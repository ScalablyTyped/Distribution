package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJsPreview.OfficeExtension.ClientObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the data connections that are part of the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
trait DataConnectionCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataConnectionCollection: RequestContext
  
  /**
    * Refreshes data connections in the collection, such as from a PivotTable to a Power BI dataset, or a Data Model to a table or range in the same workbook.
    Data connections unsupported by this method are: Power Query connections, data connections outside the original workbook (except Power BI connections), and connections to data protected by a firewall.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  def refreshAll(): Unit
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DataConnectionCollection object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataConnectionCollectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String]
}
object DataConnectionCollection {
  
  inline def apply(
    context: RequestContext,
    isNullObject: Boolean,
    refreshAll: () => Unit,
    toJSON: () => StringDictionary[String]
  ): DataConnectionCollection = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isNullObject = isNullObject.asInstanceOf[js.Any], refreshAll = js.Any.fromFunction0(refreshAll), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DataConnectionCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataConnectionCollection] (val x: Self) extends AnyVal {
    
    inline def setContext(value: RequestContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setRefreshAll(value: () => Unit): Self = StObject.set(x, "refreshAll", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: () => StringDictionary[String]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
