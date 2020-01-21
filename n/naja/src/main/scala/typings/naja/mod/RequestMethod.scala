package typings.naja.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.naja.najaStrings.GET
  - typings.naja.najaStrings.POST
  - typings.naja.najaStrings.PUT
  - typings.naja.najaStrings.PATCH
  - typings.naja.najaStrings.DELETE
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  def DELETE: typings.naja.najaStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.naja.najaStrings.GET = this.cast("GET")
  @scala.inline
  def PATCH: typings.naja.najaStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.naja.najaStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.naja.najaStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

