package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.Extract
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypeMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getType(`type`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBoolean(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(a: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def typeOf(input: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type EmptyObject = js.Object
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends never ? never extends T ? misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.falsy : std.Extract<T, misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.falsy> : std.Extract<T, misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.falsy>
    }}}
    */
  type Falsy_[T] = T
  
  type Fn[args /* <: js.Array[Any] */, returnValue /* <: Any */] = js.Function1[/* args */ args, returnValue]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation throws away the known field names. 
    * TS definition: {{{
    {[ k in K ]: V}
    }}}
    */
  type Map[K /* <: String */, V] = StringDictionary[V]
  
  type NotFalsy[T] = Exclude[T, falsy]
  
  type NotUndefined[T] = Exclude[T, Unit]
  
  type ObjectStringKeyUnion[T /* <: Any */] = Extract[/* keyof T */ String, String]
  
  type PropertyOptional[O, K /* <: /* keyof O */ String */] = (RemoveProperties[O, K]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ a in K ]:? O[K]} */ js.Any)
  
  type RemoveProperties[O, K /* <: /* keyof O */ String */] = Pick[O, Exclude[/* keyof O */ String, K]]
  
  type TODO = Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends any ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
  
  trait _falsy extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - scala.Null
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericBooleans.`false`
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericStrings._empty
    - typings.miscUtilsOfMineGeneric.miscUtilsOfMineGenericInts.`0`
  */
  type falsy = js.UndefOr[_falsy | Null]
}
