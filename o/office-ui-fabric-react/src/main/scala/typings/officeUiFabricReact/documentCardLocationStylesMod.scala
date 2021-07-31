package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationStyleProps
import typings.officeUiFabricReact.documentCardLocationTypesMod.IDocumentCardLocationStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardLocationStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardLocation.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DocumentCardLocationGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardLocation.styles", "DocumentCardLocationGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardLocation.styles", "DocumentCardLocationGlobalClassNames.root")
    @js.native
    def root: String = js.native
    @scala.inline
    def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getStyles(props: IDocumentCardLocationStyleProps): IDocumentCardLocationStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardLocationStyles]
}
