package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadConcern extends StObject {
  
  var level: ReadConcernLevel
}
object ReadConcern {
  
  inline def apply(level: ReadConcernLevel): ReadConcern = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConcern]
  }
  
  extension [Self <: ReadConcern](x: Self) {
    
    inline def setLevel(value: ReadConcernLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
