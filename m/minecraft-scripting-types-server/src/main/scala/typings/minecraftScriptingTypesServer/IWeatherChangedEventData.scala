package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.Dimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever the weather changes. It contains information about the weather it is changing to.
  */
@js.native
trait IWeatherChangedEventData extends js.Object {
  
  /**
    * The name of the dimension where the weather change happened
    */
  var dimension: Dimension = js.native
  
  /**
    * Tells if the new weather has lightning
    */
  var lightning: Boolean = js.native
  
  /**
    * Tells if the new weather has rain
    */
  var raining: Boolean = js.native
}
object IWeatherChangedEventData {
  
  @scala.inline
  def apply(dimension: Dimension, lightning: Boolean, raining: Boolean): IWeatherChangedEventData = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], lightning = lightning.asInstanceOf[js.Any], raining = raining.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWeatherChangedEventData]
  }
  
  @scala.inline
  implicit class IWeatherChangedEventDataOps[Self <: IWeatherChangedEventData] (val x: Self) extends AnyVal {
    
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
    def setDimension(value: Dimension): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightning(value: Boolean): Self = this.set("lightning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaining(value: Boolean): Self = this.set("raining", value.asInstanceOf[js.Any])
  }
}
