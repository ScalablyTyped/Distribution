package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferCounters extends StObject {
  
  /** Bytes that are copied to the data sink. */
  var bytesCopiedToSink: js.UndefOr[String] = js.native
  
  /** Bytes that are deleted from the data sink. */
  var bytesDeletedFromSink: js.UndefOr[String] = js.native
  
  /** Bytes that are deleted from the data source. */
  var bytesDeletedFromSource: js.UndefOr[String] = js.native
  
  /** Bytes that failed to be deleted from the data sink. */
  var bytesFailedToDeleteFromSink: js.UndefOr[String] = js.native
  
  /** Bytes found in the data source that are scheduled to be transferred, excluding any that are filtered based on object conditions or skipped due to sync. */
  var bytesFoundFromSource: js.UndefOr[String] = js.native
  
  /** Bytes found only in the data sink that are scheduled to be deleted. */
  var bytesFoundOnlyFromSink: js.UndefOr[String] = js.native
  
  /** Bytes in the data source that failed to be transferred or that failed to be deleted after being transferred. */
  var bytesFromSourceFailed: js.UndefOr[String] = js.native
  
  /** Bytes in the data source that are not transferred because they already exist in the data sink. */
  var bytesFromSourceSkippedBySync: js.UndefOr[String] = js.native
  
  /** Objects that are copied to the data sink. */
  var objectsCopiedToSink: js.UndefOr[String] = js.native
  
  /** Objects that are deleted from the data sink. */
  var objectsDeletedFromSink: js.UndefOr[String] = js.native
  
  /** Objects that are deleted from the data source. */
  var objectsDeletedFromSource: js.UndefOr[String] = js.native
  
  /** Objects that failed to be deleted from the data sink. */
  var objectsFailedToDeleteFromSink: js.UndefOr[String] = js.native
  
  /** Objects found in the data source that are scheduled to be transferred, excluding any that are filtered based on object conditions or skipped due to sync. */
  var objectsFoundFromSource: js.UndefOr[String] = js.native
  
  /** Objects found only in the data sink that are scheduled to be deleted. */
  var objectsFoundOnlyFromSink: js.UndefOr[String] = js.native
  
  /** Objects in the data source that failed to be transferred or that failed to be deleted after being transferred. */
  var objectsFromSourceFailed: js.UndefOr[String] = js.native
  
  /** Objects in the data source that are not transferred because they already exist in the data sink. */
  var objectsFromSourceSkippedBySync: js.UndefOr[String] = js.native
}
object TransferCounters {
  
  @scala.inline
  def apply(): TransferCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferCounters]
  }
  
  @scala.inline
  implicit class TransferCountersMutableBuilder[Self <: TransferCounters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesCopiedToSink(value: String): Self = StObject.set(x, "bytesCopiedToSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesCopiedToSinkUndefined: Self = StObject.set(x, "bytesCopiedToSink", js.undefined)
    
    @scala.inline
    def setBytesDeletedFromSink(value: String): Self = StObject.set(x, "bytesDeletedFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesDeletedFromSinkUndefined: Self = StObject.set(x, "bytesDeletedFromSink", js.undefined)
    
    @scala.inline
    def setBytesDeletedFromSource(value: String): Self = StObject.set(x, "bytesDeletedFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesDeletedFromSourceUndefined: Self = StObject.set(x, "bytesDeletedFromSource", js.undefined)
    
    @scala.inline
    def setBytesFailedToDeleteFromSink(value: String): Self = StObject.set(x, "bytesFailedToDeleteFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesFailedToDeleteFromSinkUndefined: Self = StObject.set(x, "bytesFailedToDeleteFromSink", js.undefined)
    
    @scala.inline
    def setBytesFoundFromSource(value: String): Self = StObject.set(x, "bytesFoundFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesFoundFromSourceUndefined: Self = StObject.set(x, "bytesFoundFromSource", js.undefined)
    
    @scala.inline
    def setBytesFoundOnlyFromSink(value: String): Self = StObject.set(x, "bytesFoundOnlyFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesFoundOnlyFromSinkUndefined: Self = StObject.set(x, "bytesFoundOnlyFromSink", js.undefined)
    
    @scala.inline
    def setBytesFromSourceFailed(value: String): Self = StObject.set(x, "bytesFromSourceFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesFromSourceFailedUndefined: Self = StObject.set(x, "bytesFromSourceFailed", js.undefined)
    
    @scala.inline
    def setBytesFromSourceSkippedBySync(value: String): Self = StObject.set(x, "bytesFromSourceSkippedBySync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesFromSourceSkippedBySyncUndefined: Self = StObject.set(x, "bytesFromSourceSkippedBySync", js.undefined)
    
    @scala.inline
    def setObjectsCopiedToSink(value: String): Self = StObject.set(x, "objectsCopiedToSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsCopiedToSinkUndefined: Self = StObject.set(x, "objectsCopiedToSink", js.undefined)
    
    @scala.inline
    def setObjectsDeletedFromSink(value: String): Self = StObject.set(x, "objectsDeletedFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsDeletedFromSinkUndefined: Self = StObject.set(x, "objectsDeletedFromSink", js.undefined)
    
    @scala.inline
    def setObjectsDeletedFromSource(value: String): Self = StObject.set(x, "objectsDeletedFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsDeletedFromSourceUndefined: Self = StObject.set(x, "objectsDeletedFromSource", js.undefined)
    
    @scala.inline
    def setObjectsFailedToDeleteFromSink(value: String): Self = StObject.set(x, "objectsFailedToDeleteFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsFailedToDeleteFromSinkUndefined: Self = StObject.set(x, "objectsFailedToDeleteFromSink", js.undefined)
    
    @scala.inline
    def setObjectsFoundFromSource(value: String): Self = StObject.set(x, "objectsFoundFromSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsFoundFromSourceUndefined: Self = StObject.set(x, "objectsFoundFromSource", js.undefined)
    
    @scala.inline
    def setObjectsFoundOnlyFromSink(value: String): Self = StObject.set(x, "objectsFoundOnlyFromSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsFoundOnlyFromSinkUndefined: Self = StObject.set(x, "objectsFoundOnlyFromSink", js.undefined)
    
    @scala.inline
    def setObjectsFromSourceFailed(value: String): Self = StObject.set(x, "objectsFromSourceFailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsFromSourceFailedUndefined: Self = StObject.set(x, "objectsFromSourceFailed", js.undefined)
    
    @scala.inline
    def setObjectsFromSourceSkippedBySync(value: String): Self = StObject.set(x, "objectsFromSourceSkippedBySync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsFromSourceSkippedBySyncUndefined: Self = StObject.set(x, "objectsFromSourceSkippedBySync", js.undefined)
  }
}
