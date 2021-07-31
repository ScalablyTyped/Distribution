package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.ComponentPath
import typings.officeUiFabricReact.officeUiFabricReactStrings.componentPath
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isConformantMod {
  
  @JSImport("office-ui-fabric-react/lib/common/isConformant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isConformant_componentPath(
    testInfo: (Omit[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IsConformantOptions */ js.Any, 
      componentPath
    ]) & ComponentPath
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isConformant")(testInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
