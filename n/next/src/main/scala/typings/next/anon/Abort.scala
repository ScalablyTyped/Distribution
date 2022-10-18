package typings.next.anon

import typings.next.`distCompiled@edgeRuntimePrimitivesEventsMod`.Event1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abort extends StObject {
  
  var abort: Event1[String]
}
object Abort {
  
  inline def apply(abort: Event1[String]): Abort = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abort]
  }
  
  extension [Self <: Abort](x: Self) {
    
    inline def setAbort(value: Event1[String]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
  }
}
