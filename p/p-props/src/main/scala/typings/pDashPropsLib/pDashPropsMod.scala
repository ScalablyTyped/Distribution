package typings
package pDashPropsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-props", JSImport.Namespace)
@js.native
object pDashPropsMod extends js.Object {
  def apply[V, M /* <: ScalablyTyped.runtime.StringDictionary[js.Thenable[V] | V] */](input: M): js.Promise[stdLib.Record[java.lang.String, V]] = js.native
  def apply[K, V](input: stdLib.Map[K, js.Thenable[V] | V]): js.Promise[stdLib.Map[K, V]] = js.native
}

