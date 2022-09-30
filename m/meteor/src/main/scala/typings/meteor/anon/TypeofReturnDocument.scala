package typings.meteor.anon

import typings.meteor.meteorStrings.after
import typings.meteor.meteorStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReturnDocument extends StObject {
  
  val AFTER: after
  
  val BEFORE: before
}
object TypeofReturnDocument {
  
  inline def apply(): TypeofReturnDocument = {
    val __obj = js.Dynamic.literal(AFTER = "after", BEFORE = "before")
    __obj.asInstanceOf[TypeofReturnDocument]
  }
  
  extension [Self <: TypeofReturnDocument](x: Self) {
    
    inline def setAFTER(value: after): Self = StObject.set(x, "AFTER", value.asInstanceOf[js.Any])
    
    inline def setBEFORE(value: before): Self = StObject.set(x, "BEFORE", value.asInstanceOf[js.Any])
  }
}
