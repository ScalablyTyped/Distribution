package typings.officeUiFabricReact.personaCoinBaseMod

import typings.officeUiFabricReact.personaTypesMod.IPersonaCoinProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
@js.native
class PersonaCoinBase protected ()
  extends Component[IPersonaCoinProps, IPersonaState, js.Any] {
  def this(props: IPersonaCoinProps) = this()
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MPersonaCoinBase(nextProps: IPersonaCoinProps): Unit = js.native
  
  /**
    * Deprecation helper for getting text.
    */
  var _getText: js.Any = js.native
  
  var _onPhotoLoadingStateChange: js.Any = js.native
  
  var _onRenderCoin: js.Any = js.native
  
  var _onRenderInitials: js.Any = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaCoin/PersonaCoin.base", "PersonaCoinBase")
@js.native
object PersonaCoinBase extends js.Object {
  
  var defaultProps: IPersonaCoinProps = js.native
}
