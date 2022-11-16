package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Reducer = (state : S, action : mongorito.mongorito.Action): mongorito.mongorito.Reducer<any>
}}}
to avoid circular code involving: 
- mongorito.mongorito.Reducer
*/
@js.native
trait Reducer[S] extends StObject {
  
  def apply(state: S, action: Action): Reducer[Any] = js.native
}
