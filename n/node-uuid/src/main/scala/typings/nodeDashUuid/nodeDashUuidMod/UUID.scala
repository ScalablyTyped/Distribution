package typings.nodeDashUuid.nodeDashUuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUID extends js.Object {
  def parse(id: String): js.Array[Double] = js.native
  def parse(id: String, buffer: js.Array[Double]): js.Array[Double] = js.native
  def parse(id: String, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def unparse(buffer: js.Array[Double]): String = js.native
  def unparse(buffer: js.Array[Double], offset: Double): String = js.native
  def v1(): js.Array[Double] = js.native
  def v1(options: UUIDOptions): js.Array[Double] = js.native
  def v1(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
  def v1(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  @JSName("v1")
  def v1_String(): String = js.native
  @JSName("v1")
  def v1_String(options: UUIDOptions): String = js.native
  def v4(): js.Array[Double] = js.native
  def v4(options: UUIDOptions): js.Array[Double] = js.native
  def v4(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
  def v4(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  @JSName("v4")
  def v4_String(): String = js.native
  @JSName("v4")
  def v4_String(options: UUIDOptions): String = js.native
}

