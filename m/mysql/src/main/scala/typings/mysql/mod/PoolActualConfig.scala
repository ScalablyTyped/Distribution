package typings.mysql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolActualConfig
  extends StObject
     with PoolSpecificConfig {
  
  var connectionConfig: ConnectionConfig
}
object PoolActualConfig {
  
  inline def apply(connectionConfig: ConnectionConfig): PoolActualConfig = {
    val __obj = js.Dynamic.literal(connectionConfig = connectionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolActualConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PoolActualConfig] (val x: Self) extends AnyVal {
    
    inline def setConnectionConfig(value: ConnectionConfig): Self = StObject.set(x, "connectionConfig", value.asInstanceOf[js.Any])
  }
}
