package typings.mergeAnything

import typings.mergeAnything.mergeAnythingInts.`0`
import typings.mergeAnything.mergeAnythingInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypeUtilsPrettyPrintMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [U1] extends [U] ? 1 : 0
    }}}
    */
  type Has[U, U1] = `1`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    B extends 1 ? Then : Else
    }}}
    */
  type If[B /* <: `0` | `1` */, Then, Else] = Then
  
  type PrettyPrint[A, Seen] = If[
    Has[Seen, A], 
    A, 
    /* import warning: importer.ImportType#apply Failed type conversion: A extends std.Record<string | number | symbol, unknown> ? {[ K in keyof A ]: merge-anything.merge-anything/dist/types/typeUtils/PrettyPrint.PrettyPrint<A[K], A | Seen>} & unknown : A */ js.Any
  ]
}
