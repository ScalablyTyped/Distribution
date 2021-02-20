package typings.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolActualConfig extends PoolSpecificConfig {
  
  var connectionConfig: ConnectionConfig = js.native
}
object PoolActualConfig {
  
  @scala.inline
  def apply(connectionConfig: ConnectionConfig): PoolActualConfig = {
    val __obj = js.Dynamic.literal(connectionConfig = connectionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolActualConfig]
  }
  
  @scala.inline
  implicit class PoolActualConfigMutableBuilder[Self <: PoolActualConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionConfig(value: ConnectionConfig): Self = StObject.set(x, "connectionConfig", value.asInstanceOf[js.Any])
  }
}
