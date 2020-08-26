package typings.mobxApollo.mod

import typings.apolloClient.mod.ApolloClient
import typings.apolloClient.mod.ApolloError
import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.watchQueryOptionsMod.WatchQueryOptions
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobxApolloQueryOptions[T] extends WatchQueryOptions[OperationVariables] {
  var client: ApolloClient[_] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.native
  var onFetch: js.UndefOr[js.Function1[/* result */ T, Unit]] = js.native
}

object MobxApolloQueryOptions {
  @scala.inline
  def apply[T](client: ApolloClient[_], query: DocumentNode): MobxApolloQueryOptions[T] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobxApolloQueryOptions[T]]
  }
  @scala.inline
  implicit class MobxApolloQueryOptionsOps[Self <: MobxApolloQueryOptions[_], T] (val x: Self with MobxApolloQueryOptions[T]) extends AnyVal {
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
    def setClient(value: ApolloClient[_]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnError(value: /* error */ ApolloError => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnFetch(value: /* result */ T => Unit): Self = this.set("onFetch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFetch: Self = this.set("onFetch", js.undefined)
  }
  
}

