package typings.officeUiFabricReact

import typings.officeUiFabricReact.linkTypesMod.ILinkProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLinkMod {
  
  @JSImport("office-ui-fabric-react/lib/Link", "Link")
  @js.native
  val Link: FunctionComponent[ILinkProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Link", "LinkBase")
  @js.native
  class LinkBase protected ()
    extends typings.officeUiFabricReact.linkMod.LinkBase {
    def this(props: ILinkProps) = this()
  }
}
