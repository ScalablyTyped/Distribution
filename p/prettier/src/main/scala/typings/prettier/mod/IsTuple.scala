package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Determines if an object T is an array like string[] (in which case this
// evaluates to false) or a tuple like [string] (in which case this evaluates to
// true).
// eslint-disable-next-line @typescript-eslint/no-unused-vars
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends [] ? true : T extends [infer First, ...infer Remain] ? prettier.prettier.IsTuple<Remain> : false
  }}}
  */
@js.native
trait IsTuple[T] extends StObject
