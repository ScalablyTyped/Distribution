package typings.next

import typings.next.distSharedLibUtilsMod.NextPageContext
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPagesErrorMod {
  
  @JSImport("next/dist/pages/_error", JSImport.Default)
  @js.native
  open class default[P] () extends Error[P]
  /* static members */
  object default {
    
    @JSImport("next/dist/pages/_error", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/pages/_error", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/pages/_error", "default.getInitialProps")
    @js.native
    def getInitialProps: js.Function1[/* param0 */ NextPageContext, js.Promise[ErrorProps] | ErrorProps] = js.native
    inline def getInitialProps_=(x: js.Function1[/* param0 */ NextPageContext, js.Promise[ErrorProps] | ErrorProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInitialProps")(x.asInstanceOf[js.Any])
    
    @JSImport("next/dist/pages/_error", "default.origGetInitialProps")
    @js.native
    def origGetInitialProps: js.Function1[/* param0 */ NextPageContext, js.Promise[ErrorProps] | ErrorProps] = js.native
    inline def origGetInitialProps_=(x: js.Function1[/* param0 */ NextPageContext, js.Promise[ErrorProps] | ErrorProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("origGetInitialProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Error[P]
    extends Component[P & ErrorProps, js.Object, Any]
  
  trait ErrorProps extends StObject {
    
    var statusCode: Double
    
    var title: js.UndefOr[String] = js.undefined
    
    var withDarkMode: js.UndefOr[Boolean] = js.undefined
  }
  object ErrorProps {
    
    inline def apply(statusCode: Double): ErrorProps = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorProps]
    }
    
    extension [Self <: ErrorProps](x: Self) {
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWithDarkMode(value: Boolean): Self = StObject.set(x, "withDarkMode", value.asInstanceOf[js.Any])
      
      inline def setWithDarkModeUndefined: Self = StObject.set(x, "withDarkMode", js.undefined)
    }
  }
}
