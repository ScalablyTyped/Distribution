package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Sleeping` module contains methods to manage the sleeping state of bodies.
  *
  * @class Sleeping
  */
@JSGlobal("MatterJS.Sleeping")
@js.native
class Sleeping ()
  extends typings.phaser.MatterJS.Sleeping
/* static members */
@JSGlobal("MatterJS.Sleeping")
@js.native
object Sleeping extends js.Object {
  
  def set(body: BodyType, isSleeping: Boolean): Unit = js.native
}
