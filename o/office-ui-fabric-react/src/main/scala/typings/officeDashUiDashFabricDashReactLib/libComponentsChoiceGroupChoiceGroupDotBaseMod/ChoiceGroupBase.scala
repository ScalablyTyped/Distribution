package typings
package officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroup.base", "ChoiceGroupBase")
@js.native
class ChoiceGroupBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupProps, 
      IChoiceGroupState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroup {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupProps) = this()
  var _id: js.Any = js.native
  var _inputElement: js.Any = js.native
  var _labelId: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onChange: js.Any = js.native
  var _onFocus: js.Any = js.native
  var changedVars: js.Any = js.native
  var focusedVars: js.Any = js.native
  /* private */ def _getKeyChecked(props: js.Any): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MChoiceGroupBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupProps
  ): scala.Unit = js.native
  /**
    * Sets focus to the choiceGroup.
    */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/ChoiceGroup/ChoiceGroup.base", "ChoiceGroupBase")
@js.native
object ChoiceGroupBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod.IChoiceGroupProps = js.native
}

