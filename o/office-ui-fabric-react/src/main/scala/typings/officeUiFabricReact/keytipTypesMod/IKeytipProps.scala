package typings.officeUiFabricReact.keytipTypesMod

import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeytipProps extends js.Object {
  /**
    * ICalloutProps to pass to the callout element
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Content to put inside the keytip
    */
  var content: String = js.native
  /**
    * T/F if the corresponding control for this keytip is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on
    * keytip activation). Common cases are a Pivot or Modal.
    */
  var hasDynamicChildren: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not this keytip belongs to a component that has a menu
    * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
    */
  var hasMenu: js.UndefOr[Boolean] = js.native
  /**
    * Array of KeySequences which is the full key sequence to trigger this keytip
    * Should not include initial 'start' key sequence
    */
  var keySequences: js.Array[String] = js.native
  /**
    * Offset x and y for the keytip, added from the top-left corner
    * By default the keytip will be anchored to the bottom-center of the element
    */
  var offset: js.UndefOr[Point] = js.native
  /**
    * Function to call when this keytip is activated.
    * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
    * 'target' is the DOM element marked with 'data-ktp-target'.
    */
  var onExecute: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.native
  /**
    * Function to call when the keytip is the currentKeytip and a return sequence is pressed.
    * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
    * 'target' is the DOM element marked with 'data-ktp-target'.
    */
  var onReturn: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.native
  /**
    * Full KeySequence of the overflow set button, will be set automatically if this keytip is inside an overflow
    */
  var overflowSetSequence: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]] = js.native
  /**
    * Theme for the component
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * T/F if the keytip is visible
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IKeytipProps {
  @scala.inline
  def apply(content: String, keySequences: js.Array[String]): IKeytipProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipProps]
  }
  @scala.inline
  implicit class IKeytipPropsOps[Self <: IKeytipProps] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeySequencesVarargs(value: String*): Self = this.set("keySequences", js.Array(value :_*))
    @scala.inline
    def setKeySequences(value: js.Array[String]): Self = this.set("keySequences", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalloutProps(value: ICalloutProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHasDynamicChildren(value: Boolean): Self = this.set("hasDynamicChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasDynamicChildren: Self = this.set("hasDynamicChildren", js.undefined)
    @scala.inline
    def setHasMenu(value: Boolean): Self = this.set("hasMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasMenu: Self = this.set("hasMenu", js.undefined)
    @scala.inline
    def setOffset(value: Point): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = this.set("onExecute", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnExecute: Self = this.set("onExecute", js.undefined)
    @scala.inline
    def setOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Unit): Self = this.set("onReturn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReturn: Self = this.set("onReturn", js.undefined)
    @scala.inline
    def setOverflowSetSequenceVarargs(value: String*): Self = this.set("overflowSetSequence", js.Array(value :_*))
    @scala.inline
    def setOverflowSetSequence(value: js.Array[String]): Self = this.set("overflowSetSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowSetSequence: Self = this.set("overflowSetSequence", js.undefined)
    @scala.inline
    def setStylesFunction1(value: IKeytipStyleProps => DeepPartial[IKeytipStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

