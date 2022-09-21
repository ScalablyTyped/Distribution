package typings.nats.natsBaseClientMod

import typings.nats.anon.PartialKvOptions
import typings.nats.anon.PartialcodecKvCodecs
import typings.nats.typesMod.JetStreamClient
import typings.nats.typesMod.JetStreamManager
import typings.nats.typesMod.KV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "Bucket")
@js.native
open class Bucket protected ()
  extends typings.nats.internalModMod.Bucket {
  def this(bucket: String, jsm: JetStreamManager, js_ : JetStreamClient) = this()
}
/* static members */
object Bucket {
  
  @JSImport("nats/lib/src/nats-base-client", "Bucket")
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind(js_ : JetStreamClient, name: String): js.Promise[KV] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(js_.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KV]]
  inline def bind(js_ : JetStreamClient, name: String, opts: PartialcodecKvCodecs): js.Promise[KV] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(js_.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KV]]
  
  inline def create(js_ : JetStreamClient, name: String): js.Promise[KV] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(js_.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KV]]
  inline def create(js_ : JetStreamClient, name: String, opts: PartialKvOptions): js.Promise[KV] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(js_.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KV]]
}
