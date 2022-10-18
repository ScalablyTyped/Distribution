package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Verbose extends StObject {
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object Verbose {
  
  inline def apply(): Verbose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Verbose]
  }
  
  extension [Self <: Verbose](x: Self) {
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
