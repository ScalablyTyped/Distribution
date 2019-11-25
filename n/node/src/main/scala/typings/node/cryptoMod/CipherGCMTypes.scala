package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.nodeStrings.`aes-128-gcm`
  - typings.node.nodeStrings.`aes-192-gcm`
  - typings.node.nodeStrings.`aes-256-gcm`
*/
trait CipherGCMTypes extends js.Object

object CipherGCMTypes {
  @scala.inline
  def `aes-128-gcm`: typings.node.nodeStrings.`aes-128-gcm` = this.cast("aes-128-gcm")
  @scala.inline
  def `aes-192-gcm`: typings.node.nodeStrings.`aes-192-gcm` = this.cast("aes-192-gcm")
  @scala.inline
  def `aes-256-gcm`: typings.node.nodeStrings.`aes-256-gcm` = this.cast("aes-256-gcm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

