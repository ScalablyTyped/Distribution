package typings.nivoArcs.anon

import typings.nivoArcs.typesTypesMod.DatumWithArc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter[Datum /* <: DatumWithArc */] extends StObject {
  
  def enter(datum: Datum): EndAngle
  
  def leave(datum: Datum): EndAngle
  
  def update(datum: Datum): EndAngle
}
object Enter {
  
  inline def apply[Datum /* <: DatumWithArc */](enter: Datum => EndAngle, leave: Datum => EndAngle, update: Datum => EndAngle): Enter[Datum] = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), leave = js.Any.fromFunction1(leave), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Enter[Datum]]
  }
  
  extension [Self <: Enter[?], Datum /* <: DatumWithArc */](x: Self & Enter[Datum]) {
    
    inline def setEnter(value: Datum => EndAngle): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
    
    inline def setLeave(value: Datum => EndAngle): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: Datum => EndAngle): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
