package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultServerDataPushOperations extends StObject {
  
  def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault
  
  def SendCancel(RequestID: Double): Unit
  
  def SendError(RequestID: Double, Error: String): Unit
  
  def SendHeartbeat(RequestID: Double): Unit
  
  def SendResponse(RequestID: Double, JsonResponseContent: String): Unit
  
  def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit
}
object IVaultServerDataPushOperations {
  
  inline def apply(
    CloneVaultForServerDataPush: IServerDataPushSink => IVault,
    SendCancel: Double => Unit,
    SendError: (Double, String) => Unit,
    SendHeartbeat: Double => Unit,
    SendResponse: (Double, String) => Unit,
    SetServerDataPushSink: IServerDataPushSink => Unit
  ): IVaultServerDataPushOperations = {
    val __obj = js.Dynamic.literal(CloneVaultForServerDataPush = js.Any.fromFunction1(CloneVaultForServerDataPush), SendCancel = js.Any.fromFunction1(SendCancel), SendError = js.Any.fromFunction2(SendError), SendHeartbeat = js.Any.fromFunction1(SendHeartbeat), SendResponse = js.Any.fromFunction2(SendResponse), SetServerDataPushSink = js.Any.fromFunction1(SetServerDataPushSink))
    __obj.asInstanceOf[IVaultServerDataPushOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IVaultServerDataPushOperations] (val x: Self) extends AnyVal {
    
    inline def setCloneVaultForServerDataPush(value: IServerDataPushSink => IVault): Self = StObject.set(x, "CloneVaultForServerDataPush", js.Any.fromFunction1(value))
    
    inline def setSendCancel(value: Double => Unit): Self = StObject.set(x, "SendCancel", js.Any.fromFunction1(value))
    
    inline def setSendError(value: (Double, String) => Unit): Self = StObject.set(x, "SendError", js.Any.fromFunction2(value))
    
    inline def setSendHeartbeat(value: Double => Unit): Self = StObject.set(x, "SendHeartbeat", js.Any.fromFunction1(value))
    
    inline def setSendResponse(value: (Double, String) => Unit): Self = StObject.set(x, "SendResponse", js.Any.fromFunction2(value))
    
    inline def setSetServerDataPushSink(value: IServerDataPushSink => Unit): Self = StObject.set(x, "SetServerDataPushSink", js.Any.fromFunction1(value))
  }
}
