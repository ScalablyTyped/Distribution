package typings
package officeDashUiDashFabricDashReactLib.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPeoplePickerItemSuggestionProps extends IPeoplePickerItemSharedProps {
  /**
       * Flag that controls whether each suggested PeoplePicker item (Persona) is rendered with or without secondary text for compact look.
       * @defaultvalue false
       */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** Persona props for each suggested for picking PeoplePicker item. */
  var personaProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
  ] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IPeoplePickerItemSuggestionStyleProps, IPeoplePickerItemSuggestionStyles]
  ] = js.undefined
  /** General common props for all PeoplePicker items suggestions. */
  var suggestionsProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsPickersBasePickerDotTypesMod.IBasePickerSuggestionsProps
  ] = js.undefined
}

