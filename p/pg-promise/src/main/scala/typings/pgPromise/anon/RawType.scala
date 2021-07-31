package typings.pgPromise.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawType extends StObject {
  
  var rawType: js.Symbol
  
  var toPostgres: js.Symbol
}
object RawType {
  
  @scala.inline
  def apply(rawType: js.Symbol, toPostgres: js.Symbol): RawType = {
    val __obj = js.Dynamic.literal(rawType = rawType.asInstanceOf[js.Any], toPostgres = toPostgres.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawType]
  }
  
  @scala.inline
  implicit class RawTypeMutableBuilder[Self <: RawType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRawType(value: js.Symbol): Self = StObject.set(x, "rawType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPostgres(value: js.Symbol): Self = StObject.set(x, "toPostgres", value.asInstanceOf[js.Any])
  }
}
