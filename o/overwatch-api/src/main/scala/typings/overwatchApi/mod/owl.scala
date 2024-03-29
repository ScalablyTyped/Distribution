package typings.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait owl extends StObject {
  
  def getLiveMatch(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
  
  def getSchedule(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
  
  def getStandings(callback: js.Function2[/* err */ js.Error, /* data */ Any, Unit]): Unit
}
object owl {
  
  inline def apply(
    getLiveMatch: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Unit,
    getSchedule: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Unit,
    getStandings: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Unit
  ): owl = {
    val __obj = js.Dynamic.literal(getLiveMatch = js.Any.fromFunction1(getLiveMatch), getSchedule = js.Any.fromFunction1(getSchedule), getStandings = js.Any.fromFunction1(getStandings))
    __obj.asInstanceOf[owl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: owl] (val x: Self) extends AnyVal {
    
    inline def setGetLiveMatch(value: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Unit): Self = StObject.set(x, "getLiveMatch", js.Any.fromFunction1(value))
    
    inline def setGetSchedule(value: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Unit): Self = StObject.set(x, "getSchedule", js.Any.fromFunction1(value))
    
    inline def setGetStandings(value: js.Function2[/* err */ js.Error, /* data */ Any, Unit] => Unit): Self = StObject.set(x, "getStandings", js.Any.fromFunction1(value))
  }
}
