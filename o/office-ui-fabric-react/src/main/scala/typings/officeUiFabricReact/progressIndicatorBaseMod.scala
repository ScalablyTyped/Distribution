package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Description
import typings.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressIndicatorBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator/ProgressIndicator.base", "ProgressIndicatorBase")
  @js.native
  open class ProgressIndicatorBase protected ()
    extends Component[IProgressIndicatorProps, js.Object, Any] {
    def this(props: IProgressIndicatorProps) = this()
    
    /* private */ var _descriptionId: Any = js.native
    
    /* private */ var _labelId: Any = js.native
    
    /* private */ var _onRenderProgress: Any = js.native
  }
  /* static members */
  object ProgressIndicatorBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator/ProgressIndicator.base", "ProgressIndicatorBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ProgressIndicator/ProgressIndicator.base", "ProgressIndicatorBase.defaultProps")
    @js.native
    def defaultProps: Description = js.native
    inline def defaultProps_=(x: Description): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
