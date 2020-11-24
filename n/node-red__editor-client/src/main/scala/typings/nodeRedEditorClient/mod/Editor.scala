package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Complete
import typings.nodeRedEditorClient.anon.Element
import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor extends js.Object {
  
  def buildEditForm(container: JQuery[HTMLElement], formId: String, `type`: String, ns: String, node: js.Any): JQuery[HTMLElement] = js.native
  
  /**
    * Create a editor ui component
    * @param options - the editor options
    */
  def createEditor(options: Element): typings.ace.AceAjax.Editor = js.native
  
  def edit(node: js.Object): Unit = js.native
  
  def editBuffer(options: js.Object): Unit = js.native
  
  /**
    *
    * @param name - name of the property that holds this config node
    * @param type - type of config node
    * @param id - id of config node to edit. _ADD_ for a new one
    * @param prefix - the input prefix of the parent property
    */
  def editConfig(name: String, `type`: String, id: String, prefix: String): Unit = js.native
  
  def editExpression(options: js.Object): Unit = js.native
  
  def editGroup(group: js.Object): Unit = js.native
  
  def editJSON(options: js.Object): Unit = js.native
  
  def editJavaScript(options: js.Object): Unit = js.native
  
  def editMarkdown(options: js.Object): Unit = js.native
  
  def editSubflow(subflow: js.Object): Unit = js.native
  
  def editText(options: Complete): Unit = js.native
  
  def init(): Unit = js.native
  
  /**
    * Register a type editor.
    * @param type - the type name
    * @param definition - the editor definition
    */
  def registerTypeEditor(`type`: String, definition: js.Object): Unit = js.native
  
  def showIconPicker(
    container: JQuery[HTMLElement],
    backgroundColor: String,
    iconPath: js.Object,
    faOnly: Boolean,
    done: js.Function1[/* res */ String, Unit]
  ): Unit = js.native
  
  /**
    * Show a type editor.
    * @param type - the type to display
    * @param options - options for the editor
    */
  def showTypeEditor(`type`: String, options: js.Object): Unit = js.native
  
  /**
    * Called when the node's properties have changed.
    * Marks the node as dirty and needing a size check.
    * Removes any links to non-existant outputs.
    * @param node - the node that has been updated
    * @param outputMap - (optional) a map of old->new port numbers if wires should be moved
    * @returns the links that were removed due to this update
    */
  def updateNodeProperties(node: js.Object): js.Array[js.Object] = js.native
  def updateNodeProperties(node: js.Object, outputMap: Record[String, String]): js.Array[js.Object] = js.native
  
  /**
    * Validate a node
    * @param node - the node being validated
    */
  def validateNode(node: js.Any): Boolean = js.native
}
