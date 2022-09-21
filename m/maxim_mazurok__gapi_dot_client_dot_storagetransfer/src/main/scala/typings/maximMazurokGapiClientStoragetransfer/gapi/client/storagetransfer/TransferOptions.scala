package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferOptions extends StObject {
  
  /** Whether objects should be deleted from the source after they are transferred to the sink. **Note:** This option and delete_objects_unique_in_sink are mutually exclusive. */
  var deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.undefined
  
  /** Whether objects that exist only in the sink should be deleted. **Note:** This option and delete_objects_from_source_after_transfer are mutually exclusive. */
  var deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.undefined
  
  /** Represents the selected metadata options for a transfer job. */
  var metadataOptions: js.UndefOr[MetadataOptions] = js.undefined
  
  /**
    * When to overwrite objects that already exist in the sink. The default is that only objects that are different from the source are ovewritten. If true, all objects in the sink whose
    * name matches an object in the source are overwritten with the source object.
    */
  var overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.undefined
  
  /** When to overwrite objects that already exist in the sink. If not set, overwrite behavior is determined by overwrite_objects_already_existing_in_sink. */
  var overwriteWhen: js.UndefOr[String] = js.undefined
}
object TransferOptions {
  
  inline def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  
  extension [Self <: TransferOptions](x: Self) {
    
    inline def setDeleteObjectsFromSourceAfterTransfer(value: Boolean): Self = StObject.set(x, "deleteObjectsFromSourceAfterTransfer", value.asInstanceOf[js.Any])
    
    inline def setDeleteObjectsFromSourceAfterTransferUndefined: Self = StObject.set(x, "deleteObjectsFromSourceAfterTransfer", js.undefined)
    
    inline def setDeleteObjectsUniqueInSink(value: Boolean): Self = StObject.set(x, "deleteObjectsUniqueInSink", value.asInstanceOf[js.Any])
    
    inline def setDeleteObjectsUniqueInSinkUndefined: Self = StObject.set(x, "deleteObjectsUniqueInSink", js.undefined)
    
    inline def setMetadataOptions(value: MetadataOptions): Self = StObject.set(x, "metadataOptions", value.asInstanceOf[js.Any])
    
    inline def setMetadataOptionsUndefined: Self = StObject.set(x, "metadataOptions", js.undefined)
    
    inline def setOverwriteObjectsAlreadyExistingInSink(value: Boolean): Self = StObject.set(x, "overwriteObjectsAlreadyExistingInSink", value.asInstanceOf[js.Any])
    
    inline def setOverwriteObjectsAlreadyExistingInSinkUndefined: Self = StObject.set(x, "overwriteObjectsAlreadyExistingInSink", js.undefined)
    
    inline def setOverwriteWhen(value: String): Self = StObject.set(x, "overwriteWhen", value.asInstanceOf[js.Any])
    
    inline def setOverwriteWhenUndefined: Self = StObject.set(x, "overwriteWhen", js.undefined)
  }
}
