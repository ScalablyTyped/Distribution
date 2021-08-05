package typings.multibase

import typings.multibase.multibaseBooleans.`false`
import typings.multibase.multibaseStrings.b_
import typings.multibase.multibaseStrings.c_
import typings.multibase.multibaseStrings.f_
import typings.multibase.multibaseStrings.k_
import typings.multibase.multibaseStrings.m_
import typings.multibase.multibaseStrings.t_
import typings.multibase.multibaseStrings.u_
import typings.multibase.multibaseStrings.v_
import typings.multibase.multibaseStrings.z_
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {import('./base')} Base */
  /** @typedef {import("./types").BaseNameOrCode} BaseNameOrCode */
  /** @typedef {import("./types").BaseCode} BaseCode */
  /**
    * Create a new Uint8Array with the multibase varint+code.
    *
    * @param {BaseNameOrCode} nameOrCode - The multibase name or code number.
    * @param {Uint8Array} buf - The data to be prefixed with multibase.
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    */
  inline def apply(nameOrCode: BaseNameOrCode, buf: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].apply(nameOrCode.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @JSImport("multibase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<std.Record<multibase.multibase/dist/src/types.BaseCode, multibase.multibase/dist/src/base.^>> */
  object codes {
    
    @JSImport("multibase", "codes.0")
    @js.native
    val `0`: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.7")
    @js.native
    val `7`: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.9")
    @js.native
    val `9`: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.B")
    @js.native
    val B_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.C")
    @js.native
    val C_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.F")
    @js.native
    val F_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.K")
    @js.native
    val K_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.M")
    @js.native
    val M_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.T")
    @js.native
    val T_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.U")
    @js.native
    val U_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.V")
    @js.native
    val V_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.Z")
    @js.native
    val Z_ : typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.\u0000")
    @js.native
    val _empty: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.b")
    @js.native
    val b: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.c")
    @js.native
    val c: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.f")
    @js.native
    val f: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.h")
    @js.native
    val h: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.k")
    @js.native
    val k: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.m")
    @js.native
    val m: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.t")
    @js.native
    val t: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.u")
    @js.native
    val u: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.v")
    @js.native
    val v: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "codes.z")
    @js.native
    val z: typings.multibase.baseMod.^ = js.native
  }
  
  inline def decode(data: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  /**
    * Takes a Uint8Array or string encoded with multibase header, decodes it and
    * returns the decoded buffer
    *
    * @param {Uint8Array|string} data
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    *
    */
  inline def decode(data: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  /**
    * Encode data with the specified base and add the multibase prefix.
    *
    * @param {BaseNameOrCode} nameOrCode - The multibase name or code number.
    * @param {Uint8Array} buf - The data to be encoded.
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    *
    */
  inline def encode(nameOrCode: BaseNameOrCode, buf: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(nameOrCode.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
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
  inline def encodingFromData(data: Uint8Array): Base = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingFromData")(data.asInstanceOf[js.Any]).asInstanceOf[Base]
  
  inline def isEncoded(data: String): `false` | String = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoded")(data.asInstanceOf[js.Any]).asInstanceOf[`false` | String]
  /**
    * Is the given data multibase encoded?
    *
    * @param {Uint8Array|string} data
    * @returns {false | string}
    */
  inline def isEncoded(data: Uint8Array): `false` | String = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoded")(data.asInstanceOf[js.Any]).asInstanceOf[`false` | String]
  
  /* Inlined std.Readonly<std.Record<multibase.multibase/dist/src/types.BaseName, multibase.multibase/dist/src/base.^>> */
  object names {
    
    @JSImport("multibase", "names.base10")
    @js.native
    val base10: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base16")
    @js.native
    val base16: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base16upper")
    @js.native
    val base16upper: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base2")
    @js.native
    val base2: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32")
    @js.native
    val base32: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32hex")
    @js.native
    val base32hex: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32hexpad")
    @js.native
    val base32hexpad: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32hexpadupper")
    @js.native
    val base32hexpadupper: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32hexupper")
    @js.native
    val base32hexupper: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32pad")
    @js.native
    val base32pad: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32padupper")
    @js.native
    val base32padupper: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32upper")
    @js.native
    val base32upper: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base32z")
    @js.native
    val base32z: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base36")
    @js.native
    val base36: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base36upper")
    @js.native
    val base36upper: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base58btc")
    @js.native
    val base58btc: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base58flickr")
    @js.native
    val base58flickr: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base64")
    @js.native
    val base64: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base64pad")
    @js.native
    val base64pad: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base64url")
    @js.native
    val base64url: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base64urlpad")
    @js.native
    val base64urlpad: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.base8")
    @js.native
    val base8: typings.multibase.baseMod.^ = js.native
    
    @JSImport("multibase", "names.identity")
    @js.native
    val identity: typings.multibase.baseMod.^ = js.native
  }
  
  type Base = typings.multibase.baseMod.^
  
  /* Rewritten from type alias, can be one of: 
    - typings.multibase.multibaseStrings.Null
    - typings.multibase.multibaseStrings.`0`
    - typings.multibase.multibaseStrings.`7`
    - typings.multibase.multibaseStrings.`9`
    - typings.multibase.multibaseStrings.f_
    - typings.multibase.multibaseStrings.F
    - typings.multibase.multibaseStrings.v_
    - typings.multibase.multibaseStrings.V
    - typings.multibase.multibaseStrings.t_
    - typings.multibase.multibaseStrings.T
    - typings.multibase.multibaseStrings.b_
    - typings.multibase.multibaseStrings.B
    - typings.multibase.multibaseStrings.c_
    - typings.multibase.multibaseStrings.C
    - typings.multibase.multibaseStrings.h
    - typings.multibase.multibaseStrings.k_
    - typings.multibase.multibaseStrings.K
    - typings.multibase.multibaseStrings.z_
    - typings.multibase.multibaseStrings.Z
    - typings.multibase.multibaseStrings.m_
    - typings.multibase.multibaseStrings.M
    - typings.multibase.multibaseStrings.u_
    - typings.multibase.multibaseStrings.U
  */
  trait BaseCode extends StObject
  object BaseCode {
    
    inline def `0`: typings.multibase.multibaseStrings.`0` = "0".asInstanceOf[typings.multibase.multibaseStrings.`0`]
    
    inline def `7`: typings.multibase.multibaseStrings.`7` = "7".asInstanceOf[typings.multibase.multibaseStrings.`7`]
    
    inline def `9`: typings.multibase.multibaseStrings.`9` = "9".asInstanceOf[typings.multibase.multibaseStrings.`9`]
    
    inline def B: typings.multibase.multibaseStrings.B = "B".asInstanceOf[typings.multibase.multibaseStrings.B]
    
    inline def C: typings.multibase.multibaseStrings.C = "C".asInstanceOf[typings.multibase.multibaseStrings.C]
    
    inline def F: typings.multibase.multibaseStrings.F = "F".asInstanceOf[typings.multibase.multibaseStrings.F]
    
    inline def K: typings.multibase.multibaseStrings.K = "K".asInstanceOf[typings.multibase.multibaseStrings.K]
    
    inline def M: typings.multibase.multibaseStrings.M = "M".asInstanceOf[typings.multibase.multibaseStrings.M]
    
    inline def Null: typings.multibase.multibaseStrings.Null = "\u0000".asInstanceOf[typings.multibase.multibaseStrings.Null]
    
    inline def T: typings.multibase.multibaseStrings.T = "T".asInstanceOf[typings.multibase.multibaseStrings.T]
    
    inline def U: typings.multibase.multibaseStrings.U = "U".asInstanceOf[typings.multibase.multibaseStrings.U]
    
    inline def V: typings.multibase.multibaseStrings.V = "V".asInstanceOf[typings.multibase.multibaseStrings.V]
    
    inline def Z: typings.multibase.multibaseStrings.Z = "Z".asInstanceOf[typings.multibase.multibaseStrings.Z]
    
    inline def b: b_ = "b".asInstanceOf[b_]
    
    inline def c: c_ = "c".asInstanceOf[c_]
    
    inline def f: f_ = "f".asInstanceOf[f_]
    
    inline def h: typings.multibase.multibaseStrings.h = "h".asInstanceOf[typings.multibase.multibaseStrings.h]
    
    inline def k: k_ = "k".asInstanceOf[k_]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def t: t_ = "t".asInstanceOf[t_]
    
    inline def u: u_ = "u".asInstanceOf[u_]
    
    inline def v: v_ = "v".asInstanceOf[v_]
    
    inline def z: z_ = "z".asInstanceOf[z_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.multibase.multibaseStrings.Null
    - typings.multibase.multibaseStrings.`0`
    - typings.multibase.multibaseStrings.`7`
    - typings.multibase.multibaseStrings.`9`
    - typings.multibase.multibaseStrings.f_
    - typings.multibase.multibaseStrings.F
    - typings.multibase.multibaseStrings.v_
    - typings.multibase.multibaseStrings.V
    - typings.multibase.multibaseStrings.t_
    - typings.multibase.multibaseStrings.T
    - typings.multibase.multibaseStrings.b_
    - typings.multibase.multibaseStrings.B
    - typings.multibase.multibaseStrings.c_
    - typings.multibase.multibaseStrings.C
    - typings.multibase.multibaseStrings.h
    - typings.multibase.multibaseStrings.k_
    - typings.multibase.multibaseStrings.K
    - typings.multibase.multibaseStrings.z_
    - typings.multibase.multibaseStrings.Z
    - typings.multibase.multibaseStrings.m_
    - typings.multibase.multibaseStrings.M
    - typings.multibase.multibaseStrings.u_
    - typings.multibase.multibaseStrings.U
    - typings.multibase.multibaseStrings.identity
    - typings.multibase.multibaseStrings.base2
    - typings.multibase.multibaseStrings.base8
    - typings.multibase.multibaseStrings.base10
    - typings.multibase.multibaseStrings.base16
    - typings.multibase.multibaseStrings.base16upper
    - typings.multibase.multibaseStrings.base32hex
    - typings.multibase.multibaseStrings.base32hexupper
    - typings.multibase.multibaseStrings.base32hexpad
    - typings.multibase.multibaseStrings.base32hexpadupper
    - typings.multibase.multibaseStrings.base32
    - typings.multibase.multibaseStrings.base32upper
    - typings.multibase.multibaseStrings.base32pad
    - typings.multibase.multibaseStrings.base32padupper
    - typings.multibase.multibaseStrings.base32z
    - typings.multibase.multibaseStrings.base36
    - typings.multibase.multibaseStrings.base36upper
    - typings.multibase.multibaseStrings.base58btc
    - typings.multibase.multibaseStrings.base58flickr
    - typings.multibase.multibaseStrings.base64
    - typings.multibase.multibaseStrings.base64pad
    - typings.multibase.multibaseStrings.base64url
    - typings.multibase.multibaseStrings.base64urlpad
  */
  trait BaseNameOrCode extends StObject
  object BaseNameOrCode {
    
    inline def `0`: typings.multibase.multibaseStrings.`0` = "0".asInstanceOf[typings.multibase.multibaseStrings.`0`]
    
    inline def `7`: typings.multibase.multibaseStrings.`7` = "7".asInstanceOf[typings.multibase.multibaseStrings.`7`]
    
    inline def `9`: typings.multibase.multibaseStrings.`9` = "9".asInstanceOf[typings.multibase.multibaseStrings.`9`]
    
    inline def B: typings.multibase.multibaseStrings.B = "B".asInstanceOf[typings.multibase.multibaseStrings.B]
    
    inline def C: typings.multibase.multibaseStrings.C = "C".asInstanceOf[typings.multibase.multibaseStrings.C]
    
    inline def F: typings.multibase.multibaseStrings.F = "F".asInstanceOf[typings.multibase.multibaseStrings.F]
    
    inline def K: typings.multibase.multibaseStrings.K = "K".asInstanceOf[typings.multibase.multibaseStrings.K]
    
    inline def M: typings.multibase.multibaseStrings.M = "M".asInstanceOf[typings.multibase.multibaseStrings.M]
    
    inline def Null: typings.multibase.multibaseStrings.Null = "\u0000".asInstanceOf[typings.multibase.multibaseStrings.Null]
    
    inline def T: typings.multibase.multibaseStrings.T = "T".asInstanceOf[typings.multibase.multibaseStrings.T]
    
    inline def U: typings.multibase.multibaseStrings.U = "U".asInstanceOf[typings.multibase.multibaseStrings.U]
    
    inline def V: typings.multibase.multibaseStrings.V = "V".asInstanceOf[typings.multibase.multibaseStrings.V]
    
    inline def Z: typings.multibase.multibaseStrings.Z = "Z".asInstanceOf[typings.multibase.multibaseStrings.Z]
    
    inline def b: b_ = "b".asInstanceOf[b_]
    
    inline def base10: typings.multibase.multibaseStrings.base10 = "base10".asInstanceOf[typings.multibase.multibaseStrings.base10]
    
    inline def base16: typings.multibase.multibaseStrings.base16 = "base16".asInstanceOf[typings.multibase.multibaseStrings.base16]
    
    inline def base16upper: typings.multibase.multibaseStrings.base16upper = "base16upper".asInstanceOf[typings.multibase.multibaseStrings.base16upper]
    
    inline def base2: typings.multibase.multibaseStrings.base2 = "base2".asInstanceOf[typings.multibase.multibaseStrings.base2]
    
    inline def base32: typings.multibase.multibaseStrings.base32 = "base32".asInstanceOf[typings.multibase.multibaseStrings.base32]
    
    inline def base32hex: typings.multibase.multibaseStrings.base32hex = "base32hex".asInstanceOf[typings.multibase.multibaseStrings.base32hex]
    
    inline def base32hexpad: typings.multibase.multibaseStrings.base32hexpad = "base32hexpad".asInstanceOf[typings.multibase.multibaseStrings.base32hexpad]
    
    inline def base32hexpadupper: typings.multibase.multibaseStrings.base32hexpadupper = "base32hexpadupper".asInstanceOf[typings.multibase.multibaseStrings.base32hexpadupper]
    
    inline def base32hexupper: typings.multibase.multibaseStrings.base32hexupper = "base32hexupper".asInstanceOf[typings.multibase.multibaseStrings.base32hexupper]
    
    inline def base32pad: typings.multibase.multibaseStrings.base32pad = "base32pad".asInstanceOf[typings.multibase.multibaseStrings.base32pad]
    
    inline def base32padupper: typings.multibase.multibaseStrings.base32padupper = "base32padupper".asInstanceOf[typings.multibase.multibaseStrings.base32padupper]
    
    inline def base32upper: typings.multibase.multibaseStrings.base32upper = "base32upper".asInstanceOf[typings.multibase.multibaseStrings.base32upper]
    
    inline def base32z: typings.multibase.multibaseStrings.base32z = "base32z".asInstanceOf[typings.multibase.multibaseStrings.base32z]
    
    inline def base36: typings.multibase.multibaseStrings.base36 = "base36".asInstanceOf[typings.multibase.multibaseStrings.base36]
    
    inline def base36upper: typings.multibase.multibaseStrings.base36upper = "base36upper".asInstanceOf[typings.multibase.multibaseStrings.base36upper]
    
    inline def base58btc: typings.multibase.multibaseStrings.base58btc = "base58btc".asInstanceOf[typings.multibase.multibaseStrings.base58btc]
    
    inline def base58flickr: typings.multibase.multibaseStrings.base58flickr = "base58flickr".asInstanceOf[typings.multibase.multibaseStrings.base58flickr]
    
    inline def base64: typings.multibase.multibaseStrings.base64 = "base64".asInstanceOf[typings.multibase.multibaseStrings.base64]
    
    inline def base64pad: typings.multibase.multibaseStrings.base64pad = "base64pad".asInstanceOf[typings.multibase.multibaseStrings.base64pad]
    
    inline def base64url: typings.multibase.multibaseStrings.base64url = "base64url".asInstanceOf[typings.multibase.multibaseStrings.base64url]
    
    inline def base64urlpad: typings.multibase.multibaseStrings.base64urlpad = "base64urlpad".asInstanceOf[typings.multibase.multibaseStrings.base64urlpad]
    
    inline def base8: typings.multibase.multibaseStrings.base8 = "base8".asInstanceOf[typings.multibase.multibaseStrings.base8]
    
    inline def c: c_ = "c".asInstanceOf[c_]
    
    inline def f: f_ = "f".asInstanceOf[f_]
    
    inline def h: typings.multibase.multibaseStrings.h = "h".asInstanceOf[typings.multibase.multibaseStrings.h]
    
    inline def identity: typings.multibase.multibaseStrings.identity = "identity".asInstanceOf[typings.multibase.multibaseStrings.identity]
    
    inline def k: k_ = "k".asInstanceOf[k_]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def t: t_ = "t".asInstanceOf[t_]
    
    inline def u: u_ = "u".asInstanceOf[u_]
    
    inline def v: v_ = "v".asInstanceOf[v_]
    
    inline def z: z_ = "z".asInstanceOf[z_]
  }
}
