package typings.oracleOraclejet.ojmoduleElementMod

import typings.oracleOraclejet.AnonInsertNewView
import typings.oracleOraclejet.AnonIsInitial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleElementAnimation extends js.Object {
  def animate(context: AnonInsertNewView): js.Promise[_]
  def canAnimate(context: AnonIsInitial): Boolean
  def prepareAnimation(context: AnonIsInitial): js.Object
}

object ModuleElementAnimation {
  @scala.inline
  def apply(
    animate: AnonInsertNewView => js.Promise[_],
    canAnimate: AnonIsInitial => Boolean,
    prepareAnimation: AnonIsInitial => js.Object
  ): ModuleElementAnimation = {
    val __obj = js.Dynamic.literal(animate = js.Any.fromFunction1(animate), canAnimate = js.Any.fromFunction1(canAnimate), prepareAnimation = js.Any.fromFunction1(prepareAnimation))
    __obj.asInstanceOf[ModuleElementAnimation]
  }
}

