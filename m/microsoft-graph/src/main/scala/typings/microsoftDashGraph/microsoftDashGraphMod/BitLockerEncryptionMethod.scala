package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.aesCbc128
  - typings.microsoftDashGraph.microsoftDashGraphStrings.aesCbc256
  - typings.microsoftDashGraph.microsoftDashGraphStrings.xtsAes128
  - typings.microsoftDashGraph.microsoftDashGraphStrings.xtsAes256
*/
trait BitLockerEncryptionMethod extends js.Object

object BitLockerEncryptionMethod {
  @scala.inline
  def aesCbc128: typings.microsoftDashGraph.microsoftDashGraphStrings.aesCbc128 = this.cast("aesCbc128")
  @scala.inline
  def aesCbc256: typings.microsoftDashGraph.microsoftDashGraphStrings.aesCbc256 = this.cast("aesCbc256")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xtsAes128: typings.microsoftDashGraph.microsoftDashGraphStrings.xtsAes128 = this.cast("xtsAes128")
  @scala.inline
  def xtsAes256: typings.microsoftDashGraph.microsoftDashGraphStrings.xtsAes256 = this.cast("xtsAes256")
}

