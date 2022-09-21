package typings.mongodbConnectionStringUrl

import typings.mongodbConnectionStringUrl.mod.ConnectionString
import typings.mongodbConnectionStringUrl.mod.ConnectionStringParsingOptions
import typings.mongodbConnectionStringUrl.mongodbConnectionStringUrlStrings.URLSearchParams
import typings.mongodbConnectionStringUrl.redactMod.ConnectionStringRedactionOptions
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Append[T /* <: js.Object */] extends StObject {
    
    def _normalizeKey(name: /* keyof T */ String): String = js.native
    
    def append(name: /* keyof T */ String, value: Any): Unit = js.native
    
    def delete(name: /* keyof T */ String): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[/* keyof T */ String, String]] = js.native
    
    def forEach[THIS_ARG](
      callback: js.ThisFunction3[/* this */ THIS_ARG, /* value */ String, /* name */ String, /* searchParams */ Any, Unit]
    ): Unit = js.native
    def forEach[THIS_ARG](
      callback: js.ThisFunction3[/* this */ THIS_ARG, /* value */ String, /* name */ String, /* searchParams */ Any, Unit],
      thisArg: THIS_ARG
    ): Unit = js.native
    
    def get(name: /* keyof T */ String): String | Null = js.native
    
    def getAll(name: /* keyof T */ String): js.Array[String] = js.native
    
    def has(name: /* keyof T */ String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[/* keyof T */ String, String]]] = js.native
    
    def keys(): IterableIterator[/* keyof T */ String] = js.native
    
    def set(name: /* keyof T */ String, value: Any): Unit = js.native
    
    def sort(): Unit = js.native
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: URLSearchParams = js.native
    
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined std.Readonly<mongodb-connection-string-url.mongodb-connection-string-url/lib.default> */
  @js.native
  trait Readonlydefault extends StObject {
    
    val _hosts: js.Array[String] = js.native
    
    def hash(): String = js.native
    
    def host(): scala.Nothing = js.native
    
    def hostname(): scala.Nothing = js.native
    
    def hosts(): js.Array[String] = js.native
    
    def href(): String = js.native
    
    def isSRV(): Boolean = js.native
    
    def origin(): String = js.native
    
    def password(): String = js.native
    
    def pathname(): String = js.native
    
    def port(): scala.Nothing = js.native
    
    def protocol(): String = js.native
    
    def redact(): ConnectionString = js.native
    def redact(options: ConnectionStringRedactionOptions): ConnectionString = js.native
    
    def search(): String = js.native
    
    def searchParams(): typings.whatwgUrl.mod.URLSearchParams = js.native
    
    def toJSON(): String = js.native
    
    def typedSearchParams[T /* <: js.Object */](): Append[T] = js.native
    
    def username(): String = js.native
  }
}
