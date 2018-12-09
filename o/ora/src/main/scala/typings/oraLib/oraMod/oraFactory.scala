package typings
package oraLib.oraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait oraFactory
  extends ScalablyTyped.runtime.Instantiable1[(/* options */ Options) | (/* options */ java.lang.String), Ora]
     with ScalablyTyped.runtime.Instantiable0[Ora] {
  def apply(): Ora = js.native
  def apply(options: java.lang.String): Ora = js.native
  def apply(options: Options): Ora = js.native
  def promise(action: js.Thenable[_]): Ora = js.native
  def promise(action: js.Thenable[_], options: java.lang.String): Ora = js.native
  def promise(action: js.Thenable[_], options: Options): Ora = js.native
}

