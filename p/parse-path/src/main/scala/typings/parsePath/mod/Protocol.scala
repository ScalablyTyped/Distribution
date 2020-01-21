package typings.parsePath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parsePath.parsePathStrings.http
  - typings.parsePath.parsePathStrings.https
  - typings.parsePath.parsePathStrings.ssh
  - typings.parsePath.parsePathStrings.file
  - typings.parsePath.parsePathStrings.git
*/
trait Protocol extends js.Object

object Protocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def file: typings.parsePath.parsePathStrings.file = this.cast("file")
  @scala.inline
  def git: typings.parsePath.parsePathStrings.git = this.cast("git")
  @scala.inline
  def http: typings.parsePath.parsePathStrings.http = this.cast("http")
  @scala.inline
  def https: typings.parsePath.parsePathStrings.https = this.cast("https")
  @scala.inline
  def ssh: typings.parsePath.parsePathStrings.ssh = this.cast("ssh")
}

