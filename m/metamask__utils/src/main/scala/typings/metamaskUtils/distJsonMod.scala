package typings.metamaskUtils

import org.scalablytyped.runtime.StringDictionary
import typings.metamaskUtils.anon.DataMessage
import typings.metamaskUtils.anon.ErrorDataMessage
import typings.metamaskUtils.anon.ErrorStruct
import typings.metamaskUtils.anon.IdStruct
import typings.metamaskUtils.anon.JsonrpcMethodString
import typings.metamaskUtils.anon.JsonrpcStruct
import typings.metamaskUtils.anon.MessageStack
import typings.metamaskUtils.anon.MethodStringParams
import typings.metamaskUtils.anon.OmitidStructstringnumbern
import typings.metamaskUtils.anon.ParamsParams
import typings.metamaskUtils.anon.ResultJson
import typings.metamaskUtils.anon.ResultResult
import typings.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import typings.metamaskUtils.metamaskUtilsStrings.params
import typings.metamaskUtils.metamaskUtilsStrings.result
import typings.std.Omit
import typings.std.Record
import typings.superstruct.libStructMod.Infer
import typings.superstruct.mod.Struct_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsonMod {
  
  @JSImport("@metamask/utils/dist/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcErrorStruct")
  @js.native
  val JsonRpcErrorStruct: Struct_[DataMessage, MessageStack] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcFailureStruct")
  @js.native
  val JsonRpcFailureStruct: Struct_[ErrorDataMessage, ErrorStruct] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcIdStruct")
  @js.native
  val JsonRpcIdStruct: Struct_[String | Double | Null, Null] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcNotificationStruct")
  @js.native
  val JsonRpcNotificationStruct: Struct_[JsonrpcMethodString, OmitidStructstringnumbern] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcParamsStruct")
  @js.native
  val JsonRpcParamsStruct: Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcRequestStruct")
  @js.native
  val JsonRpcRequestStruct: Struct_[MethodStringParams, IdStruct] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcResponseStruct")
  @js.native
  val JsonRpcResponseStruct: Struct_[ResultJson | ErrorDataMessage, Null] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcSuccessStruct")
  @js.native
  val JsonRpcSuccessStruct: Struct_[ResultJson, JsonrpcStruct] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonRpcVersionStruct")
  @js.native
  val JsonRpcVersionStruct: Struct_[`2Dot0`, `2Dot0`] = js.native
  
  @JSImport("@metamask/utils/dist/json", "JsonStruct")
  @js.native
  val JsonStruct: Struct_[Json, Any] = js.native
  
  inline def assertIsJsonRpcFailure(response: Any): /* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcFailure))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcFailure")(response.asInstanceOf[js.Any]).asInstanceOf[/* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcFailure))),IArray())*/ Boolean]
  
  inline def assertIsJsonRpcNotification(requestOrNotification: Any): /* asserts requestOrNotification is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcNotification))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcParams))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcNotification")(requestOrNotification.asInstanceOf[js.Any]).asInstanceOf[/* asserts requestOrNotification is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcNotification))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcParams))),IArray())))*/ Boolean]
  
  inline def assertIsJsonRpcRequest(requestOrNotification: Any): /* asserts requestOrNotification is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcRequest))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcParams))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcRequest")(requestOrNotification.asInstanceOf[js.Any]).asInstanceOf[/* asserts requestOrNotification is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcRequest))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcParams))),IArray())))*/ Boolean]
  
  inline def assertIsJsonRpcResponse(response: Any): /* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcResponse))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(Json))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcResponse")(response.asInstanceOf[js.Any]).asInstanceOf[/* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcResponse))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(Json))),IArray())))*/ Boolean]
  
  inline def assertIsJsonRpcSuccess(response: Any): /* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcSuccess))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(Json))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcSuccess")(response.asInstanceOf[js.Any]).asInstanceOf[/* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcSuccess))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(Json))),IArray())))*/ Boolean]
  
  inline def getJsonRpcIdValidator(): js.Function1[/* id */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonRpcIdValidator")().asInstanceOf[js.Function1[/* id */ Any, Boolean]]
  inline def getJsonRpcIdValidator(options: JsonRpcValidatorOptions): js.Function1[/* id */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonRpcIdValidator")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* id */ Any, Boolean]]
  
  inline def isJsonRpcFailure(response: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcFailure */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcFailure")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcFailure */ Boolean]
  
  inline def isJsonRpcNotification(requestOrNotification: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcNotification<@metamask/utils.@metamask/utils/dist/json.JsonRpcParams> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcNotification")(requestOrNotification.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcNotification<@metamask/utils.@metamask/utils/dist/json.JsonRpcParams> */ Boolean]
  
  inline def isJsonRpcRequest(requestOrNotification: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcRequest<@metamask/utils.@metamask/utils/dist/json.JsonRpcParams> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcRequest")(requestOrNotification.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcRequest<@metamask/utils.@metamask/utils/dist/json.JsonRpcParams> */ Boolean]
  
  inline def isJsonRpcResponse(response: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcResponse<@metamask/utils.@metamask/utils/dist/json.Json> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcResponse")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcResponse<@metamask/utils.@metamask/utils/dist/json.Json> */ Boolean]
  
  inline def isJsonRpcSuccess(response: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcSuccess<@metamask/utils.@metamask/utils/dist/json.Json> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcSuccess")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcSuccess<@metamask/utils.@metamask/utils/dist/json.Json> */ Boolean]
  
  inline def isValidJson(value: Any): /* is @metamask/utils.@metamask/utils/dist/json.Json */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidJson")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.Json */ Boolean]
  
  @JSImport("@metamask/utils/dist/json", "jsonrpc2")
  @js.native
  val jsonrpc2: `2Dot0` = js.native
  
  inline def validateJsonAndGetSize(jsObject: Any): js.Tuple2[/* isValid */ Boolean, /* plainTextSizeInBytes */ Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateJsonAndGetSize")(jsObject.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[/* isValid */ Boolean, /* plainTextSizeInBytes */ Double]]
  inline def validateJsonAndGetSize(jsObject: Any, skipSizingProcess: Boolean): js.Tuple2[/* isValid */ Boolean, /* plainTextSizeInBytes */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateJsonAndGetSize")(jsObject.asInstanceOf[js.Any], skipSizingProcess.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* isValid */ Boolean, /* plainTextSizeInBytes */ Double]]
  
  type InferWithParams[Type /* <: Struct_[Any, Any] */, Params /* <: JsonRpcParams */] = (Omit[Infer[Type], params]) & ParamsParams[Params]
  
  type Json = Null | Boolean | Double | String | js.Array[Any] | StringDictionary[Any]
  
  /* Inlined superstruct.superstruct.Infer<superstruct.superstruct.Struct<{  code :number,   message :string,   data :unknown,   stack :string | undefined}, {  code :superstruct.superstruct.Struct<number, null>,   message :superstruct.superstruct.Struct<string, null>,   data :superstruct.superstruct.Struct<unknown, null>,   stack :superstruct.superstruct.Struct<string | undefined, null>}>> */
  /* Rewritten from type alias, can be one of: 
    - typings.metamaskUtils.metamaskUtilsStrings.code
    - typings.metamaskUtils.metamaskUtilsStrings.message
    - typings.metamaskUtils.metamaskUtilsStrings.data
    - typings.metamaskUtils.metamaskUtilsStrings.stack
  */
  trait JsonRpcError extends StObject
  object JsonRpcError {
    
    inline def code: typings.metamaskUtils.metamaskUtilsStrings.code = "code".asInstanceOf[typings.metamaskUtils.metamaskUtilsStrings.code]
    
    inline def data: typings.metamaskUtils.metamaskUtilsStrings.data = "data".asInstanceOf[typings.metamaskUtils.metamaskUtilsStrings.data]
    
    inline def message: typings.metamaskUtils.metamaskUtilsStrings.message = "message".asInstanceOf[typings.metamaskUtils.metamaskUtilsStrings.message]
    
    inline def stack: typings.metamaskUtils.metamaskUtilsStrings.stack = "stack".asInstanceOf[typings.metamaskUtils.metamaskUtilsStrings.stack]
  }
  
  /* Inlined superstruct.superstruct.Infer<superstruct.superstruct.Struct<{  id :string | number | null,   jsonrpc :'2.0',   error :{  code :number,   message :string,   data :unknown,   stack :string | undefined}}, {  id :superstruct.superstruct.Struct<string | number | null, null>,   jsonrpc :superstruct.superstruct.Struct<'2.0', '2.0'>,   error :superstruct.superstruct.Struct<{  code :number,   message :string,   data :unknown,   stack :string | undefined}, {  code :superstruct.superstruct.Struct<number, null>,   message :superstruct.superstruct.Struct<string, null>,   data :superstruct.superstruct.Struct<unknown, null>,   stack :superstruct.superstruct.Struct<string | undefined, null>}>}>> */
  /* Rewritten from type alias, can be one of: 
    - typings.metamaskUtils.metamaskUtilsStrings.id
    - typings.metamaskUtils.metamaskUtilsStrings.jsonrpc
    - typings.metamaskUtils.metamaskUtilsStrings.error
  */
  trait JsonRpcFailure extends StObject
  object JsonRpcFailure {
    
    inline def error: typings.metamaskUtils.metamaskUtilsStrings.error = "error".asInstanceOf[typings.metamaskUtils.metamaskUtilsStrings.error]
    
    inline def id: typings.metamaskUtils.metamaskUtilsStrings.id = "id".asInstanceOf[typings.metamaskUtils.metamaskUtilsStrings.id]
    
    inline def jsonrpc: typings.metamaskUtils.metamaskUtilsStrings.jsonrpc = "jsonrpc".asInstanceOf[typings.metamaskUtils.metamaskUtilsStrings.jsonrpc]
  }
  
  type JsonRpcId = Infer[Struct_[String | Double | Null, Null]]
  
  type JsonRpcNotification[Params /* <: JsonRpcParams */] = InferWithParams[Struct_[JsonrpcMethodString, OmitidStructstringnumbern], Params]
  
  type JsonRpcParams = Infer[Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null]]
  
  type JsonRpcRequest[Params /* <: JsonRpcParams */] = InferWithParams[Struct_[MethodStringParams, IdStruct], Params]
  
  type JsonRpcResponse[Result /* <: Json */] = JsonRpcSuccess[Result] | JsonRpcFailure
  
  type JsonRpcSuccess[Result /* <: Json */] = (Omit[Infer[Struct_[ResultJson, JsonrpcStruct]], result]) & ResultResult[Result]
  
  trait JsonRpcValidatorOptions extends StObject {
    
    var permitEmptyString: js.UndefOr[Boolean] = js.undefined
    
    var permitFractions: js.UndefOr[Boolean] = js.undefined
    
    var permitNull: js.UndefOr[Boolean] = js.undefined
  }
  object JsonRpcValidatorOptions {
    
    inline def apply(): JsonRpcValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonRpcValidatorOptions]
    }
    
    extension [Self <: JsonRpcValidatorOptions](x: Self) {
      
      inline def setPermitEmptyString(value: Boolean): Self = StObject.set(x, "permitEmptyString", value.asInstanceOf[js.Any])
      
      inline def setPermitEmptyStringUndefined: Self = StObject.set(x, "permitEmptyString", js.undefined)
      
      inline def setPermitFractions(value: Boolean): Self = StObject.set(x, "permitFractions", value.asInstanceOf[js.Any])
      
      inline def setPermitFractionsUndefined: Self = StObject.set(x, "permitFractions", js.undefined)
      
      inline def setPermitNull(value: Boolean): Self = StObject.set(x, "permitNull", value.asInstanceOf[js.Any])
      
      inline def setPermitNullUndefined: Self = StObject.set(x, "permitNull", js.undefined)
    }
  }
  
  type JsonRpcVersion2 = `2Dot0`
}
