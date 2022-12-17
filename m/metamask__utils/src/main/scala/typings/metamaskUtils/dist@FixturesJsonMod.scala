package typings.metamaskUtils

import typings.metamaskUtils.anon.A
import typings.metamaskUtils.anon.AUndefined
import typings.metamaskUtils.anon.Account
import typings.metamaskUtils.anon.B
import typings.metamaskUtils.anon.Error
import typings.metamaskUtils.anon.ErrorArray
import typings.metamaskUtils.anon.ErrorBoolean
import typings.metamaskUtils.anon.ErrorCodeArray
import typings.metamaskUtils.anon.ErrorCodeBoolean
import typings.metamaskUtils.anon.ErrorCodeData
import typings.metamaskUtils.anon.ErrorCodeMessage
import typings.metamaskUtils.anon.ErrorCodeMessageId
import typings.metamaskUtils.anon.ErrorCodeMessageIdArray
import typings.metamaskUtils.anon.ErrorCodeMessageIdBoolean
import typings.metamaskUtils.anon.ErrorCodeMessageIdNumber
import typings.metamaskUtils.anon.ErrorCodeMessageIdNumberJsonrpcNumber
import typings.metamaskUtils.anon.ErrorCodeMessageIdNumberJsonrpcString
import typings.metamaskUtils.anon.ErrorCodeMessageIdNumberJsonrpcUndefined
import typings.metamaskUtils.anon.ErrorCodeMessageIdUndefined
import typings.metamaskUtils.anon.ErrorCodeNull
import typings.metamaskUtils.anon.ErrorCodeNumber
import typings.metamaskUtils.anon.ErrorCodeNumberMessage
import typings.metamaskUtils.anon.ErrorCodeString
import typings.metamaskUtils.anon.ErrorCodeUndefined
import typings.metamaskUtils.anon.ErrorCodeUndefinedMessageString
import typings.metamaskUtils.anon.ErrorId
import typings.metamaskUtils.anon.ErrorIdJsonrpc
import typings.metamaskUtils.anon.ErrorMessageArray
import typings.metamaskUtils.anon.ErrorMessageBoolean
import typings.metamaskUtils.anon.ErrorMessageNull
import typings.metamaskUtils.anon.ErrorMessageString
import typings.metamaskUtils.anon.ErrorMessageUndefined
import typings.metamaskUtils.anon.ErrorNull
import typings.metamaskUtils.anon.ErrorNumber
import typings.metamaskUtils.anon.ErrorStack
import typings.metamaskUtils.anon.ErrorString
import typings.metamaskUtils.anon.ErrorUndefined
import typings.metamaskUtils.anon.ErrorUndefinedIdNumber
import typings.metamaskUtils.anon.Id
import typings.metamaskUtils.anon.IdArray
import typings.metamaskUtils.anon.IdBoolean
import typings.metamaskUtils.anon.IdJsonrpc
import typings.metamaskUtils.anon.IdJsonrpcMethod
import typings.metamaskUtils.anon.IdJsonrpcMethodParams
import typings.metamaskUtils.anon.IdJsonrpcResult
import typings.metamaskUtils.anon.IdJsonrpcString
import typings.metamaskUtils.anon.IdNull
import typings.metamaskUtils.anon.IdNumber
import typings.metamaskUtils.anon.IdNumberJsonrpc
import typings.metamaskUtils.anon.IdNumberJsonrpcNumber
import typings.metamaskUtils.anon.IdNumberJsonrpcString
import typings.metamaskUtils.anon.IdNumberJsonrpcUndefined
import typings.metamaskUtils.anon.IdString
import typings.metamaskUtils.anon.IdUndefined
import typings.metamaskUtils.anon.IdUndefinedJsonrpcString
import typings.metamaskUtils.anon.Jsonrpc
import typings.metamaskUtils.anon.JsonrpcArray
import typings.metamaskUtils.anon.JsonrpcBoolean
import typings.metamaskUtils.anon.JsonrpcMethod
import typings.metamaskUtils.anon.JsonrpcMethodParams
import typings.metamaskUtils.anon.JsonrpcNull
import typings.metamaskUtils.anon.JsonrpcNumber
import typings.metamaskUtils.anon.JsonrpcResult
import typings.metamaskUtils.anon.JsonrpcString
import typings.metamaskUtils.anon.JsonrpcStringMethodString
import typings.metamaskUtils.anon.JsonrpcUndefined
import typings.metamaskUtils.anon.LevelTwo
import typings.metamaskUtils.anon.Method
import typings.metamaskUtils.anon.MethodArray
import typings.metamaskUtils.anon.MethodBoolean
import typings.metamaskUtils.anon.MethodNull
import typings.metamaskUtils.anon.MethodNumber
import typings.metamaskUtils.anon.MethodParams
import typings.metamaskUtils.anon.MethodString
import typings.metamaskUtils.anon.MethodStringParamsNumber
import typings.metamaskUtils.anon.MethodStringParamsString
import typings.metamaskUtils.anon.MethodUndefined
import typings.metamaskUtils.anon.Params
import typings.metamaskUtils.anon.ParamsArray
import typings.metamaskUtils.anon.ParamsBoolean
import typings.metamaskUtils.anon.ParamsNull
import typings.metamaskUtils.anon.ParamsNumber
import typings.metamaskUtils.anon.ParamsString
import typings.metamaskUtils.anon.ParamsUndefined
import typings.metamaskUtils.anon.Result
import typings.metamaskUtils.anon.ResultArray
import typings.metamaskUtils.anon.ResultString
import typings.metamaskUtils.anon.ResultUndefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@FixturesJsonMod` {
  
  @JSImport("@metamask/utils/dist/@/fixtures/json", "ARRAY_OF_DIFFRENT_KINDS_OF_NUMBERS")
  @js.native
  val ARRAY_OF_DIFFRENT_KINDS_OF_NUMBERS: js.Array[Double] = js.native
  
  @JSImport("@metamask/utils/dist/@/fixtures/json", "ARRAY_OF_MIXED_SPECIAL_OBJECTS")
  @js.native
  val ARRAY_OF_MIXED_SPECIAL_OBJECTS: js.Array[js.UndefOr[Null]] = js.native
  
  object COMPLEX_OBJECT {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "COMPLEX_OBJECT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "COMPLEX_OBJECT.data")
    @js.native
    def data: Account = js.native
    inline def data_=(x: Account): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
  }
  
  object JSON_FIXTURES {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_FIXTURES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_FIXTURES.invalid")
    @js.native
    def invalid: js.Array[
        js.UndefOr[js.Symbol | js.Promise[Unit] | js.Function0[String] | js.Array[AUndefined]]
      ] = js.native
    inline def invalid_=(
      x: js.Array[
          js.UndefOr[js.Symbol | js.Promise[Unit] | js.Function0[String] | js.Array[AUndefined]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_FIXTURES.valid")
    @js.native
    def valid: js.Array[(js.Array[B | Double | Null | String]) | A | Null] = js.native
    inline def valid_=(x: js.Array[(js.Array[B | Double | Null | String]) | A | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  }
  
  object JSON_RPC_FAILURE_FIXTURES {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_FAILURE_FIXTURES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_FAILURE_FIXTURES.invalid")
    @js.native
    def invalid: js.Array[
        js.UndefOr[
          String | Double | Boolean | js.Array[scala.Nothing] | ErrorUndefined | ErrorCodeMessage | ErrorCodeMessageIdNumber | ErrorUndefinedIdNumber | ErrorCodeMessageId | ErrorCodeMessageIdArray | ErrorCodeMessageIdBoolean | ErrorCodeMessageIdUndefined | ErrorCodeMessageIdNumberJsonrpcString | ErrorCodeMessageIdNumberJsonrpcNumber | IdNumberJsonrpc | JsonrpcArray | JsonrpcBoolean | JsonrpcNull | ErrorCodeMessageIdNumberJsonrpcUndefined | ErrorCodeNumber | ErrorCodeUndefined | ErrorArray | ErrorMessageUndefined | ErrorBoolean | ErrorNull | ErrorString | ErrorNumber | ErrorMessageString | ErrorCodeArray | ErrorCodeBoolean | ErrorCodeNull | ErrorCodeUndefinedMessageString | ErrorCodeString | ErrorCodeNumberMessage | ErrorMessageArray | ErrorMessageBoolean | ErrorMessageNull | Null
        ]
      ] = js.native
    inline def invalid_=(
      x: js.Array[
          js.UndefOr[
            String | Double | Boolean | js.Array[scala.Nothing] | ErrorUndefined | ErrorCodeMessage | ErrorCodeMessageIdNumber | ErrorUndefinedIdNumber | ErrorCodeMessageId | ErrorCodeMessageIdArray | ErrorCodeMessageIdBoolean | ErrorCodeMessageIdUndefined | ErrorCodeMessageIdNumberJsonrpcString | ErrorCodeMessageIdNumberJsonrpcNumber | IdNumberJsonrpc | JsonrpcArray | JsonrpcBoolean | JsonrpcNull | ErrorCodeMessageIdNumberJsonrpcUndefined | ErrorCodeNumber | ErrorCodeUndefined | ErrorArray | ErrorMessageUndefined | ErrorBoolean | ErrorNull | ErrorString | ErrorNumber | ErrorMessageString | ErrorCodeArray | ErrorCodeBoolean | ErrorCodeNull | ErrorCodeUndefinedMessageString | ErrorCodeString | ErrorCodeNumberMessage | ErrorMessageArray | ErrorMessageBoolean | ErrorMessageNull | Null
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_FAILURE_FIXTURES.valid")
    @js.native
    def valid: js.Array[Error | ErrorId | ErrorIdJsonrpc | ErrorStack | ErrorCodeData] = js.native
    inline def valid_=(x: js.Array[Error | ErrorId | ErrorIdJsonrpc | ErrorStack | ErrorCodeData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  }
  
  object JSON_RPC_NOTIFICATION_FIXTURES {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_NOTIFICATION_FIXTURES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_NOTIFICATION_FIXTURES.invalid")
    @js.native
    def invalid: js.Array[
        js.UndefOr[
          String | Double | Boolean | js.Array[scala.Nothing] | Id | IdJsonrpc | JsonrpcMethod | MethodParams | IdJsonrpcMethod | JsonrpcMethodParams | IdJsonrpcMethodParams | IdUndefined | JsonrpcString | MethodNumber | MethodString | ParamsNull | ParamsNumber | ParamsString | Null
        ]
      ] = js.native
    inline def invalid_=(
      x: js.Array[
          js.UndefOr[
            String | Double | Boolean | js.Array[scala.Nothing] | Id | IdJsonrpc | JsonrpcMethod | MethodParams | IdJsonrpcMethod | JsonrpcMethodParams | IdJsonrpcMethodParams | IdUndefined | JsonrpcString | MethodNumber | MethodString | ParamsNull | ParamsNumber | ParamsString | Null
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_NOTIFICATION_FIXTURES.valid")
    @js.native
    def valid: js.Array[Jsonrpc | Method | Params] = js.native
    inline def valid_=(x: js.Array[Jsonrpc | Method | Params]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  }
  
  object JSON_RPC_REQUEST_FIXTURES {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_REQUEST_FIXTURES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_REQUEST_FIXTURES.invalid")
    @js.native
    def invalid: js.Array[
        js.UndefOr[
          String | Double | Boolean | js.Array[scala.Nothing] | Id | IdJsonrpc | JsonrpcNumber | ParamsUndefined | MethodArray | MethodBoolean | MethodNull | MethodUndefined | IdNumberJsonrpcString | ParamsBoolean | JsonrpcStringMethodString | MethodStringParamsNumber | MethodStringParamsString | Null
        ]
      ] = js.native
    inline def invalid_=(
      x: js.Array[
          js.UndefOr[
            String | Double | Boolean | js.Array[scala.Nothing] | Id | IdJsonrpc | JsonrpcNumber | ParamsUndefined | MethodArray | MethodBoolean | MethodNull | MethodUndefined | IdNumberJsonrpcString | ParamsBoolean | JsonrpcStringMethodString | MethodStringParamsNumber | MethodStringParamsString | Null
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_REQUEST_FIXTURES.valid")
    @js.native
    def valid: js.Array[IdNumber | IdString | ParamsArray | IdNull] = js.native
    inline def valid_=(x: js.Array[IdNumber | IdString | ParamsArray | IdNull]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  }
  
  object JSON_RPC_RESPONSE_FIXTURES {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_RESPONSE_FIXTURES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_RESPONSE_FIXTURES.invalid")
    @js.native
    def invalid: js.Array[
        js.UndefOr[
          String | Double | Boolean | js.Array[scala.Nothing] | JsonrpcUndefined | ResultString | IdNumberJsonrpcUndefined | ResultUndefined | IdNumberJsonrpcNumber | IdJsonrpcString | ErrorUndefined | ErrorCodeMessage | ErrorCodeMessageIdNumber | ErrorUndefinedIdNumber | ErrorCodeMessageId | IdNumberJsonrpc | JsonrpcNull | ErrorCodeNumber | ErrorCodeUndefined | ErrorArray | ErrorMessageUndefined | ErrorBoolean | ErrorNull | ErrorString | ErrorNumber | ErrorMessageString | ErrorCodeNull | ErrorCodeNumberMessage | ErrorMessageNull | Null
        ]
      ] = js.native
    inline def invalid_=(
      x: js.Array[
          js.UndefOr[
            String | Double | Boolean | js.Array[scala.Nothing] | JsonrpcUndefined | ResultString | IdNumberJsonrpcUndefined | ResultUndefined | IdNumberJsonrpcNumber | IdJsonrpcString | ErrorUndefined | ErrorCodeMessage | ErrorCodeMessageIdNumber | ErrorUndefinedIdNumber | ErrorCodeMessageId | IdNumberJsonrpc | JsonrpcNull | ErrorCodeNumber | ErrorCodeUndefined | ErrorArray | ErrorMessageUndefined | ErrorBoolean | ErrorNull | ErrorString | ErrorNumber | ErrorMessageString | ErrorCodeNull | ErrorCodeNumberMessage | ErrorMessageNull | Null
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_RESPONSE_FIXTURES.valid")
    @js.native
    def valid: js.Array[
        Result | JsonrpcResult | IdJsonrpcResult | ResultArray | Error | ErrorId | ErrorIdJsonrpc | ErrorStack | ErrorCodeData
      ] = js.native
    inline def valid_=(
      x: js.Array[
          Result | JsonrpcResult | IdJsonrpcResult | ResultArray | Error | ErrorId | ErrorIdJsonrpc | ErrorStack | ErrorCodeData
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  }
  
  object JSON_RPC_SUCCESS_FIXTURES {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_SUCCESS_FIXTURES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_SUCCESS_FIXTURES.invalid")
    @js.native
    def invalid: js.Array[
        js.UndefOr[
          String | Double | Boolean | js.Array[scala.Nothing] | JsonrpcUndefined | ResultString | IdNumberJsonrpcUndefined | ResultUndefined | Result | IdNumberJsonrpcNumber | IdJsonrpcString | IdArray | IdBoolean | IdUndefinedJsonrpcString | Null
        ]
      ] = js.native
    inline def invalid_=(
      x: js.Array[
          js.UndefOr[
            String | Double | Boolean | js.Array[scala.Nothing] | JsonrpcUndefined | ResultString | IdNumberJsonrpcUndefined | ResultUndefined | Result | IdNumberJsonrpcNumber | IdJsonrpcString | IdArray | IdBoolean | IdUndefinedJsonrpcString | Null
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalid")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "JSON_RPC_SUCCESS_FIXTURES.valid")
    @js.native
    def valid: js.Array[Result | JsonrpcResult | IdJsonrpcResult | ResultArray] = js.native
    inline def valid_=(x: js.Array[Result | JsonrpcResult | IdJsonrpcResult | ResultArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("valid")(x.asInstanceOf[js.Any])
  }
  
  object NON_SERIALIZABLE_NESTED_OBJECT {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "NON_SERIALIZABLE_NESTED_OBJECT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "NON_SERIALIZABLE_NESTED_OBJECT.levelOne")
    @js.native
    def levelOne: LevelTwo = js.native
    inline def levelOne_=(x: LevelTwo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("levelOne")(x.asInstanceOf[js.Any])
  }
  
  object OBJECT_MIXED_WITH_UNDEFINED_VALUES {
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "OBJECT_MIXED_WITH_UNDEFINED_VALUES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "OBJECT_MIXED_WITH_UNDEFINED_VALUES.a")
    @js.native
    def a: /* undefined */ Any = js.native
    inline def a_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "OBJECT_MIXED_WITH_UNDEFINED_VALUES.b")
    @js.native
    def b: String = js.native
    inline def b_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "OBJECT_MIXED_WITH_UNDEFINED_VALUES.c")
    @js.native
    def c: /* undefined */ Any = js.native
    inline def c_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("c")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "OBJECT_MIXED_WITH_UNDEFINED_VALUES.d")
    @js.native
    def d: String = js.native
    inline def d_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("d")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "OBJECT_MIXED_WITH_UNDEFINED_VALUES.e")
    @js.native
    def e: /* undefined */ Any = js.native
    inline def e_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e")(x.asInstanceOf[js.Any])
    
    @JSImport("@metamask/utils/dist/@/fixtures/json", "OBJECT_MIXED_WITH_UNDEFINED_VALUES.f")
    @js.native
    def f: String = js.native
    inline def f_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f")(x.asInstanceOf[js.Any])
  }
}
