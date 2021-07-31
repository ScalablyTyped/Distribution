package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var base: Double
  
  var count: Double
  
  var indexed: js.UndefOr[Boolean] = js.undefined
  
  var `type`: Double
}
object Base {
  
  @scala.inline
  def apply(base: Double, count: Double, `type`: Double): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  @scala.inline
  implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
