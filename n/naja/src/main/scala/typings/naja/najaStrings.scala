package typings.naja

import typings.naja.mod.RequestMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object najaStrings {
  @js.native
  sealed trait DELETE extends RequestMethod
  
  @js.native
  sealed trait GET extends RequestMethod
  
  @js.native
  sealed trait PATCH extends RequestMethod
  
  @js.native
  sealed trait POST extends RequestMethod
  
  @js.native
  sealed trait PUT extends RequestMethod
  
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait afterUpdate extends js.Object
  
  @js.native
  sealed trait before extends js.Object
  
  @js.native
  sealed trait beforeUpdate extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait init extends js.Object
  
  @js.native
  sealed trait interaction extends js.Object
  
  @js.native
  sealed trait load extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def afterUpdate: afterUpdate = "afterUpdate".asInstanceOf[afterUpdate]
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  @scala.inline
  def beforeUpdate: beforeUpdate = "beforeUpdate".asInstanceOf[beforeUpdate]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def init: init = "init".asInstanceOf[init]
  @scala.inline
  def interaction: interaction = "interaction".asInstanceOf[interaction]
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

