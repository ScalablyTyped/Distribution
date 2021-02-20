package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartGroup
  extends /* key */ StringDictionary[js.Any] {
  
  var endGroup: String = js.native
  
  var startGroup: String = js.native
  
  var xMax: Double = js.native
  
  var xMin: Double = js.native
  
  var yMax: Double = js.native
  
  var yMin: Double = js.native
}
object StartGroup {
  
  @scala.inline
  def apply(endGroup: String, startGroup: String, xMax: Double, xMin: Double, yMax: Double, yMin: Double): StartGroup = {
    val __obj = js.Dynamic.literal(endGroup = endGroup.asInstanceOf[js.Any], startGroup = startGroup.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartGroup]
  }
  
  @scala.inline
  implicit class StartGroupMutableBuilder[Self <: StartGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndGroup(value: String): Self = StObject.set(x, "endGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartGroup(value: String): Self = StObject.set(x, "startGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
  }
}
