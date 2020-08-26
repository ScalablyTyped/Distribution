package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyleProps
import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleStyles
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

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.types.IColorRectangleProps> */
@js.native
trait ReadonlyIColorRectanglePr extends js.Object {
  val ariaDescription: js.UndefOr[String] = js.native
  val ariaLabel: js.UndefOr[String] = js.native
  val ariaValueFormat: js.UndefOr[String] = js.native
  val className: js.UndefOr[String] = js.native
  val color: IColor = js.native
  val componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.native
  val minSize: js.UndefOr[Double] = js.native
  val onChange: js.UndefOr[
    js.Function2[
      /* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* color */ IColor, 
      scala.Unit
    ]
  ] = js.native
  val styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.native
  val theme: js.UndefOr[ITheme] = js.native
}

object ReadonlyIColorRectanglePr {
  @scala.inline
  def apply(color: IColor): ReadonlyIColorRectanglePr = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorRectanglePr]
  }
  @scala.inline
  implicit class ReadonlyIColorRectanglePrOps[Self <: ReadonlyIColorRectanglePr] (val x: Self) extends AnyVal {
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
    def setComponentRefFunction1(value: /* ref */ IColorRectangle | Null => scala.Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
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
      value: (/* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* color */ IColor) => scala.Unit
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

