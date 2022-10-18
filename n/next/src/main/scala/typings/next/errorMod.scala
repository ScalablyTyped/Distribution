package typings.next

import typings.next.distPagesErrorMod.ErrorProps
import typings.next.distSharedLibUtilsMod.NextPageContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("next/error", JSImport.Default)
  @js.native
  open class default[P] ()
    extends typings.next.distPagesErrorMod.default[P]
  /* static members */
  object default {
    
    @JSImport("next/error", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/error", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("next/error", "default.getInitialProps")
    @js.native
    def getInitialProps: js.Function1[/* hasResErr */ NextPageContext, js.Promise[ErrorProps] | ErrorProps] = js.native
    inline def getInitialProps_=(x: js.Function1[/* hasResErr */ NextPageContext, js.Promise[ErrorProps] | ErrorProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInitialProps")(x.asInstanceOf[js.Any])
    
    @JSImport("next/error", "default.origGetInitialProps")
    @js.native
    def origGetInitialProps: js.Function1[/* hasResErr */ NextPageContext, js.Promise[ErrorProps] | ErrorProps] = js.native
    inline def origGetInitialProps_=(x: js.Function1[/* hasResErr */ NextPageContext, js.Promise[ErrorProps] | ErrorProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("origGetInitialProps")(x.asInstanceOf[js.Any])
  }
}
