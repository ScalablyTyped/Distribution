package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2CommandOverhead extends StObject {
  
  /**
    * The elapsed time between calling Accept and Complete. The server will also have its own idea of what this should be, but this excludes the overhead of the RPCs and the bot response
    * time.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /** The amount of time *not* spent executing the command (ie uploading/downloading files). */
  var overhead: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2CommandOverhead {
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2CommandOverhead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandOverhead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2CommandOverhead] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOverhead(value: String): Self = StObject.set(x, "overhead", value.asInstanceOf[js.Any])
    
    inline def setOverheadUndefined: Self = StObject.set(x, "overhead", js.undefined)
  }
}
