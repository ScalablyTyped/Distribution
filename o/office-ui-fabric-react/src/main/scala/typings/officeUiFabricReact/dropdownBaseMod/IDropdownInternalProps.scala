package typings.officeUiFabricReact.dropdownBaseMod

import typings.officeUiFabricReact.dropdownTypesMod.IDropdownOption
import typings.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState because var conflicts: responsiveMode. Inlined  */ @js.native
trait IDropdownInternalProps extends IDropdownProps

object IDropdownInternalProps {
  @scala.inline
  def apply(options: js.Array[IDropdownOption]): IDropdownInternalProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownInternalProps]
  }
}

