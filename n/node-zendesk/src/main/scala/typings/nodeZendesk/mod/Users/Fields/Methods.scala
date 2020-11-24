package typings.nodeZendesk.mod.Users.Fields

import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends js.Object {
  
  def create(field: CreateUserField): js.Promise[_] = js.native
  def create(field: CreateUserField, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def delete(fieldId: ZendeskID): js.Promise[_] = js.native
  def delete(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def list(): js.Promise[_] = js.native
  def list(cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def show(fieldId: ZendeskID): js.Promise[_] = js.native
  def show(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def update(fieldId: ZendeskID, field: js.Any): js.Promise[_] = js.native
  def update(fieldId: ZendeskID, field: js.Any, cb: ZendeskCallback[_, _]): js.Any = js.native
}
