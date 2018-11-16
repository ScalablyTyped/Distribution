package typings
package mobxDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobxDashReactMod {
  type IReactComponent[P] = reactLib.reactMod.ReactNs.StatelessComponent[P] | (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.ClassicComponentClass[P]
  type IStoresToProps[S /* <: IValueMap */, P /* <: IValueMap */, I /* <: IValueMap */, C /* <: IValueMap */] = js.Function3[/* stores */ S, /* nextProps */ P, /* context */ C, I]
}
