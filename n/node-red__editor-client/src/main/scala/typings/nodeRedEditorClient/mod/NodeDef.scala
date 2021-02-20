package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Enabled
import typings.nodeRedEditorClient.anon.Height
import typings.nodeRedEditorClient.nodeRedEditorClientNumbers.`0`
import typings.nodeRedEditorClient.nodeRedEditorClientNumbers.`1`
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.config
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.node_label
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.node_label_italic
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node Definition
  * Read more: https://nodered.org/docs/creating-nodes/node-html#node-definition
  */
@js.native
trait NodeDef[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */] extends StObject {
  
  /**
    * The alignment of the icon and label.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#alignment
    */
  var align: js.UndefOr[left | right] = js.native
  
  /**
    * Adds a button to the edge of the node.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#buttons
    */
  var button: js.UndefOr[Enabled[TInstProps, TProps]] = js.native
  
  /** The palette category the node appears in. */
  var category: config | String = js.native
  
  /**
    * The background colour to use.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#background-colour
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * The credential properties for the node.
    * Read more: https://nodered.org/docs/creating-nodes/credentials
    */
  var credentials: js.UndefOr[NodeCredentials[TCreds]] = js.native
  
  /**
    * The editable properties for the node.
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  var defaults: NodePropertiesDef[TProps, TInstProps] = js.native
  
  /**
    * The icon to use.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#icon
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * Optional label to add on hover to the input port of a node.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#port-labels
    */
  var inputLabels: js.UndefOr[String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])] = js.native
  
  /**
    * How many inputs the node has, either 0 or 1.
    */
  var inputs: js.UndefOr[`0` | `1`] = js.native
  
  /**
    * The label to use in the workspace.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#node-label
    */
  var label: js.UndefOr[String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])] = js.native
  
  /**
    * The style to apply to the label.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#label-style
    */
  var labelStyle: js.UndefOr[
    node_label | node_label_italic | String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], node_label | node_label_italic | String])
  ] = js.native
  
  /**
    * Called when the edit dialog is cancelled.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditcancel: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.native
  
  /**
    * Called when the delete button in a configuration node’s edit dialog is pressed.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditdelete: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.native
  
  /**
    * Called when the edit dialog is being built.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditprepare: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.native
  
  /**
    * Called when the edit dialog is resized.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditresize: js.UndefOr[js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* size */ Height, Unit]] = js.native
  
  /**
    * Called when the edit dialog is okayed.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditsave: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.native
  
  /**
    * Called when the node type is added to the palette.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var onpaletteadd: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.native
  
  /**
    * Called when the node type is removed from the palette.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var onpaletteremove: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.native
  
  /**
    * Optional labels to add on hover to the output ports of a node.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#port-labels
    */
  var outputLabels: js.UndefOr[
    String | js.Array[String] | (js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* idx */ Double, js.UndefOr[String]])
  ] = js.native
  
  /**
    * How many outputs the node has. Can be 0 or more.
    */
  var outputs: js.UndefOr[Double] = js.native
  
  /**
    * The label to use in the palette.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#palette-label
    */
  var paletteLabel: js.UndefOr[String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])] = js.native
}
object NodeDef {
  
  @scala.inline
  def apply[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */](category: config | String, defaults: NodePropertiesDef[TProps, TInstProps]): NodeDef[TProps, TCreds, TInstProps] = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDef[TProps, TCreds, TInstProps]]
  }
  
  @scala.inline
  implicit class NodeDefMutableBuilder[Self <: NodeDef[_, _, _], TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */] (val x: Self with (NodeDef[TProps, TCreds, TInstProps])) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setButton(value: Enabled[TInstProps, TProps]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setCategory(value: config | String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCredentials(value: NodeCredentials[TCreds]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setDefaults(value: NodePropertiesDef[TProps, TInstProps]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setInputLabels(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = StObject.set(x, "inputLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLabelsUndefined: Self = StObject.set(x, "inputLabels", js.undefined)
    
    @scala.inline
    def setInputs(value: `0` | `1`): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setLabel(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyle(
      value: node_label | node_label_italic | String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], node_label | node_label_italic | String])
    ): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOneditcancel(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "oneditcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneditcancelUndefined: Self = StObject.set(x, "oneditcancel", js.undefined)
    
    @scala.inline
    def setOneditdelete(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "oneditdelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneditdeleteUndefined: Self = StObject.set(x, "oneditdelete", js.undefined)
    
    @scala.inline
    def setOneditprepare(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "oneditprepare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneditprepareUndefined: Self = StObject.set(x, "oneditprepare", js.undefined)
    
    @scala.inline
    def setOneditresize(value: js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* size */ Height, Unit]): Self = StObject.set(x, "oneditresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneditresizeUndefined: Self = StObject.set(x, "oneditresize", js.undefined)
    
    @scala.inline
    def setOneditsave(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "oneditsave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneditsaveUndefined: Self = StObject.set(x, "oneditsave", js.undefined)
    
    @scala.inline
    def setOnpaletteadd(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "onpaletteadd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpaletteaddUndefined: Self = StObject.set(x, "onpaletteadd", js.undefined)
    
    @scala.inline
    def setOnpaletteremove(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "onpaletteremove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpaletteremoveUndefined: Self = StObject.set(x, "onpaletteremove", js.undefined)
    
    @scala.inline
    def setOutputLabels(
      value: String | js.Array[String] | (js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* idx */ Double, js.UndefOr[String]])
    ): Self = StObject.set(x, "outputLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLabelsUndefined: Self = StObject.set(x, "outputLabels", js.undefined)
    
    @scala.inline
    def setOutputLabelsVarargs(value: String*): Self = StObject.set(x, "outputLabels", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: Double): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setPaletteLabel(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = StObject.set(x, "paletteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteLabelUndefined: Self = StObject.set(x, "paletteLabel", js.undefined)
  }
}
