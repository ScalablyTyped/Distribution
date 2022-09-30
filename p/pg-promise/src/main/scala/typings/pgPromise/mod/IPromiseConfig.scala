package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromiseConfig extends StObject {
  
  def all(iterable: Any): js.Promise[Any] = js.native
  
  def create(resolve: js.Function1[/* value */ js.UndefOr[Any], Unit]): js.Promise[Any] = js.native
  def create(
    resolve: js.Function1[/* value */ js.UndefOr[Any], Unit],
    reject: js.Function1[/* reason */ js.UndefOr[Any], Unit]
  ): js.Promise[Any] = js.native
  
  def reject(): Unit = js.native
  def reject(reason: Any): Unit = js.native
  
  def resolve(): Unit = js.native
  def resolve(value: Any): Unit = js.native
}
