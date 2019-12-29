package typings.node.urlMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "URLSearchParams")
@js.native
class URLSearchParams ()
  extends Iterable[js.Tuple2[String, String]] {
  def this(init: String) = this()
  def this(init: js.Array[js.Tuple2[String, String]]) = this()
  def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
  def this(init: URLSearchParams) = this()
  def this(init: Iterable[js.Tuple2[String, String]]) = this()
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_URLSearchParams: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
  def append(name: String, value: String): Unit = js.native
  def delete(name: String): Unit = js.native
  def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
  def forEach(callback: js.Function3[/* value */ String, /* name */ String, /* searchParams */ this.type, Unit]): Unit = js.native
  def get(name: String): String | Null = js.native
  def getAll(name: String): js.Array[String] = js.native
  def has(name: String): Boolean = js.native
  def keys(): IterableIterator[String] = js.native
  def set(name: String, value: String): Unit = js.native
  def sort(): Unit = js.native
  def values(): IterableIterator[String] = js.native
}

