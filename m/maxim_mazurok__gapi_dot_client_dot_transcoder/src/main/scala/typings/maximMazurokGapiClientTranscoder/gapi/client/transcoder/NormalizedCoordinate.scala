package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedCoordinate extends StObject {
  
  /** Normalized x coordinate. */
  var x: js.UndefOr[Double] = js.undefined
  
  /** Normalized y coordinate. */
  var y: js.UndefOr[Double] = js.undefined
}
object NormalizedCoordinate {
  
  @scala.inline
  def apply(): NormalizedCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizedCoordinate]
  }
  
  @scala.inline
  implicit class NormalizedCoordinateMutableBuilder[Self <: NormalizedCoordinate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
