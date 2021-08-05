package typings.officeUiFabricReact

import typings.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbStyleProps
import typings.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Breadcrumb/Breadcrumb.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IBreadcrumbStyleProps): IBreadcrumbStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IBreadcrumbStyles]
}
