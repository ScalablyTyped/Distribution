package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Move extends StObject {
  
  var move: js.UndefOr[Tasks] = js.native
}
object Move {
  
  @scala.inline
  def apply(): Move = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Move]
  }
  
  @scala.inline
  implicit class MoveMutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMove(value: Tasks): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
  }
}
