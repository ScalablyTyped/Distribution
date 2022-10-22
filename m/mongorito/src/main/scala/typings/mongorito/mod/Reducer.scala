package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reducer[S] extends StObject {
  
  def apply(state: S, action: Action): Reducer[Any] = js.native
}
