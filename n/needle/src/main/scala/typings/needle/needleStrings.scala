package typings.needle

import typings.needle.mod.core.NeedleHttpVerbs
import typings.needle.mod.core.NeedleReadWriteHttpVerbs
import typings.needle.mod.core.NeedleReadonlyHttpVerbs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object needleStrings {
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @scala.inline
  def digest: digest = "digest".asInstanceOf[digest]
  
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  
  @scala.inline
  def head: head = "head".asInstanceOf[head]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait basic extends js.Object
  
  @js.native
  sealed trait delete
    extends NeedleHttpVerbs
       with NeedleReadWriteHttpVerbs
  
  @js.native
  sealed trait digest extends js.Object
  
  @js.native
  sealed trait get
    extends NeedleHttpVerbs
       with NeedleReadonlyHttpVerbs
  
  @js.native
  sealed trait head
    extends NeedleHttpVerbs
       with NeedleReadonlyHttpVerbs
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait patch
    extends NeedleHttpVerbs
       with NeedleReadWriteHttpVerbs
  
  @js.native
  sealed trait post
    extends NeedleHttpVerbs
       with NeedleReadWriteHttpVerbs
  
  @js.native
  sealed trait put
    extends NeedleHttpVerbs
       with NeedleReadWriteHttpVerbs
  
  @js.native
  sealed trait xml extends js.Object
}
