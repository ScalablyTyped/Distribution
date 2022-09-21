package typings.multiformats.anon

import typings.multiformats.hasherMod.Await
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encode[Name /* <: String */, Code /* <: Double */] extends StObject {
  
  var code: Code
  
  def encode(input: js.typedarray.Uint8Array): Await[js.typedarray.Uint8Array]
  
  var name: Name
}
object Encode {
  
  inline def apply[Name /* <: String */, Code /* <: Double */](code: Code, encode: js.typedarray.Uint8Array => Await[js.typedarray.Uint8Array], name: Name): Encode[Name, Code] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encode[Name, Code]]
  }
  
  extension [Self <: Encode[?, ?], Name /* <: String */, Code /* <: Double */](x: Self & (Encode[Name, Code])) {
    
    inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEncode(value: js.typedarray.Uint8Array => Await[js.typedarray.Uint8Array]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
