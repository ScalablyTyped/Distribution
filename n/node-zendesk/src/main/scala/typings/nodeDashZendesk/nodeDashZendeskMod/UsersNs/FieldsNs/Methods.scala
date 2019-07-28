package typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.FieldsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def create(field: js.Any, cb: ZendeskCallback[_, _]): js.Any
  def delete(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  def list(cb: ZendeskCallback[_, _]): js.Any
  def show(fieldId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  def update(fieldId: ZendeskID, field: js.Any, cb: ZendeskCallback[_, _]): js.Any
}

object Methods {
  @scala.inline
  def apply(
    create: (js.Any, ZendeskCallback[_, _]) => js.Any,
    delete: (ZendeskID, ZendeskCallback[_, _]) => js.Any,
    list: ZendeskCallback[_, _] => js.Any,
    show: (ZendeskID, ZendeskCallback[_, _]) => js.Any,
    update: (ZendeskID, js.Any, ZendeskCallback[_, _]) => js.Any
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), list = js.Any.fromFunction1(list), show = js.Any.fromFunction2(show), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[Methods]
  }
}

