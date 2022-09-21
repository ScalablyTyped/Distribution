package typings.multiformats

import typings.multiformats.anon.Code
import typings.multiformats.anon.Codec
import typings.multiformats.anon.Encode
import typings.multiformats.cidMod.CIDVersion
import typings.multiformats.cidMod.MultihashDigest
import typings.multiformats.hasherMod.Await
import typings.multiformats.interfaceMod.MultibaseDecoder
import typings.multiformats.mod.hasher.Hasher
import typings.multiformats.multiformatsNumbers.`18`
import typings.multiformats.multiformatsNumbers.`19`
import typings.multiformats.multiformatsStrings.B
import typings.multiformats.multiformatsStrings.C
import typings.multiformats.multiformatsStrings.F
import typings.multiformats.multiformatsStrings.Highsurrogatesd83dLowsurrogatesde80
import typings.multiformats.multiformatsStrings.K
import typings.multiformats.multiformatsStrings.M
import typings.multiformats.multiformatsStrings.T
import typings.multiformats.multiformatsStrings.U
import typings.multiformats.multiformatsStrings.V
import typings.multiformats.multiformatsStrings.Z
import typings.multiformats.multiformatsStrings.`0`
import typings.multiformats.multiformatsStrings.`7`
import typings.multiformats.multiformatsStrings.`9`
import typings.multiformats.multiformatsStrings.`sha2-256`
import typings.multiformats.multiformatsStrings.`sha2-512`
import typings.multiformats.multiformatsStrings.b_
import typings.multiformats.multiformatsStrings.base10
import typings.multiformats.multiformatsStrings.base16
import typings.multiformats.multiformatsStrings.base16upper
import typings.multiformats.multiformatsStrings.base2
import typings.multiformats.multiformatsStrings.base256emoji
import typings.multiformats.multiformatsStrings.base32
import typings.multiformats.multiformatsStrings.base32hex
import typings.multiformats.multiformatsStrings.base32hexpad
import typings.multiformats.multiformatsStrings.base32hexpadupper
import typings.multiformats.multiformatsStrings.base32hexupper
import typings.multiformats.multiformatsStrings.base32pad
import typings.multiformats.multiformatsStrings.base32padupper
import typings.multiformats.multiformatsStrings.base32upper
import typings.multiformats.multiformatsStrings.base32z
import typings.multiformats.multiformatsStrings.base36
import typings.multiformats.multiformatsStrings.base36upper
import typings.multiformats.multiformatsStrings.base58btc
import typings.multiformats.multiformatsStrings.base58flickr
import typings.multiformats.multiformatsStrings.base64
import typings.multiformats.multiformatsStrings.base64pad
import typings.multiformats.multiformatsStrings.base64url
import typings.multiformats.multiformatsStrings.base64urlpad
import typings.multiformats.multiformatsStrings.base8
import typings.multiformats.multiformatsStrings.c_
import typings.multiformats.multiformatsStrings.f_
import typings.multiformats.multiformatsStrings.h
import typings.multiformats.multiformatsStrings.identity
import typings.multiformats.multiformatsStrings.k_
import typings.multiformats.multiformatsStrings.m_
import typings.multiformats.multiformatsStrings.t_
import typings.multiformats.multiformatsStrings.u_
import typings.multiformats.multiformatsStrings.v_
import typings.multiformats.multiformatsStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicsMod {
  
  @JSImport("multiformats/types/src/basics", "CID")
  @js.native
  open class CID protected ()
    extends typings.multiformats.mod.CID {
    /**
      * @param {CIDVersion} version
      * @param {number} code - multicodec code, see https://github.com/multiformats/multicodec/blob/master/table.csv
      * @param {MultihashDigest} multihash
      * @param {Uint8Array} bytes
      *
      */
    def this(version: CIDVersion, code: Double, multihash: MultihashDigest, bytes: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object CID {
    
    @JSImport("multiformats/types/src/basics", "CID")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes any input `value` and returns a `CID` instance if it was
      * a `CID` otherwise returns `null`. If `value` is instanceof `CID`
      * it will return value back. If `value` is not instance of this CID
      * class, but is compatible CID it will return new instance of this
      * `CID` class. Otherwise returs null.
      *
      * This allows two different incompatible versions of CID library to
      * co-exist and interop as long as binary interface is compatible.
      * @param {any} value
      * @returns {CID|null}
      */
    inline def asCID(value: Any): typings.multiformats.cidMod.CID | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asCID")(value.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.cidMod.CID | Null]
    
    /**
      *
      * @param {CIDVersion} version - Version of the CID
      * @param {number} code - Code of the codec content is encoded in.
      * @param {MultihashDigest} digest - (Multi)hash of the of the content.
      * @returns {CID}
      */
    inline def create(version: CIDVersion, code: Double, digest: MultihashDigest): typings.multiformats.cidMod.CID = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(version.asInstanceOf[js.Any], code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typings.multiformats.cidMod.CID]
    
    /**
      * Simplified version of `create` for CIDv0.
      * @param {MultihashDigest} digest - Multihash.
      */
    inline def createV0(digest: MultihashDigest): typings.multiformats.cidMod.CID = ^.asInstanceOf[js.Dynamic].applyDynamic("createV0")(digest.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.cidMod.CID]
    
    /**
      * Simplified version of `create` for CIDv1.
      * @template {number} Code
      * @param {Code} code - Content encoding format code.
      * @param {MultihashDigest} digest - Miltihash of the content.
      * @returns {CID}
      */
    inline def createV1[Code /* <: Double */](code: Code, digest: MultihashDigest): typings.multiformats.cidMod.CID = (^.asInstanceOf[js.Dynamic].applyDynamic("createV1")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typings.multiformats.cidMod.CID]
    
    /**
      * Decoded a CID from its binary representation. The byte array must contain
      * only the CID with no additional bytes.
      *
      * An error will be thrown if the bytes provided do not contain a valid
      * binary representation of a CID.
      *
      * @param {Uint8Array} bytes
      * @returns {CID}
      */
    inline def decode(bytes: js.typedarray.Uint8Array): typings.multiformats.cidMod.CID = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.cidMod.CID]
    
    /**
      * Decoded a CID from its binary representation at the beginning of a byte
      * array.
      *
      * Returns an array with the first element containing the CID and the second
      * element containing the remainder of the original byte array. The remainder
      * will be a zero-length byte array if the provided bytes only contained a
      * binary CID representation.
      *
      * @param {Uint8Array} bytes
      * @returns {[CID, Uint8Array]}
      */
    inline def decodeFirst(bytes: js.typedarray.Uint8Array): js.Tuple2[typings.multiformats.cidMod.CID, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[typings.multiformats.cidMod.CID, js.typedarray.Uint8Array]]
    
    /**
      * Inspect the initial bytes of a CID to determine its properties.
      *
      * Involves decoding up to 4 varints. Typically this will require only 4 to 6
      * bytes but for larger multicodec code values and larger multihash digest
      * lengths these varints can be quite large. It is recommended that at least
      * 10 bytes be made available in the `initialBytes` argument for a complete
      * inspection.
      *
      * @param {Uint8Array} initialBytes
      * @returns {{ version:CIDVersion, codec:number, multihashCode:number, digestSize:number, multihashSize:number, size:number }}
      */
    inline def inspectBytes(initialBytes: js.typedarray.Uint8Array): Codec = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectBytes")(initialBytes.asInstanceOf[js.Any]).asInstanceOf[Codec]
    
    /**
      * @param {any} value
      * @returns {value is CID}
      */
    inline def isCID(value: Any): /* is multiformats.multiformats/types/src/cid.CID */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCID")(value.asInstanceOf[js.Any]).asInstanceOf[/* is multiformats.multiformats/types/src/cid.CID */ Boolean]
    
    /**
      * Takes cid in a string representation and creates an instance. If `base`
      * decoder is not provided will use a default from the configuration. It will
      * throw an error if encoding of the CID is not compatible with supplied (or
      * a default decoder).
      *
      * @template {string} Prefix
      * @param {string} source
      * @param {MultibaseDecoder<Prefix>} [base]
      */
    inline def parse[Prefix /* <: String */](source: String): typings.multiformats.cidMod.CID = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.cidMod.CID]
    inline def parse[Prefix /* <: String */](source: String, base: MultibaseDecoder[Prefix]): typings.multiformats.cidMod.CID = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.multiformats.cidMod.CID]
  }
  
  object bases {
    
    @JSImport("multiformats/types/src/basics", "bases")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats/types/src/basics", "bases.base10")
    @js.native
    def base10: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base10, `9`] = js.native
    inline def base10_=(x: typings.multiformats.baseMod.Codec[base10, `9`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base10")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base16")
    @js.native
    def base16: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base16, f_] = js.native
    inline def base16_=(x: typings.multiformats.baseMod.Codec[base16, f_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base16")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base16upper")
    @js.native
    def base16upper: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base16upper, F] = js.native
    inline def base16upper_=(x: typings.multiformats.baseMod.Codec[base16upper, F]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base16upper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base2")
    @js.native
    def base2: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base2, `0`] = js.native
    
    @JSImport("multiformats/types/src/basics", "bases.base256emoji")
    @js.native
    def base256emoji: typings.multiformats.baseMod.Codec[
        typings.multiformats.multiformatsStrings.base256emoji, 
        Highsurrogatesd83dLowsurrogatesde80
      ] = js.native
    inline def base256emoji_=(x: typings.multiformats.baseMod.Codec[base256emoji, Highsurrogatesd83dLowsurrogatesde80]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base256emoji")(x.asInstanceOf[js.Any])
    
    inline def base2_=(x: typings.multiformats.baseMod.Codec[base2, `0`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base2")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32")
    @js.native
    def base32: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32, b_] = js.native
    inline def base32_=(x: typings.multiformats.baseMod.Codec[base32, b_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32hex")
    @js.native
    def base32hex: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32hex, v_] = js.native
    inline def base32hex_=(x: typings.multiformats.baseMod.Codec[base32hex, v_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32hex")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32hexpad")
    @js.native
    def base32hexpad: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32hexpad, t_] = js.native
    inline def base32hexpad_=(x: typings.multiformats.baseMod.Codec[base32hexpad, t_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32hexpad")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32hexpadupper")
    @js.native
    def base32hexpadupper: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32hexpadupper, T] = js.native
    inline def base32hexpadupper_=(x: typings.multiformats.baseMod.Codec[base32hexpadupper, T]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32hexpadupper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32hexupper")
    @js.native
    def base32hexupper: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32hexupper, V] = js.native
    inline def base32hexupper_=(x: typings.multiformats.baseMod.Codec[base32hexupper, V]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32hexupper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32pad")
    @js.native
    def base32pad: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32pad, c_] = js.native
    inline def base32pad_=(x: typings.multiformats.baseMod.Codec[base32pad, c_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32pad")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32padupper")
    @js.native
    def base32padupper: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32padupper, C] = js.native
    inline def base32padupper_=(x: typings.multiformats.baseMod.Codec[base32padupper, C]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32padupper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32upper")
    @js.native
    def base32upper: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32upper, B] = js.native
    inline def base32upper_=(x: typings.multiformats.baseMod.Codec[base32upper, B]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32upper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base32z")
    @js.native
    def base32z: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base32z, h] = js.native
    inline def base32z_=(x: typings.multiformats.baseMod.Codec[base32z, h]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32z")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base36")
    @js.native
    def base36: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base36, k_] = js.native
    inline def base36_=(x: typings.multiformats.baseMod.Codec[base36, k_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base36")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base36upper")
    @js.native
    def base36upper: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base36upper, K] = js.native
    inline def base36upper_=(x: typings.multiformats.baseMod.Codec[base36upper, K]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base36upper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base58btc")
    @js.native
    def base58btc: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base58btc, z_] = js.native
    inline def base58btc_=(x: typings.multiformats.baseMod.Codec[base58btc, z_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base58btc")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base58flickr")
    @js.native
    def base58flickr: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base58flickr, Z] = js.native
    inline def base58flickr_=(x: typings.multiformats.baseMod.Codec[base58flickr, Z]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base58flickr")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base64")
    @js.native
    def base64: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base64, m_] = js.native
    inline def base64_=(x: typings.multiformats.baseMod.Codec[base64, m_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base64pad")
    @js.native
    def base64pad: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base64pad, M] = js.native
    inline def base64pad_=(x: typings.multiformats.baseMod.Codec[base64pad, M]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64pad")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base64url")
    @js.native
    def base64url: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base64url, u_] = js.native
    inline def base64url_=(x: typings.multiformats.baseMod.Codec[base64url, u_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64url")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base64urlpad")
    @js.native
    def base64urlpad: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base64urlpad, U] = js.native
    inline def base64urlpad_=(x: typings.multiformats.baseMod.Codec[base64urlpad, U]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64urlpad")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.base8")
    @js.native
    def base8: typings.multiformats.baseMod.Codec[typings.multiformats.multiformatsStrings.base8, `7`] = js.native
    inline def base8_=(x: typings.multiformats.baseMod.Codec[base8, `7`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base8")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "bases.identity")
    @js.native
    def identity: typings.multiformats.baseMod.Codec[
        typings.multiformats.multiformatsStrings.identity, 
        typings.multiformats.multiformatsStrings.Null
      ] = js.native
    inline def identity_=(x: typings.multiformats.baseMod.Codec[identity, typings.multiformats.multiformatsStrings.Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
  }
  
  object bytes {
    
    @JSImport("multiformats/types/src/basics", "bytes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def coerce(o: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def coerce(o: js.typedarray.ArrayBufferView): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def coerce(o: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("multiformats/types/src/basics", "bytes.empty")
    @js.native
    val empty: js.typedarray.Uint8Array = js.native
    
    inline def equals_(aa: js.typedarray.Uint8Array, bb: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(aa.asInstanceOf[js.Any], bb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromHex(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromString(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def isBinary(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toHex(d: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toString_(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(b.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object digest {
    
    @JSImport("multiformats/types/src/basics", "digest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats/types/src/basics", "digest.Digest")
    @js.native
    open class Digest[Code /* <: Double */, Size /* <: Double */] protected ()
      extends typings.multiformats.mod.digest.Digest[Code, Size] {
      /**
        * Creates a multihash digest.
        * @param {Code} code
        * @param {Size} size
        * @param {Uint8Array} digest
        * @param {Uint8Array} bytes
        */
      def this(code: Code, size: Size, digest: js.typedarray.Uint8Array, bytes: js.typedarray.Uint8Array) = this()
    }
    
    inline def create[Code /* <: Double */](code: Code, digest: js.typedarray.Uint8Array): typings.multiformats.digestMod.Digest[Code, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typings.multiformats.digestMod.Digest[Code, Double]]
    
    inline def decode(multihash: js.typedarray.Uint8Array): typings.multiformats.digestMod.MultihashDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(multihash.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.digestMod.MultihashDigest]
    
    inline def equals_(
      a: typings.multiformats.digestMod.MultihashDigest,
      b: typings.multiformats.digestMod.MultihashDigest
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object hasher {
    
    @JSImport("multiformats/types/src/basics", "hasher")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats/types/src/basics", "hasher.Hasher")
    @js.native
    open class Hasher[Name /* <: String */, Code /* <: Double */] protected ()
      extends typings.multiformats.mod.hasher.Hasher[Name, Code] {
      /**
        *
        * @param {Name} name
        * @param {Code} code
        * @param {(input: Uint8Array) => Await<Uint8Array>} encode
        */
      def this(
        name: Name,
        code: Code,
        encode: js.Function1[/* input */ js.typedarray.Uint8Array, Await[js.typedarray.Uint8Array]]
      ) = this()
    }
    
    inline def from[Name /* <: String */, Code /* <: Double */](hasNameCodeEncode: Encode[Name, Code]): typings.multiformats.hasherMod.Hasher[Name, Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(hasNameCodeEncode.asInstanceOf[js.Any]).asInstanceOf[typings.multiformats.hasherMod.Hasher[Name, Code]]
  }
  
  object hashes {
    
    @JSImport("multiformats/types/src/basics", "hashes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats/types/src/basics", "hashes.identity")
    @js.native
    def identity: Code = js.native
    inline def identity_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "hashes.sha256")
    @js.native
    def sha256: Hasher[`sha2-256`, `18`] = js.native
    inline def sha256_=(x: Hasher[`sha2-256`, `18`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/types/src/basics", "hashes.sha512")
    @js.native
    def sha512: Hasher[`sha2-512`, `19`] = js.native
    inline def sha512_=(x: Hasher[`sha2-512`, `19`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512")(x.asInstanceOf[js.Any])
  }
  
  object varint {
    
    @JSImport("multiformats/types/src/basics", "varint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: js.typedarray.Uint8Array): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    inline def decode(data: js.typedarray.Uint8Array, offset: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def encodeTo(int: Double, target: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTo")(int.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def encodeTo(int: Double, target: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTo")(int.asInstanceOf[js.Any], target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodingLength(int: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(int.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
