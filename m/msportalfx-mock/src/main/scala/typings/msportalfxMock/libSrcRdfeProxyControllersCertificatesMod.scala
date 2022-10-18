package typings.msportalfxMock

import typings.express.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcRdfeProxyControllersCertificatesMod {
  
  object Certificates {
    
    @JSImport("msportalfx-mock/lib/src/RdfeProxy/Controllers/Certificates", "Certificates")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initializes the routes.
      *
      * @param app The express app.
      */
    inline def init(app: Express): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
