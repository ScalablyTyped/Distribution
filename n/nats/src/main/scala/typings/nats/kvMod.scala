package typings.nats

import typings.nats.anon.Headersonly
import typings.nats.anon.PartialConsumerConfig
import typings.nats.anon.PartialKvOptions
import typings.nats.anon.PartialcodecKvCodecs
import typings.nats.headersMod.MsgHdrs
import typings.nats.natsStrings.DEL
import typings.nats.natsStrings.PURGE
import typings.nats.queuedIteratorMod.QueuedIterator
import typings.nats.typesMod.JetStreamClient
import typings.nats.typesMod.JetStreamManager
import typings.nats.typesMod.JsMsg
import typings.nats.typesMod.KV
import typings.nats.typesMod.KvCodec
import typings.nats.typesMod.KvCodecs
import typings.nats.typesMod.KvEntry
import typings.nats.typesMod.KvRemove
import typings.nats.typesMod.PurgeOpts
import typings.nats.typesMod.PurgeResponse
import typings.nats.typesMod.StoredMsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kvMod {
  
  @JSImport("nats/lib/nats-base-client/kv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Base64KeyCodec(): KvCodec[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64KeyCodec")().asInstanceOf[KvCodec[String]]
  
  @JSImport("nats/lib/nats-base-client/kv", "Bucket")
  @js.native
  open class Bucket protected ()
    extends StObject
       with KV
       with KvRemove {
    def this(bucket: String, jsm: JetStreamManager, js_ : JetStreamClient) = this()
    
    def _buildCC(k: String): PartialConsumerConfig = js.native
    def _buildCC(k: String, history: Boolean): PartialConsumerConfig = js.native
    def _buildCC(k: String, history: Boolean, opts: PartialConsumerConfig): PartialConsumerConfig = js.native
    def _buildCC(k: String, history: Unit, opts: PartialConsumerConfig): PartialConsumerConfig = js.native
    
    def _deleteOrPurge(k: String, op: DEL | PURGE): js.Promise[Unit] = js.native
    
    def _doDeleteOrPurge(k: String, op: DEL | PURGE): js.Promise[Unit] = js.native
    
    var _prefixLen: Double = js.native
    
    var bucket: String = js.native
    
    def bucketName(): String = js.native
    
    var codec: KvCodecs = js.native
    
    def dataLen(data: js.typedarray.Uint8Array): Double = js.native
    def dataLen(data: js.typedarray.Uint8Array, h: MsgHdrs): Double = js.native
    
    def decodeKey(ekey: String): String = js.native
    
    def encodeKey(key: String): String = js.native
    
    def fullKeyName(k: String): String = js.native
    
    def hasWildcards(k: String): Boolean = js.native
    @JSName("hasWildcards")
    var hasWildcards_Original: js.Function1[/* k */ String, Boolean] = js.native
    
    def history(opts: Headersonly): js.Promise[QueuedIterator[KvEntry]] = js.native
    
    def init(): js.Promise[Unit] = js.native
    def init(opts: PartialKvOptions): js.Promise[Unit] = js.native
    
    def jmToEntry(jm: JsMsg): KvEntry = js.native
    
    @JSName("js")
    var js_ : JetStreamClient = js.native
    
    var jsm: JetStreamManager = js.native
    
    def prefixLen: Double = js.native
    
    def purgeBucket(): js.Promise[PurgeResponse] = js.native
    def purgeBucket(opts: PurgeOpts): js.Promise[PurgeResponse] = js.native
    
    def purgeDeletes(): js.Promise[PurgeResponse] = js.native
    def purgeDeletes(olderMillis: Double): js.Promise[PurgeResponse] = js.native
    
    /* CompleteClass */
    override def remove(k: String): js.Promise[Unit] = js.native
    
    def smToEntry(sm: StoredMsg): KvEntry = js.native
    
    var stream: String = js.native
    
    var subjPrefix: String = js.native
    
    def subjectForBucket(): String = js.native
    
    def subjectForKey(k: String): String = js.native
    
    def validateKey(k: String): Unit = js.native
    @JSName("validateKey")
    var validateKey_Original: js.Function1[/* k */ String, Unit] = js.native
    
    def validateSearchKey(k: String): Unit = js.native
    @JSName("validateSearchKey")
    var validateSearchKey_Original: js.Function1[/* k */ String, Unit] = js.native
  }
  /* static members */
  object Bucket {
    
    @JSImport("nats/lib/nats-base-client/kv", "Bucket")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bind(js_ : JetStreamClient, name: String): js.Promise[KV] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(js_.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KV]]
    inline def bind(js_ : JetStreamClient, name: String, opts: PartialcodecKvCodecs): js.Promise[KV] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(js_.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KV]]
    
    inline def create(js_ : JetStreamClient, name: String): js.Promise[KV] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(js_.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KV]]
    inline def create(js_ : JetStreamClient, name: String, opts: PartialKvOptions): js.Promise[KV] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(js_.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KV]]
  }
  
  inline def NoopKvCodecs(): KvCodecs = ^.asInstanceOf[js.Dynamic].applyDynamic("NoopKvCodecs")().asInstanceOf[KvCodecs]
  
  inline def defaultBucketOpts(): PartialKvOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultBucketOpts")().asInstanceOf[PartialKvOptions]
  
  inline def hasWildcards(k: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasWildcards")(k.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("nats/lib/nats-base-client/kv", "kvOperationHdr")
  @js.native
  val kvOperationHdr: /* "KV-Operation" */ String = js.native
  
  inline def validateBucket(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateBucket")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateKey(k: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateKey")(k.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateSearchKey(k: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSearchKey")(k.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
