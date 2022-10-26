package typings.next.anon

import typings.next.nextStrings.bug
import typings.next.nextStrings.error
import typings.next.nextStrings.fatal
import typings.next.nextStrings.hint
import typings.next.nextStrings.info
import typings.next.nextStrings.note
import typings.next.nextStrings.suggestions
import typings.next.nextStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextDirectory extends StObject {
  
  var contextDirectory: js.UndefOr[String] = js.undefined
  
  var logDetail: js.UndefOr[Boolean] = js.undefined
  
  var logLevel: js.UndefOr[bug | fatal | error | warning | hint | note | suggestions | info] = js.undefined
  
  var processCwd: js.UndefOr[String] = js.undefined
}
object ContextDirectory {
  
  inline def apply(): ContextDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextDirectory]
  }
  
  extension [Self <: ContextDirectory](x: Self) {
    
    inline def setContextDirectory(value: String): Self = StObject.set(x, "contextDirectory", value.asInstanceOf[js.Any])
    
    inline def setContextDirectoryUndefined: Self = StObject.set(x, "contextDirectory", js.undefined)
    
    inline def setLogDetail(value: Boolean): Self = StObject.set(x, "logDetail", value.asInstanceOf[js.Any])
    
    inline def setLogDetailUndefined: Self = StObject.set(x, "logDetail", js.undefined)
    
    inline def setLogLevel(value: bug | fatal | error | warning | hint | note | suggestions | info): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setProcessCwd(value: String): Self = StObject.set(x, "processCwd", value.asInstanceOf[js.Any])
    
    inline def setProcessCwdUndefined: Self = StObject.set(x, "processCwd", js.undefined)
  }
}
