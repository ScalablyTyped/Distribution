package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Horz extends StObject {
  
  var horz: Double = js.native
  
  var vert: Double = js.native
}
object Horz {
  
  @scala.inline
  def apply(horz: Double, vert: Double): Horz = {
    val __obj = js.Dynamic.literal(horz = horz.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horz]
  }
  
  @scala.inline
  implicit class HorzMutableBuilder[Self <: Horz] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorz(value: Double): Self = StObject.set(x, "horz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVert(value: Double): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
  }
}
