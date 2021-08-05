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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node Definition
  * Read more: https://nodered.org/docs/creating-nodes/node-html#node-definition
  */
trait NodeDef[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */] extends StObject {
  
  /**
    * The alignment of the icon and label.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#alignment
    */
  var align: js.UndefOr[left | right] = js.undefined
  
  /**
    * Adds a button to the edge of the node.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#buttons
    */
  var button: js.UndefOr[Enabled[TInstProps, TProps]] = js.undefined
  
  /** The palette category the node appears in. */
  var category: config | String
  
  /**
    * The background colour to use.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#background-colour
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The credential properties for the node.
    * Read more: https://nodered.org/docs/creating-nodes/credentials
    */
  var credentials: js.UndefOr[NodeCredentials[TCreds]] = js.undefined
  
  /**
    * The editable properties for the node.
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  var defaults: NodePropertiesDef[TProps, TInstProps]
  
  /**
    * The icon to use.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#icon
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Optional label to add on hover to the input port of a node.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#port-labels
    */
  var inputLabels: js.UndefOr[String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])] = js.undefined
  
  /**
    * How many inputs the node has, either 0 or 1.
    */
  var inputs: js.UndefOr[`0` | `1`] = js.undefined
  
  /**
    * The label to use in the workspace.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#node-label
    */
  var label: js.UndefOr[String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])] = js.undefined
  
  /**
    * The style to apply to the label.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#label-style
    */
  var labelStyle: js.UndefOr[
    node_label | node_label_italic | String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], node_label | node_label_italic | String])
  ] = js.undefined
  
  /**
    * Called when the edit dialog is cancelled.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditcancel: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.undefined
  
  /**
    * Called when the delete button in a configuration node’s edit dialog is pressed.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditdelete: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.undefined
  
  /**
    * Called when the edit dialog is being built.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditprepare: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.undefined
  
  /**
    * Called when the edit dialog is resized.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditresize: js.UndefOr[js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* size */ Height, Unit]] = js.undefined
  
  /**
    * Called when the edit dialog is okayed.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var oneditsave: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.undefined
  
  /**
    * Called when the node type is added to the palette.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var onpaletteadd: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.undefined
  
  /**
    * Called when the node type is removed from the palette.
    * Read more: https://nodered.org/docs/creating-nodes/properties#custom-edit-behaviour
    */
  var onpaletteremove: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]] = js.undefined
  
  /**
    * Optional labels to add on hover to the output ports of a node.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#port-labels
    */
  var outputLabels: js.UndefOr[
    String | js.Array[String] | (js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* idx */ Double, js.UndefOr[String]])
  ] = js.undefined
  
  /**
    * How many outputs the node has. Can be 0 or more.
    */
  var outputs: js.UndefOr[Double] = js.undefined
  
  /**
    * The label to use in the palette.
    * Read more: https://nodered.org/docs/creating-nodes/appearance#palette-label
    */
  var paletteLabel: js.UndefOr[String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])] = js.undefined
}
object NodeDef {
  
  inline def apply[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */](category: config | String, defaults: NodePropertiesDef[TProps, TInstProps]): NodeDef[TProps, TCreds, TInstProps] = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDef[TProps, TCreds, TInstProps]]
  }
  
  extension [Self <: NodeDef[?, ?, ?], TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */](x: Self & (NodeDef[TProps, TCreds, TInstProps])) {
    
    inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setButton(value: Enabled[TInstProps, TProps]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setCategory(value: config | String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCredentials(value: NodeCredentials[TCreds]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setDefaults(value: NodePropertiesDef[TProps, TInstProps]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInputLabels(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = StObject.set(x, "inputLabels", value.asInstanceOf[js.Any])
    
    inline def setInputLabelsUndefined: Self = StObject.set(x, "inputLabels", js.undefined)
    
    inline def setInputs(value: `0` | `1`): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setLabel(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(
      value: node_label | node_label_italic | String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], node_label | node_label_italic | String])
    ): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOneditcancel(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "oneditcancel", value.asInstanceOf[js.Any])
    
    inline def setOneditcancelUndefined: Self = StObject.set(x, "oneditcancel", js.undefined)
    
    inline def setOneditdelete(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "oneditdelete", value.asInstanceOf[js.Any])
    
    inline def setOneditdeleteUndefined: Self = StObject.set(x, "oneditdelete", js.undefined)
    
    inline def setOneditprepare(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "oneditprepare", value.asInstanceOf[js.Any])
    
    inline def setOneditprepareUndefined: Self = StObject.set(x, "oneditprepare", js.undefined)
    
    inline def setOneditresize(value: js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* size */ Height, Unit]): Self = StObject.set(x, "oneditresize", value.asInstanceOf[js.Any])
    
    inline def setOneditresizeUndefined: Self = StObject.set(x, "oneditresize", js.undefined)
    
    inline def setOneditsave(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "oneditsave", value.asInstanceOf[js.Any])
    
    inline def setOneditsaveUndefined: Self = StObject.set(x, "oneditsave", js.undefined)
    
    inline def setOnpaletteadd(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "onpaletteadd", value.asInstanceOf[js.Any])
    
    inline def setOnpaletteaddUndefined: Self = StObject.set(x, "onpaletteadd", js.undefined)
    
    inline def setOnpaletteremove(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = StObject.set(x, "onpaletteremove", value.asInstanceOf[js.Any])
    
    inline def setOnpaletteremoveUndefined: Self = StObject.set(x, "onpaletteremove", js.undefined)
    
    inline def setOutputLabels(
      value: String | js.Array[String] | (js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* idx */ Double, js.UndefOr[String]])
    ): Self = StObject.set(x, "outputLabels", value.asInstanceOf[js.Any])
    
    inline def setOutputLabelsUndefined: Self = StObject.set(x, "outputLabels", js.undefined)
    
    inline def setOutputLabelsVarargs(value: String*): Self = StObject.set(x, "outputLabels", js.Array(value :_*))
    
    inline def setOutputs(value: Double): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setPaletteLabel(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = StObject.set(x, "paletteLabel", value.asInstanceOf[js.Any])
    
    inline def setPaletteLabelUndefined: Self = StObject.set(x, "paletteLabel", js.undefined)
  }
}
