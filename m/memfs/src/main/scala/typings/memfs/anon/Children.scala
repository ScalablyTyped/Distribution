package typings.memfs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.Array[String]
  
  var ino: Double
  
  var steps: js.Array[String]
}
object Children {
  
  inline def apply(children: js.Array[String], ino: Double, steps: js.Array[String]): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[String]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: String*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
