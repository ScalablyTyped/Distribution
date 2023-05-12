package typings.mimetext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIMEHeader extends StObject {
  
  var custom: Boolean
  
  def dump(v: Any): Any
  
  var generator: js.UndefOr[js.Function0[String]] = js.undefined
  
  var name: String
  
  var placement: MIMEPlacement
  
  var value: String | Null
}
object MIMEHeader {
  
  inline def apply(custom: Boolean, dump: Any => Any, name: String, placement: MIMEPlacement): MIMEHeader = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], dump = js.Any.fromFunction1(dump), name = name.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[MIMEHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MIMEHeader] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDump(value: Any => Any): Self = StObject.set(x, "dump", js.Any.fromFunction1(value))
    
    inline def setGenerator(value: () => String): Self = StObject.set(x, "generator", js.Any.fromFunction0(value))
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: MIMEPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
