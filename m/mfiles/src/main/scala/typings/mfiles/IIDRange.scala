package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIDRange extends StObject {
  
  def Clone(): IIDRange = js.native
  
  var MaxID: Double = js.native
  
  var MaxID_32bit: String = js.native
  
  var MinID: Double = js.native
  
  var MinID_32bit: String = js.native
  
  def SetIDs(MinID: Double, MaxID: Double): Unit = js.native
  
  def SetIDs_32bit(MinID: String, MaxID: String): Unit = js.native
}
object IIDRange {
  
  @scala.inline
  def apply(
    Clone: () => IIDRange,
    MaxID: Double,
    MaxID_32bit: String,
    MinID: Double,
    MinID_32bit: String,
    SetIDs: (Double, Double) => Unit,
    SetIDs_32bit: (String, String) => Unit
  ): IIDRange = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), MaxID = MaxID.asInstanceOf[js.Any], MaxID_32bit = MaxID_32bit.asInstanceOf[js.Any], MinID = MinID.asInstanceOf[js.Any], MinID_32bit = MinID_32bit.asInstanceOf[js.Any], SetIDs = js.Any.fromFunction2(SetIDs), SetIDs_32bit = js.Any.fromFunction2(SetIDs_32bit))
    __obj.asInstanceOf[IIDRange]
  }
  
  @scala.inline
  implicit class IIDRangeMutableBuilder[Self <: IIDRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IIDRange): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxID(value: Double): Self = StObject.set(x, "MaxID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxID_32bit(value: String): Self = StObject.set(x, "MaxID_32bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinID(value: Double): Self = StObject.set(x, "MinID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinID_32bit(value: String): Self = StObject.set(x, "MinID_32bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIDs(value: (Double, Double) => Unit): Self = StObject.set(x, "SetIDs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetIDs_32bit(value: (String, String) => Unit): Self = StObject.set(x, "SetIDs_32bit", js.Any.fromFunction2(value))
  }
}
