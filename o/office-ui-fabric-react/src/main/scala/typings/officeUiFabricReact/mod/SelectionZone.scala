package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.AnonIsSelectedOnFocus
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.react.mod.DeprecatedLifecycle because Already inherited
- typings.react.mod.NewLifecycle because Already inherited
- typings.react.mod.ComponentLifecycle because Already inherited
- typings.react.mod.Component because Already inherited
- typings.uifabricUtilities.baseComponentMod.BaseComponent because Already inherited
- typings.uifabricUtilities.mod.BaseComponent because Already inherited
- typings.officeUiFabricReact.utilitiesMod.BaseComponent because Already inherited
- typings.officeUiFabricReact.selectionZoneMod.SelectionZone because Already inherited
- typings.officeUiFabricReact.selectionMod.SelectionZone because Already inherited
- typings.officeUiFabricReact.libMarqueeSelectionMod.SelectionZone because Inheritance from two classes. Inlined 
- typings.officeUiFabricReact.libSelectionMod.SelectionZone because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "SelectionZone")
@js.native
class SelectionZone protected ()
  extends typings.officeUiFabricReact.libDetailsListMod.SelectionZone {
  def this(props: ISelectionZoneProps) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "SelectionZone")
@js.native
object SelectionZone extends js.Object {
  var defaultProps: AnonIsSelectedOnFocus = js.native
  def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
}

