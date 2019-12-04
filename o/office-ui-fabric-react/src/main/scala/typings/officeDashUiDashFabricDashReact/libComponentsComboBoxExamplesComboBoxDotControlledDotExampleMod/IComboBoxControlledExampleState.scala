package typings.officeDashUiDashFabricDashReact.libComponentsComboBoxExamplesComboBoxDotControlledDotExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComboBoxControlledExampleState extends js.Object {
  /**
    * Initial display value for the single-select example.
    * This will be cleared after the options are resolved for the first time.
    */
  var initialDisplayValue: js.UndefOr[String] = js.undefined
  /**
    * Initial display value for the multi-select example.
    * This will be cleared after the options are resolved for the first time.
    */
  var initialDisplayValueMulti: js.UndefOr[String] = js.undefined
  /** Current options for the single-select example */
  var options: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IComboBoxOption */ _
  ]
  /** Current options for the multi-select example */
  var optionsMulti: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IComboBoxOption */ _
  ]
  /** Current selected option for the single-select example */
  var selectedOptionKey: js.UndefOr[String | Double] = js.undefined
  /** Current selected options for the multi-select example */
  var selectedOptionKeys: js.UndefOr[js.Array[String]] = js.undefined
}

object IComboBoxControlledExampleState {
  @scala.inline
  def apply(
    options: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IComboBoxOption */ _
    ],
    optionsMulti: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IComboBoxOption */ _
    ],
    initialDisplayValue: String = null,
    initialDisplayValueMulti: String = null,
    selectedOptionKey: String | Double = null,
    selectedOptionKeys: js.Array[String] = null
  ): IComboBoxControlledExampleState = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], optionsMulti = optionsMulti.asInstanceOf[js.Any])
    if (initialDisplayValue != null) __obj.updateDynamic("initialDisplayValue")(initialDisplayValue.asInstanceOf[js.Any])
    if (initialDisplayValueMulti != null) __obj.updateDynamic("initialDisplayValueMulti")(initialDisplayValueMulti.asInstanceOf[js.Any])
    if (selectedOptionKey != null) __obj.updateDynamic("selectedOptionKey")(selectedOptionKey.asInstanceOf[js.Any])
    if (selectedOptionKeys != null) __obj.updateDynamic("selectedOptionKeys")(selectedOptionKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxControlledExampleState]
  }
}

