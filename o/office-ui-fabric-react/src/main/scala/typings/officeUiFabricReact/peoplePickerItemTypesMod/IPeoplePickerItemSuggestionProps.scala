package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerItemSuggestionProps extends IPeoplePickerItemSharedProps {
  /**
    * Flag that controls whether each suggested PeoplePicker item (Persona) is rendered with or without secondary text
    * for compact look.
    * @defaultvalue false
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Persona props for each suggested for picking PeoplePicker item. */
  var personaProps: js.UndefOr[IPersonaProps] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
  ] = js.undefined
  /** General common props for all PeoplePicker items suggestions. */
  var suggestionsProps: js.UndefOr[IBasePickerSuggestionsProps[_]] = js.undefined
}

object IPeoplePickerItemSuggestionProps {
  @scala.inline
  def apply(
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    personaProps: IPersonaProps = null,
    styles: IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles] = null,
    suggestionsProps: IBasePickerSuggestionsProps[_] = null,
    theme: ITheme = null
  ): IPeoplePickerItemSuggestionProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (personaProps != null) __obj.updateDynamic("personaProps")(personaProps.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (suggestionsProps != null) __obj.updateDynamic("suggestionsProps")(suggestionsProps.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSuggestionProps]
  }
}

