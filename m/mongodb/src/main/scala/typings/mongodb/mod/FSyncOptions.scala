package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FSyncOptions
  extends StObject
     with CommonOptions {
  
  var fsync: js.UndefOr[Boolean] = js.undefined
}
object FSyncOptions {
  
  inline def apply(): FSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSyncOptions]
  }
  
  extension [Self <: FSyncOptions](x: Self) {
    
    inline def setFsync(value: Boolean): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
    
    inline def setFsyncUndefined: Self = StObject.set(x, "fsync", js.undefined)
  }
}
