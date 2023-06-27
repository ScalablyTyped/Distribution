package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the options that define which content controls are returned.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
trait ContentControlOptions extends StObject {
  
  /**
    * An array of content control types, item must be 'RichText' or 'PlainText'.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var types: js.Array[ContentControlType]
}
object ContentControlOptions {
  
  inline def apply(types: js.Array[ContentControlType]): ContentControlOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentControlOptions] (val x: Self) extends AnyVal {
    
    inline def setTypes(value: js.Array[ContentControlType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: ContentControlType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
