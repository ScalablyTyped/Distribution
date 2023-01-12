package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiCoreLibraryMod.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreLabelEnablementMod extends Shortcut {
  
  @JSImport("sap/ui/core/LabelEnablement", JSImport.Default)
  @js.native
  val default: LabelEnablement = js.native
  
  /**
    * @SINCE 1.28.0
    *
    * Helper functionality for enhancement of a `Label` with common label functionality.
    * See:
    * 	sap.ui.core.LabelEnablement#enrich
    */
  trait LabelEnablement extends StObject {
    
    /**
      * This function should be called on a label control to enrich its functionality.
      *
      * **Usage:** The function can be called with a control prototype: ` sap.ui.core.LabelEnablement.enrich(my.Label.prototype);
      * ` Or the function can be called on instance level in the init function of a label control: ` my.Label.prototype.init:
      * function(){ sap.ui.core.LabelEnablement.enrich(this); } `
      *
      * **Preconditions:** The given control must implement the interface sap.ui.core.Label and have an association
      * 'labelFor' with cardinality 0..1. This function extends existing API functions. Ensure not to override
      * these extensions AFTER calling this function.
      *
      * **What does this function do?**
      *
      * A mechanism is added that ensures that a bidirectional reference between the label and its labeled control
      * is established: The label references the labeled control via the HTML 'for' attribute (@see sap.ui.core.LabelEnablement#writeLabelForAttribute).
      * If the labeled control supports the aria-labelledby attribute, a reference to the label is added automatically.
      *
      * In addition an alternative to apply a 'for' reference without influencing the labelFor association of
      * the API is applied (e.g. used by Form). For this purpose the functions setAlternativeLabelFor and getLabelForRendering
      * are added.
      */
    def enrich(
      /**
      * the label control which should be enriched with further label functionality.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit
    
    /**
      * Returns an array of IDs of the labels referencing the given element.
      *
      * @returns an array of ids of the labels referencing the given element
      */
    def getReferencingLabels(
      /**
      * The element whose referencing labels should be returned
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): js.Array[String]
    
    /**
      * @SINCE 1.29.0
      *
      * Returns `true` when the given control is required (property 'required') or one of its referencing labels,
      * `false` otherwise.
      *
      * @returns `true` when the given control is required (property 'required') or one of its referencing labels,
      * `false` otherwise
      */
    def isRequired(
      /**
      * The element which should be checked for its required state
      */
    oElement: typings.openui5.sapUiCoreElementMod.default
    ): Boolean
    
    /**
      * Helper function for the `Label` control to render the HTML 'for' attribute.
      *
      * This function should be called at the desired location in the renderer code of the `Label` control. It
      * can be used with both rendering APIs, with the new semantic rendering API (`apiVersion 2`) as well as
      * with the old, string-based API.
      *
      * As this method renders an attribute, it can only be called while a start tag is open. For the new semantic
      * rendering API, this means it can only be called between an `openStart/voidStart` call and the corresponding
      * `openEnd/voidEnd` call. In the context of the old rendering API, it can be called only after the prefix
      * of a start tag has been written (e.g. after `rm.write("<span id=\"foo\"");`), but before the start
      * tag ended, e.g before the right-angle ">" of the start tag has been written.
      */
    def writeLabelForAttribute(
      /**
      * The RenderManager that can be used for rendering.
      */
    oRenderManager: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * The `Label` for which the 'for' HTML attribute should be rendered.
      */
    oLabel: Label
    ): Unit
  }
  object LabelEnablement {
    
    inline def apply(
      enrich: typings.openui5.sapUiCoreControlMod.default => Unit,
      getReferencingLabels: typings.openui5.sapUiCoreElementMod.default => js.Array[String],
      isRequired: typings.openui5.sapUiCoreElementMod.default => Boolean,
      writeLabelForAttribute: (typings.openui5.sapUiCoreRenderManagerMod.default, Label) => Unit
    ): LabelEnablement = {
      val __obj = js.Dynamic.literal(enrich = js.Any.fromFunction1(enrich), getReferencingLabels = js.Any.fromFunction1(getReferencingLabels), isRequired = js.Any.fromFunction1(isRequired), writeLabelForAttribute = js.Any.fromFunction2(writeLabelForAttribute))
      __obj.asInstanceOf[LabelEnablement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelEnablement] (val x: Self) extends AnyVal {
      
      inline def setEnrich(value: typings.openui5.sapUiCoreControlMod.default => Unit): Self = StObject.set(x, "enrich", js.Any.fromFunction1(value))
      
      inline def setGetReferencingLabels(value: typings.openui5.sapUiCoreElementMod.default => js.Array[String]): Self = StObject.set(x, "getReferencingLabels", js.Any.fromFunction1(value))
      
      inline def setIsRequired(value: typings.openui5.sapUiCoreElementMod.default => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction1(value))
      
      inline def setWriteLabelForAttribute(value: (typings.openui5.sapUiCoreRenderManagerMod.default, Label) => Unit): Self = StObject.set(x, "writeLabelForAttribute", js.Any.fromFunction2(value))
    }
  }
  
  type _To = LabelEnablement
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreLabelEnablementMod.foo` */
  override def _to: LabelEnablement = default
}
