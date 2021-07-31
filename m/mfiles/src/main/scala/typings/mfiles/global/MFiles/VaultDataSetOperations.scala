package typings.mfiles.global.MFiles

import typings.mfiles.IDataSetExportingStatus
import typings.mfiles.IDataSets
import typings.mfiles.IReportAccessCredentials
import typings.mfiles.IVaultDataSetOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultDataSetOperations")
@js.native
class VaultDataSetOperations ()
  extends StObject
     with IVaultDataSetOperations {
  
  /* CompleteClass */
  override def GetDataSetExportingStatus(ID: Double): IDataSetExportingStatus = js.native
  
  /* CompleteClass */
  override def GetDataSets(): IDataSets = js.native
  
  /* CompleteClass */
  override def GetReportAccessCredentials(): IReportAccessCredentials = js.native
  
  /* CompleteClass */
  override def StartDataSetExport(ID: Double): Unit = js.native
}
