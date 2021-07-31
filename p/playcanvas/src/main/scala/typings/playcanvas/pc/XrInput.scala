package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to input sources for WebXR.
  * @property inputSources - List of active {@link pc.XrInputSource}.
  * @param manager - WebXR Manager.
  */
@js.native
trait XrInput
  extends StObject
     with EventHandler {
  
  /**
    * List of active {@link pc.XrInputSource}.
    */
  var inputSources: js.Array[XrInputSource] = js.native
}
