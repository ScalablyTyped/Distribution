package typings.atOracleOraclejet.ojmoduleDashElementMod

import typings.atOracleOraclejet.Anon_InsertNewView
import typings.atOracleOraclejet.Anon_IsInitial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleElementAnimation extends js.Object {
  def animate(context: Anon_InsertNewView): js.Promise[_]
  def canAnimate(context: Anon_IsInitial): Boolean
  def prepareAnimation(context: Anon_IsInitial): js.Object
}

object ModuleElementAnimation {
  @scala.inline
  def apply(
    animate: Anon_InsertNewView => js.Promise[_],
    canAnimate: Anon_IsInitial => Boolean,
    prepareAnimation: Anon_IsInitial => js.Object
  ): ModuleElementAnimation = {
    val __obj = js.Dynamic.literal(animate = js.Any.fromFunction1(animate), canAnimate = js.Any.fromFunction1(canAnimate), prepareAnimation = js.Any.fromFunction1(prepareAnimation))
  
    __obj.asInstanceOf[ModuleElementAnimation]
  }
}

