package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMContainerConfig extends StObject {
  
  /**
    * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
    */
  var behindCanvas: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
    */
  var createContainer: js.UndefOr[Boolean] = js.undefined
}
object DOMContainerConfig {
  
  @scala.inline
  def apply(): DOMContainerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMContainerConfig]
  }
  
  @scala.inline
  implicit class DOMContainerConfigMutableBuilder[Self <: DOMContainerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehindCanvas(value: Boolean): Self = StObject.set(x, "behindCanvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehindCanvasUndefined: Self = StObject.set(x, "behindCanvas", js.undefined)
    
    @scala.inline
    def setCreateContainer(value: Boolean): Self = StObject.set(x, "createContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateContainerUndefined: Self = StObject.set(x, "createContainer", js.undefined)
  }
}
