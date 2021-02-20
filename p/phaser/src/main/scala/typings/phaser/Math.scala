package typings.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Math extends StObject {
  
  def fround(n: Double): Double = js.native
}
object Math {
  
  @scala.inline
  def apply(fround: Double => Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround))
    __obj.asInstanceOf[Math]
  }
  
  @scala.inline
  implicit class MathMutableBuilder[Self <: Math] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFround(value: Double => Double): Self = StObject.set(x, "fround", js.Any.fromFunction1(value))
  }
}
