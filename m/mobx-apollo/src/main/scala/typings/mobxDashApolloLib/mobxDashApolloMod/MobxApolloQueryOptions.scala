package typings
package mobxDashApolloLib.mobxDashApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobxApolloQueryOptions[T]
  extends apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryOptions[apolloDashClientLib.coreTypesMod.OperationVariables] {
  var client: apolloDashClientLib.apolloDashClientMod.ApolloClient[_]
  var onError: js.UndefOr[
    js.Function1[/* error */ apolloDashClientLib.apolloDashClientMod.ApolloError, scala.Unit]
  ] = js.undefined
  var onFetch: js.UndefOr[js.Function1[/* result */ T, scala.Unit]] = js.undefined
}

