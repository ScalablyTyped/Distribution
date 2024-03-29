package typings.multiformats

import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcCodecsInterfaceMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.multiformats.distTypesSrcCodecsInterfaceMod.BlockDecoder because var conflicts: code. Inlined decode */ trait BlockCodec[Code /* <: Double */, T]
    extends StObject
       with BlockEncoder[Code, T] {
    
    def decode(bytes: ByteView[T]): T
  }
  object BlockCodec {
    
    inline def apply[Code /* <: Double */, T](code: Code, decode: ByteView[T] => T, encode: T => ByteView[T], name: String): BlockCodec[Code, T] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockCodec[Code, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockCodec[?, ?], Code /* <: Double */, T] (val x: Self & (BlockCodec[Code, T])) extends AnyVal {
      
      inline def setDecode(value: ByteView[T] => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  trait BlockDecoder[Code /* <: Double */, T] extends StObject {
    
    var code: Code
    
    def decode(bytes: ByteView[T]): T
  }
  object BlockDecoder {
    
    inline def apply[Code /* <: Double */, T](code: Code, decode: ByteView[T] => T): BlockDecoder[Code, T] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode))
      __obj.asInstanceOf[BlockDecoder[Code, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockDecoder[?, ?], Code /* <: Double */, T] (val x: Self & (BlockDecoder[Code, T])) extends AnyVal {
      
      inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDecode(value: ByteView[T] => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  trait BlockEncoder[Code /* <: Double */, T] extends StObject {
    
    var code: Code
    
    def encode(data: T): ByteView[T]
    
    var name: String
  }
  object BlockEncoder {
    
    inline def apply[Code /* <: Double */, T](code: Code, encode: T => ByteView[T], name: String): BlockEncoder[Code, T] = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockEncoder[Code, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockEncoder[?, ?], Code /* <: Double */, T] (val x: Self & (BlockEncoder[Code, T])) extends AnyVal {
      
      inline def setCode(value: Code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: T => ByteView[T]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
