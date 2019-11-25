package typings.pgDashPromise.pgDashPromiseMod

import typings.pgDashPromise.typescriptPgDashSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Library's Initialization Options
// API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
trait IInitOptions[Ext, C /* <: IClient */] extends js.Object {
  var capSQL: js.UndefOr[Boolean] = js.undefined
  var connect: js.UndefOr[js.Function3[/* client */ C, /* dc */ js.Any, /* useCount */ Double, Unit]] = js.undefined
  var disconnect: js.UndefOr[js.Function2[/* client */ C, /* dc */ js.Any, Unit]] = js.undefined
  var error: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ IEventContext[C], Unit]] = js.undefined
  var extend: js.UndefOr[js.Function2[/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any, Unit]] = js.undefined
  var noLocking: js.UndefOr[Boolean] = js.undefined
  var noWarnings: js.UndefOr[Boolean] = js.undefined
  var pgFormatting: js.UndefOr[Boolean] = js.undefined
  var pgNative: js.UndefOr[Boolean] = js.undefined
  var promiseLib: js.UndefOr[js.Any] = js.undefined
  var query: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
  var receive: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C], Unit]
  ] = js.undefined
  var schema: js.UndefOr[ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema])] = js.undefined
  var task: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
  var transact: js.UndefOr[js.Function1[/* e */ IEventContext[C], Unit]] = js.undefined
}

object IInitOptions {
  @scala.inline
  def apply[Ext, C /* <: IClient */](
    capSQL: js.UndefOr[Boolean] = js.undefined,
    connect: (/* client */ C, /* dc */ js.Any, /* useCount */ Double) => Unit = null,
    disconnect: (/* client */ C, /* dc */ js.Any) => Unit = null,
    error: (/* err */ js.Any, /* e */ IEventContext[C]) => Unit = null,
    extend: (/* obj */ (IDatabase[Ext, C]) with Ext, /* dc */ js.Any) => Unit = null,
    noLocking: js.UndefOr[Boolean] = js.undefined,
    noWarnings: js.UndefOr[Boolean] = js.undefined,
    pgFormatting: js.UndefOr[Boolean] = js.undefined,
    pgNative: js.UndefOr[Boolean] = js.undefined,
    promiseLib: js.Any = null,
    query: /* e */ IEventContext[C] => Unit = null,
    receive: (/* data */ js.Array[_], /* result */ IResultExt, /* e */ IEventContext[C]) => Unit = null,
    schema: ValidSchema | (js.Function1[/* dc */ js.Any, ValidSchema]) = null,
    task: /* e */ IEventContext[C] => Unit = null,
    transact: /* e */ IEventContext[C] => Unit = null
  ): IInitOptions[Ext, C] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capSQL)) __obj.updateDynamic("capSQL")(capSQL.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction3(connect))
    if (disconnect != null) __obj.updateDynamic("disconnect")(js.Any.fromFunction2(disconnect))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (extend != null) __obj.updateDynamic("extend")(js.Any.fromFunction2(extend))
    if (!js.isUndefined(noLocking)) __obj.updateDynamic("noLocking")(noLocking.asInstanceOf[js.Any])
    if (!js.isUndefined(noWarnings)) __obj.updateDynamic("noWarnings")(noWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(pgFormatting)) __obj.updateDynamic("pgFormatting")(pgFormatting.asInstanceOf[js.Any])
    if (!js.isUndefined(pgNative)) __obj.updateDynamic("pgNative")(pgNative.asInstanceOf[js.Any])
    if (promiseLib != null) __obj.updateDynamic("promiseLib")(promiseLib.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (receive != null) __obj.updateDynamic("receive")(js.Any.fromFunction3(receive))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(js.Any.fromFunction1(task))
    if (transact != null) __obj.updateDynamic("transact")(js.Any.fromFunction1(transact))
    __obj.asInstanceOf[IInitOptions[Ext, C]]
  }
}

