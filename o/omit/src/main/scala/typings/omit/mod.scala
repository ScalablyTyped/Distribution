package typings.omit

import org.scalablytyped.runtime.TopLevel
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
    (OmitMultiple[Any, String]) | (js.Array[OmitMultiple[Any, String]])
  ] = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ Any, 
    (OmitMultiple[Any, String]) | (js.Array[OmitMultiple[Any, String]])
  ]]
  inline def apply(key: js.Array[String]): js.Function1[
    /* target */ Any, 
    (OmitMultiple[Any, js.Array[String]]) | (js.Array[OmitMultiple[Any, js.Array[String]]])
  ] = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ Any, 
    (OmitMultiple[Any, js.Array[String]]) | (js.Array[OmitMultiple[Any, js.Array[String]]])
  ]]
  // Static key, with target
  inline def apply[T](key: String, target: T): (OmitMultiple[Any, String]) | (js.Array[OmitMultiple[Any, String]]) = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[(OmitMultiple[Any, String]) | (js.Array[OmitMultiple[Any, String]])]
  inline def apply[T](key: js.Array[String], target: T): (OmitMultiple[Any, js.Array[String]]) | (js.Array[OmitMultiple[Any, js.Array[String]]]) = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[(OmitMultiple[Any, js.Array[String]]) | (js.Array[OmitMultiple[Any, js.Array[String]]])]
  // Custom key
  inline def apply[K /* <: Key */](rule: Rule[K, Any]): js.Function1[
    /* target */ Any, 
    (MaybeOmitMultiple[Any, K]) | (js.Array[MaybeOmitMultiple[Any, K]])
  ] = ^.asInstanceOf[js.Dynamic].apply(rule.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* target */ Any, 
    (MaybeOmitMultiple[Any, K]) | (js.Array[MaybeOmitMultiple[Any, K]])
  ]]
  // Custom key, with target
  inline def apply[T, K /* <: Key */](key: Rule[K, Any], target: T): (MaybeOmitMultiple[Any, K]) | (js.Array[MaybeOmitMultiple[Any, K]]) = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[(MaybeOmitMultiple[Any, K]) | (js.Array[MaybeOmitMultiple[Any, K]])]
  
  @JSImport("omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Key = String | js.Array[String]
  
  type KeyAsStringType[K /* <: Key */] = K | (/* import warning: importer.ImportType#apply Failed type conversion: K[number] */ js.Any)
  
  type MaybeOmitMultiple[T, K /* <: Key */] = (OmitMultiple[T, K]) & typings.omit.omitStrings.MaybeOmitMultiple & TopLevel[T]
  
  type OmitMultiple[T, K /* <: Key */] = Pick[T, Exclude[/* keyof T */ String, KeyAsStringType[K]]]
  
  type Rule[K /* <: Key */, V] = Key | (js.Function3[/* key */ K, /* value */ V, /* target */ Record[KeyAsStringType[K], V], Boolean])
}
