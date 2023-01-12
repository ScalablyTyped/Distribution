package typings.prettier.anon

import typings.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meriyah extends StObject {
  
  var meriyah: Parser[Any]
}
object Meriyah {
  
  inline def apply(meriyah: Parser[Any]): Meriyah = {
    val __obj = js.Dynamic.literal(meriyah = meriyah.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meriyah]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Meriyah] (val x: Self) extends AnyVal {
    
    inline def setMeriyah(value: Parser[Any]): Self = StObject.set(x, "meriyah", value.asInstanceOf[js.Any])
  }
}
