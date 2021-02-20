package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.DeprecatedLifecycle because Already inherited
- typings.react.mod.NewLifecycle because Already inherited
- typings.react.mod.ComponentLifecycle because Already inherited
- typings.react.mod.Component because Already inherited
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
object SelectionZone {
  
  @JSImport("office-ui-fabric-react", "SelectionZone")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "SelectionZone.defaultProps")
  @js.native
  def defaultProps: IsSelectedOnFocus = js.native
  @scala.inline
  def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "SelectionZone.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
}
