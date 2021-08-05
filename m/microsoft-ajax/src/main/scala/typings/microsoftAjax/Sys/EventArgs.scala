package typings.microsoftAjax.Sys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a base class for classes that are used by event sources to pass event argument information.
  * The EventArgs class is a base class and not intended to be used directly. Override this constructor to provide specific functionality.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383795(v=vs.100).aspx}
  */
trait EventArgs extends StObject {
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  var Empty: EventArgs
}
object EventArgs {
  
  inline def apply(Empty: EventArgs): EventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
  
  extension [Self <: EventArgs](x: Self) {
    
    inline def setEmpty(value: EventArgs): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
  }
}
