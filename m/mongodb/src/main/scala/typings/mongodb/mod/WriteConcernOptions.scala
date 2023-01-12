package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteConcernOptions extends StObject {
  
  /** Write Concern as an object */
  var writeConcern: js.UndefOr[WriteConcern | WriteConcernSettings] = js.undefined
}
object WriteConcernOptions {
  
  inline def apply(): WriteConcernOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteConcernOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WriteConcernOptions] (val x: Self) extends AnyVal {
    
    inline def setWriteConcern(value: WriteConcern | WriteConcernSettings): Self = StObject.set(x, "writeConcern", value.asInstanceOf[js.Any])
    
    inline def setWriteConcernUndefined: Self = StObject.set(x, "writeConcern", js.undefined)
  }
}
