package typings.postcss.anon

import typings.postcss.libResultMod.default
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOnrejected extends StObject {
  
  def apply[TResult](): js.Promise[default | TResult] = js.native
  def apply[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[default | TResult] = js.native
}
