package typings.pgProtocol

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.pgProtocol.messagesMod.MessageName
import typings.pgProtocol.parserMod.MessageCallback
import typings.pgProtocol.serializerMod.BindOpts
import typings.pgProtocol.serializerMod.ExecOpts
import typings.pgProtocol.serializerMod.ParseOpts
import typings.pgProtocol.serializerMod.PortalOpts
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-protocol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pg-protocol", "DatabaseError")
  @js.native
  class DatabaseError protected ()
    extends typings.pgProtocol.messagesMod.DatabaseError {
    def this(message: String, length: Double, name: MessageName) = this()
  }
  
  @scala.inline
  def parse(stream: ReadableStream, callback: MessageCallback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  object serialize {
    
    @JSImport("pg-protocol", "serialize")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def bind(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")().asInstanceOf[Buffer]
    @scala.inline
    def bind(config: BindOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(config.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def cancel(processID: Double, secretKey: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(processID.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def close(msg: PortalOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def copyData(chunk: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyData")(chunk.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def copyDone(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyDone")().asInstanceOf[Buffer]
    
    @scala.inline
    def copyFail(message: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyFail")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def describe(msg: PortalOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def end(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[Buffer]
    
    @scala.inline
    def execute(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")().asInstanceOf[Buffer]
    @scala.inline
    def execute(config: ExecOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(config.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def flush(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Buffer]
    
    @scala.inline
    def parse(query: ParseOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def password(password: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(password.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def query(text: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(text.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def requestSsl(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("requestSsl")().asInstanceOf[Buffer]
    
    @scala.inline
    def sendSASLInitialResponseMessage(mechanism: String, initialResponse: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSASLInitialResponseMessage")(mechanism.asInstanceOf[js.Any], initialResponse.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def sendSCRAMClientFinalMessage(additionalData: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sendSCRAMClientFinalMessage")(additionalData.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def startup(opts: Record[String, String]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("startup")(opts.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def sync(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[Buffer]
  }
}
