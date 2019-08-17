package typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaCoinPersonaCoinDotBaseMod

import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaCoinProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
@js.native
class PersonaCoinBase protected () extends BaseComponent[IPersonaCoinProps, IPersonaState] {
  def this(props: IPersonaCoinProps) = this()
  /**
    * Deprecation helper for getting text.
    */
  var _getText: js.Any = js.native
  var _onPhotoLoadingStateChange: js.Any = js.native
  var _onRenderCoin: js.Any = js.native
  var _onRenderInitials: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MPersonaCoinBase(nextProps: IPersonaCoinProps): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
@js.native
object PersonaCoinBase extends js.Object {
  var defaultProps: IPersonaCoinProps = js.native
}

