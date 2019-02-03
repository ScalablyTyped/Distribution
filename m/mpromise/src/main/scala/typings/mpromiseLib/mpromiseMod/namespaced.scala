package typings
package mpromiseLib.mpromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mpromise", JSImport.Namespace)
@js.native
class namespaced[F, R] () extends Promise[F, R] {
  def this(fn: IResolveFunction[F, R]) = this()
}

/* static members */
@JSImport("mpromise", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var FAILURE: java.lang.String = js.native
  var SUCCESS: java.lang.String = js.native
}

