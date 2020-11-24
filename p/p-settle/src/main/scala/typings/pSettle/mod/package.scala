package typings.pSettle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // TODO: Use the native version when TS supports it (should be in v4).
  type Awaited[T] = T
  
  type PromiseFulfilledResult[ValueType] = typings.pReflect.mod.PromiseFulfilledResult[ValueType]
  
  type PromiseRejectedResult = typings.pReflect.mod.PromiseRejectedResult
  
  type PromiseResult[ValueType] = typings.pReflect.mod.PromiseResult[ValueType]
  
  type ReturnValue[T] = T | typings.std.ReturnType[T]
}
