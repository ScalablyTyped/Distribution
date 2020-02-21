package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.AnimationComponentSystem
  * @augments pc.ComponentSystem
  * @classdesc The AnimationComponentSystem manages creating and deleting AnimationComponents.
  * @description Create an AnimationComponentSystem.
  * @param {pc.Application} app - The application managing this system.
  */
@JSImport("playcanvas", "AnimationComponentSystem")
@js.native
class AnimationComponentSystem protected ()
  extends typings.playcanvas.pc.AnimationComponentSystem {
  def this(app: typings.playcanvas.pc.Application) = this()
}

