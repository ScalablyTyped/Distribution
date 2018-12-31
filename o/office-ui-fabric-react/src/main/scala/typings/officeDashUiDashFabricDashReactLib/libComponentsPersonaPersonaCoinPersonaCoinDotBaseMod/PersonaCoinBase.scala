package typings
package officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaCoinPersonaCoinDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
@js.native
class PersonaCoinBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaCoinProps, 
      IPersonaState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaCoinProps) = this()
  var _onPhotoLoadingStateChange: js.Any = js.native
  var _onRenderCoin: js.Any = js.native
  var _onRenderInitials: js.Any = js.native
  /**
    * Deprecation helper for getting text.
    */
  /* private */ def _getText(): js.Any = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MPersonaCoinBase(
    nextProps: officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaCoinProps
  ): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
@js.native
object PersonaCoinBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaCoinProps = js.native
}

