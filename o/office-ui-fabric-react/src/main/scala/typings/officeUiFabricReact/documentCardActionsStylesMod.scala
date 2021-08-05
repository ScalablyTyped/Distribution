package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsStyleProps
import typings.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardActionsStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActions.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IDocumentCardActionsStyleProps): IDocumentCardActionsStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardActionsStyles]
}
