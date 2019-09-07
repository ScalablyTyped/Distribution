package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.AnimationComponentSystem
  * @classdesc The AnimationComponentSystem manages creating and deleting AnimationComponents
  * @description Create an AnimationComponentSystem
  * @param {pc.Application} app The application managing this system.
  * @extends pc.ComponentSystem
  */
@JSImport("playcanvas", "AnimationComponentSystem")
@js.native
class AnimationComponentSystem protected ()
  extends typings.playcanvas.pcNs.AnimationComponentSystem {
  def this(app: typings.playcanvas.pcNs.Application) = this()
}

