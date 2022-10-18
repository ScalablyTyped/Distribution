package typings.multiformats

import typings.multiformats.anon.Alphabet
import typings.multiformats.anon.BitsPerChar
import typings.multiformats.anon.Decode
import typings.multiformats.distTypesSrcBasesInterfaceMod.BaseDecoder
import typings.multiformats.distTypesSrcBasesInterfaceMod.BaseEncoder
import typings.multiformats.distTypesSrcBasesInterfaceMod.CombobaseDecoder
import typings.multiformats.distTypesSrcBasesInterfaceMod.Multibase
import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseCodec
import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseDecoder
import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseEncoder
import typings.multiformats.distTypesSrcBasesInterfaceMod.UnibaseDecoder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcBasesBaseMod {
  
  @JSImport("multiformats/dist/types/src/bases/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.multiformats.distTypesSrcBasesInterfaceMod.BaseCodec because var conflicts: decoder, encoder. Inlined 
  - typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseEncoder because var conflicts: name, prefix. Inlined encode */ @JSImport("multiformats/dist/types/src/bases/base", "Codec")
  @js.native
  open class Codec[Base /* <: String */, Prefix /* <: String */] protected ()
    extends StObject
       with MultibaseCodec[Prefix]
       with MultibaseDecoder[Prefix]
       with BaseEncoder
       with BaseDecoder {
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
      *
      * @param text
      */
    /* CompleteClass */
    override def baseDecode(text: String): js.typedarray.Uint8Array = js.native
    
    /**
      * Base encodes to a **plain** (and not a multibase) string. Unlike
      * `encode` no multibase prefix is added.
      *
      * @param bytes
      */
    /* CompleteClass */
    override def baseEncode(bytes: js.typedarray.Uint8Array): String = js.native
    
    /**
      * Decodes **multibase** string (which must have a multibase prefix added).
      * If prefix does not match
      *
      * @param multibase
      */
    /* CompleteClass */
    override def decode(multibase: Multibase[Prefix]): js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var decoder: MultibaseDecoder[Prefix] = js.native
    @JSName("decoder")
    var decoder_Codec: Decoder[Base, Prefix] = js.native
    
    /**
      * @param {Uint8Array} input
      */
    /**
      * Encodes binary data into **multibase** string (which will have a
      * prefix added).
      */
    def encode(input: js.typedarray.Uint8Array): Multibase[Prefix] = js.native
    
    /* CompleteClass */
    var encoder: MultibaseEncoder[Prefix] = js.native
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
  
  inline def or[L /* <: String */, R /* <: String */](left: CombobaseDecoder[L], right: CombobaseDecoder[R]): ComposedDecoder[L | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ComposedDecoder[L | R]]
  inline def or[L /* <: String */, R /* <: String */](left: CombobaseDecoder[L], right: UnibaseDecoder[R]): ComposedDecoder[L | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ComposedDecoder[L | R]]
  inline def or[L /* <: String */, R /* <: String */](left: UnibaseDecoder[L], right: CombobaseDecoder[R]): ComposedDecoder[L | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ComposedDecoder[L | R]]
  inline def or[L /* <: String */, R /* <: String */](left: UnibaseDecoder[L], right: UnibaseDecoder[R]): ComposedDecoder[L | R] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[ComposedDecoder[L | R]]
  
  inline def rfc4648[Base /* <: String */, Prefix /* <: String */](hasNamePrefixBitsPerCharAlphabet: BitsPerChar[Base, Prefix]): Codec[Base, Prefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc4648")(hasNamePrefixBitsPerCharAlphabet.asInstanceOf[js.Any]).asInstanceOf[Codec[Base, Prefix]]
  
  /**
    * @template {string} Prefix
    * @typedef {Record<Prefix, API.UnibaseDecoder<Prefix>>} Decoders
    */
  /**
    * @template {string} Prefix
    * @implements {API.MultibaseDecoder<Prefix>}
    * @implements {API.CombobaseDecoder<Prefix>}
    */
  @js.native
  trait ComposedDecoder[Prefix /* <: String */]
    extends StObject
       with CombobaseDecoder[Prefix] {
    
    @JSName("decoders")
    var decoders_ComposedDecoder: Decoders[Prefix] = js.native
    
    def or[OtherPrefix /* <: String */](decoder: ComposedDecoder[OtherPrefix]): ComposedDecoder[Prefix | OtherPrefix] = js.native
    /**
      * @template {string} OtherPrefix
      * @param {API.UnibaseDecoder<OtherPrefix>|ComposedDecoder<OtherPrefix>} decoder
      * @returns {ComposedDecoder<Prefix|OtherPrefix>}
      */
    def or[OtherPrefix /* <: String */](decoder: UnibaseDecoder[OtherPrefix]): ComposedDecoder[Prefix | OtherPrefix] = js.native
  }
  
  /**
    * @template {string} Prefix
    */
  /**
    * Class represents both BaseDecoder and MultibaseDecoder so it could be used
    * to decode multibases (with matching prefix) or just base decode strings
    * with corresponding base encoding.
    *
    * @class
    * @template {string} Base
    * @template {string} Prefix
    * @implements {API.MultibaseDecoder<Prefix>}
    * @implements {API.UnibaseDecoder<Prefix>}
    * @implements {API.BaseDecoder}
    */
  @js.native
  trait Decoder[Base /* <: String */, Prefix /* <: String */]
    extends StObject
       with UnibaseDecoder[Prefix]
       with BaseDecoder {
    
    var name: Base = js.native
    
    def or[OtherPrefix /* <: String */](decoder: ComposedDecoder[OtherPrefix]): ComposedDecoder[Prefix | OtherPrefix] = js.native
    /**
      * @template {string} OtherPrefix
      * @param {API.UnibaseDecoder<OtherPrefix>|ComposedDecoder<OtherPrefix>} decoder
      * @returns {ComposedDecoder<Prefix|OtherPrefix>}
      */
    def or[OtherPrefix /* <: String */](decoder: UnibaseDecoder[OtherPrefix]): ComposedDecoder[Prefix | OtherPrefix] = js.native
    
    /** @private */
    /* private */ var prefixCodePoint: Any = js.native
  }
  
  type Decoders[Prefix /* <: String */] = Record[Prefix, UnibaseDecoder[Prefix]]
  
  /**
    * Class represents both BaseEncoder and MultibaseEncoder meaning it
    * can be used to encode to multibase or base encode without multibase
    * prefix.
    *
    * @class
    * @template {string} Base
    * @template {string} Prefix
    * @implements {API.MultibaseEncoder<Prefix>}
    * @implements {API.BaseEncoder}
    */
  trait Encoder[Base /* <: String */, Prefix /* <: String */]
    extends StObject
       with MultibaseEncoder[Prefix]
       with BaseEncoder {
    
    @JSName("name")
    var name_Encoder: Base
  }
  object Encoder {
    
    inline def apply[Base /* <: String */, Prefix /* <: String */](
      baseEncode: js.typedarray.Uint8Array => String,
      encode: js.typedarray.Uint8Array => Multibase[Prefix],
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
}
