package typings.popperjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  x :number,   y :number,   centerOffset :number}> */
@js.native
trait Partialxnumberynumbercent extends StObject {
  
  var centerOffset: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object Partialxnumberynumbercent {
  
  @scala.inline
  def apply(): Partialxnumberynumbercent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialxnumberynumbercent]
  }
  
  @scala.inline
  implicit class PartialxnumberynumbercentMutableBuilder[Self <: Partialxnumberynumbercent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterOffset(value: Double): Self = StObject.set(x, "centerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterOffsetUndefined: Self = StObject.set(x, "centerOffset", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
