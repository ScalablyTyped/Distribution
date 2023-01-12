package typings.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single tag in the slide.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
trait TagLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the unique ID of the tag. The `key` is unique within the owning `TagCollection` and always stored as uppercase letters within the document.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the value of the tag.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object TagLoadOptions {
  
  inline def apply(): TagLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
