package typings
package mobxDashApolloLib.mobxDashApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobxApolloQuery[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: js.UndefOr[apolloDashClientLib.apolloDashClientMod.ApolloError] = js.undefined
  var loading: scala.Boolean
  var ref: apolloDashClientLib.apolloDashClientMod.ObservableQuery[T, apolloDashClientLib.coreTypesMod.OperationVariables]
}

object MobxApolloQuery {
  @scala.inline
  def apply[T](
    loading: scala.Boolean,
    ref: apolloDashClientLib.apolloDashClientMod.ObservableQuery[T, apolloDashClientLib.coreTypesMod.OperationVariables],
    data: T = null,
    error: apolloDashClientLib.apolloDashClientMod.ApolloError = null
  ): MobxApolloQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("ref")(ref)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MobxApolloQuery[T]]
  }
}

