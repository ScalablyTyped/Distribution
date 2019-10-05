package typings.objection.objectionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compose extends js.Object {
  def apply(plugins: Plugin*): Plugin = js.native
  def apply(plugins: js.Array[Plugin]): Plugin = js.native
}

@JSImport("objection", "compose")
@js.native
object compose extends TopLevel[Compose]

