package typings.officeUiFabricReact.buttonGridTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.TableHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLTableElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IButtonGridProps extends TableHTMLAttributes[HTMLTableElement] {
  
  /**
    * Position this ButtonGrid is in the parent set (index in a parent menu, for example)
    */
  var ariaPosInSet: js.UndefOr[Double] = js.native
  
  /**
    * Size of the parent set (size of parent menu, for example)
    */
  var ariaSetSize: js.UndefOr[Double] = js.native
  
  /**
    * The number of columns.
    */
  var columnCount: Double = js.native
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IButtonGrid]] = js.native
  
  /**
    * Class name for the FocusZone container for the ButtonGrid.
    * @deprecated Use `styles.focusedContainer` to define styling for the focus zone container
    */
  var containerClassName: js.UndefOr[String] = js.native
  
  /**
    * If false (the default), the ButtonGrid is contained inside a FocusZone.
    * If true, a FocusZone is not used.
    * @default false
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.native
  
  /**
    * Items to display in a ButtonGrid with the specified number of columns.
    */
  var items: js.Array[_] = js.native
  
  /**
    * Handler for when focus leaves the ButtonGrid.
    */
  @JSName("onBlur")
  var onBlur_IButtonGridProps: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Custom renderer for the individual items.
    */
  def onRenderItem(item: js.Any, index: Double): Element = js.native
  
  /**
    * @deprecated Use `ariaPosInSet`
    */
  var positionInSet: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated Use `ariaSetSize`
    */
  var setSize: js.UndefOr[Double] = js.native
  
  /**
    * Whether focus should cycle back to the beginning once the user navigates past the end (and vice versa).
    * Only relevant if `doNotContainWithinFocusZone` is not true.
    */
  var shouldFocusCircularNavigate: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IButtonGridStyleProps, IButtonGridStyles]] = js.native
  
  /**
    * Theme to apply to the component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object IButtonGridProps {
  
  @scala.inline
  def apply(columnCount: Double, items: js.Array[_], onRenderItem: (js.Any, Double) => Element): IButtonGridProps = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction2(onRenderItem))
    __obj.asInstanceOf[IButtonGridProps]
  }
  
  @scala.inline
  implicit class IButtonGridPropsOps[Self <: IButtonGridProps] (val x: Self) extends AnyVal {
    
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
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRenderItem(value: (js.Any, Double) => Element): Self = this.set("onRenderItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAriaPosInSet(value: Double): Self = this.set("ariaPosInSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaPosInSet: Self = this.set("ariaPosInSet", js.undefined)
    
    @scala.inline
    def setAriaSetSize(value: Double): Self = this.set("ariaSetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaSetSize: Self = this.set("ariaSetSize", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IButtonGrid | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IButtonGrid]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setDoNotContainWithinFocusZone(value: Boolean): Self = this.set("doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotContainWithinFocusZone: Self = this.set("doNotContainWithinFocusZone", js.undefined)
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setPositionInSet(value: Double): Self = this.set("positionInSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionInSet: Self = this.set("positionInSet", js.undefined)
    
    @scala.inline
    def setSetSize(value: Double): Self = this.set("setSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    
    @scala.inline
    def setShouldFocusCircularNavigate(value: Boolean): Self = this.set("shouldFocusCircularNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFocusCircularNavigate: Self = this.set("shouldFocusCircularNavigate", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IButtonGridStyleProps => DeepPartial[IButtonGridStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IButtonGridStyleProps, IButtonGridStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
