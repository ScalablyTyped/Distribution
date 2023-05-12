package typings.mergeAnything

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypeUtilsListMod {
  
  type Length[L /* <: typings.mergeAnything.distTypesTypeUtilsListMod.List[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: L['length'] */ js.Any
  
  type List[T] = js.Array[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    L extends [] ? never : L extends [...std.Array<unknown>, infer Last] ? Last : L extends std.Array<infer T> ? T : never
    }}}
    */
  @js.native
  trait Pop[L /* <: typings.mergeAnything.distTypesTypeUtilsListMod.List[Any] */] extends StObject
}
