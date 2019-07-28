package typings.mz.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLine
  extends typings.node.readlineMod.Interface {
  def question(query: String): js.Promise[String] = js.native
}

