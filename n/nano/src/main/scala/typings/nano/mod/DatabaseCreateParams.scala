package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseCreateParams extends StObject {
  
  var n: js.UndefOr[Double] = js.undefined
  
  var partitioned: js.UndefOr[Boolean] = js.undefined
  
  var q: js.UndefOr[Double] = js.undefined
}
object DatabaseCreateParams {
  
  @scala.inline
  def apply(): DatabaseCreateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseCreateParams]
  }
  
  @scala.inline
  implicit class DatabaseCreateParamsMutableBuilder[Self <: DatabaseCreateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    @scala.inline
    def setPartitioned(value: Boolean): Self = StObject.set(x, "partitioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionedUndefined: Self = StObject.set(x, "partitioned", js.undefined)
    
    @scala.inline
    def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
  }
}
