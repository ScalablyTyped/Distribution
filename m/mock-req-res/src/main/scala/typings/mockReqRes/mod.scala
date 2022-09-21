package typings.mockReqRes

import org.scalablytyped.runtime.StringDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.sinon.mod.SinonSpy
import typings.sinon.mod.SinonStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Mock = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Mock]
  
  @JSImport("mock-req-res", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mockRequest(): RequestOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("mockRequest")().asInstanceOf[RequestOutput]
  inline def mockRequest(options: RequestPayload): RequestOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("mockRequest")(options.asInstanceOf[js.Any]).asInstanceOf[RequestOutput]
  
  inline def mockResponse(): ResponseOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("mockResponse")().asInstanceOf[ResponseOutput]
  inline def mockResponse(options: ResponsePayload): ResponseOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("mockResponse")(options.asInstanceOf[js.Any]).asInstanceOf[ResponseOutput]
  
  type Dictionary[T] = StringDictionary[T]
  
  @js.native
  trait Mock extends StObject {
    
    def mockRequest(): RequestOutput = js.native
    def mockRequest(options: RequestPayload): RequestOutput = js.native
    
    def mockResponse(): ResponseOutput = js.native
    def mockResponse(options: ResponsePayload): ResponseOutput = js.native
  }
  
  @js.native
  trait RequestOutput
    extends StObject
       with Request {
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("get")
    var get_Original: SinonStub[js.Array[Any], Any] = js.native
  }
  
  type RequestPayload = Dictionary[Any]
  
  @js.native
  trait ResponseOutput extends Response {
    
    // Methods
    def clearCookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("clearCookie")
    var clearCookie_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def cookie(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("cookie")
    var cookie_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def download(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("download")
    var download_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def end(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("end")
    var end_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def format(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("format")
    var format_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    
    // Methods
    def getHeader(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("getHeader")
    var getHeader_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    @JSName("get")
    var get_Original: SinonStub[js.Array[Any], Any] = js.native
    
    // Methods
    def json(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("json")
    var json_Original_ResponseOutput: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def jsonp(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("jsonp")
    var jsonp_Original_ResponseOutput: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def redirect(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("redirect")
    var redirect_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def render(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("render")
    var render_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def send(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    
    // Methods
    def sendFile(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("sendFile")
    var sendFile_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def sendStatus(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("sendStatus")
    var sendStatus_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    @JSName("send")
    var send_Original_ResponseOutput: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    
    // Methods
    def setHeader(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("setHeader")
    var setHeader_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    @JSName("set")
    var set_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def status(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("status")
    var status_Original: SinonStub[js.Array[Any], Any] = js.native
    
    // Methods
    def `type`(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("type")
    var type_Original: SinonSpy[js.Array[Any], Any] = js.native
    
    // Methods
    def vary(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[Any]
    ): Any = js.native
    @JSName("vary")
    var vary_Original: SinonStub[js.Array[Any], Any] = js.native
  }
  
  type ResponsePayload = Dictionary[Any]
}
