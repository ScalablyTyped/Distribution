package typings.multiformats

import typings.multiformats.anon.Codec
import typings.multiformats.anon.Encode
import typings.multiformats.cidMod.CIDVersion
import typings.multiformats.cidMod.MultihashDigest
import typings.multiformats.hasherMod.Await
import typings.multiformats.interfaceMod.MultibaseDecoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multiformats", "CID")
  @js.native
  open class CID protected ()
    extends typings.multiformats.cidMod.CID {
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
    
    @JSImport("multiformats", "CID")
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
  
  object bytes {
    
    @JSImport("multiformats", "bytes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def coerce(o: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def coerce(o: js.typedarray.ArrayBufferView): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def coerce(o: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("multiformats", "bytes.empty")
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
    
    @JSImport("multiformats", "digest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats", "digest.Digest")
    @js.native
    open class Digest[Code /* <: Double */, Size /* <: Double */] protected ()
      extends typings.multiformats.digestMod.Digest[Code, Size] {
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
    
    @JSImport("multiformats", "hasher")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats", "hasher.Hasher")
    @js.native
    open class Hasher[Name /* <: String */, Code /* <: Double */] protected ()
      extends typings.multiformats.hasherMod.Hasher[Name, Code] {
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
  
  object varint {
    
    @JSImport("multiformats", "varint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: js.typedarray.Uint8Array): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    inline def decode(data: js.typedarray.Uint8Array, offset: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def encodeTo(int: Double, target: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTo")(int.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def encodeTo(int: Double, target: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTo")(int.asInstanceOf[js.Any], target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodingLength(int: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(int.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
