package typings.nats.typesMod

import typings.nats.anon.PartialStreamConfig
import typings.nats.anon.PartialStreamInfoRequestO
import typings.nats.anon.PartialStreamUpdateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamAPI extends StObject {
  
  def add(cfg: PartialStreamConfig): js.Promise[StreamInfo] = js.native
  
  def delete(stream: String): js.Promise[Boolean] = js.native
  
  def deleteMessage(stream: String, seq: Double): js.Promise[Boolean] = js.native
  def deleteMessage(stream: String, seq: Double, erase: Boolean): js.Promise[Boolean] = js.native
  
  def find(subject: String): js.Promise[String] = js.native
  
  def getMessage(stream: String, query: MsgRequest): js.Promise[StoredMsg] = js.native
  
  def info(stream: String): js.Promise[StreamInfo] = js.native
  def info(stream: String, opts: PartialStreamInfoRequestO): js.Promise[StreamInfo] = js.native
  
  def list(): Lister[StreamInfo] = js.native
  
  def purge(stream: String): js.Promise[PurgeResponse] = js.native
  def purge(stream: String, opts: PurgeOpts): js.Promise[PurgeResponse] = js.native
  
  def update(name: String, cfg: PartialStreamUpdateConfig): js.Promise[StreamInfo] = js.native
}
