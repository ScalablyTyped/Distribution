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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node Definition
  * Read more: https://nodered.org/docs/creating-nodes/node-html#node-definition
  */
@js.native
trait NodeDef[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */] extends js.Object {
  
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
  implicit class NodeDefOps[Self <: NodeDef[_, _, _], TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */] (val x: Self with (NodeDef[TProps, TCreds, TInstProps])) extends AnyVal {
    
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
    def setCategory(value: config | String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: NodePropertiesDef[TProps, TInstProps]): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlign(value: left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setButton(value: Enabled[TInstProps, TProps]): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCredentials(value: NodeCredentials[TCreds]): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInputLabels(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = this.set("inputLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLabels: Self = this.set("inputLabels", js.undefined)
    
    @scala.inline
    def setInputs(value: `0` | `1`): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setLabel(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelStyle(
      value: node_label | node_label_italic | String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], node_label | node_label_italic | String])
    ): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setOneditcancel(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = this.set("oneditcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneditcancel: Self = this.set("oneditcancel", js.undefined)
    
    @scala.inline
    def setOneditdelete(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = this.set("oneditdelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneditdelete: Self = this.set("oneditdelete", js.undefined)
    
    @scala.inline
    def setOneditprepare(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = this.set("oneditprepare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneditprepare: Self = this.set("oneditprepare", js.undefined)
    
    @scala.inline
    def setOneditresize(value: js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* size */ Height, Unit]): Self = this.set("oneditresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneditresize: Self = this.set("oneditresize", js.undefined)
    
    @scala.inline
    def setOneditsave(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = this.set("oneditsave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneditsave: Self = this.set("oneditsave", js.undefined)
    
    @scala.inline
    def setOnpaletteadd(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = this.set("onpaletteadd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpaletteadd: Self = this.set("onpaletteadd", js.undefined)
    
    @scala.inline
    def setOnpaletteremove(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Unit]): Self = this.set("onpaletteremove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpaletteremove: Self = this.set("onpaletteremove", js.undefined)
    
    @scala.inline
    def setOutputLabelsVarargs(value: String*): Self = this.set("outputLabels", js.Array(value :_*))
    
    @scala.inline
    def setOutputLabels(
      value: String | js.Array[String] | (js.ThisFunction1[/* this */ NodeInstance[TInstProps], /* idx */ Double, js.UndefOr[String]])
    ): Self = this.set("outputLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLabels: Self = this.set("outputLabels", js.undefined)
    
    @scala.inline
    def setOutputs(value: Double): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    
    @scala.inline
    def setPaletteLabel(value: String | (js.ThisFunction0[/* this */ NodeInstance[TInstProps], String])): Self = this.set("paletteLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteLabel: Self = this.set("paletteLabel", js.undefined)
  }
}
