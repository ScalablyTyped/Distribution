package typings.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var alg: String = js.native
  var keystore: KeyStore = js.native
  var kid: String = js.native
  var kty: String = js.native
  var length: Double = js.native
  var use: KeyUse = js.native
  def thumbprint(): js.Promise[String] = js.native
  def thumbprint(hash: String): js.Promise[String] = js.native
  def toJSON(): js.Object = js.native
  def toJSON(isPrivate: js.UndefOr[scala.Nothing], excluded: js.Array[String]): js.Object = js.native
  def toJSON(isPrivate: Boolean): js.Object = js.native
  def toJSON(isPrivate: Boolean, excluded: js.Array[String]): js.Object = js.native
  def toPEM(): String = js.native
  def toPEM(isPrivate: Boolean): String = js.native
}

