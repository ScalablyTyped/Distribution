package typings.parseDashPath.parseDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parseDashPath.parseDashPathStrings.http
  - typings.parseDashPath.parseDashPathStrings.https
  - typings.parseDashPath.parseDashPathStrings.ssh
  - typings.parseDashPath.parseDashPathStrings.file
  - typings.parseDashPath.parseDashPathStrings.git
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typings.parseDashPath.parseDashPathStrings.file = this.cast("file")
  @scala.inline
  def git: typings.parseDashPath.parseDashPathStrings.git = this.cast("git")
  @scala.inline
  def http: typings.parseDashPath.parseDashPathStrings.http = this.cast("http")
  @scala.inline
  def https: typings.parseDashPath.parseDashPathStrings.https = this.cast("https")
  @scala.inline
  def ssh: typings.parseDashPath.parseDashPathStrings.ssh = this.cast("ssh")
}

