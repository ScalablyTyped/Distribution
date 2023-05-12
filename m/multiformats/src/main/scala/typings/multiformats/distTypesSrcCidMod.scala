package typings.multiformats

import typings.multiformats.anon.Codec
import typings.multiformats.anon._empty
import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseDecoder
import typings.multiformats.distTypesSrcBasesInterfaceMod.MultibaseEncoder
import typings.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typings.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import typings.multiformats.distTypesSrcLinkInterfaceMod.DAG_PB
import typings.multiformats.distTypesSrcLinkInterfaceMod.Link
import typings.multiformats.distTypesSrcLinkInterfaceMod.LinkJSON
import typings.multiformats.distTypesSrcLinkInterfaceMod.SHA_256
import typings.multiformats.distTypesSrcLinkInterfaceMod.ToString
import typings.multiformats.distTypesSrcLinkInterfaceMod.UnknownLink
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.multiformatsInts.`0`
import typings.multiformats.multiformatsInts.`112`
import typings.multiformats.multiformatsInts.`18`
import typings.multiformats.multiformatsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcCidMod {
  
  @JSImport("multiformats/dist/types/src/cid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/dist/types/src/cid", "CID")
  @js.native
  open class CID[Data /* <: Any */, Format /* <: Double */, Alg /* <: Double */, Version /* <: typings.multiformats.distTypesSrcLinkInterfaceMod.Version */] protected ()
    extends StObject
       with Link[Data, Format, Alg, Version] {
    /**
      * @param {Version} version - Version of the CID
      * @param {Format} code - Code of the codec content is encoded in, see https://github.com/multiformats/multicodec/blob/master/table.csv
      * @param {API.MultihashDigest<Alg>} multihash - (Multi)hash of the of the content.
      * @param {Uint8Array} bytes
      *
      */
    def this(version: Version, code: Format, multihash: MultihashDigest[Alg], bytes: js.typedarray.Uint8Array) = this()
    
    /** @readonly */
    @JSName("/")
    val Slash: js.typedarray.Uint8Array = js.native
    
    /**
      * Signalling `cid.asCID === cid` has been replaced with `cid['/'] === cid.bytes`
      * please either use `CID.asCID(cid)` or switch to new signalling mechanism
      *
      * @deprecated
      */
    def asCID: CID[Data, Format, Alg, Version] = js.native
    
    @JSName("byteLength")
    def byteLength_MCID: Double = js.native
    
    @JSName("byteOffset")
    def byteOffset_MCID: Double = js.native
    
    /** @readonly */
    @JSName("bytes")
    val bytes_CID: js.typedarray.Uint8Array = js.native
    
    var get: Any = js.native
    
    def toJSON(): _empty[Data, Format, Alg, Version] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * @returns {CID<Data, API.DAG_PB, API.SHA_256, 0>}
      */
    def toV0(): CID[Data, DAG_PB, SHA_256, `0`] = js.native
  }
  /* static members */
  object CID {
    
    @JSImport("multiformats/dist/types/src/cid", "CID")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes any input `value` and returns a `CID` instance if it was
      * a `CID` otherwise returns `null`. If `value` is instanceof `CID`
      * it will return value back. If `value` is not instance of this CID
      * class, but is compatible CID it will return new instance of this
      * `CID` class. Otherwise returns null.
      *
      * This allows two different incompatible versions of CID library to
      * co-exist and interop as long as binary interface is compatible.
      *
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @template {unknown} U
      * @param {API.Link<Data, Format, Alg, Version>|U} input
      * @returns {CID<Data, Format, Alg, Version>|null}
      */
    inline def asCID[Data_2 /* <: Any */, Format_2 /* <: Double */, Alg_2 /* <: Double */, Version_2 /* <: Version */, U /* <: Any */](input: U): (CID[Data_2, Format_2, Alg_2, Version_2]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asCID")(input.asInstanceOf[js.Any]).asInstanceOf[(CID[Data_2, Format_2, Alg_2, Version_2]) | Null]
    inline def asCID[Data_2 /* <: Any */, Format_2 /* <: Double */, Alg_2 /* <: Double */, Version_2 /* <: Version */, U /* <: Any */](input: Link[Data_2, Format_2, Alg_2, Version_2]): (CID[Data_2, Format_2, Alg_2, Version_2]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asCID")(input.asInstanceOf[js.Any]).asInstanceOf[(CID[Data_2, Format_2, Alg_2, Version_2]) | Null]
    
    /**
      *
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @param {Version} version - Version of the CID
      * @param {Format} code - Code of the codec content is encoded in, see https://github.com/multiformats/multicodec/blob/master/table.csv
      * @param {API.MultihashDigest<Alg>} digest - (Multi)hash of the of the content.
      * @returns {CID<Data, Format, Alg, Version>}
      */
    inline def create[Data_3 /* <: Any */, Format_3 /* <: Double */, Alg_3 /* <: Double */, Version_3 /* <: Version */](version: Version_3, code: Format_3, digest: MultihashDigest[Alg_3]): CID[Data_3, Format_3, Alg_3, Version_3] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(version.asInstanceOf[js.Any], code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[CID[Data_3, Format_3, Alg_3, Version_3]]
    
    /**
      * Simplified version of `create` for CIDv0.
      *
      * @template {unknown} [T=unknown]
      * @param {API.MultihashDigest<typeof SHA_256_CODE>} digest - Multihash.
      * @returns {CID<T, typeof DAG_PB_CODE, typeof SHA_256_CODE, 0>}
      */
    inline def createV0_18[T /* <: Any */](digest: MultihashDigest[`18`]): CID[T, `112`, `18`, `0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("createV0")(digest.asInstanceOf[js.Any]).asInstanceOf[CID[T, `112`, `18`, `0`]]
    
    /**
      * Simplified version of `create` for CIDv1.
      *
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @param {Code} code - Content encoding format code.
      * @param {API.MultihashDigest<Alg>} digest - Miltihash of the content.
      * @returns {CID<Data, Code, Alg, 1>}
      */
    inline def createV1[Data_4 /* <: Any */, Code /* <: Double */, Alg_4 /* <: Double */](code: Code, digest: MultihashDigest[Alg_4]): CID[Data_4, Code, Alg_4, `1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("createV1")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[CID[Data_4, Code, Alg_4, `1`]]
    
    /**
      * Decoded a CID from its binary representation. The byte array must contain
      * only the CID with no additional bytes.
      *
      * An error will be thrown if the bytes provided do not contain a valid
      * binary representation of a CID.
      *
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @template {API.Version} Ver
      * @param {API.ByteView<API.Link<Data, Code, Alg, Ver>>} bytes
      * @returns {CID<Data, Code, Alg, Ver>}
      */
    inline def decode[Data_5 /* <: Any */, Code_1 /* <: Double */, Alg_5 /* <: Double */, Ver /* <: Version */](bytes: ByteView[Link[Data_5, Code_1, Alg_5, Ver]]): CID[Data_5, Code_1, Alg_5, Ver] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[CID[Data_5, Code_1, Alg_5, Ver]]
    
    /**
      * Decoded a CID from its binary representation at the beginning of a byte
      * array.
      *
      * Returns an array with the first element containing the CID and the second
      * element containing the remainder of the original byte array. The remainder
      * will be a zero-length byte array if the provided bytes only contained a
      * binary CID representation.
      *
      * @template {unknown} T
      * @template {number} C
      * @template {number} A
      * @template {API.Version} V
      * @param {API.ByteView<API.Link<T, C, A, V>>} bytes
      * @returns {[CID<T, C, A, V>, Uint8Array]}
      */
    inline def decodeFirst[T_1 /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */](bytes: ByteView[Link[T_1, C, A, V]]): js.Tuple2[CID[T_1, C, A, V], js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CID[T_1, C, A, V], js.typedarray.Uint8Array]]
    
    /**
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @param {API.Link<Data, Format, Alg, Version>} self
      * @param {unknown} other
      * @returns {other is CID}
      */
    inline def equals[Data_1 /* <: Any */, Format_1 /* <: Double */, Alg_1 /* <: Double */, Version_1 /* <: Version */](self: Link[Data_1, Format_1, Alg_1, Version_1], other: Any): /* is multiformats.multiformats/dist/types/src/cid.CID<any, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(self.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[/* is multiformats.multiformats/dist/types/src/cid.CID<any, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean]
    
    /**
      * Inspect the initial bytes of a CID to determine its properties.
      *
      * Involves decoding up to 4 varints. Typically this will require only 4 to 6
      * bytes but for larger multicodec code values and larger multihash digest
      * lengths these varints can be quite large. It is recommended that at least
      * 10 bytes be made available in the `initialBytes` argument for a complete
      * inspection.
      *
      * @template {unknown} T
      * @template {number} C
      * @template {number} A
      * @template {API.Version} V
      * @param {API.ByteView<API.Link<T, C, A, V>>} initialBytes
      * @returns {{ version:V, codec:C, multihashCode:A, digestSize:number, multihashSize:number, size:number }}
      */
    inline def inspectBytes[T_2 /* <: Any */, C_1 /* <: Double */, A_1 /* <: Double */, V_1 /* <: Version */](initialBytes: ByteView[Link[T_2, C_1, A_1, V_1]]): Codec[V_1, C_1, A_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectBytes")(initialBytes.asInstanceOf[js.Any]).asInstanceOf[Codec[V_1, C_1, A_1]]
    
    /**
      * Takes cid in a string representation and creates an instance. If `base`
      * decoder is not provided will use a default from the configuration. It will
      * throw an error if encoding of the CID is not compatible with supplied (or
      * a default decoder).
      *
      * @template {string} Prefix
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @template {API.Version} Ver
      * @param {API.ToString<API.Link<Data, Code, Alg, Ver>, Prefix>} source
      * @param {API.MultibaseDecoder<Prefix>} [base]
      * @returns {CID<Data, Code, Alg, Ver>}
      */
    inline def parse[Prefix /* <: String */, Data_6 /* <: Any */, Code_2 /* <: Double */, Alg_6 /* <: Double */, Ver_1 /* <: Version */](source: ToString[Link[Data_6, Code_2, Alg_6, Ver_1], Prefix]): CID[Data_6, Code_2, Alg_6, Ver_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[CID[Data_6, Code_2, Alg_6, Ver_1]]
    inline def parse[Prefix /* <: String */, Data_6 /* <: Any */, Code_2 /* <: Double */, Alg_6 /* <: Double */, Ver_1 /* <: Version */](source: ToString[Link[Data_6, Code_2, Alg_6, Ver_1], Prefix], base: MultibaseDecoder[Prefix]): CID[Data_6, Code_2, Alg_6, Ver_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[CID[Data_6, Code_2, Alg_6, Ver_1]]
  }
  
  inline def format[T /* <: Link[Any, Double, Double, Version] */, Prefix /* <: String */](link: T): ToString[T, Prefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(link.asInstanceOf[js.Any]).asInstanceOf[ToString[T, Prefix]]
  inline def format[T /* <: Link[Any, Double, Double, Version] */, Prefix /* <: String */](link: T, base: MultibaseEncoder[Prefix]): ToString[T, Prefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(link.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ToString[T, Prefix]]
  
  inline def fromJSON[Link /* <: UnknownLink */](json: LinkJSON[Link]): CID[Any, Double, Double, Version] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[CID[Any, Double, Double, Version]]
  
  inline def toJSON(link: Link[Any, Double, Double, Version]): LinkJSON[Link[Any, Double, Double, Version]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(link.asInstanceOf[js.Any]).asInstanceOf[LinkJSON[Link[Any, Double, Double, Version]]]
  
  inline def toJSON_0(link: Link[Any, DAG_PB, SHA_256, `0`]): LinkJSON[Link[Any, DAG_PB, SHA_256, `0`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(link.asInstanceOf[js.Any]).asInstanceOf[LinkJSON[Link[Any, DAG_PB, SHA_256, `0`]]]
}
