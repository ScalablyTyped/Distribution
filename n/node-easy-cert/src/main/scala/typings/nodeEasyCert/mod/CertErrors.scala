package typings.nodeEasyCert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_NOT_EXISTS
  - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_EXISTED
  - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_COMMON_NAME_UNSPECIFIED
*/
trait CertErrors extends js.Object

object CertErrors {
  @scala.inline
  def ROOT_CA_COMMON_NAME_UNSPECIFIED: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_COMMON_NAME_UNSPECIFIED = this.cast("ROOT_CA_COMMON_NAME_UNSPECIFIED")
  @scala.inline
  def ROOT_CA_EXISTED: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_EXISTED = this.cast("ROOT_CA_EXISTED")
  @scala.inline
  def ROOT_CA_NOT_EXISTS: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_NOT_EXISTS = this.cast("ROOT_CA_NOT_EXISTS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

