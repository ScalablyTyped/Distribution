package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionOptions extends js.Object {
  
  /**
    * **Note:** This hint is currently ignored by PartitionQuery and PartitionRead requests. The desired maximum number of partitions to return. For example, this may be set to the number
    * of workers available. The default for this option is currently 10,000. The maximum value is currently 200,000. This is only a hint. The actual number of partitions returned may be
    * smaller or larger than this maximum count request.
    */
  var maxPartitions: js.UndefOr[String] = js.native
  
  /**
    * **Note:** This hint is currently ignored by PartitionQuery and PartitionRead requests. The desired data size for each partition generated. The default for this option is currently 1
    * GiB. This is only a hint. The actual size of each partition may be smaller or larger than this size request.
    */
  var partitionSizeBytes: js.UndefOr[String] = js.native
}
object PartitionOptions {
  
  @scala.inline
  def apply(): PartitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionOptions]
  }
  
  @scala.inline
  implicit class PartitionOptionsOps[Self <: PartitionOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxPartitions(value: String): Self = this.set("maxPartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPartitions: Self = this.set("maxPartitions", js.undefined)
    
    @scala.inline
    def setPartitionSizeBytes(value: String): Self = this.set("partitionSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionSizeBytes: Self = this.set("partitionSizeBytes", js.undefined)
  }
}
