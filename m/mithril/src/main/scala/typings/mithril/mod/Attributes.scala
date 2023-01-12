package typings.mithril.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This represents the attributes available for configuring virtual elements, beyond the applicable DOM attributes. */
trait Attributes
  extends StObject
     with CommonAttributes[Any, Any]
     with /** Any other virtual element properties, including attributes and event handlers. */
/* property */ StringDictionary[Any] {
  
  /** The class name(s) for this virtual element, as a space-separated list. */
  var `class`: js.UndefOr[String] = js.undefined
  
  /** The class name(s) for this virtual element, as a space-separated list. */
  var className: js.UndefOr[String] = js.undefined
}
object Attributes {
  
  inline def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
  }
}
