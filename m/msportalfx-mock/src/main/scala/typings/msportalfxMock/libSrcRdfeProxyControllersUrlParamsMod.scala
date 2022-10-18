package typings.msportalfxMock

import typings.express.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcRdfeProxyControllersUrlParamsMod {
  
  object UrlParams {
    
    @JSImport("msportalfx-mock/lib/src/RdfeProxy/Controllers/urlParams", "UrlParams")
    @js.native
    val ^ : js.Any = js.native
    
    object Params {
      
      @JSImport("msportalfx-mock/lib/src/RdfeProxy/Controllers/urlParams", "UrlParams.Params")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("msportalfx-mock/lib/src/RdfeProxy/Controllers/urlParams", "UrlParams.Params.subscriptionId")
      @js.native
      def subscriptionId: String = js.native
      inline def subscriptionId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(x.asInstanceOf[js.Any])
      
      @JSImport("msportalfx-mock/lib/src/RdfeProxy/Controllers/urlParams", "UrlParams.Params.thumbprint")
      @js.native
      def thumbprint: String = js.native
      inline def thumbprint_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Initializes the url param validations.
      */
    inline def init(app: Express): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
