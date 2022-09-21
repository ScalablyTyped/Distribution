package typings.postcssNormalizeDisplayValues

import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("postcss-normalize-display-values/types/lib/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def delete(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def entries(): IterableIterator[js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")().asInstanceOf[IterableIterator[js.Tuple2[String, String]]]
  
  inline def forEach(
    callbackfn: js.Function3[/* value */ String, /* key */ String, /* map */ Map[String, String], Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def forEach(
    callbackfn: js.Function3[/* value */ String, /* key */ String, /* map */ Map[String, String], Unit],
    thisArg: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(callbackfn.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def get(key: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def has(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[IterableIterator[String]]
  
  inline def set(key: String, value: String): Map[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Map[String, String]]
  
  @JSImport("postcss-normalize-display-values/types/lib/map", "size")
  @js.native
  val size: Double = js.native
  
  inline def values(): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")().asInstanceOf[IterableIterator[String]]
}
