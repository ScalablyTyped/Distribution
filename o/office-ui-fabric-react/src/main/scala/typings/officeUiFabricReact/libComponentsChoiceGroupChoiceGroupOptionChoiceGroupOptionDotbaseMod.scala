package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIChoiceGroupOption
import typings.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDottypesMod.IChoiceGroupOptionProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroupOption/ChoiceGroupOption.base", "ChoiceGroupOptionBase")
  @js.native
  open class ChoiceGroupOptionBase protected ()
    extends Component[IChoiceGroupOptionProps, js.Object, Any] {
    def this(props: IChoiceGroupOptionProps) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onChange: Any = js.native
    
    /* private */ var _onFocus: Any = js.native
    
    /* private */ var _onRenderField: Any = js.native
    
    /* private */ var _onRenderLabel: Any = js.native
  }
  /* static members */
  object ChoiceGroupOptionBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroupOption/ChoiceGroupOption.base", "ChoiceGroupOptionBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroupOption/ChoiceGroupOption.base", "ChoiceGroupOptionBase.defaultProps")
    @js.native
    def defaultProps: PartialIChoiceGroupOption = js.native
    inline def defaultProps_=(x: PartialIChoiceGroupOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
