package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/Keytip.IKeytipProps> */
@js.native
trait PartialIKeytipProps extends js.Object {
  
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var hasDynamicChildren: js.UndefOr[Boolean] = js.native
  
  var hasMenu: js.UndefOr[Boolean] = js.native
  
  var keySequences: js.UndefOr[js.Array[String]] = js.native
  
  var offset: js.UndefOr[Point] = js.native
  
  var onExecute: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, scala.Unit]
  ] = js.native
  
  var onReturn: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, scala.Unit]
  ] = js.native
  
  var overflowSetSequence: js.UndefOr[js.Array[String]] = js.native
  
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object PartialIKeytipProps {
  
  @scala.inline
  def apply(): PartialIKeytipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIKeytipProps]
  }
  
  @scala.inline
  implicit class PartialIKeytipPropsOps[Self <: PartialIKeytipProps] (val x: Self) extends AnyVal {
    
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
    def setCalloutProps(value: ICalloutProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
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
    def setKeySequencesVarargs(value: String*): Self = this.set("keySequences", js.Array(value :_*))
    
    @scala.inline
    def setKeySequences(value: js.Array[String]): Self = this.set("keySequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeySequences: Self = this.set("keySequences", js.undefined)
    
    @scala.inline
    def setOffset(value: Point): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => scala.Unit): Self = this.set("onExecute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnExecute: Self = this.set("onExecute", js.undefined)
    
    @scala.inline
    def setOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => scala.Unit): Self = this.set("onReturn", js.Any.fromFunction2(value))
    
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
