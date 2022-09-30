package typings.multiformats

import typings.multiformats.anon.Codec
import typings.multiformats.anon.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cidMod {
  
  @JSImport("multiformats/types/src/cid", "CID")
  @js.native
  open class CID protected () extends StObject {
    /**
      * @param {CIDVersion} version
      * @param {number} code - multicodec code, see https://github.com/multiformats/multicodec/blob/master/table.csv
      * @param {MultihashDigest} multihash
      * @param {Uint8Array} bytes
      *
      */
    def this(version: CIDVersion, code: Double, multihash: MultihashDigest, bytes: js.typedarray.Uint8Array) = this()
    
    /**
      * @type {Map<string, string>}
      * @private
      */
    /* private */ var _baseCache: Any = js.native
    
    /** @private */
    /* private */ var asCID: Any = js.native
    
    def buffer: Unit = js.native
    
    var byteLength: Double = js.native
    
    var byteOffset: Double = js.native
    
    var bytes: js.typedarray.Uint8Array = js.native
    
    var code: Double = js.native
    
    def codec: Unit = js.native
    
    var get: Any = js.native
    
    def multibaseName: Unit = js.native
    
    var multihash: MultihashDigest = js.native
    
    def prefix: Unit = js.native
    
    def toBaseEncodedString: Unit = js.native
    
    def toJSON(): Hash = js.native
    
    def toString(base: typings.multiformats.interfaceMod.MultibaseEncoder[Any]): String = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * @returns {CID}
      */
    def toV0(): CID = js.native
    
    /**
      * @returns {CID}
      */
    def toV1(): CID = js.native
    
    var version: CIDVersion = js.native
  }
  /* static members */
  object CID {
    
    @JSImport("multiformats/types/src/cid", "CID")
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
    inline def asCID(value: Any): CID | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asCID")(value.asInstanceOf[js.Any]).asInstanceOf[CID | Null]
    
    /**
      *
      * @param {CIDVersion} version - Version of the CID
      * @param {number} code - Code of the codec content is encoded in.
      * @param {MultihashDigest} digest - (Multi)hash of the of the content.
      * @returns {CID}
      */
    inline def create(version: CIDVersion, code: Double, digest: MultihashDigest): CID = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(version.asInstanceOf[js.Any], code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[CID]
    
    /**
      * Simplified version of `create` for CIDv0.
      * @param {MultihashDigest} digest - Multihash.
      */
    inline def createV0(digest: MultihashDigest): CID = ^.asInstanceOf[js.Dynamic].applyDynamic("createV0")(digest.asInstanceOf[js.Any]).asInstanceOf[CID]
    
    /**
      * Simplified version of `create` for CIDv1.
      * @template {number} Code
      * @param {Code} code - Content encoding format code.
      * @param {MultihashDigest} digest - Miltihash of the content.
      * @returns {CID}
      */
    inline def createV1[Code /* <: Double */](code: Code, digest: MultihashDigest): CID = (^.asInstanceOf[js.Dynamic].applyDynamic("createV1")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[CID]
    
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
    inline def decode(bytes: js.typedarray.Uint8Array): CID = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[CID]
    
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
    inline def decodeFirst(bytes: js.typedarray.Uint8Array): js.Tuple2[CID, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CID, js.typedarray.Uint8Array]]
    
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
    inline def parse[Prefix /* <: String */](source: String): CID = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[CID]
    inline def parse[Prefix /* <: String */](source: String, base: typings.multiformats.interfaceMod.MultibaseDecoder[Prefix]): CID = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[CID]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.multiformats.multiformatsInts.`0`
    - typings.multiformats.multiformatsInts.`1`
  */
  trait CIDVersion extends StObject
  object CIDVersion {
    
    inline def `0`: typings.multiformats.multiformatsInts.`0` = 0.asInstanceOf[typings.multiformats.multiformatsInts.`0`]
    
    inline def `1`: typings.multiformats.multiformatsInts.`1` = 1.asInstanceOf[typings.multiformats.multiformatsInts.`1`]
  }
  
  type MultibaseDecoder[Prefix] = typings.multiformats.interfaceMod.MultibaseDecoder[Prefix]
  
  type MultibaseEncoder[Prefix] = typings.multiformats.interfaceMod.MultibaseEncoder[Prefix]
  
  type MultihashDigest = typings.multiformats.hashesInterfaceMod.MultihashDigest[Double]
}
