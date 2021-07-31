package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TimelineStyle object, for use in `timelineStyle.set({ ... })`. */
trait TimelineStyleUpdateData extends StObject {
  
  /**
    *
    * Gets the name of the TimelineStyle.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.undefined
}
object TimelineStyleUpdateData {
  
  @scala.inline
  def apply(): TimelineStyleUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineStyleUpdateData]
  }
  
  @scala.inline
  implicit class TimelineStyleUpdateDataMutableBuilder[Self <: TimelineStyleUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
