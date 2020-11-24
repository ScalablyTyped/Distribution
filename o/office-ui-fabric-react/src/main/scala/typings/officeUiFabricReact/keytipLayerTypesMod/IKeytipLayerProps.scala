package typings.officeUiFabricReact.keytipLayerTypesMod

import typings.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typings.react.mod.ClassAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeytipLayerProps extends ClassAttributes[IKeytipLayer] {
  
  /**
    * Optional callback to access the KeytipLayer component. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IKeytipLayer]] = js.native
  
  /**
    * String to put inside the layer to be used for the aria-describedby for the component with the keytip
    * Should be one of the starting sequences
    */
  var content: String = js.native
  
  /**
    * List of key sequences that will exit keytips mode
    */
  var keytipExitSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.native
  
  /**
    * List of key sequences that execute the return functionality in keytips
    * (going back to the previous level of keytips)
    */
  var keytipReturnSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.native
  
  /**
    * List of key sequences that will start keytips mode
    */
  var keytipStartSequences: js.UndefOr[js.Array[IKeytipTransitionKey]] = js.native
  
  /**
    * Callback function triggered when keytip mode is entered
    */
  var onEnterKeytipMode: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback function triggered when keytip mode is exited.
    * ev is the Mouse or Keyboard Event that triggered the exit, if any.
    */
  var onExitKeytipMode: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[KeyboardEvent[HTMLElement] | (MouseEvent[HTMLElement, NativeMouseEvent])], 
      Unit
    ]
  ] = js.native
  
  /**
    * (Optional) Call to provide customized styling.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]] = js.native
}
object IKeytipLayerProps {
  
  @scala.inline
  def apply(content: String): IKeytipLayerProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipLayerProps]
  }
  
  @scala.inline
  implicit class IKeytipLayerPropsOps[Self <: IKeytipLayerProps] (val x: Self) extends AnyVal {
    
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
    def setComponentRefFunction1(value: /* ref */ IKeytipLayer | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IKeytipLayer]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setKeytipExitSequencesVarargs(value: IKeytipTransitionKey*): Self = this.set("keytipExitSequences", js.Array(value :_*))
    
    @scala.inline
    def setKeytipExitSequences(value: js.Array[IKeytipTransitionKey]): Self = this.set("keytipExitSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeytipExitSequences: Self = this.set("keytipExitSequences", js.undefined)
    
    @scala.inline
    def setKeytipReturnSequencesVarargs(value: IKeytipTransitionKey*): Self = this.set("keytipReturnSequences", js.Array(value :_*))
    
    @scala.inline
    def setKeytipReturnSequences(value: js.Array[IKeytipTransitionKey]): Self = this.set("keytipReturnSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeytipReturnSequences: Self = this.set("keytipReturnSequences", js.undefined)
    
    @scala.inline
    def setKeytipStartSequencesVarargs(value: IKeytipTransitionKey*): Self = this.set("keytipStartSequences", js.Array(value :_*))
    
    @scala.inline
    def setKeytipStartSequences(value: js.Array[IKeytipTransitionKey]): Self = this.set("keytipStartSequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeytipStartSequences: Self = this.set("keytipStartSequences", js.undefined)
    
    @scala.inline
    def setOnEnterKeytipMode(value: () => Unit): Self = this.set("onEnterKeytipMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnEnterKeytipMode: Self = this.set("onEnterKeytipMode", js.undefined)
    
    @scala.inline
    def setOnExitKeytipMode(
      value: /* ev */ js.UndefOr[KeyboardEvent[HTMLElement] | (MouseEvent[HTMLElement, NativeMouseEvent])] => Unit
    ): Self = this.set("onExitKeytipMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExitKeytipMode: Self = this.set("onExitKeytipMode", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IKeytipLayerStyleProps => DeepPartial[IKeytipLayerStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
