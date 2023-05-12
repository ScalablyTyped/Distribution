package typings.postgres.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenMeta
  extends StObject
     with ResultMeta[Null] {
  
  def unlisten(): js.Promise[Unit]
}
object ListenMeta {
  
  inline def apply(command: String, count: Null, state: State, statement: Statement, unlisten: () => js.Promise[Unit]): ListenMeta = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], unlisten = js.Any.fromFunction0(unlisten))
    __obj.asInstanceOf[ListenMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenMeta] (val x: Self) extends AnyVal {
    
    inline def setUnlisten(value: () => js.Promise[Unit]): Self = StObject.set(x, "unlisten", js.Any.fromFunction0(value))
  }
}
