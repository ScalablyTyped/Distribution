package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGenericPromise extends StObject {
  
  def apply(
    cb: js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[Any], Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
      Unit
    ]
  ): js.Promise[Any] = js.native
  
  def all(iterable: Any): js.Promise[Any] = js.native
  
  def reject(): Unit = js.native
  def reject(reason: Any): Unit = js.native
  
  def resolve(): Unit = js.native
  def resolve(value: Any): Unit = js.native
}
