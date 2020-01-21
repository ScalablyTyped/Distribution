package typings.msRest

import typings.msRest.mod.HttpMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object msRestStrings {
  @js.native
  sealed trait DELETE extends HttpMethods
  
  @js.native
  sealed trait GET extends HttpMethods
  
  @js.native
  sealed trait HEAD extends HttpMethods
  
  @js.native
  sealed trait OPTIONS extends HttpMethods
  
  @js.native
  sealed trait PATCH extends HttpMethods
  
  @js.native
  sealed trait POST extends HttpMethods
  
  @js.native
  sealed trait PUT extends HttpMethods
  
  @js.native
  sealed trait TRACE extends HttpMethods
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
}

