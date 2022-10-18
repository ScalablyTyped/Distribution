package typings.prettier.mod

import typings.prettier.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// A union of the properties of the given array T that can be used to index it.
// If the array is a tuple, then that's going to be the explicit indices of the
// array, otherwise it's going to just be number.
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  prettier.prettier.IsTuple<T> extends true ? std.Exclude<std.Partial<T>['length'], T['length']> : number
  }}}
  */
@js.native
trait IndexProperties[T /* <: Length */] extends StObject
