package typings
package pouchDashReduxDashMiddlewareLib.pouchDashReduxDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var actions: pouchDashReduxDashMiddlewareLib.Anon_Update
  var db: pouchdbDashCoreLib.PouchDBNs.Database[_]
  var docs: js.UndefOr[js.Any] = js.undefined
  var handleResponse: js.UndefOr[
    js.Function3[
      /* err */ nodeLib.Error, 
      /* data */ js.Any, 
      /* errorCallback */ js.Function1[/* err */ nodeLib.Error, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var path: java.lang.String
  var propagateDelete: js.UndefOr[
    js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit]
  ] = js.undefined
  var propagateInsert: js.UndefOr[
    js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit]
  ] = js.undefined
  var propagateUpdate: js.UndefOr[
    js.Function2[/* doc */ Document, /* dispatch */ reduxLib.reduxMod.Dispatch[_], scala.Unit]
  ] = js.undefined
  var queue: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var scheduleInset: js.UndefOr[js.Function1[/* doc */ Document, scala.Unit]] = js.undefined
  var scheduleRemove: js.UndefOr[js.Function1[/* doc */ Document, scala.Unit]] = js.undefined
}

