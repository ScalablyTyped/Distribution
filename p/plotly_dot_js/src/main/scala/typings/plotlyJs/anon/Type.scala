package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.constant
import typings.plotlyJs.plotlyJsStrings.percent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: constant | percent
  
  var value: Double
  
  var valueminus: js.UndefOr[Double] = js.undefined
}
object Type {
  
  @scala.inline
  def apply(`type`: constant | percent, value: Double): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: constant | percent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueminus(value: Double): Self = StObject.set(x, "valueminus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueminusUndefined: Self = StObject.set(x, "valueminus", js.undefined)
  }
}
