package typings.mobileMessagingCordova.MobileMessagingCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultMessageStorage extends js.Object {
  def delete(messageId: String, callback: js.Function0[Unit]): Unit
  def deleteAll(callback: js.Function0[Unit]): Unit
  def find(messageId: String, callback: js.Function1[/* message */ Message, Unit]): Unit
  def findAll(callback: js.Function1[/* messages */ js.Array[Message], Unit]): Unit
}

object DefaultMessageStorage {
  @scala.inline
  def apply(
    delete: (String, js.Function0[Unit]) => Unit,
    deleteAll: js.Function0[Unit] => Unit,
    find: (String, js.Function1[/* message */ Message, Unit]) => Unit,
    findAll: js.Function1[/* messages */ js.Array[Message], Unit] => Unit
  ): DefaultMessageStorage = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction2(delete), deleteAll = js.Any.fromFunction1(deleteAll), find = js.Any.fromFunction2(find), findAll = js.Any.fromFunction1(findAll))
  
    __obj.asInstanceOf[DefaultMessageStorage]
  }
}

