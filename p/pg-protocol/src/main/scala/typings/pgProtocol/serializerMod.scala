package typings.pgProtocol

import typings.node.Buffer
import typings.pgProtocol.pgProtocolStrings.P
import typings.pgProtocol.pgProtocolStrings.S
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMod {
  
  object serialize {
    
    @JSImport("pg-protocol/dist/serializer", "serialize.bind")
    @js.native
    def bind(): Buffer = js.native
    @JSImport("pg-protocol/dist/serializer", "serialize.bind")
    @js.native
    def bind(config: BindOpts): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.cancel")
    @js.native
    def cancel(processID: Double, secretKey: Double): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.close")
    @js.native
    def close(msg: PortalOpts): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.copyData")
    @js.native
    def copyData(chunk: Buffer): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.copyDone")
    @js.native
    def copyDone(): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.copyFail")
    @js.native
    def copyFail(message: String): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.describe")
    @js.native
    def describe(msg: PortalOpts): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.end")
    @js.native
    def end(): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.execute")
    @js.native
    def execute(): Buffer = js.native
    @JSImport("pg-protocol/dist/serializer", "serialize.execute")
    @js.native
    def execute(config: ExecOpts): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.flush")
    @js.native
    def flush(): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.parse")
    @js.native
    def parse(query: ParseOpts): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.password")
    @js.native
    def password(password: String): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.query")
    @js.native
    def query(text: String): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.requestSsl")
    @js.native
    def requestSsl(): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.sendSASLInitialResponseMessage")
    @js.native
    def sendSASLInitialResponseMessage(mechanism: String, initialResponse: String): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.sendSCRAMClientFinalMessage")
    @js.native
    def sendSCRAMClientFinalMessage(additionalData: String): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.startup")
    @js.native
    def startup(opts: Record[String, String]): Buffer = js.native
    
    @JSImport("pg-protocol/dist/serializer", "serialize.sync")
    @js.native
    def sync(): Buffer = js.native
  }
  
  @js.native
  trait BindOpts extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.native
    
    var portal: js.UndefOr[String] = js.native
    
    var statement: js.UndefOr[String] = js.native
    
    var valueMapper: js.UndefOr[ValueMapper] = js.native
    
    var values: js.UndefOr[js.Array[_]] = js.native
  }
  object BindOpts {
    
    @scala.inline
    def apply(): BindOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindOpts]
    }
    
    @scala.inline
    implicit class BindOptsMutableBuilder[Self <: BindOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setPortal(value: String): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      @scala.inline
      def setStatement(value: String): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementUndefined: Self = StObject.set(x, "statement", js.undefined)
      
      @scala.inline
      def setValueMapper(value: (/* param */ js.Any, /* index */ Double) => js.Any): Self = StObject.set(x, "valueMapper", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueMapperUndefined: Self = StObject.set(x, "valueMapper", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ExecOpts extends StObject {
    
    var portal: js.UndefOr[String] = js.native
    
    var rows: js.UndefOr[Double] = js.native
  }
  object ExecOpts {
    
    @scala.inline
    def apply(): ExecOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOpts]
    }
    
    @scala.inline
    implicit class ExecOptsMutableBuilder[Self <: ExecOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPortal(value: String): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  @js.native
  trait ParseOpts extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var text: String = js.native
    
    var types: js.UndefOr[js.Array[Double]] = js.native
  }
  object ParseOpts {
    
    @scala.inline
    def apply(text: String): ParseOpts = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOpts]
    }
    
    @scala.inline
    implicit class ParseOptsMutableBuilder[Self <: ParseOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: js.Array[Double]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: Double*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PortalOpts extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: S | P = js.native
  }
  object PortalOpts {
    
    @scala.inline
    def apply(`type`: S | P): PortalOpts = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalOpts]
    }
    
    @scala.inline
    implicit class PortalOptsMutableBuilder[Self <: PortalOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: S | P): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueMapper = js.Function2[/* param */ js.Any, /* index */ Double, js.Any]
}
