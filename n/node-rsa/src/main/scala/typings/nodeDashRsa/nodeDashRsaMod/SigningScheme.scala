package typings.nodeDashRsa.nodeDashRsaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeDashRsa.nodeDashRsaStrings.pkcs1
  - typings.nodeDashRsa.nodeDashRsaStrings.pss
*/
trait SigningScheme extends js.Object

object SigningScheme {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pkcs1: typings.nodeDashRsa.nodeDashRsaStrings.pkcs1 = this.cast("pkcs1")
  @scala.inline
  def pss: typings.nodeDashRsa.nodeDashRsaStrings.pss = this.cast("pss")
}

