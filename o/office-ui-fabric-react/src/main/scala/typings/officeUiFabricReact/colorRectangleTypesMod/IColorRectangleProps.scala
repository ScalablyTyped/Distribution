package typings.officeUiFabricReact.colorRectangleTypesMod

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorRectangleProps extends js.Object {
  /**
    * Detailed description for how to use the color rectangle. Moving the thumb horizontally adjusts
    * saturation and moving it vertically adjusts value (essentially, brightness).
    * @defaultvalue 'Use left and right arrow keys to set saturation. Use up and down arrow keys to set brightness.'
    */
  var ariaDescription: js.UndefOr[String] = js.native
  /**
    * Label of the ColorRectangle for the benefit of screen reader users.
    * @defaultvalue 'Saturation and brightness'
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * Format string for the color rectangle's current value as read by screen readers.
    * The string must include descriptions and two placeholders for the current values:
    * `{0}` for saturation and `{1}` for value/brightness.
    * @defaultvalue `'Saturation {0} brightness {1}'`
    */
  var ariaValueFormat: js.UndefOr[String] = js.native
  /**
    * Additional CSS class(es) to apply to the ColorRectangle.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Current color of the rectangle.
    */
  var color: IColor = js.native
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.native
  /**
    * Minimum width and height.
    */
  var minSize: js.UndefOr[Double] = js.native
  /**
    * Callback for when the color changes.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* color */ IColor, 
      Unit
    ]
  ] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.native
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IColorRectangleProps {
  @scala.inline
  def apply(color: IColor): IColorRectangleProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorRectangleProps]
  }
  @scala.inline
  implicit class IColorRectanglePropsOps[Self <: IColorRectangleProps] (val x: Self) extends AnyVal {
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
    def setColor(value: IColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaDescription(value: String): Self = this.set("ariaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescription: Self = this.set("ariaDescription", js.undefined)
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setAriaValueFormat(value: String): Self = this.set("ariaValueFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaValueFormat: Self = this.set("ariaValueFormat", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IColorRectangle | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[IColorRectangle]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* color */ IColor) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IColorRectangleStyleProps => DeepPartial[IColorRectangleStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

