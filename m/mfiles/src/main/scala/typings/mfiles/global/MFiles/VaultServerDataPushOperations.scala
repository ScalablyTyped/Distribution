package typings.mfiles.global.MFiles

import typings.mfiles.IServerDataPushSink
import typings.mfiles.IVault
import typings.mfiles.IVaultServerDataPushOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultServerDataPushOperations")
@js.native
open class VaultServerDataPushOperations ()
  extends StObject
     with IVaultServerDataPushOperations {
  
  /* CompleteClass */
  override def CloneVaultForServerDataPush(ServerDataPushSink: IServerDataPushSink): IVault = js.native
  
  /* CompleteClass */
  override def SendCancel(RequestID: Double): Unit = js.native
  
  /* CompleteClass */
  override def SendError(RequestID: Double, Error: String): Unit = js.native
  
  /* CompleteClass */
  override def SendHeartbeat(RequestID: Double): Unit = js.native
  
  /* CompleteClass */
  override def SendResponse(RequestID: Double, JsonResponseContent: String): Unit = js.native
  
  /* CompleteClass */
  override def SetServerDataPushSink(ServerDataPushSink: IServerDataPushSink): Unit = js.native
}
