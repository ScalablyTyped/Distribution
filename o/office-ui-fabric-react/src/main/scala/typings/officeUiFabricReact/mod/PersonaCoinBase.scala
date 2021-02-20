package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.personaTypesMod.IPersonaCoinProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.DeprecatedLifecycle because Already inherited
- typings.react.mod.NewLifecycle because Already inherited
- typings.react.mod.ComponentLifecycle because Already inherited
- typings.react.mod.Component because Already inherited
- typings.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase because Already inherited
- typings.officeUiFabricReact.personaCoinMod.PersonaCoinBase because Already inherited
- typings.officeUiFabricReact.personaMod.PersonaCoinBase because Already inherited
- typings.officeUiFabricReact.libPersonaCoinMod.PersonaCoinBase because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "PersonaCoinBase")
@js.native
class PersonaCoinBase protected ()
  extends typings.officeUiFabricReact.libPersonaMod.PersonaCoinBase {
  def this(props: IPersonaCoinProps) = this()
}
/* static members */
object PersonaCoinBase {
  
  @JSImport("office-ui-fabric-react", "PersonaCoinBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "PersonaCoinBase.defaultProps")
  @js.native
  def defaultProps: IPersonaCoinProps = js.native
  @scala.inline
  def defaultProps_=(x: IPersonaCoinProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
