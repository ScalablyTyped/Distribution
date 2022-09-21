package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.TopLevel
import typings.nodeRedEditorClient.anon.ReadonlyI18nTFunctionidst
import typings.nodeRedEditorClient.nodeRedEditorClientBooleans.`false`
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CommSubscriber = js.Function2[/* topic */ String, /* data */ Any, Unit]

type EditorClientModule = `false`

type NodeCredentials[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: @node-red/editor-client.@node-red/editor-client.NodeCredential}
  */ typings.nodeRedEditorClient.nodeRedEditorClientStrings.NodeCredentials & TopLevel[Any]

type NodeInstance[TProps /* <: NodeProperties */] = (Omit[TProps, NodeReservedProperties]) & ReadonlyI18nTFunctionidst

/**
  * Properties definitions (`defaults` object)
  * Read more: https://nodered.org/docs/creating-nodes/properties
  */
type NodePropertiesDef[TProps /* <: NodeProperties */, TInstProps /* <: TProps */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof TProps ]: K extends @node-red/editor-client.@node-red/editor-client.NodeReservedProperties? never : @node-red/editor-client.@node-red/editor-client.NodePropertyDef<TProps[K], TInstProps>}
  */ typings.nodeRedEditorClient.nodeRedEditorClientStrings.NodePropertiesDef & TopLevel[TProps]
