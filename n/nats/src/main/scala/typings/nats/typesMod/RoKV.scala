package typings.nats.typesMod

import typings.nats.anon.InitializedFn
import typings.nats.anon.Key
import typings.nats.anon.Revision
import typings.nats.queuedIteratorMod.QueuedIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoKV extends StObject {
  
  def close(): js.Promise[Unit] = js.native
  
  def get(k: String): js.Promise[KvEntry | Null] = js.native
  def get(k: String, opts: Revision): js.Promise[KvEntry | Null] = js.native
  
  def history(): js.Promise[QueuedIterator[KvEntry]] = js.native
  def history(opts: Key): js.Promise[QueuedIterator[KvEntry]] = js.native
  
  def keys(): js.Promise[QueuedIterator[String]] = js.native
  def keys(k: String): js.Promise[QueuedIterator[String]] = js.native
  
  def status(): js.Promise[KvStatus] = js.native
  
  def watch(): js.Promise[QueuedIterator[KvEntry]] = js.native
  def watch(opts: InitializedFn): js.Promise[QueuedIterator[KvEntry]] = js.native
}
