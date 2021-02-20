package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownstreamOnly extends StObject {
  
  var downstreamOnly: Boolean = js.native
  
  var expr: Null | String = js.native
}
object DownstreamOnly {
  
  @scala.inline
  def apply(downstreamOnly: Boolean): DownstreamOnly = {
    val __obj = js.Dynamic.literal(downstreamOnly = downstreamOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownstreamOnly]
  }
  
  @scala.inline
  implicit class DownstreamOnlyMutableBuilder[Self <: DownstreamOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownstreamOnly(value: Boolean): Self = StObject.set(x, "downstreamOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpr(value: String): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprNull: Self = StObject.set(x, "expr", null)
  }
}
