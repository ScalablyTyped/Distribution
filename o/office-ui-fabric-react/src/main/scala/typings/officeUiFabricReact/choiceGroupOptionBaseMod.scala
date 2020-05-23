package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIChoiceGroupOption
import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroupOption/ChoiceGroupOption.base", JSImport.Namespace)
@js.native
object choiceGroupOptionBaseMod extends js.Object {
  @js.native
  class ChoiceGroupOptionBase protected ()
    extends Component[IChoiceGroupOptionProps, js.Object, js.Any] {
    def this(props: IChoiceGroupOptionProps) = this()
    var _classNames: js.Any = js.native
    var _onBlur: js.Any = js.native
    var _onChange: js.Any = js.native
    var _onFocus: js.Any = js.native
    var _onRenderField: js.Any = js.native
    var _onRenderLabel: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ChoiceGroupOptionBase extends js.Object {
    var defaultProps: PartialIChoiceGroupOption = js.native
  }
  
}

