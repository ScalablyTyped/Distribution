package typings.mergeAnything

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypeUtilsMergeDeepMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends unknown ? O1 extends unknown ? merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.MergeObjectDeeply<O, O1> : never : never
    }}}
    */
  type MergeDeep[O /* <: Record[String | Double | js.Symbol, Any] */, O1 /* <: Record[String | Double | js.Symbol, Any] */] = MergeObjectDeeply[O, O1]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O & O1 ]: K extends merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.RequiredKeys<O1>? merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.MergeObjectsOrReturnFallback<O[K], O1[K], O1[K]> : K extends merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.OptionalKeys<O1>? K extends merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.OptionalKeys<O>? merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.MergeObjectsOrReturnFallback<std.Exclude<O[K], undefined>, std.Exclude<O1[K], undefined>, std.Exclude<O[K], undefined> | std.Exclude<O1[K], undefined>> : K extends merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.RequiredKeys<O>? std.Exclude<O1[K], undefined> extends O[K]? O[K] : merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.MergeObjectsOrReturnFallback<O[K], std.Exclude<O1[K], undefined>, O[K] | std.Exclude<O1[K], undefined>> : O1[K] : O[K]}
    }}}
    */
  @js.native
  trait MergeObjectDeeply[O /* <: Record[String | Double | js.Symbol, Any] */, O1 /* <: Record[String | Double | js.Symbol, Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends std.Record<string | number | symbol, unknown> ? O1 extends std.Record<string | number | symbol, unknown> ? merge-anything.merge-anything/dist/types/typeUtils/MergeDeep.MergeObjectDeeply<O, O1> : Fallback : Fallback
    }}}
    */
  type MergeObjectsOrReturnFallback[O, O1, Fallback] = Fallback
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    O extends unknown ? {[ K in keyof O ]: -? {} extends std.Pick<O, K>? K : never}[keyof O] : never
    }}}
    */
  @js.native
  trait OptionalKeys[O /* <: js.Object */] extends StObject
  
  /**
    * Get the keys of `O` that are required
    * @param O
    * @returns [[Key]]
    * @example
    * ```ts
    * ```
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    O extends unknown ? {[ K in keyof O ]: -? {} extends std.Pick<O, K>? never : K}[keyof O] : never
    }}}
    */
  @js.native
  trait RequiredKeys[O /* <: js.Object */] extends StObject
}
