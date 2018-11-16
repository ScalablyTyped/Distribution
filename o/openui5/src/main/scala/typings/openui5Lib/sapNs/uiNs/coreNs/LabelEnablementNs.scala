package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.LabelEnablement")
@js.native
object LabelEnablementNs extends js.Object {
  /**
           * This function should be called on a label control to enrich it's functionality.<b>Usage:</b>The
           * function can be called with a control
           * prototype:<code>sap.ui.core.LabelEnablement.enrich(my.Label.prototype);</code>Or the function can be
           * called on instance level in the init function of a label control:<code>my.Label.prototype.init:
           * function(){   sap.ui.core.LabelEnablement.enrich(this);}</code><b>Preconditions:</b>The given
           * control must implement the interface sap.ui.core.Label and have an association 'labelFor' with
           * cardinality 0..1.This function extends existing API functions. Ensure not to override this
           * extensions AFTER calling this function.<b>What does this function do?</b>A mechanismn is added that
           * ensures that a bidirectional reference between the label and it's labeled control is established:The
           * label references the labeled control via the html 'for' attribute (@see
           * sap.ui.core.LabelEnablement#writeLabelForAttribute).If the labeled control supports the
           * aria-labelledby attribute. A reference to the label is added automatically.In addition an
           * alternative to apply a for reference without influencing the labelFor association of the API is
           * applied (e.g. used by Form).For this purpose the functions setAlternativeLabelFor and
           * getLabelForRendering are added.
           * @param oControl the label control which should be enriched with further label functionality.
          */
  def enrich(oControl: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Unit = js.native
  /**
           * Returns an array of ids of the labels referencing the given element
           * @param oElement The element whose referencing labels should be returned
           * @returns an array of ids of the labels referencing the given element
          */
  def getReferencingLabels(oElement: openui5Lib.sapNs.uiNs.coreNs.Element): js.Array[java.lang.String] = js.native
  /**
           * Returns <code>true</code> when the given control is required (property 'required') or one of its
           * referencing labels, <code>false</code> otherwise.
           * @since 1.29.0
           * @param oElement The element which should be checked for its required state
           * @returns <code>true</code> when the given control is required (property 'required') or one of its
           * referencing labels, <code>false</code> otherwise
          */
  def isRequired(oElement: openui5Lib.sapNs.uiNs.coreNs.Element): scala.Boolean = js.native
  /**
           * Helper function for the label control to render the html 'for' attribute. This function should be
           * calledat the desired location in the renderer code of the label control.
           * @param oRenderManager The RenderManager that can be used for writing to the render-output-buffer.
           * @param oLabel The label for which the 'for' html attribute should be written to the
           * render-output-buffer.
          */
  def writeLabelForAttribute(oRenderManager: openui5Lib.sapNs.uiNs.coreNs.RenderManager, oLabel: js.Any): scala.Unit = js.native
}

