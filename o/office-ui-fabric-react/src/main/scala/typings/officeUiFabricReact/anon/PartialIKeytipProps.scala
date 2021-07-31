package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/Keytip.IKeytipProps> */
trait PartialIKeytipProps extends StObject {
  
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var hasDynamicChildren: js.UndefOr[Boolean] = js.undefined
  
  var hasMenu: js.UndefOr[Boolean] = js.undefined
  
  var keySequences: js.UndefOr[js.Array[String]] = js.undefined
  
  var offset: js.UndefOr[Point] = js.undefined
  
  var onExecute: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, scala.Unit]
  ] = js.undefined
  
  var onReturn: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, scala.Unit]
  ] = js.undefined
  
  var overflowSetSequence: js.UndefOr[js.Array[String]] = js.undefined
  
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]] = js.undefined
  
  var theme: js.UndefOr[ITheme] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PartialIKeytipProps {
  
  @scala.inline
  def apply(): PartialIKeytipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIKeytipProps]
  }
  
  @scala.inline
  implicit class PartialIKeytipPropsMutableBuilder[Self <: PartialIKeytipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setHasDynamicChildren(value: Boolean): Self = StObject.set(x, "hasDynamicChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDynamicChildrenUndefined: Self = StObject.set(x, "hasDynamicChildren", js.undefined)
    
    @scala.inline
    def setHasMenu(value: Boolean): Self = StObject.set(x, "hasMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMenuUndefined: Self = StObject.set(x, "hasMenu", js.undefined)
    
    @scala.inline
    def setKeySequences(value: js.Array[String]): Self = StObject.set(x, "keySequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySequencesUndefined: Self = StObject.set(x, "keySequences", js.undefined)
    
    @scala.inline
    def setKeySequencesVarargs(value: String*): Self = StObject.set(x, "keySequences", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => scala.Unit): Self = StObject.set(x, "onExecute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
    
    @scala.inline
    def setOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => scala.Unit): Self = StObject.set(x, "onReturn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnReturnUndefined: Self = StObject.set(x, "onReturn", js.undefined)
    
    @scala.inline
    def setOverflowSetSequence(value: js.Array[String]): Self = StObject.set(x, "overflowSetSequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowSetSequenceUndefined: Self = StObject.set(x, "overflowSetSequence", js.undefined)
    
    @scala.inline
    def setOverflowSetSequenceVarargs(value: String*): Self = StObject.set(x, "overflowSetSequence", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesFunction1(value: IKeytipStyleProps => DeepPartial[IKeytipStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
