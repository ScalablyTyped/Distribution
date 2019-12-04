package typings.nextDashServer.distLibLoadableMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoadable extends js.Object {
  def apply[P](opts: js.Any): ComponentClass[P, ComponentState] = js.native
  def Map[P](opts: js.Any): ComponentType[P] = js.native
  def preloadAll(): js.Promise[_] = js.native
}

