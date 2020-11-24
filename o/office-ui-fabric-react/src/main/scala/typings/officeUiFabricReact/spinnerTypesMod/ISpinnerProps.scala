package typings.officeUiFabricReact.spinnerTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typings.officeUiFabricReact.officeUiFabricReactStrings.off
import typings.officeUiFabricReact.officeUiFabricReactStrings.polite
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpinnerProps extends HTMLAttributes[HTMLElement] {
  
  /**
    * Alternative status label for screen reader
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Politeness setting for label update announcement.
    * @defaultvalue polite
    */
  var ariaLive: js.UndefOr[assertive | polite | off] = js.native
  
  /**
    * Optional callback to access the ISpinner interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISpinner]] = js.native
  
  /**
    * The label to show next to the Spinner. Label updates will be announced to the screen readers.
    * Use ariaLive to control politeness level.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The position of the label in regards of the spinner animation.
    * @defaultvalue SpinnerLabelPosition.bottom
    */
  var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.native
  
  /**
    * The size of Spinner to render. \{ extraSmall, small, medium, large \}
    * @defaultvalue SpinnerType.medium
    */
  var size: js.UndefOr[SpinnerSize] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles]] = js.native
  
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize` instead.
    * @deprecated Use `SpinnerSize` instead.
    */
  var `type`: js.UndefOr[SpinnerType] = js.native
}
object ISpinnerProps {
  
  @scala.inline
  def apply(): ISpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinnerProps]
  }
  
  @scala.inline
  implicit class ISpinnerPropsOps[Self <: ISpinnerProps] (val x: Self) extends AnyVal {
    
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaLive(value: assertive | polite | off): Self = this.set("ariaLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLive: Self = this.set("ariaLive", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ISpinner | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[ISpinner]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelPosition(value: SpinnerLabelPosition): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    
    @scala.inline
    def setSize(value: SpinnerSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: ISpinnerStyleProps => DeepPartial[ISpinnerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: SpinnerType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
