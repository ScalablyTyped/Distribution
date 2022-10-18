package typings.omit

import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Static key
  inline def apply(key: String): js.Function1[
    /* target */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.OmitMultiple<T, string>> : omit.omit.OmitMultiple<T, string> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.OmitMultiple<T, string>> : omit.omit.OmitMultiple<T, string> */ js.Any
  ]]
  inline def apply(key: js.Array[String]): js.Function1[
    /* target */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.OmitMultiple<T, std.Array<string>>> : omit.omit.OmitMultiple<T, std.Array<string>> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.OmitMultiple<T, std.Array<string>>> : omit.omit.OmitMultiple<T, std.Array<string>> */ js.Any
  ]]
  // Static key, with target
  inline def apply[T](key: String, target: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.OmitMultiple<T, string>> : omit.omit.OmitMultiple<T, string> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.OmitMultiple<T, string>> : omit.omit.OmitMultiple<T, string> */ js.Any]
  inline def apply[T](key: js.Array[String], target: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.OmitMultiple<T, std.Array<string>>> : omit.omit.OmitMultiple<T, std.Array<string>> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.OmitMultiple<T, std.Array<string>>> : omit.omit.OmitMultiple<T, std.Array<string>> */ js.Any]
  // Custom key
  inline def apply[K /* <: Key */](rule: Rule[K, Any]): js.Function1[
    /* target */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.MaybeOmitMultiple<T, K>> : omit.omit.MaybeOmitMultiple<T, K> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].apply(rule.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.MaybeOmitMultiple<T, K>> : omit.omit.MaybeOmitMultiple<T, K> */ js.Any
  ]]
  // Custom key, with target
  inline def apply[T, K /* <: Key */](key: Rule[K, Any], target: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.MaybeOmitMultiple<T, K>> : omit.omit.MaybeOmitMultiple<T, K> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer T> ? std.Array<omit.omit.MaybeOmitMultiple<T, K>> : omit.omit.MaybeOmitMultiple<T, K> */ js.Any]
  
  @JSImport("omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Key = String | js.Array[String]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    K extends std.Array<string> ? K[number] : K
    }}}
    */
  @js.native
  trait KeyAsStringType[K /* <: Key */] extends StObject
  
  type MaybeOmitMultiple[T, K /* <: Key */] = (OmitMultiple[T, K]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in std.Extract<keyof T, omit.omit.KeyAsStringType<K>> ]:? T[P]} */ js.Any)
  
  type OmitMultiple[T, K /* <: Key */] = Pick[T, Exclude[/* keyof T */ String, KeyAsStringType[K]]]
  
  type Rule[K /* <: Key */, V] = Key | (js.Function3[/* key */ K, /* value */ V, /* target */ Record[KeyAsStringType[K], V], Boolean])
}
