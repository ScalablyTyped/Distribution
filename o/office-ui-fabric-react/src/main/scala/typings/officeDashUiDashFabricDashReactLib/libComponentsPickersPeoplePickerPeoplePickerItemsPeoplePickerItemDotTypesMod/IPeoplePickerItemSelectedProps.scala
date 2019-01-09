package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- officeDashUiDashFabricDashReactLib.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSharedProps because var conflicts: className. Inlined theme */ trait IPeoplePickerItemSelectedProps
  extends officeDashUiDashFabricDashReactLib.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps[
      officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps with officeDashUiDashFabricDashReactLib.Anon_ValidationState
    ] {
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IPeoplePickerItemSelectedStyleProps, IPeoplePickerItemSelectedStyles]
  ] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

