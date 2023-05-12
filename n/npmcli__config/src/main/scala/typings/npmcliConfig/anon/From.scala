package typings.npmcliConfig.anon

import typings.npmcliConfig.mod.ConfType
import typings.npmcliConfig.mod.Problem
import typings.npmcliConfig.npmcliConfigStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From
  extends StObject
     with Problem {
  
  var action: rename
  
  var from: String
  
  var to: String
  
  var where: ConfType
}
object From {
  
  inline def apply(from: String, to: String, where: ConfType): From = {
    val __obj = js.Dynamic.literal(action = "rename", from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    inline def setAction(value: rename): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setWhere(value: ConfType): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
