package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accuracy extends StObject {
  
  /**
    * Accuracy, in m.
    */
  var accuracy: String = js.native
  
  var latitude: String = js.native
  
  var longitude: String = js.native
}
object Accuracy {
  
  @scala.inline
  def apply(accuracy: String, latitude: String, longitude: String): Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
  
  @scala.inline
  implicit class AccuracyMutableBuilder[Self <: Accuracy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: String): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
