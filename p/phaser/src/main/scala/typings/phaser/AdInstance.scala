package typings.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdInstance extends StObject {
  
  /**
    * Represents an instance of an ad.
    */
  var instance: js.Any
  
  /**
    * The Audience Network placement ID of this ad instance.
    */
  var placementID: String
  
  /**
    * Has this ad already been shown in-game?
    */
  var shown: Boolean
  
  /**
    * Is this a video ad?
    */
  var video: Boolean
}
object AdInstance {
  
  @scala.inline
  def apply(instance: js.Any, placementID: String, shown: Boolean, video: Boolean): AdInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], placementID = placementID.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdInstance]
  }
  
  @scala.inline
  implicit class AdInstanceMutableBuilder[Self <: AdInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementID(value: String): Self = StObject.set(x, "placementID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
