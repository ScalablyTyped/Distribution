package typings.oracleOraclejet.ojmoduleElementMod

import typings.oracleOraclejet.anon.InsertNewView
import typings.oracleOraclejet.anon.IsInitial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleElementAnimation extends js.Object {
  def animate(context: InsertNewView): js.Promise[_]
  def canAnimate(context: IsInitial): Boolean
  def prepareAnimation(context: IsInitial): js.Object
}

object ModuleElementAnimation {
  @scala.inline
  def apply(
    animate: InsertNewView => js.Promise[_],
    canAnimate: IsInitial => Boolean,
    prepareAnimation: IsInitial => js.Object
  ): ModuleElementAnimation = {
    val __obj = js.Dynamic.literal(animate = js.Any.fromFunction1(animate), canAnimate = js.Any.fromFunction1(canAnimate), prepareAnimation = js.Any.fromFunction1(prepareAnimation))
    __obj.asInstanceOf[ModuleElementAnimation]
  }
}

