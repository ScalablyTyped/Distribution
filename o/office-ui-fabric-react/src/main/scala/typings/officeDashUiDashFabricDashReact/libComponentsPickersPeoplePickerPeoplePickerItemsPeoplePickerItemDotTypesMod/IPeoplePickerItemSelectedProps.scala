package typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.Anon_ValidationState
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.officeDashUiDashFabricDashReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod.IPeoplePickerItemSharedProps because var conflicts: className. Inlined theme */ trait IPeoplePickerItemSelectedProps extends IPickerItemProps[IPersonaProps with Anon_ValidationState] {
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IPeoplePickerItemSelectedStyleProps, IPeoplePickerItemSelectedStyles]
  ] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IPeoplePickerItemSelectedProps {
  @scala.inline
  def apply(
    IPickerItemProps: IPickerItemProps[IPersonaProps with Anon_ValidationState],
    styles: IStyleFunctionOrObject[IPeoplePickerItemSelectedStyleProps, IPeoplePickerItemSelectedStyles] = null,
    theme: ITheme = null
  ): IPeoplePickerItemSelectedProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedProps]
  }
}

