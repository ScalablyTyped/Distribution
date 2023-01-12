package typings.meteor.anon

import typings.meteor.meteorInts.`1`
import typings.meteor.meteorInts.`2`
import typings.meteor.meteorInts.`3`
import typings.meteor.meteorInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAutoEncryptionLogge extends StObject {
  
  val Error: `1`
  
  val FatalError: typings.meteor.meteorInts.`0`
  
  val Info: `3`
  
  val Trace: `4`
  
  val Warning: `2`
}
object TypeofAutoEncryptionLogge {
  
  inline def apply(): TypeofAutoEncryptionLogge = {
    val __obj = js.Dynamic.literal(Error = 1, FatalError = 0, Info = 3, Trace = 4, Warning = 2)
    __obj.asInstanceOf[TypeofAutoEncryptionLogge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofAutoEncryptionLogge] (val x: Self) extends AnyVal {
    
    inline def setError(value: `1`): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setFatalError(value: typings.meteor.meteorInts.`0`): Self = StObject.set(x, "FatalError", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: `3`): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setTrace(value: `4`): Self = StObject.set(x, "Trace", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: `2`): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
  }
}
