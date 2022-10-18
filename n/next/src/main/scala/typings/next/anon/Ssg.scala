package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ssg extends StObject {
  
  var ssg: Boolean
  
  var ssr: Boolean
}
object Ssg {
  
  inline def apply(ssg: Boolean, ssr: Boolean): Ssg = {
    val __obj = js.Dynamic.literal(ssg = ssg.asInstanceOf[js.Any], ssr = ssr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssg]
  }
  
  extension [Self <: Ssg](x: Self) {
    
    inline def setSsg(value: Boolean): Self = StObject.set(x, "ssg", value.asInstanceOf[js.Any])
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
  }
}
