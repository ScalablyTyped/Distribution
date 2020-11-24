package typings.pg.mod

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
  implicit class Defaults_Ops[Self <: Defaults_] (val x: Self) extends AnyVal {
    
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
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setParseInt8(value: Boolean): Self = this.set("parseInt8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseInt8: Self = this.set("parseInt8", js.undefined)
    
    @scala.inline
    def setPoolIdleTimeout(value: Double): Self = this.set("poolIdleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolIdleTimeout: Self = this.set("poolIdleTimeout", js.undefined)
    
    @scala.inline
    def setPoolSize(value: Double): Self = this.set("poolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolSize: Self = this.set("poolSize", js.undefined)
    
    @scala.inline
    def setReapIntervalMillis(value: Double): Self = this.set("reapIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReapIntervalMillis: Self = this.set("reapIntervalMillis", js.undefined)
  }
}
