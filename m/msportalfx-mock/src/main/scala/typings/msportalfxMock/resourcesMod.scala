package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesMod {
  
  object Resources {
    
    @JSImport("msportalfx-mock/lib/src/ArmProxy/Controllers/resources", "Resources")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initializes the routes.
      *
      * @param app The express app.
      */
    inline def init(app: typings.msportalfxMock.mod.Express): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
