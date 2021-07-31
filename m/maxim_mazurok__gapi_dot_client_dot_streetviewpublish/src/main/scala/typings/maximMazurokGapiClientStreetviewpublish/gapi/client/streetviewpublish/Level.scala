package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  /** Required. A name assigned to this Level, restricted to 3 characters. Consider how the elevator buttons would be labeled for this level if there was an elevator. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Floor number, used for ordering. 0 indicates the ground level, 1 indicates the first level above ground level, -1 indicates the first level under ground level. Non-integer values
    * are OK.
    */
  var number: js.UndefOr[Double] = js.undefined
}
object Level {
  
  @scala.inline
  def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
