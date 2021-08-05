package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultAutomaticMetadataOperations extends StObject {
  
  def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult
  
  def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult
  
  def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult
}
object IVaultAutomaticMetadataOperations {
  
  inline def apply(
    GetAutomaticMetadataForObject: IObjVer => IAutomaticMetadataResult,
    GetAutomaticMetadataForTemporaryFile: Double => IAutomaticMetadataResult,
    GetAutomaticMetadataForTemporaryFiles: IIDs => IAutomaticMetadataResult
  ): IVaultAutomaticMetadataOperations = {
    val __obj = js.Dynamic.literal(GetAutomaticMetadataForObject = js.Any.fromFunction1(GetAutomaticMetadataForObject), GetAutomaticMetadataForTemporaryFile = js.Any.fromFunction1(GetAutomaticMetadataForTemporaryFile), GetAutomaticMetadataForTemporaryFiles = js.Any.fromFunction1(GetAutomaticMetadataForTemporaryFiles))
    __obj.asInstanceOf[IVaultAutomaticMetadataOperations]
  }
  
  extension [Self <: IVaultAutomaticMetadataOperations](x: Self) {
    
    inline def setGetAutomaticMetadataForObject(value: IObjVer => IAutomaticMetadataResult): Self = StObject.set(x, "GetAutomaticMetadataForObject", js.Any.fromFunction1(value))
    
    inline def setGetAutomaticMetadataForTemporaryFile(value: Double => IAutomaticMetadataResult): Self = StObject.set(x, "GetAutomaticMetadataForTemporaryFile", js.Any.fromFunction1(value))
    
    inline def setGetAutomaticMetadataForTemporaryFiles(value: IIDs => IAutomaticMetadataResult): Self = StObject.set(x, "GetAutomaticMetadataForTemporaryFiles", js.Any.fromFunction1(value))
  }
}
