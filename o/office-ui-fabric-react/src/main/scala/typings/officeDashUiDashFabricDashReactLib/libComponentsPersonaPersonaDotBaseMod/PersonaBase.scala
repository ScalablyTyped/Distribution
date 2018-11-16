package typings
package officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.base", "PersonaBase")
@js.native
class PersonaBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps, 
      js.Object
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps) = this()
  /**
       * Deprecation helper for getting text.
       */
  /* private */ def _getText(): js.Any = js.native
  /**
       * using closure to wrap the default render behavior
       * to make it independent of the type of text passed
       * @param text
       */
  /* private */ def _onRenderText(text: js.Any): js.Any = js.native
  /**
       * Renders various types of Text (primaryText, secondaryText, etc)
       * based on the classNames passed
       * @param classNames
       * @param renderFunction
       * @param defaultRenderFunction
       */
  /* private */ def _renderElement(classNames: js.Any, renderFunction: js.Any, defaultRenderFunction: js.Any): js.Any = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.base", "PersonaBase")
@js.native
object PersonaBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps = js.native
}

