package typings.nodeRedEditorClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CommSubscriber = js.Function2[/* topic */ java.lang.String, /* data */ js.Any, scala.Unit]
  
  type EditorClientModule = typings.nodeRedEditorClient.nodeRedEditorClientBooleans.`false`
  
  type HistoryEvent = typings.nodeRedEditorClient.anon.Callback with (typings.nodeRedEditorClient.anon.Events | typings.nodeRedEditorClient.anon.Changed | typings.nodeRedEditorClient.anon.Groups | typings.nodeRedEditorClient.anon.Changes | typings.nodeRedEditorClient.anon.AddToGroup | typings.nodeRedEditorClient.anon.CreatedLinks | typings.nodeRedEditorClient.anon.Links | typings.nodeRedEditorClient.anon.MovedNodes | typings.nodeRedEditorClient.anon.Order | typings.nodeRedEditorClient.anon.T | typings.nodeRedEditorClient.anon.GroupsT | typings.nodeRedEditorClient.anon.Nodes | typings.nodeRedEditorClient.anon.NodesT)
  
  type NodeCredentials[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @node-red/editor-client.@node-red/editor-client.NodeCredential}
    */ typings.nodeRedEditorClient.nodeRedEditorClientStrings.NodeCredentials with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type NodeInstance[TProps /* <: typings.nodeRedEditorClient.mod.NodeProperties */] = TProps with typings.nodeRedEditorClient.anon._empty
  
  /**
    * Properties definitions (`defaults` object)
    * Read more: https://nodered.org/docs/creating-nodes/properties
    */
  type NodePropertiesDef[TProps /* <: typings.nodeRedEditorClient.mod.NodeProperties */, TInstProps /* <: TProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TProps ]: @node-red/editor-client.@node-red/editor-client.NodePropertyDef<TProps[K], TInstProps>}
    */ typings.nodeRedEditorClient.nodeRedEditorClientStrings.NodePropertiesDef with org.scalablytyped.runtime.TopLevel[TProps]
}
