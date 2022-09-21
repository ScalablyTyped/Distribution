package typings.mfiles.global.MFiles

import typings.mfiles.IAdditionalFolders
import typings.mfiles.ISQLDatabase
import typings.mfiles.IVaultProperties
import typings.mfiles.MFiles.MFFileDataStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultProperties")
@js.native
open class VaultProperties ()
  extends StObject
     with IVaultProperties {
  
  /* CompleteClass */
  override def Clone(): IVaultProperties = js.native
  
  /* CompleteClass */
  var DisplayName: String = js.native
  
  /* CompleteClass */
  var EncryptionOfFileDataAtRest: Boolean = js.native
  
  /* CompleteClass */
  var ExtendedMetadataDrivenPermissions: Boolean = js.native
  
  /* CompleteClass */
  var FileDataConnectionString: String = js.native
  
  /* CompleteClass */
  var FileDataStorageType: MFFileDataStorage = js.native
  
  /* CompleteClass */
  var FullTextSearchLanguage: String = js.native
  
  /* CompleteClass */
  var Icon: js.Array[Double] = js.native
  
  /* CompleteClass */
  var MainDataFolder: String = js.native
  
  /* CompleteClass */
  var SQLDatabase: ISQLDatabase = js.native
  
  /* CompleteClass */
  var SeparateLocationForFileData: IAdditionalFolders = js.native
  
  /* CompleteClass */
  var VaultGUID: String = js.native
}
