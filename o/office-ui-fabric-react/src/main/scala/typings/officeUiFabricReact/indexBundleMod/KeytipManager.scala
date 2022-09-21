package typings.officeUiFabricReact.indexBundleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "KeytipManager")
@js.native
open class KeytipManager ()
  extends typings.officeUiFabricReact.mod.KeytipManager
/* static members */
object KeytipManager {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "KeytipManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "KeytipManager._instance")
  @js.native
  def _instance: Any = js.native
  inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
  
  /**
    * Static function to get singleton KeytipManager instance
    *
    * @returns Singleton KeytipManager instance
    */
  inline def getInstance(): typings.officeUiFabricReact.keytipManagerMod.KeytipManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.officeUiFabricReact.keytipManagerMod.KeytipManager]
}
