package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsDocumentCardDocumentCardLocationDottypesMod.IDocumentCardLocationStyleProps
import typings.officeUiFabricReact.libComponentsDocumentCardDocumentCardLocationDottypesMod.IDocumentCardLocationStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDocumentCardDocumentCardLocationDotstylesMod {
  
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
    inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  inline def getStyles(props: IDocumentCardLocationStyleProps): IDocumentCardLocationStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardLocationStyles]
}
