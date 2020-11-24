package typings.octokitTypes

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/types/dist-types/GetResponseTypeFromEndpointMethod", JSImport.Namespace)
@js.native
object getResponseTypeFromEndpointMethodMod extends js.Object {
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type GetResponseDataTypeFromEndpointMethod[T /* <: AnyFunction */] = /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.Unwrap<std.ReturnType<T>>['data'] */ js.Any
  
  type GetResponseTypeFromEndpointMethod[T /* <: AnyFunction */] = Unwrap[ReturnType[T]]
  
  type Unwrap[T] = T
}
