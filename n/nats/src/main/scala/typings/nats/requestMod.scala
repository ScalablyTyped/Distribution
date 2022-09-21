package typings.nats

import typings.nats.anon.PartialRequestManyOptions
import typings.nats.anon.PartialRequestManyOptionsCallback
import typings.nats.errorMod.NatsError
import typings.nats.muxsubscriptionMod.MuxSubscription
import typings.nats.typesMod.Msg
import typings.nats.typesMod.RequestManyOptions
import typings.nats.typesMod.RequestOptions
import typings.nats.utilMod.Deferred_
import typings.nats.utilMod.Timeout_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("nats/lib/nats-base-client/request", "BaseRequest")
  @js.native
  open class BaseRequest protected () extends StObject {
    def this(mux: MuxSubscription, requestSubject: String) = this()
    
    var ctx: js.Error = js.native
    
    var mux: MuxSubscription = js.native
    
    var received: Double = js.native
    
    var requestSubject: String = js.native
    
    var token: String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nats.requestMod.Request because var conflicts: received, requestSubject, token. Inlined resolver, resolver, cancel, cancel */ @JSImport("nats/lib/nats-base-client/request", "RequestMany")
  @js.native
  open class RequestMany protected () extends BaseRequest {
    def this(mux: MuxSubscription, requestSubject: String) = this()
    def this(mux: MuxSubscription, requestSubject: String, opts: PartialRequestManyOptions) = this()
    
    def callback(): Unit = js.native
    def callback(err: js.Error): Unit = js.native
    def callback(err: js.Error, msg: Msg): Unit = js.native
    def callback(err: Null, msg: Msg): Unit = js.native
    
    def cancel(): Unit = js.native
    def cancel(err: NatsError): Unit = js.native
    
    var done: Deferred_[Unit] = js.native
    
    var max: Double = js.native
    
    var opts: PartialRequestManyOptionsCallback = js.native
    
    def resolver(err: js.Error, msg: Msg): Unit = js.native
    def resolver(err: Null, msg: Msg): Unit = js.native
    
    var timer: Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.nats.requestMod.Request because var conflicts: received, requestSubject, token. Inlined resolver, resolver, cancel, cancel */ @JSImport("nats/lib/nats-base-client/request", "RequestOne")
  @js.native
  open class RequestOne protected () extends BaseRequest {
    def this(mux: MuxSubscription, requestSubject: String) = this()
    def this(mux: MuxSubscription, requestSubject: String, opts: RequestOptions) = this()
    
    def cancel(): Unit = js.native
    def cancel(err: NatsError): Unit = js.native
    
    var deferred: Deferred_[Msg] = js.native
    
    def resolver(err: js.Error, msg: Msg): Unit = js.native
    def resolver(err: Null, msg: Msg): Unit = js.native
    
    var timer: Timeout_[Msg] = js.native
  }
  
  @js.native
  trait Request extends StObject {
    
    def cancel(): Unit = js.native
    def cancel(err: NatsError): Unit = js.native
    
    var received: Double = js.native
    
    var requestSubject: String = js.native
    
    def resolver(err: js.Error, msg: Msg): Unit = js.native
    def resolver(err: Null, msg: Msg): Unit = js.native
    
    var token: String = js.native
  }
  
  @js.native
  trait RequestManyOptionsInternal
    extends StObject
       with RequestManyOptions {
    
    def callback(): Unit = js.native
    def callback(err: js.Error): Unit = js.native
    def callback(err: js.Error, msg: Msg): Unit = js.native
    def callback(err: Null, msg: Msg): Unit = js.native
  }
}
