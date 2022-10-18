package typings.multibase

import typings.multibase.multibaseBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {import('./base')} Base */
  /** @typedef {import("./types").BaseNameOrCode} BaseNameOrCode */
  /** @typedef {import("./types").BaseCode} BaseCode */
  /** @typedef {import("./types").BaseName} BaseName */
  /**
    * Create a new Uint8Array with the multibase varint+code.
    *
    * @param {BaseNameOrCode} nameOrCode - The multibase name or code number.
    * @param {Uint8Array} buf - The data to be prefixed with multibase.
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    */
  inline def apply(nameOrCode: BaseNameOrCode, buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].apply(nameOrCode.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("multibase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<std.Record<multibase.multibase/dist/src/types.BaseCode, multibase.multibase/dist/src/base.^>> */
  object codes {
    
    @JSImport("multibase", "codes.0")
    @js.native
    val `0`: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.7")
    @js.native
    val `7`: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.9")
    @js.native
    val `9`: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.B")
    @js.native
    val B_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.C")
    @js.native
    val C_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.F")
    @js.native
    val F_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.K")
    @js.native
    val K_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.M")
    @js.native
    val M_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.T")
    @js.native
    val T_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.U")
    @js.native
    val U_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.V")
    @js.native
    val V_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.Z")
    @js.native
    val Z_ : typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.\u0000")
    @js.native
    val _empty: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.b")
    @js.native
    val b: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.c")
    @js.native
    val c: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.f")
    @js.native
    val f: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.h")
    @js.native
    val h: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.k")
    @js.native
    val k: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.m")
    @js.native
    val m: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.t")
    @js.native
    val t: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.u")
    @js.native
    val u: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.v")
    @js.native
    val v: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "codes.z")
    @js.native
    val z: typings.multibase.distSrcBaseMod.^ = js.native
  }
  
  inline def decode(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  /**
    * Takes a Uint8Array or string encoded with multibase header, decodes it and
    * returns the decoded buffer
    *
    * @param {Uint8Array|string} data
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    *
    */
  inline def decode(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Encode data with the specified base and add the multibase prefix.
    *
    * @param {BaseNameOrCode} nameOrCode - The multibase name or code number.
    * @param {Uint8Array} buf - The data to be encoded.
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    *
    */
  inline def encode(nameOrCode: BaseNameOrCode, buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(nameOrCode.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Get the encoding by name or code
    *
    * @param {BaseNameOrCode} nameOrCode
    * @returns {Base}
    * @throws {Error} Will throw if the encoding is not supported
    */
  inline def encoding(nameOrCode: BaseNameOrCode): Base = ^.asInstanceOf[js.Dynamic].applyDynamic("encoding")(nameOrCode.asInstanceOf[js.Any]).asInstanceOf[Base]
  
  /**
    * Get encoding from data
    *
    * @param {string|Uint8Array} data
    * @returns {Base}
    * @throws {Error} Will throw if the encoding is not supported
    */
  inline def encodingFromData(data: String): Base = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingFromData")(data.asInstanceOf[js.Any]).asInstanceOf[Base]
  inline def encodingFromData(data: js.typedarray.Uint8Array): Base = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingFromData")(data.asInstanceOf[js.Any]).asInstanceOf[Base]
  
  inline def isEncoded(data: String): `false` | typings.multibase.distSrcTypesMod.BaseName = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoded")(data.asInstanceOf[js.Any]).asInstanceOf[`false` | typings.multibase.distSrcTypesMod.BaseName]
  /**
    * Is the given data multibase encoded?
    *
    * @param {Uint8Array|string} data
    */
  inline def isEncoded(data: js.typedarray.Uint8Array): `false` | typings.multibase.distSrcTypesMod.BaseName = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoded")(data.asInstanceOf[js.Any]).asInstanceOf[`false` | typings.multibase.distSrcTypesMod.BaseName]
  
  /* Inlined std.Readonly<std.Record<multibase.multibase/dist/src/types.BaseName, multibase.multibase/dist/src/base.^>> */
  object names {
    
    @JSImport("multibase", "names.base10")
    @js.native
    val base10: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base16")
    @js.native
    val base16: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base16upper")
    @js.native
    val base16upper: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base2")
    @js.native
    val base2: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32")
    @js.native
    val base32: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32hex")
    @js.native
    val base32hex: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32hexpad")
    @js.native
    val base32hexpad: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32hexpadupper")
    @js.native
    val base32hexpadupper: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32hexupper")
    @js.native
    val base32hexupper: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32pad")
    @js.native
    val base32pad: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32padupper")
    @js.native
    val base32padupper: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32upper")
    @js.native
    val base32upper: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base32z")
    @js.native
    val base32z: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base36")
    @js.native
    val base36: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base36upper")
    @js.native
    val base36upper: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base58btc")
    @js.native
    val base58btc: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base58flickr")
    @js.native
    val base58flickr: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base64")
    @js.native
    val base64: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base64pad")
    @js.native
    val base64pad: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base64url")
    @js.native
    val base64url: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base64urlpad")
    @js.native
    val base64urlpad: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.base8")
    @js.native
    val base8: typings.multibase.distSrcBaseMod.^ = js.native
    
    @JSImport("multibase", "names.identity")
    @js.native
    val identity: typings.multibase.distSrcBaseMod.^ = js.native
  }
  
  type Base = typings.multibase.distSrcBaseMod.^
  
  type BaseCode = typings.multibase.distSrcTypesMod.BaseCode
  
  type BaseName = typings.multibase.distSrcTypesMod.BaseName
  
  type BaseNameOrCode = typings.multibase.distSrcTypesMod.BaseNameOrCode
}
