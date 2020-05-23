package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.DeprecatedLifecycle because Already inherited
- typings.react.mod.NewLifecycle because Already inherited
- typings.react.mod.ComponentLifecycle because Already inherited
- typings.react.mod.Component because Already inherited
- typings.officeUiFabricReact.personaBaseMod.PersonaBase because Already inherited
- typings.officeUiFabricReact.personaMod.PersonaBase because Already inherited
- typings.officeUiFabricReact.libPersonaCoinMod.PersonaBase because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "PersonaBase")
@js.native
class PersonaBase protected ()
  extends typings.officeUiFabricReact.libPersonaMod.PersonaBase {
  def this(props: IPersonaProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "PersonaBase")
@js.native
object PersonaBase extends js.Object {
  var defaultProps: IPersonaProps = js.native
}

