package typings.nextServer.anon

import org.scalablytyped.runtime.Instantiable1
import typings.nextServer.sideEffectMod.State
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable
  extends StObject
     with Instantiable1[/* props */ js.Any, ComponentDidMount] {
  
  var contextType: js.UndefOr[Context[js.Any]] = js.native
  
  def rewind(): State = js.native
}
