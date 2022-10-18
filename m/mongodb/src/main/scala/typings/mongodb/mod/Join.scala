package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends [] ? '' : T extends [string | number] ? / * template literal string: ${T[0]} * / string : T extends [string | number, ...infer R] ? / * template literal string: ${T[0]}${D}${Join<R,D>} * / string : string
  }}}
  */
@js.native
trait Join[T /* <: js.Array[Any] */, D /* <: String */] extends StObject
