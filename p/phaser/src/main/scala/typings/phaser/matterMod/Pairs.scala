package typings.phaser.matterMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Pairs` module contains methods for creating and manipulating collision pair sets.
  *
  * @class Pairs
  */
@JSImport("matter", "Pairs")
@js.native
open class Pairs ()
  extends StObject
     with typings.phaser.MatterJS.Pairs
object Pairs {
  
  @JSImport("matter", "Pairs")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the given pairs structure.
    * @method clear
    * @param {pairs} pairs
    * @return {pairs} pairs
    */
  /* static member */
  inline def clear(pairs: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(pairs.asInstanceOf[js.Any]).asInstanceOf[Any]
}
