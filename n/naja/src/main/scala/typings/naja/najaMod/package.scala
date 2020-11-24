package typings.naja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object najaMod {
  
  type AbortEvent = typings.std.CustomEvent[typings.naja.anon.Error]
  
  type BeforeEvent = typings.std.CustomEvent[typings.naja.anon.Data]
  
  type CompleteEvent = typings.std.CustomEvent[typings.naja.anon.Payload]
  
  type ErrorEvent = typings.std.CustomEvent[typings.naja.anon.Request]
  
  type InitEvent = typings.std.CustomEvent[typings.naja.anon.DefaultOptions]
  
  type StartEvent = typings.std.CustomEvent[typings.naja.anon.AbortController]
  
  type SuccessEvent = typings.std.CustomEvent[typings.naja.anon.Options]
}
