package typings.next

import typings.next.distPagesAppMod.AppContext
import typings.next.distSharedLibUtilsMod.AppInitialProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("next/app", JSImport.Default)
  @js.native
  open class default[P, CP, S] ()
    extends typings.next.distPagesAppMod.default[P, CP, S]
  /* static members */
  object default {
    
    @JSImport("next/app", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/app", "default.getInitialProps")
    @js.native
    def getInitialProps: js.Function1[/* param0 */ AppContext, js.Promise[AppInitialProps[Any]]] = js.native
    inline def getInitialProps_=(x: js.Function1[/* param0 */ AppContext, js.Promise[AppInitialProps[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInitialProps")(x.asInstanceOf[js.Any])
    
    @JSImport("next/app", "default.origGetInitialProps")
    @js.native
    def origGetInitialProps: js.Function1[/* param0 */ AppContext, js.Promise[AppInitialProps[Any]]] = js.native
    inline def origGetInitialProps_=(x: js.Function1[/* param0 */ AppContext, js.Promise[AppInitialProps[Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("origGetInitialProps")(x.asInstanceOf[js.Any])
  }
}
