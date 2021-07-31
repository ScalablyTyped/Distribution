package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageStyleProps
import typings.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardImageStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardImage.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IDocumentCardImageStyleProps): IDocumentCardImageStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardImageStyles]
}
