package typings.onfleetNodeOnfleet.administratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Admin extends js.Object {
  def create(obj: CreateAdminProps): js.Promise[OnfleetAdmin] = js.native
  def deleteOne(id: String): js.Promise[Unit] = js.native
  def get(): js.Promise[js.Array[OnfleetAdmin]] = js.native
  def update(id: String, obj: UpdateAdminProps): js.Promise[OnfleetAdmin] = js.native
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
  @scala.inline
  implicit class AdminOps[Self <: Admin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: CreateAdminProps => js.Promise[OnfleetAdmin]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteOne(value: String => js.Promise[Unit]): Self = this.set("deleteOne", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: () => js.Promise[js.Array[OnfleetAdmin]]): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: (String, UpdateAdminProps) => js.Promise[OnfleetAdmin]): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

