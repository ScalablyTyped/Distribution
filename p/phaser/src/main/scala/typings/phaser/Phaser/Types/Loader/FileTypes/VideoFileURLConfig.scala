package typings.phaser.Phaser.Types.Loader.FileTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoFileURLConfig extends StObject {
  
  /**
    * The video file format. See property names in {@link Phaser.Device.Video}.
    */
  var `type`: String
  
  /**
    * The absolute or relative URL of the video file.
    */
  var url: String
}
object VideoFileURLConfig {
  
  inline def apply(`type`: String, url: String): VideoFileURLConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFileURLConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoFileURLConfig] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
