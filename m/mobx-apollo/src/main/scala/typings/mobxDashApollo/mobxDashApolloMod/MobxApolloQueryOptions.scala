package typings.mobxDashApollo.mobxDashApolloMod

import typings.apolloDashClient.apolloDashClientMod.ApolloClient
import typings.apolloDashClient.apolloDashClientMod.ApolloError
import typings.apolloDashClient.coreTypesMod.OperationVariables
import typings.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
import typings.apolloDashClient.coreWatchQueryOptionsMod.WatchQueryOptions
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobxApolloQueryOptions[T] extends WatchQueryOptions[OperationVariables] {
  var client: ApolloClient[_]
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.undefined
  var onFetch: js.UndefOr[js.Function1[/* result */ T, Unit]] = js.undefined
}

object MobxApolloQueryOptions {
  @scala.inline
  def apply[T](
    client: ApolloClient[_],
    query: DocumentNode,
    context: js.Any = null,
    errorPolicy: ErrorPolicy = null,
    fetchPolicy: WatchQueryFetchPolicy = null,
    fetchResults: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Any = null,
    notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.undefined,
    onError: /* error */ ApolloError => Unit = null,
    onFetch: /* result */ T => Unit = null,
    pollInterval: Int | Double = null,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    variables: OperationVariables = null
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
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[MobxApolloQueryOptions[T]]
  }
}

