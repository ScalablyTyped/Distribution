package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.ReadonlyI18nTFunctionidst
import typings.nodeRedEditorClient.nodeRedEditorClientBooleans.`false`
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CommSubscriber = js.Function2[/* topic */ String, /* data */ Any, Unit]

type EditorClientModule = `false`

type NodeInstance[TProps /* <: NodeProperties */] = (Omit[TProps, NodeReservedProperties]) & ReadonlyI18nTFunctionidst
