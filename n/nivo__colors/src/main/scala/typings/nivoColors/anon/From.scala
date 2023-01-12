package typings.nivoColors.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var from: Validator[String]
  
  var modifiers: Requireable[js.Array[js.UndefOr[js.Array[Any] | Null]]]
}
object From {
  
  inline def apply(from: Validator[String], modifiers: Requireable[js.Array[js.UndefOr[js.Array[Any] | Null]]]): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Validator[String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setModifiers(value: Requireable[js.Array[js.UndefOr[js.Array[Any] | Null]]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
  }
}
