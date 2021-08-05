package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultDataSetOperations extends StObject {
  
  def GetDataSetExportingStatus(ID: Double): IDataSetExportingStatus
  
  def GetDataSets(): IDataSets
  
  def GetReportAccessCredentials(): IReportAccessCredentials
  
  def StartDataSetExport(ID: Double): Unit
}
object IVaultDataSetOperations {
  
  inline def apply(
    GetDataSetExportingStatus: Double => IDataSetExportingStatus,
    GetDataSets: () => IDataSets,
    GetReportAccessCredentials: () => IReportAccessCredentials,
    StartDataSetExport: Double => Unit
  ): IVaultDataSetOperations = {
    val __obj = js.Dynamic.literal(GetDataSetExportingStatus = js.Any.fromFunction1(GetDataSetExportingStatus), GetDataSets = js.Any.fromFunction0(GetDataSets), GetReportAccessCredentials = js.Any.fromFunction0(GetReportAccessCredentials), StartDataSetExport = js.Any.fromFunction1(StartDataSetExport))
    __obj.asInstanceOf[IVaultDataSetOperations]
  }
  
  extension [Self <: IVaultDataSetOperations](x: Self) {
    
    inline def setGetDataSetExportingStatus(value: Double => IDataSetExportingStatus): Self = StObject.set(x, "GetDataSetExportingStatus", js.Any.fromFunction1(value))
    
    inline def setGetDataSets(value: () => IDataSets): Self = StObject.set(x, "GetDataSets", js.Any.fromFunction0(value))
    
    inline def setGetReportAccessCredentials(value: () => IReportAccessCredentials): Self = StObject.set(x, "GetReportAccessCredentials", js.Any.fromFunction0(value))
    
    inline def setStartDataSetExport(value: Double => Unit): Self = StObject.set(x, "StartDataSetExport", js.Any.fromFunction1(value))
  }
}
