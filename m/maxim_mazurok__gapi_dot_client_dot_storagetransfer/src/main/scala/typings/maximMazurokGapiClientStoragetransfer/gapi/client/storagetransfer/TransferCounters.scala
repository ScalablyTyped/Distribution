package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferCounters extends StObject {
  
  /** Bytes that are copied to the data sink. */
  var bytesCopiedToSink: js.UndefOr[String] = js.undefined
  
  /** Bytes that are deleted from the data sink. */
  var bytesDeletedFromSink: js.UndefOr[String] = js.undefined
  
  /** Bytes that are deleted from the data source. */
  var bytesDeletedFromSource: js.UndefOr[String] = js.undefined
  
  /** Bytes that failed to be deleted from the data sink. */
  var bytesFailedToDeleteFromSink: js.UndefOr[String] = js.undefined
  
  /** Bytes found in the data source that are scheduled to be transferred, excluding any that are filtered based on object conditions or skipped due to sync. */
  var bytesFoundFromSource: js.UndefOr[String] = js.undefined
  
  /** Bytes found only in the data sink that are scheduled to be deleted. */
  var bytesFoundOnlyFromSink: js.UndefOr[String] = js.undefined
  
  /** Bytes in the data source that failed to be transferred or that failed to be deleted after being transferred. */
  var bytesFromSourceFailed: js.UndefOr[String] = js.undefined
  
  /** Bytes in the data source that are not transferred because they already exist in the data sink. */
  var bytesFromSourceSkippedBySync: js.UndefOr[String] = js.undefined
  
  /** Objects that are copied to the data sink. */
  var objectsCopiedToSink: js.UndefOr[String] = js.undefined
  
  /** Objects that are deleted from the data sink. */
  var objectsDeletedFromSink: js.UndefOr[String] = js.undefined
  
  /** Objects that are deleted from the data source. */
  var objectsDeletedFromSource: js.UndefOr[String] = js.undefined
  
  /** Objects that failed to be deleted from the data sink. */
  var objectsFailedToDeleteFromSink: js.UndefOr[String] = js.undefined
  
  /** Objects found in the data source that are scheduled to be transferred, excluding any that are filtered based on object conditions or skipped due to sync. */
  var objectsFoundFromSource: js.UndefOr[String] = js.undefined
  
  /** Objects found only in the data sink that are scheduled to be deleted. */
  var objectsFoundOnlyFromSink: js.UndefOr[String] = js.undefined
  
  /** Objects in the data source that failed to be transferred or that failed to be deleted after being transferred. */
  var objectsFromSourceFailed: js.UndefOr[String] = js.undefined
  
  /** Objects in the data source that are not transferred because they already exist in the data sink. */
  var objectsFromSourceSkippedBySync: js.UndefOr[String] = js.undefined
}
object TransferCounters {
  
  inline def apply(): TransferCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferCounters]
  }
  
  extension [Self <: TransferCounters](x: Self) {
    
    inline def setBytesCopiedToSink(value: String): Self = StObject.set(x, "bytesCopiedToSink", value.asInstanceOf[js.Any])
    
    inline def setBytesCopiedToSinkUndefined: Self = StObject.set(x, "bytesCopiedToSink", js.undefined)
    
    inline def setBytesDeletedFromSink(value: String): Self = StObject.set(x, "bytesDeletedFromSink", value.asInstanceOf[js.Any])
    
    inline def setBytesDeletedFromSinkUndefined: Self = StObject.set(x, "bytesDeletedFromSink", js.undefined)
    
    inline def setBytesDeletedFromSource(value: String): Self = StObject.set(x, "bytesDeletedFromSource", value.asInstanceOf[js.Any])
    
    inline def setBytesDeletedFromSourceUndefined: Self = StObject.set(x, "bytesDeletedFromSource", js.undefined)
    
    inline def setBytesFailedToDeleteFromSink(value: String): Self = StObject.set(x, "bytesFailedToDeleteFromSink", value.asInstanceOf[js.Any])
    
    inline def setBytesFailedToDeleteFromSinkUndefined: Self = StObject.set(x, "bytesFailedToDeleteFromSink", js.undefined)
    
    inline def setBytesFoundFromSource(value: String): Self = StObject.set(x, "bytesFoundFromSource", value.asInstanceOf[js.Any])
    
    inline def setBytesFoundFromSourceUndefined: Self = StObject.set(x, "bytesFoundFromSource", js.undefined)
    
    inline def setBytesFoundOnlyFromSink(value: String): Self = StObject.set(x, "bytesFoundOnlyFromSink", value.asInstanceOf[js.Any])
    
    inline def setBytesFoundOnlyFromSinkUndefined: Self = StObject.set(x, "bytesFoundOnlyFromSink", js.undefined)
    
    inline def setBytesFromSourceFailed(value: String): Self = StObject.set(x, "bytesFromSourceFailed", value.asInstanceOf[js.Any])
    
    inline def setBytesFromSourceFailedUndefined: Self = StObject.set(x, "bytesFromSourceFailed", js.undefined)
    
    inline def setBytesFromSourceSkippedBySync(value: String): Self = StObject.set(x, "bytesFromSourceSkippedBySync", value.asInstanceOf[js.Any])
    
    inline def setBytesFromSourceSkippedBySyncUndefined: Self = StObject.set(x, "bytesFromSourceSkippedBySync", js.undefined)
    
    inline def setObjectsCopiedToSink(value: String): Self = StObject.set(x, "objectsCopiedToSink", value.asInstanceOf[js.Any])
    
    inline def setObjectsCopiedToSinkUndefined: Self = StObject.set(x, "objectsCopiedToSink", js.undefined)
    
    inline def setObjectsDeletedFromSink(value: String): Self = StObject.set(x, "objectsDeletedFromSink", value.asInstanceOf[js.Any])
    
    inline def setObjectsDeletedFromSinkUndefined: Self = StObject.set(x, "objectsDeletedFromSink", js.undefined)
    
    inline def setObjectsDeletedFromSource(value: String): Self = StObject.set(x, "objectsDeletedFromSource", value.asInstanceOf[js.Any])
    
    inline def setObjectsDeletedFromSourceUndefined: Self = StObject.set(x, "objectsDeletedFromSource", js.undefined)
    
    inline def setObjectsFailedToDeleteFromSink(value: String): Self = StObject.set(x, "objectsFailedToDeleteFromSink", value.asInstanceOf[js.Any])
    
    inline def setObjectsFailedToDeleteFromSinkUndefined: Self = StObject.set(x, "objectsFailedToDeleteFromSink", js.undefined)
    
    inline def setObjectsFoundFromSource(value: String): Self = StObject.set(x, "objectsFoundFromSource", value.asInstanceOf[js.Any])
    
    inline def setObjectsFoundFromSourceUndefined: Self = StObject.set(x, "objectsFoundFromSource", js.undefined)
    
    inline def setObjectsFoundOnlyFromSink(value: String): Self = StObject.set(x, "objectsFoundOnlyFromSink", value.asInstanceOf[js.Any])
    
    inline def setObjectsFoundOnlyFromSinkUndefined: Self = StObject.set(x, "objectsFoundOnlyFromSink", js.undefined)
    
    inline def setObjectsFromSourceFailed(value: String): Self = StObject.set(x, "objectsFromSourceFailed", value.asInstanceOf[js.Any])
    
    inline def setObjectsFromSourceFailedUndefined: Self = StObject.set(x, "objectsFromSourceFailed", js.undefined)
    
    inline def setObjectsFromSourceSkippedBySync(value: String): Self = StObject.set(x, "objectsFromSourceSkippedBySync", value.asInstanceOf[js.Any])
    
    inline def setObjectsFromSourceSkippedBySyncUndefined: Self = StObject.set(x, "objectsFromSourceSkippedBySync", js.undefined)
  }
}
