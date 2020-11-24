package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferOptions extends js.Object {
  
  /** Whether objects should be deleted from the source after they are transferred to the sink. **Note:** This option and delete_objects_unique_in_sink are mutually exclusive. */
  var deleteObjectsFromSourceAfterTransfer: js.UndefOr[Boolean] = js.native
  
  /** Whether objects that exist only in the sink should be deleted. **Note:** This option and delete_objects_from_source_after_transfer are mutually exclusive. */
  var deleteObjectsUniqueInSink: js.UndefOr[Boolean] = js.native
  
  /**
    * When to overwrite objects that already exist in the sink. The default is that only objects that are different from the source are ovewritten. If true, all objects in the sink whose
    * name matches an object in the source will be overwritten with the source object.
    */
  var overwriteObjectsAlreadyExistingInSink: js.UndefOr[Boolean] = js.native
}
object TransferOptions {
  
  @scala.inline
  def apply(): TransferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOptions]
  }
  
  @scala.inline
  implicit class TransferOptionsOps[Self <: TransferOptions] (val x: Self) extends AnyVal {
    
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
    def setDeleteObjectsFromSourceAfterTransfer(value: Boolean): Self = this.set("deleteObjectsFromSourceAfterTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteObjectsFromSourceAfterTransfer: Self = this.set("deleteObjectsFromSourceAfterTransfer", js.undefined)
    
    @scala.inline
    def setDeleteObjectsUniqueInSink(value: Boolean): Self = this.set("deleteObjectsUniqueInSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteObjectsUniqueInSink: Self = this.set("deleteObjectsUniqueInSink", js.undefined)
    
    @scala.inline
    def setOverwriteObjectsAlreadyExistingInSink(value: Boolean): Self = this.set("overwriteObjectsAlreadyExistingInSink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwriteObjectsAlreadyExistingInSink: Self = this.set("overwriteObjectsAlreadyExistingInSink", js.undefined)
  }
}
