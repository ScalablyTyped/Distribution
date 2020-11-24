package typings.nodeRed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EditorNodeCredential = typings.nodeRedEditorClient.mod.NodeCredential
  
  type EditorNodeCredentials[T] = typings.nodeRedEditorClient.mod.NodeCredentials[T]
  
  /**
    * Node Definition
    * Read more: https://nodered.org/docs/creating-nodes/node-html#node-definition
    */
  type EditorNodeDef[TProps /* <: typings.nodeRed.mod.EditorNodeProperties */, TCreds, TInstProps /* <: TProps */] = typings.nodeRedEditorClient.mod.NodeDef[TProps, TCreds, TInstProps]
  
  type EditorNodeInstance[TProps /* <: typings.nodeRed.mod.EditorNodeProperties */] = typings.nodeRedEditorClient.mod.NodeInstance[TProps]
  
  /**
    * Node properties
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type EditorNodeProperties = typings.nodeRedEditorClient.mod.NodeProperties
  
  /**
    * Properties definitions (`defaults` object)
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type EditorNodePropertiesDef[TProps /* <: typings.nodeRed.mod.EditorNodeProperties */, TInstProps /* <: TProps */] = typings.nodeRedEditorClient.mod.NodePropertiesDef[TProps, TInstProps]
  
  /********************************************************************
    * Type shortcuts for writing the editor side of nodes (.html file)
    ********************************************************************/
  /**
    * Property definition
    * Read more: https://nodered.org/docs/creating-nodes/properties#property-definitions
    */
  type EditorNodePropertyDef[TVal, TInstProps /* <: typings.nodeRed.mod.EditorNodeProperties */] = typings.nodeRedEditorClient.mod.NodePropertyDef[TVal, TInstProps]
  
  /**
    * Type def for the global `RED` in the node .html files.
    * Should be used to access `RED.nodes.registerType` function
    * registering a node with the editor.
    *
    * Example:
    * ```
    * declare const RED: EditorRED;
    *
    * RED.nodes.registerType<
    *   MyNodeProps
    * >("my-node", {
    *   ...
    * })
    * ```
    *
    */
  type EditorRED = typings.nodeRedEditorClient.mod.RED
  
  type EditorWidgetEditableList = typings.nodeRedEditorClient.mod.WidgetEditableList
  
  /**
    * WIDGETS
    */
  type EditorWidgetEditableListOptions[T] = typings.nodeRedEditorClient.mod.WidgetEditableListOptions[T]
  
  type EditorWidgetTypedInput = typings.nodeRedEditorClient.mod.WidgetTypedInput
  
  type EditorWidgetTypedInputOptions = typings.nodeRedEditorClient.mod.WidgetTypedInputOptions
  
  type EditorWidgetTypedInputType = typings.nodeRedEditorClient.mod.WidgetTypedInputType
  
  type EditorWidgetTypedInputTypeDefinition = typings.nodeRedEditorClient.mod.WidgetTypedInputTypeDefinition
  
  type Node[TCreds /* <: js.Object */] = typings.nodeRedRegistry.mod.Node[TCreds]
  
  type NodeAPI[TSets /* <: typings.nodeRed.mod.NodeAPISettingsWithData */] = typings.nodeRedRegistry.mod.NodeAPI[TSets]
  
  type NodeAPISettingsWithData = typings.nodeRedRegistry.mod.NodeAPISettingsWithData
  
  type NodeConstructor[TNode /* <: typings.nodeRed.mod.Node[TCreds] */, TNodeDef /* <: typings.nodeRed.mod.NodeDef */, TCreds] = typings.nodeRedRegistry.mod.NodeConstructor[TNode, TNodeDef, TCreds]
  
  type NodeContext = typings.nodeRedRegistry.mod.NodeContext
  
  type NodeContextData = typings.nodeRedRegistry.mod.NodeContextData
  
  type NodeCredential = typings.nodeRedRegistry.mod.NodeCredential
  
  type NodeCredentials[TCreds] = typings.nodeRedRegistry.mod.NodeCredentials[TCreds]
  
  type NodeDef = typings.nodeRedRegistry.mod.NodeDef
  
  /*******************************************************************
    * Type shortcuts for writing the runtime side of nodes (.js file)
    *******************************************************************/
  /**
    * Type def for the functions that should be exported
    * by the node .js files.
    */
  type NodeInitializer[TSets /* <: typings.nodeRed.mod.NodeAPISettingsWithData */] = typings.nodeRedRegistry.mod.NodeInitializer[TSets]
  
  type NodeMessage = typings.nodeRedRegistry.mod.NodeMessage
  
  type NodeMessageInFlow = typings.nodeRedRegistry.mod.NodeMessageInFlow
  
  type NodeMessageParts = typings.nodeRedRegistry.mod.NodeMessageParts
  
  type NodeSetting[T] = typings.nodeRedRegistry.mod.NodeSetting[T]
  
  type NodeSettings[TSets] = typings.nodeRedRegistry.mod.NodeSettings[TSets]
  
  type NodeStatus = typings.nodeRedRegistry.mod.NodeStatus
  
  type NodeStatusFill = typings.nodeRedRegistry.mod.NodeStatusFill
  
  type NodeStatusShape = typings.nodeRedRegistry.mod.NodeStatusShape
}
