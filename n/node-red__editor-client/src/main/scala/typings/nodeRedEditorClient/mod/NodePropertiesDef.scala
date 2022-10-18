package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties definitions (`defaults` object)
  * Read more: https://nodered.org/docs/creating-nodes/properties
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {[ K in keyof TProps ]: K extends @node-red/editor-client.@node-red/editor-client.NodeReservedProperties? never : @node-red/editor-client.@node-red/editor-client.NodePropertyDef<TProps[K], TInstProps>}
  }}}
  */
@js.native
trait NodePropertiesDef[TProps /* <: NodeProperties */, TInstProps /* <: TProps */] extends StObject
