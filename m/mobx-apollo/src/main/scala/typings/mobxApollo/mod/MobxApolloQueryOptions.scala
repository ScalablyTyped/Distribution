package typings.mobxApollo.mod

import typings.apolloClient.mod.ApolloClient
import typings.apolloClient.mod.ApolloError
import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typings.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typings.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typings.graphql.astMod.DocumentNode
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
    pollInterval: js.UndefOr[Double] = js.undefined,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    variables: OperationVariables = null
  ): MobxApolloQueryOptions[T] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (errorPolicy != null) __obj.updateDynamic("errorPolicy")(errorPolicy.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchResults)) __obj.updateDynamic("fetchResults")(fetchResults.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(notifyOnNetworkStatusChange)) __obj.updateDynamic("notifyOnNetworkStatusChange")(notifyOnNetworkStatusChange.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFetch != null) __obj.updateDynamic("onFetch")(js.Any.fromFunction1(onFetch))
    if (!js.isUndefined(pollInterval)) __obj.updateDynamic("pollInterval")(pollInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData.get.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobxApolloQueryOptions[T]]
  }
}

