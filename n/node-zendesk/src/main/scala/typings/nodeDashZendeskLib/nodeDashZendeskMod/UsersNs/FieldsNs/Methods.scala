package typings
package nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.FieldsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def create(field: js.Any, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): js.Any
  def delete(
    fieldId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  def list(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): js.Any
  def show(
    fieldId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  def update(
    fieldId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    field: js.Any,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
}

object Methods {
  @scala.inline
  def apply(
    create: (js.Any, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    delete: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    list: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => js.Any,
    show: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    update: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, js.Any, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), list = js.Any.fromFunction1(list), show = js.Any.fromFunction2(show), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[Methods]
  }
}

