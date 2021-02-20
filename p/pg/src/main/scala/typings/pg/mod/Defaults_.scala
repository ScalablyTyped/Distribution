package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaults_ extends ClientConfig {
  
  var binary: js.UndefOr[Boolean] = js.native
  
  var parseInt8: js.UndefOr[Boolean] = js.native
  
  var poolIdleTimeout: js.UndefOr[Double] = js.native
  
  var poolSize: js.UndefOr[Double] = js.native
  
  var reapIntervalMillis: js.UndefOr[Double] = js.native
}
object Defaults_ {
  
  @scala.inline
  def apply(): Defaults_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaults_]
  }
  
  @scala.inline
  implicit class Defaults_MutableBuilder[Self <: Defaults_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setParseInt8(value: Boolean): Self = StObject.set(x, "parseInt8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseInt8Undefined: Self = StObject.set(x, "parseInt8", js.undefined)
    
    @scala.inline
    def setPoolIdleTimeout(value: Double): Self = StObject.set(x, "poolIdleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolIdleTimeoutUndefined: Self = StObject.set(x, "poolIdleTimeout", js.undefined)
    
    @scala.inline
    def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    
    @scala.inline
    def setReapIntervalMillis(value: Double): Self = StObject.set(x, "reapIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReapIntervalMillisUndefined: Self = StObject.set(x, "reapIntervalMillis", js.undefined)
  }
}
