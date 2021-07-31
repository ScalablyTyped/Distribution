package typings.phaser.Phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScaleModes extends StObject
/**
  * Phaser Scale Modes.
  */
@JSGlobal("Phaser.ScaleModes")
@js.native
object ScaleModes extends StObject {
  
  /**
    * Default Scale Mode (Linear).
    */
  @js.native
  sealed trait DEFAULT
    extends StObject
       with ScaleModes
  
  /**
    * Linear Scale Mode.
    */
  @js.native
  sealed trait LINEAR
    extends StObject
       with ScaleModes
  
  /**
    * Nearest Scale Mode.
    */
  @js.native
  sealed trait NEAREST
    extends StObject
       with ScaleModes
}
