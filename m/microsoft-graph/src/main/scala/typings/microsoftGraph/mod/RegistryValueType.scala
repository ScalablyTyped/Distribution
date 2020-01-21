package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.binary
  - typings.microsoftGraph.microsoftGraphStrings.dword
  - typings.microsoftGraph.microsoftGraphStrings.dwordLittleEndian
  - typings.microsoftGraph.microsoftGraphStrings.dwordBigEndian
  - typings.microsoftGraph.microsoftGraphStrings.expandSz
  - typings.microsoftGraph.microsoftGraphStrings.link
  - typings.microsoftGraph.microsoftGraphStrings.multiSz
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.qword
  - typings.microsoftGraph.microsoftGraphStrings.qwordlittleEndian
  - typings.microsoftGraph.microsoftGraphStrings.sz
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RegistryValueType extends js.Object

object RegistryValueType {
  @scala.inline
  def binary: typings.microsoftGraph.microsoftGraphStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dword: typings.microsoftGraph.microsoftGraphStrings.dword = this.cast("dword")
  @scala.inline
  def dwordBigEndian: typings.microsoftGraph.microsoftGraphStrings.dwordBigEndian = this.cast("dwordBigEndian")
  @scala.inline
  def dwordLittleEndian: typings.microsoftGraph.microsoftGraphStrings.dwordLittleEndian = this.cast("dwordLittleEndian")
  @scala.inline
  def expandSz: typings.microsoftGraph.microsoftGraphStrings.expandSz = this.cast("expandSz")
  @scala.inline
  def link: typings.microsoftGraph.microsoftGraphStrings.link = this.cast("link")
  @scala.inline
  def multiSz: typings.microsoftGraph.microsoftGraphStrings.multiSz = this.cast("multiSz")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def qword: typings.microsoftGraph.microsoftGraphStrings.qword = this.cast("qword")
  @scala.inline
  def qwordlittleEndian: typings.microsoftGraph.microsoftGraphStrings.qwordlittleEndian = this.cast("qwordlittleEndian")
  @scala.inline
  def sz: typings.microsoftGraph.microsoftGraphStrings.sz = this.cast("sz")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

