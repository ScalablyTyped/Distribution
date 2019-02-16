package typings
package nodeDashJoseLib.nodeDashJoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWA")
@js.native
object JWANs extends js.Object {
  trait DecryptEncryptOptions extends js.Object {
    var aad: js.UndefOr[nodeLib.Buffer] = js.undefined
    var adata: js.UndefOr[nodeLib.Buffer] = js.undefined
     // algorithm to use in ec
    var alg: js.UndefOr[java.lang.String] = js.undefined
     // variation of enc, probably oversight in lib code
    var apu: js.UndefOr[nodeLib.Buffer] = js.undefined
     // agreement party info used in ec
    var apv: js.UndefOr[nodeLib.Buffer] = js.undefined
     // ephemeral pub key used in ec
    var enc: js.UndefOr[java.lang.String] = js.undefined
    var epk: js.UndefOr[nodeLib.Buffer] = js.undefined
     // Not used in encrypt
    var epu: js.UndefOr[nodeLib.Buffer] = js.undefined
     // encryption party info
    var epv: js.UndefOr[nodeLib.Buffer] = js.undefined
    var iv: js.UndefOr[nodeLib.Buffer] = js.undefined
     // encryption party info
    var kdata: js.UndefOr[nodeLib.Buffer] = js.undefined
     // Not used in encrypt
    var mac: js.UndefOr[nodeLib.Buffer] = js.undefined
     // used in pbes
    var p2c: js.UndefOr[scala.Double] = js.undefined
     // agreement party info used in ec
    var p2s: js.UndefOr[nodeLib.Buffer] = js.undefined
    var tag: js.UndefOr[nodeLib.Buffer] = js.undefined
  }
  
  trait DeriveOptions extends js.Object {
     // public key used in ecdh
    var hash: js.UndefOr[nodeLib.Buffer] = js.undefined
     // salt value used in hkdf
    var info: js.UndefOr[nodeLib.Buffer] = js.undefined
    var length: js.UndefOr[scala.Double] = js.undefined
     // key length
    var otherInfo: js.UndefOr[nodeLib.Buffer] = js.undefined
     // info used in concatkdf
    var public: js.UndefOr[nodeLib.Buffer] = js.undefined
     // hash used in ecdh
    var salt: js.UndefOr[nodeLib.Buffer] = js.undefined
  }
  
  trait EncryptReturn extends js.Object {
    var data: nodeLib.Buffer
     // The cipher text
    var tag: js.UndefOr[nodeLib.Buffer] = js.undefined
  }
  
  trait SignReturn extends js.Object {
    var data: nodeLib.Buffer
     // the data passed into the sign function
    var mac: nodeLib.Buffer
  }
  
  trait SignVerifyOptions extends js.Object {
    var loose: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait VerifyReturn extends js.Object {
    var data: nodeLib.Buffer
     // the data passed into the verify function
    var mac: nodeLib.Buffer
     // the signature for `data`
    var valid: scala.Boolean
  }
  
  def decrypt(alg: java.lang.String, key: java.lang.String, cdata: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def decrypt(
    alg: java.lang.String,
    key: java.lang.String,
    cdata: java.lang.String,
    props: DecryptEncryptOptions
  ): js.Promise[nodeLib.Buffer] = js.native
  def decrypt(alg: java.lang.String, key: java.lang.String, cdata: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def decrypt(alg: java.lang.String, key: java.lang.String, cdata: nodeLib.Buffer, props: DecryptEncryptOptions): js.Promise[nodeLib.Buffer] = js.native
  def decrypt(alg: java.lang.String, key: nodeLib.Buffer, cdata: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def decrypt(alg: java.lang.String, key: nodeLib.Buffer, cdata: java.lang.String, props: DecryptEncryptOptions): js.Promise[nodeLib.Buffer] = js.native
  def decrypt(alg: java.lang.String, key: nodeLib.Buffer, cdata: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def decrypt(alg: java.lang.String, key: nodeLib.Buffer, cdata: nodeLib.Buffer, props: DecryptEncryptOptions): js.Promise[nodeLib.Buffer] = js.native
  def derive(alg: java.lang.String, key: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def derive(alg: java.lang.String, key: java.lang.String, props: DeriveOptions): js.Promise[nodeLib.Buffer] = js.native
  def derive(alg: java.lang.String, key: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def derive(alg: java.lang.String, key: nodeLib.Buffer, props: DeriveOptions): js.Promise[nodeLib.Buffer] = js.native
  def digest(alg: java.lang.String, data: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def digest(alg: java.lang.String, data: java.lang.String, props: js.Any): js.Promise[nodeLib.Buffer] = js.native
  def digest(alg: java.lang.String, data: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def digest(alg: java.lang.String, data: nodeLib.Buffer, props: js.Any): js.Promise[nodeLib.Buffer] = js.native
  def encrypt(alg: java.lang.String, key: java.lang.String, pdata: java.lang.String): js.Promise[EncryptReturn] = js.native
  def encrypt(
    alg: java.lang.String,
    key: java.lang.String,
    pdata: java.lang.String,
    props: DecryptEncryptOptions
  ): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: java.lang.String, key: java.lang.String, pdata: nodeLib.Buffer): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: java.lang.String, key: java.lang.String, pdata: nodeLib.Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: java.lang.String, key: nodeLib.Buffer, pdata: java.lang.String): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: java.lang.String, key: nodeLib.Buffer, pdata: java.lang.String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: java.lang.String, key: nodeLib.Buffer, pdata: nodeLib.Buffer): js.Promise[EncryptReturn] = js.native
  def encrypt(alg: java.lang.String, key: nodeLib.Buffer, pdata: nodeLib.Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = js.native
  def sign(alg: java.lang.String, key: java.lang.String, pdata: java.lang.String, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def sign(alg: java.lang.String, key: java.lang.String, pdata: nodeLib.Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def sign(alg: java.lang.String, key: nodeLib.Buffer, pdata: java.lang.String, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def sign(alg: java.lang.String, key: nodeLib.Buffer, pdata: nodeLib.Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = js.native
  def verify(
    alg: java.lang.String,
    key: java.lang.String,
    pdata: java.lang.String,
    mac: java.lang.String,
    props: SignVerifyOptions
  ): js.Promise[VerifyReturn] = js.native
  def verify(
    alg: java.lang.String,
    key: java.lang.String,
    pdata: java.lang.String,
    mac: nodeLib.Buffer,
    props: SignVerifyOptions
  ): js.Promise[VerifyReturn] = js.native
  def verify(
    alg: java.lang.String,
    key: java.lang.String,
    pdata: nodeLib.Buffer,
    mac: java.lang.String,
    props: SignVerifyOptions
  ): js.Promise[VerifyReturn] = js.native
  def verify(
    alg: java.lang.String,
    key: java.lang.String,
    pdata: nodeLib.Buffer,
    mac: nodeLib.Buffer,
    props: SignVerifyOptions
  ): js.Promise[VerifyReturn] = js.native
  def verify(
    alg: java.lang.String,
    key: nodeLib.Buffer,
    pdata: java.lang.String,
    mac: java.lang.String,
    props: SignVerifyOptions
  ): js.Promise[VerifyReturn] = js.native
  def verify(
    alg: java.lang.String,
    key: nodeLib.Buffer,
    pdata: java.lang.String,
    mac: nodeLib.Buffer,
    props: SignVerifyOptions
  ): js.Promise[VerifyReturn] = js.native
  def verify(
    alg: java.lang.String,
    key: nodeLib.Buffer,
    pdata: nodeLib.Buffer,
    mac: java.lang.String,
    props: SignVerifyOptions
  ): js.Promise[VerifyReturn] = js.native
  def verify(
    alg: java.lang.String,
    key: nodeLib.Buffer,
    pdata: nodeLib.Buffer,
    mac: nodeLib.Buffer,
    props: SignVerifyOptions
  ): js.Promise[VerifyReturn] = js.native
}

