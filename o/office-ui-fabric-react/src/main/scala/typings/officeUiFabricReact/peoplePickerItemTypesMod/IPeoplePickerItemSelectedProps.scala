package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.officeUiFabricReact.IPersonaPropsValidationSt
import typings.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSharedProps because var conflicts: className. Inlined theme */ trait IPeoplePickerItemSelectedProps extends IPickerItemProps[IPersonaPropsValidationSt] {
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
    IPickerItemProps: IPickerItemProps[IPersonaPropsValidationSt],
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

