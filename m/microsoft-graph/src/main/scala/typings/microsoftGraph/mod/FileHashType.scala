package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.sha1
  - typings.microsoftGraph.microsoftGraphStrings.sha256
  - typings.microsoftGraph.microsoftGraphStrings.md5
  - typings.microsoftGraph.microsoftGraphStrings.authenticodeHash256
  - typings.microsoftGraph.microsoftGraphStrings.lsHash
  - typings.microsoftGraph.microsoftGraphStrings.ctph
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait FileHashType extends js.Object

object FileHashType {
  @scala.inline
  def authenticodeHash256: typings.microsoftGraph.microsoftGraphStrings.authenticodeHash256 = this.cast("authenticodeHash256")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ctph: typings.microsoftGraph.microsoftGraphStrings.ctph = this.cast("ctph")
  @scala.inline
  def lsHash: typings.microsoftGraph.microsoftGraphStrings.lsHash = this.cast("lsHash")
  @scala.inline
  def md5: typings.microsoftGraph.microsoftGraphStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typings.microsoftGraph.microsoftGraphStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typings.microsoftGraph.microsoftGraphStrings.sha256 = this.cast("sha256")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

