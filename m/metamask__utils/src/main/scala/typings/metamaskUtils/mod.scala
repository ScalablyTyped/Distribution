package typings.metamaskUtils

import typings.debug.mod.Debugger
import typings.metamaskUtils.anon.DataMessage
import typings.metamaskUtils.anon.ErrorDataMessage
import typings.metamaskUtils.anon.ErrorStruct
import typings.metamaskUtils.anon.IdStruct
import typings.metamaskUtils.anon.JsonrpcMethodString
import typings.metamaskUtils.anon.JsonrpcStruct
import typings.metamaskUtils.anon.MessageStack
import typings.metamaskUtils.anon.MethodStringParams
import typings.metamaskUtils.anon.OmitidStructstringnumbern
import typings.metamaskUtils.anon.ResultJson
import typings.metamaskUtils.distJsonMod.Json
import typings.metamaskUtils.distJsonMod.JsonRpcValidatorOptions
import typings.metamaskUtils.distMiscMod.RuntimeObject
import typings.metamaskUtils.distTimeMod.Duration
import typings.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import typings.std.Record
import typings.superstruct.mod.Struct_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@metamask/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@metamask/utils", "Duration")
  @js.native
  object Duration extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.metamaskUtils.distTimeMod.Duration & Double] = js.native
    
    /* 86400000 */ val Day: typings.metamaskUtils.distTimeMod.Duration.Day & Double = js.native
    
    /* 3600000 */ val Hour: typings.metamaskUtils.distTimeMod.Duration.Hour & Double = js.native
    
    /* 1 */ val Millisecond: typings.metamaskUtils.distTimeMod.Duration.Millisecond & Double = js.native
    
    /* 60000 */ val Minute: typings.metamaskUtils.distTimeMod.Duration.Minute & Double = js.native
    
    /* 1000 */ val Second: typings.metamaskUtils.distTimeMod.Duration.Second & Double = js.native
    
    /* 604800000 */ val Week: typings.metamaskUtils.distTimeMod.Duration.Week & Double = js.native
    
    /* 31536000000.0 */ val Year: typings.metamaskUtils.distTimeMod.Duration.Year & Double = js.native
  }
  
  @JSImport("@metamask/utils", "ESCAPE_CHARACTERS_REGEXP")
  @js.native
  val ESCAPE_CHARACTERS_REGEXP: js.RegExp = js.native
  
  @JSImport("@metamask/utils", "FrozenMap")
  @js.native
  open class FrozenMap[Key, Value] ()
    extends typings.metamaskUtils.distCollectionsMod.FrozenMap[Key, Value] {
    def this(entries: js.Array[js.Tuple2[Key, Value]]) = this()
  }
  
  /**
    * A {@link ReadonlySet} that cannot be modified after instantiation.
    * The implementation uses an inner set hidden via a private field, and the
    * immutability guarantee relies on it being impossible to get a reference
    * to this set.
    */
  @JSImport("@metamask/utils", "FrozenSet")
  @js.native
  open class FrozenSet[Value] ()
    extends typings.metamaskUtils.distCollectionsMod.FrozenSet[Value] {
    def this(values: js.Array[Value]) = this()
  }
  
  @JSImport("@metamask/utils", "JsonRpcErrorStruct")
  @js.native
  val JsonRpcErrorStruct: Struct_[DataMessage, MessageStack] = js.native
  
  @JSImport("@metamask/utils", "JsonRpcFailureStruct")
  @js.native
  val JsonRpcFailureStruct: Struct_[ErrorDataMessage, ErrorStruct] = js.native
  
  @JSImport("@metamask/utils", "JsonRpcIdStruct")
  @js.native
  val JsonRpcIdStruct: Struct_[String | Double | Null, Null] = js.native
  
  @JSImport("@metamask/utils", "JsonRpcNotificationStruct")
  @js.native
  val JsonRpcNotificationStruct: Struct_[JsonrpcMethodString, OmitidStructstringnumbern] = js.native
  
  @JSImport("@metamask/utils", "JsonRpcParamsStruct")
  @js.native
  val JsonRpcParamsStruct: Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null] = js.native
  
  @JSImport("@metamask/utils", "JsonRpcRequestStruct")
  @js.native
  val JsonRpcRequestStruct: Struct_[MethodStringParams, IdStruct] = js.native
  
  @JSImport("@metamask/utils", "JsonRpcResponseStruct")
  @js.native
  val JsonRpcResponseStruct: Struct_[ResultJson | ErrorDataMessage, Null] = js.native
  
  @JSImport("@metamask/utils", "JsonRpcSuccessStruct")
  @js.native
  val JsonRpcSuccessStruct: Struct_[ResultJson, JsonrpcStruct] = js.native
  
  @JSImport("@metamask/utils", "JsonRpcVersionStruct")
  @js.native
  val JsonRpcVersionStruct: Struct_[`2Dot0`, `2Dot0`] = js.native
  
  @JSImport("@metamask/utils", "JsonSize")
  @js.native
  object JsonSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.metamaskUtils.distMiscMod.JsonSize & Double] = js.native
    
    /* 1 */ val Colon: typings.metamaskUtils.distMiscMod.JsonSize.Colon & Double = js.native
    
    /* 1 */ val Comma: typings.metamaskUtils.distMiscMod.JsonSize.Comma & Double = js.native
    
    /* 24 */ val Date: typings.metamaskUtils.distMiscMod.JsonSize.Date & Double = js.native
    
    /* 5 */ val False: typings.metamaskUtils.distMiscMod.JsonSize.False & Double = js.native
    
    /* 4 */ val Null: typings.metamaskUtils.distMiscMod.JsonSize.Null & Double = js.native
    
    /* 1 */ val Quote: typings.metamaskUtils.distMiscMod.JsonSize.Quote & Double = js.native
    
    /* 4 */ val True: typings.metamaskUtils.distMiscMod.JsonSize.True & Double = js.native
    
    /* 1 */ val Wrapper: typings.metamaskUtils.distMiscMod.JsonSize.Wrapper & Double = js.native
  }
  
  @JSImport("@metamask/utils", "JsonStruct")
  @js.native
  val JsonStruct: Struct_[Json, Any] = js.native
  
  inline def assertIsJsonRpcFailure(response: Any): /* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcFailure))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcFailure")(response.asInstanceOf[js.Any]).asInstanceOf[/* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcFailure))),IArray())*/ Boolean]
  
  inline def assertIsJsonRpcNotification(requestOrNotification: Any): /* asserts requestOrNotification is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcNotification))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcParams))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcNotification")(requestOrNotification.asInstanceOf[js.Any]).asInstanceOf[/* asserts requestOrNotification is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcNotification))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcParams))),IArray())))*/ Boolean]
  
  inline def assertIsJsonRpcRequest(requestOrNotification: Any): /* asserts requestOrNotification is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcRequest))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcParams))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcRequest")(requestOrNotification.asInstanceOf[js.Any]).asInstanceOf[/* asserts requestOrNotification is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcRequest))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcParams))),IArray())))*/ Boolean]
  
  inline def assertIsJsonRpcResponse(response: Any): /* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcResponse))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(Json))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcResponse")(response.asInstanceOf[js.Any]).asInstanceOf[/* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcResponse))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(Json))),IArray())))*/ Boolean]
  
  inline def assertIsJsonRpcSuccess(response: Any): /* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcSuccess))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(Json))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIsJsonRpcSuccess")(response.asInstanceOf[js.Any]).asInstanceOf[/* asserts response is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(JsonRpcSuccess))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(metamask,utils), TsIdentModule(Some(metamask),List(utils, dist, json)), TsIdentSimple(Json))),IArray())))*/ Boolean]
  
  inline def calculateNumberSize(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateNumberSize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def calculateStringSize(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateStringSize")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def createModuleLogger(projectLogger: Debugger, moduleName: String): Debugger = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleLogger")(projectLogger.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[Debugger]
  
  inline def createProjectLogger(projectName: String): Debugger = ^.asInstanceOf[js.Dynamic].applyDynamic("createProjectLogger")(projectName.asInstanceOf[js.Any]).asInstanceOf[Debugger]
  
  inline def getJsonRpcIdValidator(): js.Function1[/* id */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonRpcIdValidator")().asInstanceOf[js.Function1[/* id */ Any, Boolean]]
  inline def getJsonRpcIdValidator(options: JsonRpcValidatorOptions): js.Function1[/* id */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonRpcIdValidator")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* id */ Any, Boolean]]
  
  inline def hasProperty(`object`: RuntimeObject, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasProperty(`object`: RuntimeObject, name: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasProperty(`object`: RuntimeObject, name: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(`object`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inMilliseconds(count: Double, duration: Duration): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inMilliseconds")(count.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isASCII(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isASCII")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isJsonRpcFailure(response: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcFailure */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcFailure")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcFailure */ Boolean]
  
  inline def isJsonRpcNotification(requestOrNotification: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcNotification<@metamask/utils.@metamask/utils/dist/json.JsonRpcParams> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcNotification")(requestOrNotification.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcNotification<@metamask/utils.@metamask/utils/dist/json.JsonRpcParams> */ Boolean]
  
  inline def isJsonRpcRequest(requestOrNotification: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcRequest<@metamask/utils.@metamask/utils/dist/json.JsonRpcParams> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcRequest")(requestOrNotification.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcRequest<@metamask/utils.@metamask/utils/dist/json.JsonRpcParams> */ Boolean]
  
  inline def isJsonRpcResponse(response: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcResponse<@metamask/utils.@metamask/utils/dist/json.Json> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcResponse")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcResponse<@metamask/utils.@metamask/utils/dist/json.Json> */ Boolean]
  
  inline def isJsonRpcSuccess(response: Any): /* is @metamask/utils.@metamask/utils/dist/json.JsonRpcSuccess<@metamask/utils.@metamask/utils/dist/json.Json> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsonRpcSuccess")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.JsonRpcSuccess<@metamask/utils.@metamask/utils/dist/json.Json> */ Boolean]
  
  inline def isNonEmptyArray[Element](value: js.Array[Element]): /* is @metamask/utils.@metamask/utils/dist/misc.NonEmptyArray<Element> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonEmptyArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/misc.NonEmptyArray<Element> */ Boolean]
  
  inline def isNullOrUndefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): /* is @metamask/utils.@metamask/utils/dist/misc.RuntimeObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/misc.RuntimeObject */ Boolean]
  
  inline def isPlainObject(value: Any): /* is @metamask/utils.@metamask/utils/dist/misc.PlainObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/misc.PlainObject */ Boolean]
  
  inline def isValidJson(value: Any): /* is @metamask/utils.@metamask/utils/dist/json.Json */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidJson")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @metamask/utils.@metamask/utils/dist/json.Json */ Boolean]
  
  @JSImport("@metamask/utils", "jsonrpc2")
  @js.native
  val jsonrpc2: `2Dot0` = js.native
  
  inline def timeSince(timestamp: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeSince")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def validateJsonAndGetSize(jsObject: Any): js.Tuple2[/* isValid */ Boolean, /* plainTextSizeInBytes */ Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateJsonAndGetSize")(jsObject.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[/* isValid */ Boolean, /* plainTextSizeInBytes */ Double]]
  inline def validateJsonAndGetSize(jsObject: Any, skipSizingProcess: Boolean): js.Tuple2[/* isValid */ Boolean, /* plainTextSizeInBytes */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateJsonAndGetSize")(jsObject.asInstanceOf[js.Any], skipSizingProcess.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* isValid */ Boolean, /* plainTextSizeInBytes */ Double]]
}
