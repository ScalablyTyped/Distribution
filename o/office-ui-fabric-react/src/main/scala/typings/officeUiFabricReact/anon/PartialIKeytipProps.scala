package typings.officeUiFabricReact.anon

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipStyleProps
import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipStyles
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libPointMod.Point
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
  
  inline def apply(): PartialIKeytipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIKeytipProps]
  }
  
  extension [Self <: PartialIKeytipProps](x: Self) {
    
    inline def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
    
    inline def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHasDynamicChildren(value: Boolean): Self = StObject.set(x, "hasDynamicChildren", value.asInstanceOf[js.Any])
    
    inline def setHasDynamicChildrenUndefined: Self = StObject.set(x, "hasDynamicChildren", js.undefined)
    
    inline def setHasMenu(value: Boolean): Self = StObject.set(x, "hasMenu", value.asInstanceOf[js.Any])
    
    inline def setHasMenuUndefined: Self = StObject.set(x, "hasMenu", js.undefined)
    
    inline def setKeySequences(value: js.Array[String]): Self = StObject.set(x, "keySequences", value.asInstanceOf[js.Any])
    
    inline def setKeySequencesUndefined: Self = StObject.set(x, "keySequences", js.undefined)
    
    inline def setKeySequencesVarargs(value: String*): Self = StObject.set(x, "keySequences", js.Array(value*))
    
    inline def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnExecute(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => scala.Unit): Self = StObject.set(x, "onExecute", js.Any.fromFunction2(value))
    
    inline def setOnExecuteUndefined: Self = StObject.set(x, "onExecute", js.undefined)
    
    inline def setOnReturn(value: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => scala.Unit): Self = StObject.set(x, "onReturn", js.Any.fromFunction2(value))
    
    inline def setOnReturnUndefined: Self = StObject.set(x, "onReturn", js.undefined)
    
    inline def setOverflowSetSequence(value: js.Array[String]): Self = StObject.set(x, "overflowSetSequence", value.asInstanceOf[js.Any])
    
    inline def setOverflowSetSequenceUndefined: Self = StObject.set(x, "overflowSetSequence", js.undefined)
    
    inline def setOverflowSetSequenceVarargs(value: String*): Self = StObject.set(x, "overflowSetSequence", js.Array(value*))
    
    inline def setStyles(value: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IKeytipStyleProps => DeepPartial[IKeytipStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
