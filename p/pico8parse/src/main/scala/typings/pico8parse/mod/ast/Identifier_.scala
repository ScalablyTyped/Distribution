package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier_
  extends StObject
     with Base[Identifier]
     with Expression {
  
  var isLocal: js.UndefOr[Boolean] = js.undefined
  
  var name: String
}
object Identifier_ {
  
  inline def apply(name: String): Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[Identifier_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Identifier_] (val x: Self) extends AnyVal {
    
    inline def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    inline def setIsLocalUndefined: Self = StObject.set(x, "isLocal", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
