package typings
package officeDashUiDashFabricDashReactLib.libComponentsChoiceGroupChoiceGroupDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupOption
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement | reactLib.HTMLInputElement] {
  /**
    * The aria label of the ChoiceGroupOption for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not the option is checked.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not the option is disabled.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Icon component props for choice field
    */
  var iconProps: js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps] = js.undefined
  /**
    * The alt of image for choice field. Defaults to '' if not set.
    */
  var imageAlt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width and height of the image in px for choice field.
    * @defaultvalue \{ width: 32, height: 32 \}
    */
  var imageSize: js.UndefOr[officeDashUiDashFabricDashReactLib.Anon_Height] = js.undefined
  /**
    * The src of image for choice field.
    */
  var imageSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A required key to uniquely identify the option.
    */
  var key: java.lang.String
  /**
    * DOM id to tag the ChoiceGroup label with, for reference.
    * Should be used for 'aria-owns' and other such uses, rather than direct reference for programmatic purposes.
    */
  var labelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional override of option render
    */
  var onRenderField: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IChoiceGroupOption]] = js.undefined
  /**
    * Optional override of label render
    */
  var onRenderLabel: js.UndefOr[
    js.Function1[/* option */ IChoiceGroupOption, reactLib.reactMod.Global.JSXNs.Element]
  ] = js.undefined
  /**
    * The src of image for choice field which is selected.
    */
  var selectedImageSrc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text string for the option.
    */
  var text: java.lang.String
}

