package typings.pgProtocol

import typings.node.bufferMod.global.Buffer
import typings.pgProtocol.pgProtocolStrings.P
import typings.pgProtocol.pgProtocolStrings.S
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMod {
  
  object serialize {
    
    @JSImport("pg-protocol/dist/serializer", "serialize")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bind(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")().asInstanceOf[Buffer]
    inline def bind(config: BindOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(config.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def cancel(processID: Double, secretKey: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(processID.asInstanceOf[js.Any], secretKey.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def close(msg: PortalOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def copyData(chunk: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyData")(chunk.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def copyDone(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyDone")().asInstanceOf[Buffer]
    
    inline def copyFail(message: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("copyFail")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def describe(msg: PortalOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(msg.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def end(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("end")().asInstanceOf[Buffer]
    
    inline def execute(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")().asInstanceOf[Buffer]
    inline def execute(config: ExecOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(config.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def flush(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Buffer]
    
    inline def parse(query: ParseOpts): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def password(password: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("password")(password.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def query(text: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(text.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def requestSsl(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("requestSsl")().asInstanceOf[Buffer]
    
    inline def sendSASLInitialResponseMessage(mechanism: String, initialResponse: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sendSASLInitialResponseMessage")(mechanism.asInstanceOf[js.Any], initialResponse.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def sendSCRAMClientFinalMessage(additionalData: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sendSCRAMClientFinalMessage")(additionalData.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def startup(opts: Record[String, String]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("startup")(opts.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def sync(): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[Buffer]
  }
  
  trait BindOpts extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var portal: js.UndefOr[String] = js.undefined
    
    var statement: js.UndefOr[String] = js.undefined
    
    var valueMapper: js.UndefOr[ValueMapper] = js.undefined
    
    var values: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object BindOpts {
    
    inline def apply(): BindOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindOpts]
    }
    
    extension [Self <: BindOpts](x: Self) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setPortal(value: String): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      inline def setStatement(value: String): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
      
      inline def setStatementUndefined: Self = StObject.set(x, "statement", js.undefined)
      
      inline def setValueMapper(value: (/* param */ Any, /* index */ Double) => Any): Self = StObject.set(x, "valueMapper", js.Any.fromFunction2(value))
      
      inline def setValueMapperUndefined: Self = StObject.set(x, "valueMapper", js.undefined)
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait ExecOpts extends StObject {
    
    var portal: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
  }
  object ExecOpts {
    
    inline def apply(): ExecOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOpts]
    }
    
    extension [Self <: ExecOpts](x: Self) {
      
      inline def setPortal(value: String): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  trait ParseOpts extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var text: String
    
    var types: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object ParseOpts {
    
    inline def apply(text: String): ParseOpts = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOpts]
    }
    
    extension [Self <: ParseOpts](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait PortalOpts extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: S | P
  }
  object PortalOpts {
    
    inline def apply(`type`: S | P): PortalOpts = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalOpts]
    }
    
    extension [Self <: PortalOpts](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: S | P): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueMapper = js.Function2[/* param */ Any, /* index */ Double, Any]
}
