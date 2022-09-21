package typings.postcssOrderedValues

import typings.std.IterableIterator
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathfunctionsMod {
  
  @JSImport("postcss-ordered-values/types/lib/mathfunctions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(value: String): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(value.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def delete(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def entries(): IterableIterator[js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[String, String]]]
  
  inline def forEach(callbackfn: js.Function3[/* value */ String, /* value2 */ String, /* set */ Set[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def forEach(
    callbackfn: js.Function3[/* value */ String, /* value2 */ String, /* set */ Set[String], Unit],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def has(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[String]]
  
  @JSImport("postcss-ordered-values/types/lib/mathfunctions", "size")
  @js.native
  val size: Double = js.native
  
  inline def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
}
