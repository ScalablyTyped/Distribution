package typings
package mzLib.readlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadLine
  extends nodeLib.readlineMod.Interface {
  def question(query: java.lang.String): js.Promise[java.lang.String] = js.native
}

