package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object armModelMod {
  
  object ResourceLockState {
    
    @JSImport("msportalfx-mock/lib/src/ArmProxy/Models/armModel", "ResourceLockState")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Locked resource group.
      */
    @JSImport("msportalfx-mock/lib/src/ArmProxy/Models/armModel", "ResourceLockState.Locked")
    @js.native
    def Locked: String = js.native
    inline def Locked_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locked")(x.asInstanceOf[js.Any])
    
    /**
      * Unlocked resource group.
      */
    @JSImport("msportalfx-mock/lib/src/ArmProxy/Models/armModel", "ResourceLockState.Unlocked")
    @js.native
    def Unlocked: String = js.native
    inline def Unlocked_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unlocked")(x.asInstanceOf[js.Any])
  }
}
