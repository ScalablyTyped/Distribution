package typings.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeJose.nodeJoseStrings.sig
  - typings.nodeJose.nodeJoseStrings.enc
  - typings.nodeJose.nodeJoseStrings.desc
*/
trait KeyUse extends js.Object

object KeyUse {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typings.nodeJose.nodeJoseStrings.desc = this.cast("desc")
  @scala.inline
  def enc: typings.nodeJose.nodeJoseStrings.enc = this.cast("enc")
  @scala.inline
  def sig: typings.nodeJose.nodeJoseStrings.sig = this.cast("sig")
}

