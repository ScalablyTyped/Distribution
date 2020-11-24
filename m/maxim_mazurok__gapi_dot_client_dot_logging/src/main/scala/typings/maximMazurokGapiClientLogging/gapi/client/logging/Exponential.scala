package typings.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exponential extends js.Object {
  
  /** Must be greater than 1. */
  var growthFactor: js.UndefOr[Double] = js.native
  
  /** Must be greater than 0. */
  var numFiniteBuckets: js.UndefOr[Double] = js.native
  
  /** Must be greater than 0. */
  var scale: js.UndefOr[Double] = js.native
}
object Exponential {
  
  @scala.inline
  def apply(): Exponential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exponential]
  }
  
  @scala.inline
  implicit class ExponentialOps[Self <: Exponential] (val x: Self) extends AnyVal {
    
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
    def setGrowthFactor(value: Double): Self = this.set("growthFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrowthFactor: Self = this.set("growthFactor", js.undefined)
    
    @scala.inline
    def setNumFiniteBuckets(value: Double): Self = this.set("numFiniteBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumFiniteBuckets: Self = this.set("numFiniteBuckets", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
