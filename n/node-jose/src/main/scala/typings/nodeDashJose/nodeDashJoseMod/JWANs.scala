package typings.nodeDashJose.nodeDashJoseMod

import typings.node.Buffer
import typings.nodeDashJose.nodeDashJoseMod.JWANs.DecryptEncryptOptions
import typings.nodeDashJose.nodeDashJoseMod.JWANs.DeriveOptions
import typings.nodeDashJose.nodeDashJoseMod.JWANs.EncryptReturn
import typings.nodeDashJose.nodeDashJoseMod.JWANs.SignReturn
import typings.nodeDashJose.nodeDashJoseMod.JWANs.SignVerifyOptions
import typings.nodeDashJose.nodeDashJoseMod.JWANs.VerifyReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWA")
@js.native
object JWANs extends js.Object {
  trait DecryptEncryptOptions extends js.Object {
    var aad: js.UndefOr[Buffer] = js.undefined
    var adata: js.UndefOr[Buffer] = js.undefined
     // algorithm to use in ec
    var alg: js.UndefOr[String] = js.undefined
     // variation of enc, probably oversight in lib code
    var apu: js.UndefOr[Buffer] = js.undefined
     // agreement party info used in ec
    var apv: js.UndefOr[Buffer] = js.undefined
     // ephemeral pub key used in ec
    var enc: js.UndefOr[String] = js.undefined
    var epk: js.UndefOr[Buffer] = js.undefined
     // Not used in encrypt
    var epu: js.UndefOr[Buffer] = js.undefined
     // encryption party info
    var epv: js.UndefOr[Buffer] = js.undefined
    var iv: js.UndefOr[Buffer] = js.undefined
     // encryption party info
    var kdata: js.UndefOr[Buffer] = js.undefined
     // Not used in encrypt
    var mac: js.UndefOr[Buffer] = js.undefined
     // used in pbes
    var p2c: js.UndefOr[Double] = js.undefined
     // agreement party info used in ec
    var p2s: js.UndefOr[Buffer] = js.undefined
    var tag: js.UndefOr[Buffer] = js.undefined
  }
  
  trait DeriveOptions extends js.Object {
     // public key used in ecdh
    var hash: js.UndefOr[Buffer] = js.undefined
     // salt value used in hkdf
    var info: js.UndefOr[Buffer] = js.undefined
    var length: js.UndefOr[Double] = js.undefined
     // key length
    var otherInfo: js.UndefOr[Buffer] = js.undefined
     // info used in concatkdf
    var public: js.UndefOr[Buffer] = js.undefined
     // hash used in ecdh
    var salt: js.UndefOr[Buffer] = js.undefined
  }
  
  trait EncryptReturn extends js.Object {
    var data: Buffer
     // The cipher text
    var tag: js.UndefOr[Buffer] = js.undefined
  }
  
  trait SignReturn extends js.Object {
    var data: Buffer
     // the data passed into the sign function
    var mac: Buffer
  }
  
  trait SignVerifyOptions extends js.Object {
    var loose: js.UndefOr[Boolean] = js.undefined
  }
  
  trait VerifyReturn extends js.Object {
    var data: Buffer
     // the data passed into the verify function
    var mac: Buffer
     // the signature for `data`
    var valid: Boolean
  }
  
  def decrypt(alg: String, key: String, cdata: String): js.Promise[Buffer] = js.native
  def decrypt(alg: String, key: String, cdata: String, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  def decrypt(alg: String, key: String, cdata: Buffer): js.Promise[Buffer] = js.native
  def decrypt(alg: String, key: String, cdata: Buffer, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  def decrypt(alg: String, key: Buffer, cdata: String): js.Promise[Buffer] = js.native
  def decrypt(alg: String, key: Buffer, cdata: String, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  def decrypt(alg: String, key: Buffer, cdata: Buffer): js.Promise[Buffer] = js.native
  def decrypt(alg: String, key: Buffer, cdata: Buffer, props: DecryptEncryptOptions): js.Promise[Buffer] = js.native
  def derive(alg: String, key: String): js.Promise[Buffer] = js.native
  def derive(alg: String, key: String, props: DeriveOptions): js.Promise[Buffer] = js.native
  def derive(alg: String, key: Buffer): js.Promise[Buffer] = js.native
  def derive(alg: String, key: Buffer, props: DeriveOptions): js.Promise[Buffer] = js.native
  def digest(alg: String, data: String): js.Promise[Buffer] = js.native
  def digest(alg: String, data: String, props: js.Any): js.Promise[Buffer] = js.native
  def digest(alg: String, data: Buffer): js.Promise[Buffer] = js.native
  def digest(alg: String, data: Buffer, props: js.Any): js.Promise[Buffer] = js.native
  def encrypt(alg: String, key: String, pdata: String): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: String, key: String, pdata: String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: String, key: String, pdata: Buffer): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: String, key: String, pdata: Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: String, key: Buffer, pdata: String): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: String, key: Buffer, pdata: String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: String, key: Buffer, pdata: Buffer): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: String, key: Buffer, pdata: Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def sign(alg: String, key: String, pdata: String, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def sign(alg: String, key: String, pdata: Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def sign(alg: String, key: Buffer, pdata: String, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def sign(alg: String, key: Buffer, pdata: Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def verify(alg: String, key: String, pdata: String, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def verify(alg: String, key: String, pdata: String, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def verify(alg: String, key: String, pdata: Buffer, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def verify(alg: String, key: String, pdata: Buffer, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def verify(alg: String, key: Buffer, pdata: String, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def verify(alg: String, key: Buffer, pdata: String, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def verify(alg: String, key: Buffer, pdata: Buffer, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
  def verify(alg: String, key: Buffer, pdata: Buffer, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = js.native
}

