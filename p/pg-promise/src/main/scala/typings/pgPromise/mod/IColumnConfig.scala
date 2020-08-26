package typings.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnConfig[S] extends js.Object {
  var cast: js.UndefOr[String] = js.native
  var cnd: js.UndefOr[Boolean] = js.native
  var `def`: js.UndefOr[js.Any] = js.native
  var init: js.UndefOr[js.Function1[/* col */ IColumnDescriptor[S], _]] = js.native
  var mod: js.UndefOr[FormattingFilter] = js.native
  var name: String = js.native
  var prop: js.UndefOr[String] = js.native
  var skip: js.UndefOr[js.Function1[/* col */ IColumnDescriptor[S], Boolean]] = js.native
}

object IColumnConfig {
  @scala.inline
  def apply[S](name: String): IColumnConfig[S] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnConfig[S]]
  }
  @scala.inline
  implicit class IColumnConfigOps[Self <: IColumnConfig[_], S] (val x: Self with IColumnConfig[S]) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCast(value: String): Self = this.set("cast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCast: Self = this.set("cast", js.undefined)
    @scala.inline
    def setCnd(value: Boolean): Self = this.set("cnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCnd: Self = this.set("cnd", js.undefined)
    @scala.inline
    def setDef(value: js.Any): Self = this.set("def", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDef: Self = this.set("def", js.undefined)
    @scala.inline
    def setInit(value: /* col */ IColumnDescriptor[S] => _): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setMod(value: FormattingFilter): Self = this.set("mod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMod: Self = this.set("mod", js.undefined)
    @scala.inline
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProp: Self = this.set("prop", js.undefined)
    @scala.inline
    def setSkip(value: /* col */ IColumnDescriptor[S] => Boolean): Self = this.set("skip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
  
}

