package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a reference to a property used by the card layout.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CardLayoutPropertyReference extends StObject {
  
  /**
    * Represents the name of the property referenced by the card layout.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var property: String
}
object CardLayoutPropertyReference {
  
  inline def apply(property: String): CardLayoutPropertyReference = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardLayoutPropertyReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardLayoutPropertyReference] (val x: Self) extends AnyVal {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
