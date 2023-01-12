package typings.openui5.sapUiUnifiedLibraryMod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProcessableBlobs extends StObject {
  
  var __implements__sap_ui_unified_IProcessableBlobs: Boolean
  
  /**
    * @SINCE 1.52
    *
    * Allows to process Blobs before they get uploaded. This API can be used to create custom Blobs and upload
    * these custom Blobs instead of the received/initials Blobs in the parameter `aBlobs`. One use case could
    * be to create and upload zip archives based on the passed Blobs. The default implementation of this API
    * should simply resolve with the received Blobs (parameter `aBlobs`).
    *
    * @returns A Promise that resolves with an array of Blobs which is used for the final uploading.
    */
  def getProcessedBlobsFromArray(
    /**
    * The initial Blobs which can be used to determine a new array of Blobs for further processing.
    */
  aBlobs: js.Array[Blob]
  ): js.Promise[Any]
}
object IProcessableBlobs {
  
  inline def apply(
    __implements__sap_ui_unified_IProcessableBlobs: Boolean,
    getProcessedBlobsFromArray: js.Array[Blob] => js.Promise[Any]
  ): IProcessableBlobs = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_unified_IProcessableBlobs = __implements__sap_ui_unified_IProcessableBlobs.asInstanceOf[js.Any], getProcessedBlobsFromArray = js.Any.fromFunction1(getProcessedBlobsFromArray))
    __obj.asInstanceOf[IProcessableBlobs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProcessableBlobs] (val x: Self) extends AnyVal {
    
    inline def setGetProcessedBlobsFromArray(value: js.Array[Blob] => js.Promise[Any]): Self = StObject.set(x, "getProcessedBlobsFromArray", js.Any.fromFunction1(value))
    
    inline def set__implements__sap_ui_unified_IProcessableBlobs(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_unified_IProcessableBlobs", value.asInstanceOf[js.Any])
  }
}
