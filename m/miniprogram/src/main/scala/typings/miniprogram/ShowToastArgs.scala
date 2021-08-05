package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowToastArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  /**
    * Text content.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Displaying duration, in ms, 2000 by default.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * toast type, showing the related icon, none by default,
    * supporting success/fail/exception/none Here. If it is exception, content is mandatory.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ShowToastArgs {
  
  inline def apply(): ShowToastArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowToastArgs]
  }
  
  extension [Self <: ShowToastArgs](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
