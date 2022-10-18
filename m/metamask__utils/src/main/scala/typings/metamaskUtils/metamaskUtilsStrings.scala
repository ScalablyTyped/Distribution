package typings.metamaskUtils

import typings.metamaskUtils.distJsonMod.JsonRpcError
import typings.metamaskUtils.distJsonMod.JsonRpcFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metamaskUtilsStrings {
  
  @js.native
  sealed trait `2Dot0` extends StObject
  inline def `2Dot0`: `2Dot0` = "2.0".asInstanceOf[`2Dot0`]
  
  @js.native
  sealed trait code
    extends StObject
       with JsonRpcError
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait data
    extends StObject
       with JsonRpcError
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait error
    extends StObject
       with JsonRpcFailure
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait id
    extends StObject
       with JsonRpcFailure
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait jsonrpc
    extends StObject
       with JsonRpcFailure
  inline def jsonrpc: jsonrpc = "jsonrpc".asInstanceOf[jsonrpc]
  
  @js.native
  sealed trait message
    extends StObject
       with JsonRpcError
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait params extends StObject
  inline def params: params = "params".asInstanceOf[params]
  
  @js.native
  sealed trait result extends StObject
  inline def result: result = "result".asInstanceOf[result]
  
  @js.native
  sealed trait stack
    extends StObject
       with JsonRpcError
  inline def stack: stack = "stack".asInstanceOf[stack]
}
