package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeConfig extends StObject {
  
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
  implicit class NodeConfigMutableBuilder[Self <: NodeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuCount(value: Double): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    @scala.inline
    def setMemorySizeMb(value: Double): Self = StObject.set(x, "memorySizeMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemorySizeMbUndefined: Self = StObject.set(x, "memorySizeMb", js.undefined)
  }
}
