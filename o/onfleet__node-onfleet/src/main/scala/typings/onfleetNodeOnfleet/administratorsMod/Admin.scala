package typings.onfleetNodeOnfleet.administratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Admin extends js.Object {
  def create(obj: CreateAdminProps): js.Promise[OnfleetAdmin]
  def deleteOne(id: String): js.Promise[Unit]
  def get(): js.Promise[js.Array[OnfleetAdmin]]
  def update(id: String, obj: UpdateAdminProps): js.Promise[OnfleetAdmin]
}

object Admin {
  @scala.inline
  def apply(
    create: CreateAdminProps => js.Promise[OnfleetAdmin],
    deleteOne: String => js.Promise[Unit],
    get: () => js.Promise[js.Array[OnfleetAdmin]],
    update: (String, UpdateAdminProps) => js.Promise[OnfleetAdmin]
  ): Admin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = js.Any.fromFunction0(get), update = js.Any.fromFunction2(update))
  
    __obj.asInstanceOf[Admin]
  }
}

