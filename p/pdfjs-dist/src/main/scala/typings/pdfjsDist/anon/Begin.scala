package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Begin extends StObject {
  
  var begin: DivIdx
}
object Begin {
  
  inline def apply(begin: DivIdx): Begin = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Begin]
  }
  
  extension [Self <: Begin](x: Self) {
    
    inline def setBegin(value: DivIdx): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
  }
}
