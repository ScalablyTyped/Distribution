package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @returnobject
  * @targetfolder objects/returnobjects
  * @minVersion 22.5
  */
trait Scheduling extends StObject {
  
  var eventLevel: js.UndefOr[Double] = js.undefined
  
  var playLevel: js.UndefOr[Double] = js.undefined
  
  var timeOut: js.UndefOr[Double] = js.undefined
}
object Scheduling {
  
  inline def apply(): Scheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scheduling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scheduling] (val x: Self) extends AnyVal {
    
    inline def setEventLevel(value: Double): Self = StObject.set(x, "eventLevel", value.asInstanceOf[js.Any])
    
    inline def setEventLevelUndefined: Self = StObject.set(x, "eventLevel", js.undefined)
    
    inline def setPlayLevel(value: Double): Self = StObject.set(x, "playLevel", value.asInstanceOf[js.Any])
    
    inline def setPlayLevelUndefined: Self = StObject.set(x, "playLevel", js.undefined)
    
    inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
    
    inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
  }
}
