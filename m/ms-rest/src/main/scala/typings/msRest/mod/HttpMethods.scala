package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.msRest.msRestStrings.GET
  - typings.msRest.msRestStrings.PUT
  - typings.msRest.msRestStrings.POST
  - typings.msRest.msRestStrings.DELETE
  - typings.msRest.msRestStrings.PATCH
  - typings.msRest.msRestStrings.HEAD
  - typings.msRest.msRestStrings.OPTIONS
  - typings.msRest.msRestStrings.TRACE
*/
trait HttpMethods extends js.Object

object HttpMethods {
  @scala.inline
  def DELETE: typings.msRest.msRestStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.msRest.msRestStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.msRest.msRestStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.msRest.msRestStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.msRest.msRestStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.msRest.msRestStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.msRest.msRestStrings.PUT = this.cast("PUT")
  @scala.inline
  def TRACE: typings.msRest.msRestStrings.TRACE = this.cast("TRACE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

