package typings.officeUiFabricReact.choiceGroupTypesMod

import typings.officeUiFabricReact.anon.Width
import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionStyleProps
import typings.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionStyles
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupOption extends InputHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * Aria label of the option for the benefit of screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Props for an icon to display with this option.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Alt text if the option is an image.
    * @default '' (empty string)
    */
  var imageAlt: js.UndefOr[String] = js.native
  /**
    * The width and height of the image in px for choice field.
    * @defaultvalue `{ width: 32, height: 32 }`
    */
  var imageSize: js.UndefOr[Width] = js.native
  /**
    * Image to display with this option.
    */
  var imageSrc: js.UndefOr[String] = js.native
  /**
    * A required key to uniquely identify the option.
    */
  var key: String = js.native
  /**
    * ID used on the option's label.
    */
  var labelId: js.UndefOr[String] = js.native
  /**
    * Used to customize option rendering.
    */
  var onRenderField: js.UndefOr[IRenderFunction[IChoiceGroupOption]] = js.native
  /**
    * Used to customize label rendering.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[IChoiceGroupOption]] = js.native
  /**
    * The src of image for choice field which is selected.
    */
  var selectedImageSrc: js.UndefOr[String] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]] = js.native
  /**
    * The text string for the option.
    */
  var text: String = js.native
}

object IChoiceGroupOption {
  @scala.inline
  def apply(key: String, text: String): IChoiceGroupOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOption]
  }
  @scala.inline
  implicit class IChoiceGroupOptionOps[Self <: IChoiceGroupOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setIconProps(value: IIconProps): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconProps: Self = this.set("iconProps", js.undefined)
    @scala.inline
    def setImageAlt(value: String): Self = this.set("imageAlt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageAlt: Self = this.set("imageAlt", js.undefined)
    @scala.inline
    def setImageSize(value: Width): Self = this.set("imageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSize: Self = this.set("imageSize", js.undefined)
    @scala.inline
    def setImageSrc(value: String): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSrc: Self = this.set("imageSrc", js.undefined)
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelId: Self = this.set("labelId", js.undefined)
    @scala.inline
    def setOnRenderField(
      value: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IChoiceGroupOption], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderField", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderField: Self = this.set("onRenderField", js.undefined)
    @scala.inline
    def setOnRenderLabel(
      value: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IChoiceGroupOption], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderLabel: Self = this.set("onRenderLabel", js.undefined)
    @scala.inline
    def setSelectedImageSrc(value: String): Self = this.set("selectedImageSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedImageSrc: Self = this.set("selectedImageSrc", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IChoiceGroupOptionStyleProps => DeepPartial[IChoiceGroupOptionStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

