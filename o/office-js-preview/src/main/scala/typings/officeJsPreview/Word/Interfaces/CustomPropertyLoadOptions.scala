package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a custom property.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
trait CustomPropertyLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the key of the custom property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the value type of the custom property. Possible values are: String, Number, Date, Boolean.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the value of the custom property. Note that even though Word on the web and the docx file format allow these properties to be arbitrarily long, the desktop version of Word will truncate string values to 255 16-bit chars (possibly creating invalid unicode by breaking up a surrogate pair).
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object CustomPropertyLoadOptions {
  
  inline def apply(): CustomPropertyLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPropertyLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
