package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.octokitRest.octokitRestStrings.DELETE
  - typings.octokitRest.octokitRestStrings.GET
  - typings.octokitRest.octokitRestStrings.HEAD
  - typings.octokitRest.octokitRestStrings.PATCH
  - typings.octokitRest.octokitRestStrings.POST
  - typings.octokitRest.octokitRestStrings.PUT
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  def DELETE: typings.octokitRest.octokitRestStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.octokitRest.octokitRestStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.octokitRest.octokitRestStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def PATCH: typings.octokitRest.octokitRestStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.octokitRest.octokitRestStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.octokitRest.octokitRestStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

