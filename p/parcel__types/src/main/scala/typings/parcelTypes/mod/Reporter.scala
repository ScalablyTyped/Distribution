package typings.parcelTypes.mod

import typings.parcelTypes.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reporter extends StObject {
  
  def report(arg0: Event): Async[Unit]
}
object Reporter {
  
  inline def apply(report: Event => Async[Unit]): Reporter = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[Reporter]
  }
  
  extension [Self <: Reporter](x: Self) {
    
    inline def setReport(value: Event => Async[Unit]): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
  }
}
