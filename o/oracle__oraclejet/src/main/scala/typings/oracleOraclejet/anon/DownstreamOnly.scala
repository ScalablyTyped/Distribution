package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownstreamOnly extends StObject {
  
  var downstreamOnly: Boolean
  
  var expr: Null | String
}
object DownstreamOnly {
  
  inline def apply(downstreamOnly: Boolean): DownstreamOnly = {
    val __obj = js.Dynamic.literal(downstreamOnly = downstreamOnly.asInstanceOf[js.Any], expr = null)
    __obj.asInstanceOf[DownstreamOnly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownstreamOnly] (val x: Self) extends AnyVal {
    
    inline def setDownstreamOnly(value: Boolean): Self = StObject.set(x, "downstreamOnly", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: String): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprNull: Self = StObject.set(x, "expr", null)
  }
}
