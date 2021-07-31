package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PositionMode extends StObject
@JSGlobal("PIXI.spine.core.PositionMode")
@js.native
object PositionMode extends StObject {
  
  @js.native
  sealed trait Fixed
    extends StObject
       with PositionMode
  
  @js.native
  sealed trait Percent
    extends StObject
       with PositionMode
}
