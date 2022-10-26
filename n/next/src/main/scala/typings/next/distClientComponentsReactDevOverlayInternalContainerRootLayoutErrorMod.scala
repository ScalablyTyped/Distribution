package typings.next

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalContainerRootLayoutErrorMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/container/RootLayoutError", "RootLayoutError")
  @js.native
  val RootLayoutError: FC[RootLayoutErrorProps] = js.native
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/container/RootLayoutError", "styles")
  @js.native
  val styles: String = js.native
  
  trait RootLayoutErrorProps extends StObject {
    
    var missingTags: js.Array[String]
  }
  object RootLayoutErrorProps {
    
    inline def apply(missingTags: js.Array[String]): RootLayoutErrorProps = {
      val __obj = js.Dynamic.literal(missingTags = missingTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootLayoutErrorProps]
    }
    
    extension [Self <: RootLayoutErrorProps](x: Self) {
      
      inline def setMissingTags(value: js.Array[String]): Self = StObject.set(x, "missingTags", value.asInstanceOf[js.Any])
      
      inline def setMissingTagsVarargs(value: String*): Self = StObject.set(x, "missingTags", js.Array(value*))
    }
  }
}
