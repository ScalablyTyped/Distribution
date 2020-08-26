package typings.mongration.mod

import typings.mongodb.mod.Db
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationStep extends js.Object {
  var down: js.UndefOr[
    js.Function2[/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[Error], Unit], Unit]
  ] = js.native
  var id: String = js.native
  def up(db: Db, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
}

object MigrationStep {
  @scala.inline
  def apply(id: String, up: (Db, js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit): MigrationStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], up = js.Any.fromFunction2(up))
    __obj.asInstanceOf[MigrationStep]
  }
  @scala.inline
  implicit class MigrationStepOps[Self <: MigrationStep] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUp(value: (Db, js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit): Self = this.set("up", js.Any.fromFunction2(value))
    @scala.inline
    def setDown(value: (/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[Error], Unit]) => Unit): Self = this.set("down", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
  }
  
}

