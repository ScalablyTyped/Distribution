package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.CallAfterInitialVariant
import typings.openui5.anon.Control
import typings.openui5.anon.Element
import typings.openui5.anon.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiFlApplyApiControlVariantApplyAPIMod extends Shortcut {
  
  @JSImport("sap/ui/fl/apply/api/ControlVariantApplyAPI", JSImport.Default)
  @js.native
  val default: ControlVariantApplyAPI = js.native
  
  /**
    * @SINCE 1.67
    * @EXPERIMENTAL (since 1.67)
    *
    * Provides an API for applications to work with control variants. See also {@link sap.ui.fl.variants.VariantManagement}.
    */
  trait ControlVariantApplyAPI extends StObject {
    
    /**
      * Activates the passed variant applicable to the passed control/component.
      *
      * @returns Resolves after the variant is activated or rejects if an error occurs
      */
    def activateVariant(/**
      * Object with parameters as properties
      */
    mPropertyBag: Element): js.Promise[Any]
    
    /**
      * Saves a function that will be called after a variant has been applied with the new variant as parameter.
      * Even if the same variant is selected again the callback is called. The function also performs a sanity
      * check after the control has been rendered. If the passed variant control ID does not match the responsible
      * variant management control, the callback will not be saved. Optionally this function is also called after
      * the initial variant is applied without a sanity check.
      */
    def attachVariantApplied(/**
      * Object with parameters as properties
      */
    mPropertyBag: CallAfterInitialVariant): Unit
    
    /**
      * Clears URL technical parameter `sap-ui-fl-control-variant-id` for control variants. Use this method in
      * case you normally want the variant parameter in the URL, but have a few special navigation patterns where
      * you want to clear it. If you don't want that parameter in general, set the `updateVariantInURL` parameter
      * on your variant management control to `false`. SAP Fiori elements use this method. If a variant management
      * control is given as a parameter, only parameters specific to that control are cleared.
      */
    def clearVariantParameterInURL(/**
      * Object with parameters as properties
      */
    mPropertyBag: Control): Unit
    
    /**
      * Removes the saved callback for the given control and variant management control.
      */
    def detachVariantApplied(/**
      * Object with parameters as properties
      */
    mPropertyBag: Selector): Unit
  }
  object ControlVariantApplyAPI {
    
    inline def apply(
      activateVariant: Element => js.Promise[Any],
      attachVariantApplied: CallAfterInitialVariant => Unit,
      clearVariantParameterInURL: Control => Unit,
      detachVariantApplied: Selector => Unit
    ): ControlVariantApplyAPI = {
      val __obj = js.Dynamic.literal(activateVariant = js.Any.fromFunction1(activateVariant), attachVariantApplied = js.Any.fromFunction1(attachVariantApplied), clearVariantParameterInURL = js.Any.fromFunction1(clearVariantParameterInURL), detachVariantApplied = js.Any.fromFunction1(detachVariantApplied))
      __obj.asInstanceOf[ControlVariantApplyAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlVariantApplyAPI] (val x: Self) extends AnyVal {
      
      inline def setActivateVariant(value: Element => js.Promise[Any]): Self = StObject.set(x, "activateVariant", js.Any.fromFunction1(value))
      
      inline def setAttachVariantApplied(value: CallAfterInitialVariant => Unit): Self = StObject.set(x, "attachVariantApplied", js.Any.fromFunction1(value))
      
      inline def setClearVariantParameterInURL(value: Control => Unit): Self = StObject.set(x, "clearVariantParameterInURL", js.Any.fromFunction1(value))
      
      inline def setDetachVariantApplied(value: Selector => Unit): Self = StObject.set(x, "detachVariantApplied", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ControlVariantApplyAPI
  
  /* This means you don't have to write `default`, but can instead just say `sapUiFlApplyApiControlVariantApplyAPIMod.foo` */
  override def _to: ControlVariantApplyAPI = default
}
