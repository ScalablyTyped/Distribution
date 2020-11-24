package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeConfig extends js.Object {
  
  /** Required. Number of cpus per Memcached node. */
  var cpuCount: js.UndefOr[Double] = js.native
  
  /** Required. Memory size in MiB for each Memcached node. */
  var memorySizeMb: js.UndefOr[Double] = js.native
}
object NodeConfig {
  
  @scala.inline
  def apply(): NodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfig]
  }
  
  @scala.inline
  implicit class NodeConfigOps[Self <: NodeConfig] (val x: Self) extends AnyVal {
    
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
    def setCpuCount(value: Double): Self = this.set("cpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuCount: Self = this.set("cpuCount", js.undefined)
    
    @scala.inline
    def setMemorySizeMb(value: Double): Self = this.set("memorySizeMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemorySizeMb: Self = this.set("memorySizeMb", js.undefined)
  }
}
