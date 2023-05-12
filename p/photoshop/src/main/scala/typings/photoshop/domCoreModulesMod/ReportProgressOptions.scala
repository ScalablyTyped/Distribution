package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportProgressOptions extends StObject {
  
  /**
    * Text shown in progress bar dialog. Usually explaining the current progress
    */
  var commandName: js.UndefOr[String] = js.undefined
  
  /**
    * Value in range [0,1] where 0 is 0% and 1 is 100%
    */
  var value: js.UndefOr[Double] = js.undefined
}
object ReportProgressOptions {
  
  inline def apply(): ReportProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportProgressOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportProgressOptions] (val x: Self) extends AnyVal {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setCommandNameUndefined: Self = StObject.set(x, "commandName", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
