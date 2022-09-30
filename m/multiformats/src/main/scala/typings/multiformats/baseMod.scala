package typings.multiformats

import typings.multiformats.anon.Alphabet
import typings.multiformats.anon.BitsPerChar
import typings.multiformats.anon.Decode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("multiformats/types/src/bases/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.multiformats.interfaceMod.BaseCodec because var conflicts: decoder, encoder. Inlined 
  - typings.multiformats.interfaceMod.MultibaseEncoder because var conflicts: name, prefix. Inlined encode */ @JSImport("multiformats/types/src/bases/base", "Codec")
  @js.native
  open class Codec[Base /* <: String */, Prefix /* <: String */] protected ()
    extends StObject
       with typings.multiformats.interfaceMod.MultibaseCodec[Prefix]
       with typings.multiformats.interfaceMod.MultibaseDecoder[Prefix]
       with typings.multiformats.interfaceMod.BaseEncoder
       with typings.multiformats.interfaceMod.BaseDecoder {
    /**
      * @param {Base} name
      * @param {Prefix} prefix
      * @param {(bytes:Uint8Array) => string} baseEncode
      * @param {(text:string) => Uint8Array} baseDecode
      */
    def this(
      name: Base,
      prefix: Prefix,
      baseEncode: js.Function1[/* bytes */ js.typedarray.Uint8Array, String],
      baseDecode: js.Function1[/* text */ String, js.typedarray.Uint8Array]
    ) = this()
    
    /**
      * Decodes **plain** (and not a multibase) string. Unlike
      * decode
      * @param text
      */
    /* CompleteClass */
    override def baseDecode(text: String): js.typedarray.Uint8Array = js.native
    
    /**
      * Base encodes to a **plain** (and not a multibase) string. Unlike
      * `encode` no multibase prefix is added.
      * @param bytes
      */
    /* CompleteClass */
    override def baseEncode(bytes: js.typedarray.Uint8Array): String = js.native
    
    /**
      * Decodes **multibase** string (which must have a multibase prefix added).
      * If prefix does not match
      * @param multibase
      */
    /* CompleteClass */
    override def decode(multibase: typings.multiformats.interfaceMod.Multibase[Prefix]): js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var decoder: typings.multiformats.interfaceMod.MultibaseDecoder[Prefix] = js.native
    @JSName("decoder")
    var decoder_Codec: Decoder[Base, Prefix] = js.native
    
    /**
      * Encodes binary data into **multibase** string (which will have a
      * prefix added).
      */
    def encode(bytes: js.typedarray.Uint8Array): typings.multiformats.interfaceMod.Multibase[Prefix] = js.native
    /**
      * @param {Uint8Array} input
      */
    @JSName("encode")
    def encode_Multibase(input: js.typedarray.Uint8Array): Multibase[Prefix] = js.native
    
    /* CompleteClass */
    var encoder: typings.multiformats.interfaceMod.MultibaseEncoder[Prefix] = js.native
    @JSName("encoder")
    var encoder_Codec: Encoder[Base, Prefix] = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_Codec: Base = js.native
    
    /* CompleteClass */
    var prefix: Prefix = js.native
  }
  
  inline def baseX[Base /* <: String */, Prefix /* <: String */](hasPrefixNameAlphabet: Alphabet[Base, Prefix]): Codec[Base, Prefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("baseX")(hasPrefixNameAlphabet.asInstanceOf[js.Any]).asInstanceOf[Codec[Base, Prefix]]
  
  inline def from[Base /* <: String */, Prefix /* <: String */](hasNamePrefixEncodeDecode: Decode[Base, Prefix]): Codec[Base, Prefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(hasNamePrefixEncodeDecode.asInstanceOf[js.Any]).asInstanceOf[Codec[Base, Prefix]]
  
  inline def or[L /* <: String */, R /* <: String */](
    left: typings.multiformats.interfaceMod.CombobaseDecoder[L],
    right: typings.multiformats.interfaceMod.CombobaseDecoder[R]
  ): ComposedDecoder[L | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ComposedDecoder[L | R]]
  inline def or[L /* <: String */, R /* <: String */](
    left: typings.multiformats.interfaceMod.CombobaseDecoder[L],
    right: typings.multiformats.interfaceMod.UnibaseDecoder[R]
  ): ComposedDecoder[L | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ComposedDecoder[L | R]]
  inline def or[L /* <: String */, R /* <: String */](
    left: typings.multiformats.interfaceMod.UnibaseDecoder[L],
    right: typings.multiformats.interfaceMod.CombobaseDecoder[R]
  ): ComposedDecoder[L | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ComposedDecoder[L | R]]
  inline def or[L /* <: String */, R /* <: String */](
    left: typings.multiformats.interfaceMod.UnibaseDecoder[L],
    right: typings.multiformats.interfaceMod.UnibaseDecoder[R]
  ): ComposedDecoder[L | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ComposedDecoder[L | R]]
  
  inline def rfc4648[Base /* <: String */, Prefix /* <: String */](hasNamePrefixBitsPerCharAlphabet: BitsPerChar[Base, Prefix]): Codec[Base, Prefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc4648")(hasNamePrefixBitsPerCharAlphabet.asInstanceOf[js.Any]).asInstanceOf[Codec[Base, Prefix]]
  
  type BaseCodec = typings.multiformats.interfaceMod.BaseCodec
  
  type BaseDecoder = typings.multiformats.interfaceMod.BaseDecoder
  
  type BaseEncoder = typings.multiformats.interfaceMod.BaseEncoder
  
  type CombobaseDecoder[Prefix /* <: String */] = typings.multiformats.interfaceMod.CombobaseDecoder[Prefix]
  
  /**
    * @template {string} Prefix
    * @typedef {import('./interface').CombobaseDecoder<Prefix>} CombobaseDecoder
    */
  /**
    * @template {string} Prefix
    * @typedef {Record<Prefix, UnibaseDecoder<Prefix>>} Decoders
    */
  /**
    * @template {string} Prefix
    * @implements {MultibaseDecoder<Prefix>}
    * @implements {CombobaseDecoder<Prefix>}
    */
  @js.native
  trait ComposedDecoder[Prefix /* <: String */]
    extends StObject
       with typings.multiformats.interfaceMod.CombobaseDecoder[Prefix] {
    
    def or[OtherPrefix /* <: String */](decoder: ComposedDecoder[OtherPrefix]): ComposedDecoder[Prefix | OtherPrefix] = js.native
    /**
      * @template {string} OtherPrefix
      * @param {UnibaseDecoder<OtherPrefix>|ComposedDecoder<OtherPrefix>} decoder
      * @returns {ComposedDecoder<Prefix|OtherPrefix>}
      */
    def or[OtherPrefix /* <: String */](decoder: typings.multiformats.interfaceMod.UnibaseDecoder[OtherPrefix]): ComposedDecoder[Prefix | OtherPrefix] = js.native
  }
  
  /**
    * @template {string} Prefix
    * @typedef {import('./interface').MultibaseDecoder<Prefix>} MultibaseDecoder
    */
  /**
    * @template {string} Prefix
    * @typedef {import('./interface').UnibaseDecoder<Prefix>} UnibaseDecoder
    */
  /**
    * @template {string} Prefix
    */
  /**
    * Class represents both BaseDecoder and MultibaseDecoder so it could be used
    * to decode multibases (with matching prefix) or just base decode strings
    * with corresponding base encoding.
    * @class
    * @template {string} Base
    * @template {string} Prefix
    * @implements {MultibaseDecoder<Prefix>}
    * @implements {UnibaseDecoder<Prefix>}
    * @implements {BaseDecoder}
    */
  @js.native
  trait Decoder[Base /* <: String */, Prefix /* <: String */]
    extends StObject
       with typings.multiformats.interfaceMod.UnibaseDecoder[Prefix]
       with typings.multiformats.interfaceMod.BaseDecoder {
    
    var name: Base = js.native
    
    def or[OtherPrefix /* <: String */](decoder: ComposedDecoder[OtherPrefix]): ComposedDecoder[Prefix | OtherPrefix] = js.native
    /**
      * @template {string} OtherPrefix
      * @param {UnibaseDecoder<OtherPrefix>|ComposedDecoder<OtherPrefix>} decoder
      * @returns {ComposedDecoder<Prefix|OtherPrefix>}
      */
    def or[OtherPrefix /* <: String */](decoder: typings.multiformats.interfaceMod.UnibaseDecoder[OtherPrefix]): ComposedDecoder[Prefix | OtherPrefix] = js.native
    
    /** @private */
    /* private */ var prefixCodePoint: Any = js.native
  }
  
  type Decoders[Prefix /* <: String */] = Record[Prefix, UnibaseDecoder[Prefix]]
  
  /**
    * @typedef {import('./interface').BaseEncoder} BaseEncoder
    * @typedef {import('./interface').BaseDecoder} BaseDecoder
    * @typedef {import('./interface').BaseCodec} BaseCodec
    */
  /**
    * @template {string} T
    * @typedef {import('./interface').Multibase<T>} Multibase
    */
  /**
    * @template {string} T
    * @typedef {import('./interface').MultibaseEncoder<T>} MultibaseEncoder
    */
  /**
    * Class represents both BaseEncoder and MultibaseEncoder meaning it
    * can be used to encode to multibase or base encode without multibase
    * prefix.
    * @class
    * @template {string} Base
    * @template {string} Prefix
    * @implements {MultibaseEncoder<Prefix>}
    * @implements {BaseEncoder}
    */
  trait Encoder[Base /* <: String */, Prefix /* <: String */]
    extends StObject
       with typings.multiformats.interfaceMod.MultibaseEncoder[Prefix]
       with typings.multiformats.interfaceMod.BaseEncoder {
    
    @JSName("name")
    var name_Encoder: Base
  }
  object Encoder {
    
    inline def apply[Base /* <: String */, Prefix /* <: String */](
      baseEncode: js.typedarray.Uint8Array => String,
      encode: js.typedarray.Uint8Array => typings.multiformats.interfaceMod.Multibase[Prefix],
      name: Base,
      prefix: Prefix
    ): Encoder[Base, Prefix] = {
      val __obj = js.Dynamic.literal(baseEncode = js.Any.fromFunction1(baseEncode), encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoder[Base, Prefix]]
    }
    
    extension [Self <: Encoder[?, ?], Base /* <: String */, Prefix /* <: String */](x: Self & (Encoder[Base, Prefix])) {
      
      inline def setName(value: Base): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Multibase[T /* <: String */] = typings.multiformats.interfaceMod.Multibase[T]
  
  type MultibaseCodec[T] = typings.multiformats.interfaceMod.MultibaseCodec[T]
  
  type MultibaseDecoder[Prefix /* <: String */] = typings.multiformats.interfaceMod.MultibaseDecoder[Prefix]
  
  type MultibaseEncoder[T /* <: String */] = typings.multiformats.interfaceMod.MultibaseEncoder[T]
  
  type UnibaseDecoder[Prefix /* <: String */] = typings.multiformats.interfaceMod.UnibaseDecoder[Prefix]
}
