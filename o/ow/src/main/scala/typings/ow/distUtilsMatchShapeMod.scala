package typings.ow

import org.scalablytyped.runtime.StringDictionary
import typings.ow.distPredicatesBasePredicateMod.BasePredicate
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMatchShapeMod {
  
  @JSImport("ow/dist/utils/match-shape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exact(`object`: Record[String, Any], shape: Shape): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def exact(`object`: Record[String, Any], shape: Shape, parent: String): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def exact(`object`: Record[String, Any], shape: Shape, parent: String, isArray: Boolean): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], isArray.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def exact(`object`: Record[String, Any], shape: Shape, parent: Unit, isArray: Boolean): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], isArray.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  
  inline def partial(`object`: Record[String, Any], shape: Shape): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("partial")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def partial(`object`: Record[String, Any], shape: Shape, parent: String): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("partial")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Shape = {[key: string] : ow.ow/dist/predicates/base-predicate.BasePredicate<unknown> | ow.ow/dist/utils/match-shape.Shape}
  }}}
  to avoid circular code involving: 
  - ow.ow/dist/utils/match-shape.Shape
  */
  trait Shape
    extends StObject
       with /* key */ StringDictionary[BasePredicate[Any] | Shape]
  object Shape {
    
    inline def apply(): Shape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shape]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    S extends ow.ow/dist/predicates/base-predicate.BasePredicate<infer X> ? X : S extends ow.ow/dist/utils/match-shape.Shape ? {[ K in keyof S ]: ow.ow/dist/utils/match-shape.TypeOfShape<S[K]>} : never
    }}}
    */
  @js.native
  trait TypeOfShape[S /* <: BasePredicate[Any] | Shape */] extends StObject
}
