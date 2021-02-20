package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PositionMode extends StObject
@JSGlobal("spine.PositionMode")
@js.native
object PositionMode extends StObject {
  
  @js.native
  sealed trait Fixed extends PositionMode
  
  @js.native
  sealed trait Percent extends PositionMode
}
