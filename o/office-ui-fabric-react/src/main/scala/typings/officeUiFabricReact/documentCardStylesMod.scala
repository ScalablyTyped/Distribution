package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardTypesMod.IDocumentCardStyleProps
import typings.officeUiFabricReact.documentCardTypesMod.IDocumentCardStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCard.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IDocumentCardStyleProps): IDocumentCardStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardStyles]
}
