package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends std.Record<string, any> ? {[ key in keyof T ]:? mongodb.mongodb.FilterOperators<T[key]>} : mongodb.mongodb.FilterOperators<T>
  }}}
  */
@js.native
trait FilterOperations[T] extends StObject
