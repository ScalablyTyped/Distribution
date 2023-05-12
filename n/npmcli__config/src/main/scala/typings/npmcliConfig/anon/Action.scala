package typings.npmcliConfig.anon

import typings.npmcliConfig.mod.ConfType
import typings.npmcliConfig.mod.Problem
import typings.npmcliConfig.npmcliConfigStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action
  extends StObject
     with Problem {
  
  var action: delete
  
  var key: String
  
  var where: ConfType
}
object Action {
  
  inline def apply(key: String, where: ConfType): Action = {
    val __obj = js.Dynamic.literal(action = "delete", key = key.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    inline def setAction(value: delete): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setWhere(value: ConfType): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
