package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Sleeping` module contains methods to manage the sleeping state of bodies.
  *
  * @class Sleeping
  */
@JSImport("matter", "Sleeping")
@js.native
class Sleeping ()
  extends typings.phaser.MatterJS.Sleeping
object Sleeping {
  
  /* static member */
  @JSImport("matter", "Sleeping.set")
  @js.native
  def set(body: BodyType, isSleeping: Boolean): Unit = js.native
}
