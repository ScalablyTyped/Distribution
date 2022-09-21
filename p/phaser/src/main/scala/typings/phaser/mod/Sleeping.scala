package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Sleeping` module contains methods to manage the sleeping state of bodies.
  *
  * @class Sleeping
  */
@JSImport("matter", "Sleeping")
@js.native
open class Sleeping ()
  extends StObject
     with typings.phaser.MatterJS.Sleeping
object Sleeping {
  
  @JSImport("matter", "Sleeping")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def set(body: BodyType, isSleeping: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], isSleeping.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
