package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Match {
  
  trait Matcher[T] extends StObject {
    
    var _meteorCheckMatcherBrand: Unit
  }
  object Matcher {
    
    inline def apply[T](_meteorCheckMatcherBrand: Unit): Matcher[T] = {
      val __obj = js.Dynamic.literal(_meteorCheckMatcherBrand = _meteorCheckMatcherBrand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matcher[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Matcher[?], T] (val x: Self & Matcher[T]) extends AnyVal {
      
      inline def set_meteorCheckMatcherBrand(value: Unit): Self = StObject.set(x, "_meteorCheckMatcherBrand", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Pattern = std.StringConstructor | std.NumberConstructor | std.BooleanConstructor | std.ObjectConstructor | std.FunctionConstructor | new (args : ...any): any | undefined | null | string | number | boolean | [meteor.Match.Pattern] | {[key: string] : meteor.Match.Pattern} | meteor.Match.Matcher<any>
  }}}
  to avoid circular code involving: 
  - meteor.Match.Pattern
  */
  type Pattern = js.UndefOr[
    StringConstructor | NumberConstructor | BooleanConstructor | ObjectConstructor | FunctionConstructor | (Instantiable1[/* args (repeated) */ Any, Any]) | Null | String | Double | Boolean | js.Array[Any] | StringDictionary[Any] | Matcher[Any]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends meteor.Match.Matcher<infer U> ? U : T extends std.StringConstructor ? string : T extends std.NumberConstructor ? number : T extends std.BooleanConstructor ? boolean : T extends std.ObjectConstructor ? object : T extends std.FunctionConstructor ? std.Function : T extends undefined | null | string | number | boolean ? T : T extends new (args : ...any): infer U ? U : // eslint-disable-next-line no-single-element-tuple-type
  T extends [meteor.Match.Pattern] ? std.Array<meteor.Match.PatternMatch<T[0]>> : T extends {[key: string] : meteor.Match.Pattern} ? {[ K in keyof T ]: meteor.Match.PatternMatch<T[K]>} : unknown
    }}}
    */
  type PatternMatch[T /* <: Pattern */] = String
}
