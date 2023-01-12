package typings.multiformats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitsPerChar[Base /* <: String */, Prefix /* <: String */] extends StObject {
  
  var alphabet: String
  
  var bitsPerChar: Double
  
  var name: Base
  
  var prefix: Prefix
}
object BitsPerChar {
  
  inline def apply[Base /* <: String */, Prefix /* <: String */](alphabet: String, bitsPerChar: Double, name: Base, prefix: Prefix): BitsPerChar[Base, Prefix] = {
    val __obj = js.Dynamic.literal(alphabet = alphabet.asInstanceOf[js.Any], bitsPerChar = bitsPerChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitsPerChar[Base, Prefix]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitsPerChar[?, ?], Base /* <: String */, Prefix /* <: String */] (val x: Self & (BitsPerChar[Base, Prefix])) extends AnyVal {
    
    inline def setAlphabet(value: String): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
    
    inline def setBitsPerChar(value: Double): Self = StObject.set(x, "bitsPerChar", value.asInstanceOf[js.Any])
    
    inline def setName(value: Base): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
