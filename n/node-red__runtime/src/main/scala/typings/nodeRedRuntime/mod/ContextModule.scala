package typings.nodeRedRuntime.mod

import typings.nodeRedRuntime.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextModule extends StObject {
  
  /**
    * Gets the info of an individual node set
    * @param opts
    * @param opts.scope - the scope of the context
    * @param opts.id - the id of the context
    * @param opts.store - the context store
    * @param opts.key - the context key
    * @param opts.req - the request to log (optional)
    */
  def delete(opts: Id): js.Promise[Unit] = js.native
  
  /**
    * Gets the info of an individual node set
    * @param opts
    * @param opts.scope - the scope of the context
    * @param opts.id - the id of the context
    * @param opts.store - the context store
    * @param opts.key - the context key
    * @param opts.req - the request to log (optional)
    */
  def getValue(opts: Id): js.Promise[js.Object] = js.native
}
object ContextModule {
  
  @scala.inline
  def apply(delete: Id => js.Promise[Unit], getValue: Id => js.Promise[js.Object]): ContextModule = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getValue = js.Any.fromFunction1(getValue))
    __obj.asInstanceOf[ContextModule]
  }
  
  @scala.inline
  implicit class ContextModuleMutableBuilder[Self <: ContextModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: Id => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: Id => js.Promise[js.Object]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
  }
}
