package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumRotations extends StObject {
  
  val numRotations: typings.next.nextInts.`0`
}
object NumRotations {
  
  inline def apply(): NumRotations = {
    val __obj = js.Dynamic.literal(numRotations = 0)
    __obj.asInstanceOf[NumRotations]
  }
  
  extension [Self <: NumRotations](x: Self) {
    
    inline def setNumRotations(value: typings.next.nextInts.`0`): Self = StObject.set(x, "numRotations", value.asInstanceOf[js.Any])
  }
}
