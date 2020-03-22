package typings.overloadProtection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.overloadProtection.overloadProtectionStrings.express
  - typings.overloadProtection.overloadProtectionStrings.http
  - typings.overloadProtection.overloadProtectionStrings.restify
*/
trait HttpFrameworkSelection extends js.Object

object HttpFrameworkSelection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def express: typings.overloadProtection.overloadProtectionStrings.express = this.cast("express")
  @scala.inline
  def http: typings.overloadProtection.overloadProtectionStrings.http = this.cast("http")
  @scala.inline
  def restify: typings.overloadProtection.overloadProtectionStrings.restify = this.cast("restify")
}

