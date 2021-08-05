package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoStyleProps
import typings.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardLogoStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardLogo.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IDocumentCardLogoStyleProps): IDocumentCardLogoStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardLogoStyles]
}
