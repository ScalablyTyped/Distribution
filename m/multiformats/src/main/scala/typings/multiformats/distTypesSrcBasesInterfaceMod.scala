package typings.multiformats

import typings.multiformats.anon.`0`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcBasesInterfaceMod {
  
  trait BaseCodec extends StObject {
    
    var decoder: BaseDecoder
    
    var encoder: BaseEncoder
  }
  object BaseCodec {
    
    inline def apply(decoder: BaseDecoder, encoder: BaseEncoder): BaseCodec = {
      val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any], encoder = encoder.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseCodec]
    }
    
    extension [Self <: BaseCodec](x: Self) {
      
      inline def setDecoder(value: BaseDecoder): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      inline def setEncoder(value: BaseEncoder): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseDecoder extends StObject {
    
    /**
      * Decodes **plain** (and not a multibase) string. Unlike
      * decode
      *
      * @param text
      */
    def baseDecode(text: String): js.typedarray.Uint8Array
  }
  object BaseDecoder {
    
    inline def apply(baseDecode: String => js.typedarray.Uint8Array): BaseDecoder = {
      val __obj = js.Dynamic.literal(baseDecode = js.Any.fromFunction1(baseDecode))
      __obj.asInstanceOf[BaseDecoder]
    }
    
    extension [Self <: BaseDecoder](x: Self) {
      
      inline def setBaseDecode(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "baseDecode", js.Any.fromFunction1(value))
    }
  }
  
  trait BaseEncoder extends StObject {
    
    /**
      * Base encodes to a **plain** (and not a multibase) string. Unlike
      * `encode` no multibase prefix is added.
      *
      * @param bytes
      */
    def baseEncode(bytes: js.typedarray.Uint8Array): String
  }
  object BaseEncoder {
    
    inline def apply(baseEncode: js.typedarray.Uint8Array => String): BaseEncoder = {
      val __obj = js.Dynamic.literal(baseEncode = js.Any.fromFunction1(baseEncode))
      __obj.asInstanceOf[BaseEncoder]
    }
    
    extension [Self <: BaseEncoder](x: Self) {
      
      inline def setBaseEncode(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "baseEncode", js.Any.fromFunction1(value))
    }
  }
  
  trait CombobaseDecoder[Prefix /* <: String */]
    extends StObject
       with MultibaseDecoder[Prefix] {
    
    val decoders: Record[Prefix, UnibaseDecoder[Prefix]]
  }
  object CombobaseDecoder {
    
    inline def apply[Prefix /* <: String */](
      decode: Multibase[Prefix] => js.typedarray.Uint8Array,
      decoders: Record[Prefix, UnibaseDecoder[Prefix]]
    ): CombobaseDecoder[Prefix] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), decoders = decoders.asInstanceOf[js.Any])
      __obj.asInstanceOf[CombobaseDecoder[Prefix]]
    }
    
    extension [Self <: CombobaseDecoder[?], Prefix /* <: String */](x: Self & CombobaseDecoder[Prefix]) {
      
      inline def setDecoders(value: Record[Prefix, UnibaseDecoder[Prefix]]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
    }
  }
  
  type Multibase[Prefix /* <: String */] = String | (String & `0`[Prefix])
  
  trait MultibaseCodec[Prefix /* <: String */] extends StObject {
    
    var decoder: MultibaseDecoder[Prefix]
    
    var encoder: MultibaseEncoder[Prefix]
    
    var name: String
    
    var prefix: Prefix
  }
  object MultibaseCodec {
    
    inline def apply[Prefix /* <: String */](decoder: MultibaseDecoder[Prefix], encoder: MultibaseEncoder[Prefix], name: String, prefix: Prefix): MultibaseCodec[Prefix] = {
      val __obj = js.Dynamic.literal(decoder = decoder.asInstanceOf[js.Any], encoder = encoder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultibaseCodec[Prefix]]
    }
    
    extension [Self <: MultibaseCodec[?], Prefix /* <: String */](x: Self & MultibaseCodec[Prefix]) {
      
      inline def setDecoder(value: MultibaseDecoder[Prefix]): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      inline def setEncoder(value: MultibaseEncoder[Prefix]): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultibaseDecoder[Prefix /* <: String */] extends StObject {
    
    /**
      * Decodes **multibase** string (which must have a multibase prefix added).
      * If prefix does not match
      *
      * @param multibase
      */
    def decode(multibase: Multibase[Prefix]): js.typedarray.Uint8Array
  }
  object MultibaseDecoder {
    
    inline def apply[Prefix /* <: String */](decode: Multibase[Prefix] => js.typedarray.Uint8Array): MultibaseDecoder[Prefix] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
      __obj.asInstanceOf[MultibaseDecoder[Prefix]]
    }
    
    extension [Self <: MultibaseDecoder[?], Prefix /* <: String */](x: Self & MultibaseDecoder[Prefix]) {
      
      inline def setDecode(value: Multibase[Prefix] => js.typedarray.Uint8Array): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  trait MultibaseEncoder[Prefix /* <: String */] extends StObject {
    
    /**
      * Encodes binary data into **multibase** string (which will have a
      * prefix added).
      */
    def encode(bytes: js.typedarray.Uint8Array): Multibase[Prefix]
    
    /**
      * Name of the encoding.
      */
    var name: String
    
    /**
      * Prefix character for that base encoding.
      */
    var prefix: Prefix
  }
  object MultibaseEncoder {
    
    inline def apply[Prefix /* <: String */](encode: js.typedarray.Uint8Array => Multibase[Prefix], name: String, prefix: Prefix): MultibaseEncoder[Prefix] = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultibaseEncoder[Prefix]]
    }
    
    extension [Self <: MultibaseEncoder[?], Prefix /* <: String */](x: Self & MultibaseEncoder[Prefix]) {
      
      inline def setEncode(value: js.typedarray.Uint8Array => Multibase[Prefix]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnibaseDecoder[Prefix /* <: String */]
    extends StObject
       with MultibaseDecoder[Prefix] {
    
    val decoders: js.UndefOr[Null] = js.undefined
    
    val prefix: Prefix
  }
  object UnibaseDecoder {
    
    inline def apply[Prefix /* <: String */](decode: Multibase[Prefix] => js.typedarray.Uint8Array, prefix: Prefix): UnibaseDecoder[Prefix] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnibaseDecoder[Prefix]]
    }
    
    extension [Self <: UnibaseDecoder[?], Prefix /* <: String */](x: Self & UnibaseDecoder[Prefix]) {
      
      inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
