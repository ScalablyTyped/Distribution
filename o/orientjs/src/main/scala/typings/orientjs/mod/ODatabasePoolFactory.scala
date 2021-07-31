package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "ODatabasePoolFactory")
@js.native
class ODatabasePoolFactory () extends StObject {
  
  def create(): js.Promise[ODatabase] = js.native
  
  def destroy(db: ODatabase): js.Promise[Unit] = js.native
}
