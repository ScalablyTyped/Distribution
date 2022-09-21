package typings.mfiles.global.MFiles

import typings.mfiles.IIDRange
import typings.mfiles.IVaultEventLogOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultEventLogOperations")
@js.native
open class VaultEventLogOperations ()
  extends StObject
     with IVaultEventLogOperations {
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override def ClearRange(FirstEventID: Double, LastEventID: Double): Unit = js.native
  
  /* CompleteClass */
  override def ClearRange_32bit(FirstEventID: String, LastEventID: String): Unit = js.native
  
  /* CompleteClass */
  override def ExportAll(): String = js.native
  
  /* CompleteClass */
  override def ExportRange(FirstEventID: Double, LastEventID: Double, DeleteEventsAfterExporting: Boolean): String = js.native
  
  /* CompleteClass */
  override def ExportRange_32bit(FirstEventID: String, LastEventID: String, DeleteEventsAfterExporting: Boolean): String = js.native
  
  /* CompleteClass */
  override def GetIDRange(): IIDRange = js.native
  
  /* CompleteClass */
  override def IsLoggingEnabled(): Boolean = js.native
  
  /* CompleteClass */
  override def SetLoggingEnabled(Enabled: Boolean): Unit = js.native
}
