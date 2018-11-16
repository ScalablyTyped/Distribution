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

