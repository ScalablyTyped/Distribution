package typings.nodeDashJose.nodeDashJoseMod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashJose.nodeDashJoseStrings.sig
  - typings.nodeDashJose.nodeDashJoseStrings.enc
  - typings.nodeDashJose.nodeDashJoseStrings.desc
*/
trait KeyUse extends js.Object

object KeyUse {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: typings.nodeDashJose.nodeDashJoseStrings.desc = this.cast("desc")
  @scala.inline
  def enc: typings.nodeDashJose.nodeDashJoseStrings.enc = this.cast("enc")
  @scala.inline
  def sig: typings.nodeDashJose.nodeDashJoseStrings.sig = this.cast("sig")
}

