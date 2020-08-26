package typings.mobxApollo.mod

import typings.apolloClient.mod.ApolloError
import typings.apolloClient.mod.ObservableQuery
import typings.apolloClient.typesMod.OperationVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobxApolloQuery[T] extends js.Object {
  var data: js.UndefOr[T] = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
  var ref: ObservableQuery[T, OperationVariables] = js.native
}

object MobxApolloQuery {
  @scala.inline
  def apply[T](loading: Boolean, ref: ObservableQuery[T, OperationVariables]): MobxApolloQuery[T] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobxApolloQuery[T]]
  }
  @scala.inline
  implicit class MobxApolloQueryOps[Self <: MobxApolloQuery[_], T] (val x: Self with MobxApolloQuery[T]) extends AnyVal {
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: ObservableQuery[T, OperationVariables]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: ApolloError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

