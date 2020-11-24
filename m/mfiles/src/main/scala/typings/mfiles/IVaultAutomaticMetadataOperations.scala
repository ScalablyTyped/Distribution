package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultAutomaticMetadataOperations extends js.Object {
  
  def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult = js.native
  
  def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult = js.native
  
  def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult = js.native
}
object IVaultAutomaticMetadataOperations {
  
  @scala.inline
  def apply(
    GetAutomaticMetadataForObject: IObjVer => IAutomaticMetadataResult,
    GetAutomaticMetadataForTemporaryFile: Double => IAutomaticMetadataResult,
    GetAutomaticMetadataForTemporaryFiles: IIDs => IAutomaticMetadataResult
  ): IVaultAutomaticMetadataOperations = {
    val __obj = js.Dynamic.literal(GetAutomaticMetadataForObject = js.Any.fromFunction1(GetAutomaticMetadataForObject), GetAutomaticMetadataForTemporaryFile = js.Any.fromFunction1(GetAutomaticMetadataForTemporaryFile), GetAutomaticMetadataForTemporaryFiles = js.Any.fromFunction1(GetAutomaticMetadataForTemporaryFiles))
    __obj.asInstanceOf[IVaultAutomaticMetadataOperations]
  }
  
  @scala.inline
  implicit class IVaultAutomaticMetadataOperationsOps[Self <: IVaultAutomaticMetadataOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAutomaticMetadataForObject(value: IObjVer => IAutomaticMetadataResult): Self = this.set("GetAutomaticMetadataForObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAutomaticMetadataForTemporaryFile(value: Double => IAutomaticMetadataResult): Self = this.set("GetAutomaticMetadataForTemporaryFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAutomaticMetadataForTemporaryFiles(value: IIDs => IAutomaticMetadataResult): Self = this.set("GetAutomaticMetadataForTemporaryFiles", js.Any.fromFunction1(value))
  }
}
