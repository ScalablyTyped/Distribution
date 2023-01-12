package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Tag object, for use in `tag.set({ ... })`. */
trait TagUpdateData extends StObject {
  
  /**
    * Gets the value of the tag.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var value: js.UndefOr[String] = js.undefined
}
object TagUpdateData {
  
  inline def apply(): TagUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagUpdateData] (val x: Self) extends AnyVal {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
