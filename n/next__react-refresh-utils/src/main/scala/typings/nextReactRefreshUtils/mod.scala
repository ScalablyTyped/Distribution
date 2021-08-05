package typings.nextReactRefreshUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@next/react-refresh-utils/internal/helpers", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@next/react-refresh-utils/internal/helpers", "default.getRefreshBoundarySignature")
    @js.native
    def getRefreshBoundarySignature: js.Function1[/* moduleExports */ js.Any, js.Array[js.Any]] = js.native
    inline def getRefreshBoundarySignature(moduleExports: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefreshBoundarySignature")(moduleExports.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
    inline def getRefreshBoundarySignature_=(x: js.Function1[/* moduleExports */ js.Any, js.Array[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRefreshBoundarySignature")(x.asInstanceOf[js.Any])
    
    @JSImport("@next/react-refresh-utils/internal/helpers", "default.isReactRefreshBoundary")
    @js.native
    def isReactRefreshBoundary: js.Function1[/* moduleExports */ js.Any, Boolean] = js.native
    inline def isReactRefreshBoundary(moduleExports: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactRefreshBoundary")(moduleExports.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isReactRefreshBoundary_=(x: js.Function1[/* moduleExports */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isReactRefreshBoundary")(x.asInstanceOf[js.Any])
    
    @JSImport("@next/react-refresh-utils/internal/helpers", "default.registerExportsForReactRefresh")
    @js.native
    def registerExportsForReactRefresh: js.Function2[/* moduleExports */ js.Any, /* moduleID */ String, Unit] = js.native
    inline def registerExportsForReactRefresh(moduleExports: js.Any, moduleID: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerExportsForReactRefresh")(moduleExports.asInstanceOf[js.Any], moduleID.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerExportsForReactRefresh_=(x: js.Function2[/* moduleExports */ js.Any, /* moduleID */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerExportsForReactRefresh")(x.asInstanceOf[js.Any])
    
    inline def scheduleUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleUpdate")().asInstanceOf[Unit]
    @JSImport("@next/react-refresh-utils/internal/helpers", "default.scheduleUpdate")
    @js.native
    def scheduleUpdate_Fdefault: js.Function0[Unit] = js.native
    
    inline def scheduleUpdate_Fdefault_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheduleUpdate")(x.asInstanceOf[js.Any])
    
    @JSImport("@next/react-refresh-utils/internal/helpers", "default.shouldInvalidateReactRefreshBoundary")
    @js.native
    def shouldInvalidateReactRefreshBoundary: js.Function2[/* prevExports */ js.Any, /* nextExports */ js.Any, Boolean] = js.native
    inline def shouldInvalidateReactRefreshBoundary(prevExports: js.Any, nextExports: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldInvalidateReactRefreshBoundary")(prevExports.asInstanceOf[js.Any], nextExports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def shouldInvalidateReactRefreshBoundary_=(x: js.Function2[/* prevExports */ js.Any, /* nextExports */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldInvalidateReactRefreshBoundary")(x.asInstanceOf[js.Any])
  }
}
