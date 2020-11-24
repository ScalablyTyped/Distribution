package typings.nextReactRefreshUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@next/react-refresh-utils/internal/helpers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def getRefreshBoundarySignature(moduleExports: js.Any): js.Array[_] = js.native
    @JSName("getRefreshBoundarySignature")
    var getRefreshBoundarySignature_Original: js.Function1[/* moduleExports */ js.Any, js.Array[_]] = js.native
    
    def isReactRefreshBoundary(moduleExports: js.Any): Boolean = js.native
    @JSName("isReactRefreshBoundary")
    var isReactRefreshBoundary_Original: js.Function1[/* moduleExports */ js.Any, Boolean] = js.native
    
    def registerExportsForReactRefresh(moduleExports: js.Any, moduleID: String): Unit = js.native
    @JSName("registerExportsForReactRefresh")
    var registerExportsForReactRefresh_Original: js.Function2[/* moduleExports */ js.Any, /* moduleID */ String, Unit] = js.native
    
    def scheduleUpdate(): Unit = js.native
    @JSName("scheduleUpdate")
    var scheduleUpdate_Original: js.Function0[Unit] = js.native
    
    def shouldInvalidateReactRefreshBoundary(prevExports: js.Any, nextExports: js.Any): Boolean = js.native
    @JSName("shouldInvalidateReactRefreshBoundary")
    var shouldInvalidateReactRefreshBoundary_Original: js.Function2[/* prevExports */ js.Any, /* nextExports */ js.Any, Boolean] = js.native
  }
}
