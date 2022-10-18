package typings.next.anon

import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finished extends StObject {
  
  var finished: js.UndefOr[`true`] = js.undefined
}
object Finished {
  
  inline def apply(): Finished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Finished]
  }
  
  extension [Self <: Finished](x: Self) {
    
    inline def setFinished(value: `true`): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
  }
}
