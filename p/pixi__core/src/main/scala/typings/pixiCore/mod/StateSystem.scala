package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "StateSystem")
@js.native
open class StateSystem ()
  extends typings.pixiCore.libSystemsMod.StateSystem
/* static members */
object StateSystem {
  
  @JSImport("@pixi/core", "StateSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A private little wrapper function that we call to check the blend mode.
    * @param system - the System to perform the state check on
    * @param state - the state that the blendMode will pulled from
    */
  @JSImport("@pixi/core", "StateSystem.checkBlendMode")
  @js.native
  def checkBlendMode: Any = js.native
  inline def checkBlendMode_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkBlendMode")(x.asInstanceOf[js.Any])
  
  /**
    * A private little wrapper function that we call to check the polygon offset.
    * @param system - the System to perform the state check on
    * @param state - the state that the blendMode will pulled from
    */
  @JSImport("@pixi/core", "StateSystem.checkPolygonOffset")
  @js.native
  def checkPolygonOffset: Any = js.native
  inline def checkPolygonOffset_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkPolygonOffset")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core", "StateSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
