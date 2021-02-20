package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewStyleProps
import typings.officeUiFabricReact.documentCardPreviewTypesMod.IDocumentCardPreviewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardPreviewStylesMod {
  
  object DocumentCardPreviewGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.styles", "DocumentCardPreviewGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.styles", "DocumentCardPreviewGlobalClassNames.icon")
    @js.native
    def icon: String = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.styles", "DocumentCardPreviewGlobalClassNames.iconContainer")
    @js.native
    def iconContainer: String = js.native
    @scala.inline
    def iconContainer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconContainer")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def icon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.styles", "DocumentCardPreviewGlobalClassNames.root")
    @js.native
    def root: String = js.native
    @scala.inline
    def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardPreview.styles", "getStyles")
  @js.native
  def getStyles(props: IDocumentCardPreviewStyleProps): IDocumentCardPreviewStyles = js.native
}
