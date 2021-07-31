package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpacingMode extends StObject
@JSGlobal("spine.SpacingMode")
@js.native
object SpacingMode extends StObject {
  
  @js.native
  sealed trait Fixed
    extends StObject
       with SpacingMode
  
  @js.native
  sealed trait Length
    extends StObject
       with SpacingMode
  
  @js.native
  sealed trait Percent
    extends StObject
       with SpacingMode
}
