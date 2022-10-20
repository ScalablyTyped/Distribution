package typings.npmcliArborist.mod

import typings.std.Generator
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.Map<string, @npmcli/arborist.@npmcli/arborist.Node>, 'delete' | 'set' | 'has'> */
@js.native
trait Inventory extends StObject {
  
  def add(node: Node): Unit = js.native
  
  def clear(): Unit = js.native
  @JSName("clear")
  var clear_Original: js.Function0[Unit] = js.native
  
  def delete(node: Node): Unit = js.native
  
  def entries(): IterableIterator[js.Tuple2[String, Node]] = js.native
  @JSName("entries")
  var entries_Original: js.Function0[IterableIterator[js.Tuple2[String, Node]]] = js.native
  
  def filter(fn: js.Function1[/* node */ Node, Boolean]): Generator[Node, Unit, Any] = js.native
  
  def forEach(callbackfn: js.Function3[/* value */ Node, /* key */ String, /* map */ Map[String, Node], Unit]): Unit = js.native
  @JSName("forEach")
  var forEach_Original: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Node, /* key */ String, /* map */ Map[String, Node], Unit], 
    Unit
  ] = js.native
  
  def get(key: String): js.UndefOr[Node] = js.native
  @JSName("get")
  var get_Original: js.Function1[/* key */ String, js.UndefOr[Node]] = js.native
  
  def has(node: Node): Boolean = js.native
  
  def indexes: js.Array[String] = js.native
  
  def keys(): IterableIterator[String] = js.native
  @JSName("keys")
  var keys_Original: js.Function0[IterableIterator[String]] = js.native
  
  def primaryKey: String = js.native
  
  def query(key: String): Set[Node] = js.native
  def query(key: String, `val`: scala.Nothing): Set[Node] = js.native
  def query(key: String, `val`: Node): Set[String] = js.native
  
  var set: js.UndefOr[js.Function2[/* k */ scala.Nothing, /* v */ scala.Nothing, scala.Nothing]] = js.native
  
  var size: Double = js.native
  
  def values(): IterableIterator[Node] = js.native
  @JSName("values")
  var values_Original: js.Function0[IterableIterator[Node]] = js.native
}
