package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPromiseResult[T] extends StObject {
  
  var `type`: PromiseResultType
  
  var value: T
}
object IPromiseResult {
  
  inline def apply[T](`type`: PromiseResultType, value: T): IPromiseResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPromiseResult[T]]
  }
  
  extension [Self <: IPromiseResult[?], T](x: Self & IPromiseResult[T]) {
    
    inline def setType(value: PromiseResultType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
