package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Error **/
/** Method **/
trait MethodThisType extends StObject {
  
  var connection: Connection | Null
  
  var isSimulation: Boolean
  
  def setUserId(userId: String): Unit
  
  def unblock(): Unit
  
  var userId: String | Null
}
object MethodThisType {
  
  @scala.inline
  def apply(isSimulation: Boolean, setUserId: String => Unit, unblock: () => Unit): MethodThisType = {
    val __obj = js.Dynamic.literal(isSimulation = isSimulation.asInstanceOf[js.Any], setUserId = js.Any.fromFunction1(setUserId), unblock = js.Any.fromFunction0(unblock), connection = null, userId = null)
    __obj.asInstanceOf[MethodThisType]
  }
  
  @scala.inline
  implicit class MethodThisTypeMutableBuilder[Self <: MethodThisType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    @scala.inline
    def setIsSimulation(value: Boolean): Self = StObject.set(x, "isSimulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUserId(value: String => Unit): Self = StObject.set(x, "setUserId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnblock(value: () => Unit): Self = StObject.set(x, "unblock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdNull: Self = StObject.set(x, "userId", null)
  }
}
