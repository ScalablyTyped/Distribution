package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionConstructor
  extends StObject
     with ObjectStatic
     with Instantiable0[Session[Attributes]]
     with Instantiable1[/* attributes */ Attributes, Session[Attributes]] {
  
  def current(): js.Promise[Session[Attributes]] = js.native
}
