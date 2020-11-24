package typings.phaser.Phaser.Physics.Arcade.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods used for setting the debug properties of an Arcade Physics Body.
  */
@js.native
trait Debug extends js.Object {
  
  /**
    * The color of the body outline when it renders to the debug display.
    */
  var debugBodyColor: Double = js.native
  
  /**
    * Set to `true` to have this body render its outline to the debug display.
    */
  var debugShowBody: Boolean = js.native
  
  /**
    * Set to `true` to have this body render a velocity marker to the debug display.
    */
  var debugShowVelocity: Boolean = js.native
  
  /**
    * Sets the debug values of this body.
    * 
    * Bodies will only draw their debug if debug has been enabled for Arcade Physics as a whole.
    * Note that there is a performance cost in drawing debug displays. It should never be used in production.
    * @param showBody Set to `true` to have this body render its outline to the debug display.
    * @param showVelocity Set to `true` to have this body render a velocity marker to the debug display.
    * @param bodyColor The color of the body outline when rendered to the debug display.
    */
  def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): this.type = js.native
  
  /**
    * Sets the color of the body outline when it renders to the debug display.
    * @param value The color of the body outline when rendered to the debug display.
    */
  def setDebugBodyColor(value: Double): this.type = js.native
}
object Debug {
  
  @scala.inline
  def apply(
    debugBodyColor: Double,
    debugShowBody: Boolean,
    debugShowVelocity: Boolean,
    setDebug: (Boolean, Boolean, Double) => Debug,
    setDebugBodyColor: Double => Debug
  ): Debug = {
    val __obj = js.Dynamic.literal(debugBodyColor = debugBodyColor.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any], setDebug = js.Any.fromFunction3(setDebug), setDebugBodyColor = js.Any.fromFunction1(setDebugBodyColor))
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
    
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
    def setDebugBodyColor(value: Double): Self = this.set("debugBodyColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowBody(value: Boolean): Self = this.set("debugShowBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowVelocity(value: Boolean): Self = this.set("debugShowVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDebug(value: (Boolean, Boolean, Double) => Debug): Self = this.set("setDebug", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetDebugBodyColor(value: Double => Debug): Self = this.set("setDebugBodyColor", js.Any.fromFunction1(value))
  }
}
