package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait A extends StObject {
  
  var a: Double
  
  var c: Double
  
  var d: Double
  
  var w: String
}
object A {
  
  @scala.inline
  def apply(a: Double, c: Double, d: Double, w: String): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
  
  @scala.inline
  implicit class AMutableBuilder[Self <: A] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
  }
}
