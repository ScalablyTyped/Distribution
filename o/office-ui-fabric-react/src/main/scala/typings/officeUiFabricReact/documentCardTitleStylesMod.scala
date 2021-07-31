package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleStyleProps
import typings.officeUiFabricReact.documentCardTitleTypesMod.IDocumentCardTitleStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardTitleStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardTitle.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DocumentCardTitleGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardTitle.styles", "DocumentCardTitleGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardTitle.styles", "DocumentCardTitleGlobalClassNames.root")
    @js.native
    def root: String = js.native
    @scala.inline
    def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getStyles(props: IDocumentCardTitleStyleProps): IDocumentCardTitleStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardTitleStyles]
}
