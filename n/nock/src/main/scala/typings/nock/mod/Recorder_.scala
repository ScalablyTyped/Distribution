package typings.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recorder_ extends js.Object {
  
  def clear(): Unit = js.native
  
  def play(): js.Array[Definition | String] = js.native
  
  def rec(): Unit = js.native
  def rec(options: Boolean): Unit = js.native
  def rec(options: RecorderOptions): Unit = js.native
}
