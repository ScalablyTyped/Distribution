package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlParamsMod {
  
  object UrlParams {
    
    @JSImport("msportalfx-mock/lib/src/ArmProxy/Controllers/urlParams", "UrlParams")
    @js.native
    val ^ : js.Any = js.native
    
    object Params {
      
      @JSImport("msportalfx-mock/lib/src/ArmProxy/Controllers/urlParams", "UrlParams.Params")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("msportalfx-mock/lib/src/ArmProxy/Controllers/urlParams", "UrlParams.Params.resourceGroupId")
      @js.native
      def resourceGroupId: String = js.native
      @scala.inline
      def resourceGroupId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resourceGroupId")(x.asInstanceOf[js.Any])
      
      @JSImport("msportalfx-mock/lib/src/ArmProxy/Controllers/urlParams", "UrlParams.Params.subscriptionId")
      @js.native
      def subscriptionId: String = js.native
      @scala.inline
      def subscriptionId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Initializes the url param validations.
      */
    @scala.inline
    def init(app: typings.msportalfxMock.mod.Express): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
