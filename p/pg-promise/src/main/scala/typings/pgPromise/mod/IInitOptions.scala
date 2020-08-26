package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Library's Initialization Options
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
@js.native
trait IInitOptions[Ext, C /* <: IClient */] extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.native
  var connect: js.UndefOr[js.Function3[/* client */ C, /* dc */ js.Any, /* useCount */ Double, Unit]] = js.native
  var disconnect: js.UndefOr[js.Function2[/* client */ C, /* dc */ js.Any, Unit]] = js.native
  var error: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ IEventContext[C], Unit]] = js.native
  var extend: js.UndefOr[js.Function2[/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any, Unit]] = js.native
  var noLocking: js.UndefOr[Boolean] = js.native
  var noWarnings: js.UndefOr[Boolean] = js.native
  var pgFormatting: js.UndefOr[Boolean] = js.native
  var pgNative: js.UndefOr[Boolean] = js.native
  var promiseLib: js.UndefOr[js.Any] = js.native
  var query: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
  var receive: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C], Unit]
  ] = js.native
  var schema: js.UndefOr[ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema])] = js.native
  var task: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
  var transact: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.native
}

object IInitOptions {
  @scala.inline
  def apply[Ext, /* <: typings.pgPromise.pgSubsetMod.IClient */ C](): IInitOptions[Ext, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitOptions[Ext, C]]
  }
  @scala.inline
  implicit class IInitOptionsOps[Self <: IInitOptions[_, _], Ext, /* <: typings.pgPromise.pgSubsetMod.IClient */ C] (val x: Self with (IInitOptions[Ext, C])) extends AnyVal {
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
    def setCapSQL(value: Boolean): Self = this.set("capSQL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapSQL: Self = this.set("capSQL", js.undefined)
    @scala.inline
    def setConnect(value: (/* client */ C, /* dc */ js.Any, /* useCount */ Double) => Unit): Self = this.set("connect", js.Any.fromFunction3(value))
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setDisconnect(value: (/* client */ C, /* dc */ js.Any) => Unit): Self = this.set("disconnect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDisconnect: Self = this.set("disconnect", js.undefined)
    @scala.inline
    def setError(value: (/* err */ js.Any, /* e */ IEventContext[C]) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExtend(value: (/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any) => Unit): Self = this.set("extend", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    @scala.inline
    def setNoLocking(value: Boolean): Self = this.set("noLocking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoLocking: Self = this.set("noLocking", js.undefined)
    @scala.inline
    def setNoWarnings(value: Boolean): Self = this.set("noWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWarnings: Self = this.set("noWarnings", js.undefined)
    @scala.inline
    def setPgFormatting(value: Boolean): Self = this.set("pgFormatting", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePgFormatting: Self = this.set("pgFormatting", js.undefined)
    @scala.inline
    def setPgNative(value: Boolean): Self = this.set("pgNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePgNative: Self = this.set("pgNative", js.undefined)
    @scala.inline
    def setPromiseLib(value: js.Any): Self = this.set("promiseLib", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseLib: Self = this.set("promiseLib", js.undefined)
    @scala.inline
    def setQuery(value: /* e */ IEventContext[C] => Unit): Self = this.set("query", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReceive(value: (/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C]) => Unit): Self = this.set("receive", js.Any.fromFunction3(value))
    @scala.inline
    def deleteReceive: Self = this.set("receive", js.undefined)
    @scala.inline
    def setSchemaVarargs(value: String*): Self = this.set("schema", js.Array(value :_*))
    @scala.inline
    def setSchemaFunction1(value: /* dc */ js.Any => ValidSchema): Self = this.set("schema", js.Any.fromFunction1(value))
    @scala.inline
    def setSchema(value: ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema])): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSchemaNull: Self = this.set("schema", null)
    @scala.inline
    def setTask(value: /* e */ IEventContext[C] => Unit): Self = this.set("task", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
    @scala.inline
    def setTransact(value: /* e */ IEventContext[C] => Unit): Self = this.set("transact", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransact: Self = this.set("transact", js.undefined)
  }
  
}

