package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonState extends StObject
@JSImport("openseadragon", "ButtonState")
@js.native
object ButtonState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonState & Double] = js.native
  
  @js.native
  sealed trait DOWN
    extends StObject
       with ButtonState
  /* 3 */ val DOWN: typings.openseadragon.mod.ButtonState.DOWN & Double = js.native
  
  @js.native
  sealed trait GROUP
    extends StObject
       with ButtonState
  /* 1 */ val GROUP: typings.openseadragon.mod.ButtonState.GROUP & Double = js.native
  
  @js.native
  sealed trait HOVER
    extends StObject
       with ButtonState
  /* 2 */ val HOVER: typings.openseadragon.mod.ButtonState.HOVER & Double = js.native
  
  @js.native
  sealed trait REST
    extends StObject
       with ButtonState
  /* 0 */ val REST: typings.openseadragon.mod.ButtonState.REST & Double = js.native
}
