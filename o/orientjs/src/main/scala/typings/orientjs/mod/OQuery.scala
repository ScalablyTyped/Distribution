package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OQuery[T] extends StObject {
  
  def all[T](): js.Promise[js.Array[T]] = js.native
  def all[T](params: js.Any): js.Promise[js.Array[T]] = js.native
  
  def column(name: String): OQuery[T] = js.native
  
  def defaults(defaults: js.Any): OQuery[T] = js.native
  
  def exec[T](): js.Promise[T] = js.native
  def exec[T](params: js.Any): js.Promise[T] = js.native
  
  def one[T](): js.Promise[T] = js.native
  def one[T](params: js.Any): js.Promise[T] = js.native
  
  def scalar[T](): js.Promise[T] = js.native
  def scalar[T](params: js.Any): js.Promise[T] = js.native
  
  def transform[T](transformer: js.Function1[/* item */ ORecord, T]): OQuery[T] = js.native
}
