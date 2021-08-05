package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityStyleProps
import typings.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardActivityStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object DocumentCardActivityGlobalClassNames {
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", "DocumentCardActivityGlobalClassNames")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", "DocumentCardActivityGlobalClassNames.activity")
    @js.native
    def activity: String = js.native
    inline def activity_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activity")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", "DocumentCardActivityGlobalClassNames.avatar")
    @js.native
    def avatar: String = js.native
    inline def avatar_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("avatar")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", "DocumentCardActivityGlobalClassNames.avatars")
    @js.native
    def avatars: String = js.native
    inline def avatars_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("avatars")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", "DocumentCardActivityGlobalClassNames.details")
    @js.native
    def details: String = js.native
    inline def details_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("details")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", "DocumentCardActivityGlobalClassNames.multiplePeople")
    @js.native
    def multiplePeople: String = js.native
    inline def multiplePeople_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiplePeople")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", "DocumentCardActivityGlobalClassNames.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.styles", "DocumentCardActivityGlobalClassNames.root")
    @js.native
    def root: String = js.native
    inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  }
  
  inline def getStyles(props: IDocumentCardActivityStyleProps): IDocumentCardActivityStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IDocumentCardActivityStyles]
}
