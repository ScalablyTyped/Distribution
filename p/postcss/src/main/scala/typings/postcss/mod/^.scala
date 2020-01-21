package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postcss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @param plugins Can also be included with the Processor#use method.
    * @returns A processor that will apply plugins as CSS processors.
    */
  def apply(): Processor = js.native
  def apply(plugins: AcceptedPlugin*): Processor = js.native
  def apply(plugins: js.Array[AcceptedPlugin]): Processor = js.native
}

