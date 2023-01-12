package typings.officeJsPreview.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tag.toJSON()`. */
trait TagData extends StObject {
  
  /**
    * Gets the unique ID of the tag. The `key` is unique within the owning `TagCollection` and always stored as uppercase letters within the document.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the value of the tag.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var value: js.UndefOr[String] = js.undefined
}
object TagData {
  
  inline def apply(): TagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagData] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
