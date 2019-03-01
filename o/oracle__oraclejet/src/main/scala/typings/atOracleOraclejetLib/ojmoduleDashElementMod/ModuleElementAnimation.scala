package typings
package atOracleOraclejetLib.ojmoduleDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleElementAnimation extends js.Object {
  def animate(context: atOracleOraclejetLib.Anon_InsertNewView): js.Promise[_]
  def canAnimate(context: atOracleOraclejetLib.Anon_IsInitial): scala.Boolean
  def prepareAnimation(context: atOracleOraclejetLib.Anon_IsInitial): js.Object
}

object ModuleElementAnimation {
  @scala.inline
  def apply(
    animate: js.Function1[atOracleOraclejetLib.Anon_InsertNewView, js.Promise[_]],
    canAnimate: js.Function1[atOracleOraclejetLib.Anon_IsInitial, scala.Boolean],
    prepareAnimation: js.Function1[atOracleOraclejetLib.Anon_IsInitial, js.Object]
  ): ModuleElementAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animate")(animate)
    __obj.updateDynamic("canAnimate")(canAnimate)
    __obj.updateDynamic("prepareAnimation")(prepareAnimation)
    __obj.asInstanceOf[ModuleElementAnimation]
  }
}

