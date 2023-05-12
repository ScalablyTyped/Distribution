package typings.mergeAnything

import typings.mergeAnything.distTypesTypeUtilsIterationMod.Iteration
import typings.mergeAnything.mergeAnythingInts.`0`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypeUtilsAssignMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    O extends unknown ? Os extends unknown ? merge-anything.merge-anything/dist/types/typeUtils/Assign._Assign<O, Os> : never : never
    }}}
    */
  @js.native
  trait Assign[O /* <: Record[String | Double | js.Symbol, Any] */, Os /* <: typings.mergeAnything.distTypesTypeUtilsListMod.List[Record[String | Double | js.Symbol, Any]] */] extends StObject
  
  /**
    * Ask TS to re-check that `A1` extends `A2`.
    * And if it fails, `A2` will be enforced anyway.
    * Can also be used to add constraints on parameters.
    * @param A1 to check against
    * @param A2 to cast to
    * @returns `A1 | A2`
    * @example
    * ```ts
    * type test0 = Cast<'42', string> // '42'
    * type test1 = Cast<'42', number> // number
    * ```
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A1 extends A2 ? A1 : A2
    }}}
    */
  type Cast[A1, A2] = A1
  
  /**
    * Check whether `A1` is part of `A2` or not. The difference with
    * `extends` is that it forces a [[Boolean]] return.
    * @param A1
    * @param A2
    * @returns [[Boolean]]
    * @example
    * ```ts
    * type test0 = Extends<'a' | 'b', 'b'> // Boolean
    * type test1 = Extends<'a', 'a' | 'b'> // True
    *
    * type test2 = Extends<{a: string}, {a: any}>      // True
    * type test3 = Extends<{a: any}, {a: any, b: any}> // False
    *
    * type test4 = Extends<never, never> // False
    * /// Nothing cannot extend nothing, use `Equals`
    * ```
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [A1] extends [never] ? 0 : A1 extends A2 ? 1 : 0
    }}}
    */
  type Extends[A1, A2] = `0`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    merge-anything.merge-anything/dist/types/typeUtils/Assign.__Assign<O, Os, merge-anything.merge-anything/dist/types/typeUtils/Iteration.IterationOf<0>> extends infer X ? merge-anything.merge-anything/dist/types/typeUtils/Assign.Cast<X, std.Record<string | number | symbol, unknown>> : never
    }}}
    */
  type _Assign[O /* <: Record[String | Double | js.Symbol, Any] */, Os /* <: typings.mergeAnything.distTypesTypeUtilsListMod.List[Record[String | Double | js.Symbol, Any]] */] = Record[String | Double | js.Symbol, Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    merge-anything.merge-anything/dist/types/typeUtils/Assign.Extends<merge-anything.merge-anything/dist/types/typeUtils/Iteration.Pos<I>, merge-anything.merge-anything/dist/types/typeUtils/List.Length<Os>> extends 1 ? O : merge-anything.merge-anything/dist/types/typeUtils/Assign.__Assign<merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.MergeDeep<O, Os[merge-anything.merge-anything/dist/types/typeUtils/Iteration.Pos<I>]>, Os, merge-anything.merge-anything/dist/types/typeUtils/Iteration.Next<I>>
    }}}
    */
  type __Assign[O /* <: Record[String | Double | js.Symbol, Any] */, Os /* <: typings.mergeAnything.distTypesTypeUtilsListMod.List[Record[String | Double | js.Symbol, Any]] */, I /* <: Iteration */] = O
}
