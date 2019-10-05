package typings.nock.nockMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recorder extends js.Object {
  def clear(): Unit = js.native
  def play(): js.Array[Definition | String] = js.native
  def rec(): Unit = js.native
  def rec(options: Boolean): Unit = js.native
  def rec(options: RecorderOptions): Unit = js.native
}

@JSImport("nock", "recorder")
@js.native
object recorder extends TopLevel[Recorder]

