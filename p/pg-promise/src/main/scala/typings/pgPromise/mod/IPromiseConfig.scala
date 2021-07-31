package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromiseConfig extends StObject {
  
  def all(iterable: js.Any): XPromise[js.Any] = js.native
  
  def create(resolve: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): XPromise[js.Any] = js.native
  def create(
    resolve: js.Function1[/* value */ js.UndefOr[js.Any], Unit],
    reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  ): XPromise[js.Any] = js.native
  
  def reject(): Unit = js.native
  def reject(reason: js.Any): Unit = js.native
  
  def resolve(): Unit = js.native
  def resolve(value: js.Any): Unit = js.native
}
