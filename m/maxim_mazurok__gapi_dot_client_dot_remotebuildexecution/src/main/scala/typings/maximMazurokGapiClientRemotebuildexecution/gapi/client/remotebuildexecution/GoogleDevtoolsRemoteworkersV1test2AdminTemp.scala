package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2AdminTemp extends StObject {
  
  /** The argument to the admin action; see `Command` for semantics. */
  var arg: js.UndefOr[String] = js.undefined
  
  /** The admin action; see `Command` for legal values. */
  var command: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2AdminTemp {
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2AdminTemp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2AdminTemp]
  }
  
  extension [Self <: GoogleDevtoolsRemoteworkersV1test2AdminTemp](x: Self) {
    
    inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
  }
}
