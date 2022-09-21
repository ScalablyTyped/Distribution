package typings.multibase

import typings.multibase.typesMod.Codec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  /** @typedef {import('./types').CodecFactory} CodecFactory */
  /** @typedef {import("./types").BaseName} BaseName */
  /** @typedef {import("./types").BaseCode} BaseCode */
  /**
    * Class to encode/decode in the supported Bases
    *
    */
  @JSImport("multibase/dist/src/base", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Base {
    /**
      * @param {BaseName} name
      * @param {BaseCode} code
      * @param {CodecFactory} factory
      * @param {string} alphabet
      */
    def this(name: BaseName, code: BaseCode, factory: CodecFactory, alphabet: String) = this()
    
    /* CompleteClass */
    var alphabet: String = js.native
    
    /* CompleteClass */
    var code: typings.multibase.typesMod.BaseCode = js.native
    
    /* CompleteClass */
    var codeBuf: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var codec: Codec = js.native
    
    /**
      * @param {string} string
      * @returns {Uint8Array}
      */
    /* CompleteClass */
    override def decode(string: String): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {Uint8Array} buf
      * @returns {string}
      */
    /* CompleteClass */
    override def encode(buf: js.typedarray.Uint8Array): String = js.native
    
    /* CompleteClass */
    var name: typings.multibase.typesMod.BaseName = js.native
  }
  
  /** @typedef {import('./types').CodecFactory} CodecFactory */
  /** @typedef {import("./types").BaseName} BaseName */
  /** @typedef {import("./types").BaseCode} BaseCode */
  /**
    * Class to encode/decode in the supported Bases
    *
    */
  trait Base extends StObject {
    
    var alphabet: String
    
    var code: typings.multibase.typesMod.BaseCode
    
    var codeBuf: js.typedarray.Uint8Array
    
    var codec: Codec
    
    /**
      * @param {string} string
      * @returns {Uint8Array}
      */
    def decode(string: String): js.typedarray.Uint8Array
    
    /**
      * @param {Uint8Array} buf
      * @returns {string}
      */
    def encode(buf: js.typedarray.Uint8Array): String
    
    var name: typings.multibase.typesMod.BaseName
  }
  object Base {
    
    inline def apply(
      alphabet: String,
      code: typings.multibase.typesMod.BaseCode,
      codeBuf: js.typedarray.Uint8Array,
      codec: Codec,
      decode: String => js.typedarray.Uint8Array,
      encode: js.typedarray.Uint8Array => String,
      name: typings.multibase.typesMod.BaseName
    ): Base = {
      val __obj = js.Dynamic.literal(alphabet = alphabet.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], codeBuf = codeBuf.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setAlphabet(value: String): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
      
      inline def setCode(value: typings.multibase.typesMod.BaseCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeBuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "codeBuf", value.asInstanceOf[js.Any])
      
      inline def setCodec(value: Codec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setDecode(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setName(value: typings.multibase.typesMod.BaseName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type BaseCode = typings.multibase.typesMod.BaseCode
  
  type BaseName = typings.multibase.typesMod.BaseName
  
  type CodecFactory = typings.multibase.typesMod.CodecFactory
}
