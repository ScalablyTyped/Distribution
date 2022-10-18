package typings.octokitTypes

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetResponseTypeFromEndpointMethodMod {
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type GetResponseDataTypeFromEndpointMethod[T /* <: AnyFunction */] = /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/GetResponseTypeFromEndpointMethod.Unwrap<std.ReturnType<T>>['data'] */ js.Any
  
  type GetResponseTypeFromEndpointMethod[T /* <: AnyFunction */] = Unwrap[ReturnType[T]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Promise<infer U> ? U : T
    }}}
    */
  @js.native
  trait Unwrap[T] extends StObject
}
