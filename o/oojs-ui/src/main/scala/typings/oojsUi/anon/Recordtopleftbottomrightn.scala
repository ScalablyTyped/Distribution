package typings.oojsUi.anon

import typings.oojsUi.oojsUiStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'top' | 'left' | 'bottom' | 'right', number | ''> */
trait Recordtopleftbottomrightn extends StObject {
  
  var bottom: Double | _empty
  
  var left: Double | _empty
  
  var right: Double | _empty
  
  var top: Double | _empty
}
object Recordtopleftbottomrightn {
  
  inline def apply(bottom: Double | _empty, left: Double | _empty, right: Double | _empty, top: Double | _empty): Recordtopleftbottomrightn = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordtopleftbottomrightn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recordtopleftbottomrightn] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double | _empty): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double | _empty): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double | _empty): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double | _empty): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
