package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusStyleProps
import typings.officeUiFabricReact.documentCardStatusTypesMod.IDocumentCardStatusStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardDetailsStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardDetails.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IDocumentCardStatusStyleProps): IDocumentCardStatusStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardStatusStyles]
}
