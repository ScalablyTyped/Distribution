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

object MobxApolloQueryOptions {
  @scala.inline
  def apply[T](
    client: apolloDashClientLib.apolloDashClientMod.ApolloClient[_],
    query: graphqlLib.languageAstMod.DocumentNode,
    context: js.Any = null,
    errorPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy = null,
    fetchPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy = null,
    fetchResults: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: js.Any = null,
    notifyOnNetworkStatusChange: js.UndefOr[scala.Boolean] = js.undefined,
    onError: /* error */ apolloDashClientLib.apolloDashClientMod.ApolloError => scala.Unit = null,
    onFetch: /* result */ T => scala.Unit = null,
    pollInterval: scala.Int | scala.Double = null,
    variables: apolloDashClientLib.coreTypesMod.OperationVariables = null
  ): MobxApolloQueryOptions[T] = {
    val __obj = js.Dynamic.literal(client = client, query = query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFetch != null) __obj.updateDynamic("onFetch")(js.Any.fromFunction1(onFetch))
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[MobxApolloQueryOptions[T]]
  }
}

