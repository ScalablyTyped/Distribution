package typings
package nodeDashUuidLib.nodeDashUuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UUID extends js.Object {
  def parse(id: java.lang.String): js.Array[scala.Double] = js.native
  def parse(id: java.lang.String, buffer: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def parse(id: java.lang.String, buffer: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  def unparse(buffer: js.Array[scala.Double]): java.lang.String = js.native
  def unparse(buffer: js.Array[scala.Double], offset: scala.Double): java.lang.String = js.native
  def v1(): js.Array[scala.Double] = js.native
  def v1(options: UUIDOptions): js.Array[scala.Double] = js.native
  def v1(options: UUIDOptions, buffer: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def v1(options: UUIDOptions, buffer: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  @JSName("v1")
  def v1_String(): java.lang.String = js.native
  @JSName("v1")
  def v1_String(options: UUIDOptions): java.lang.String = js.native
  def v4(): js.Array[scala.Double] = js.native
  def v4(options: UUIDOptions): js.Array[scala.Double] = js.native
  def v4(options: UUIDOptions, buffer: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def v4(options: UUIDOptions, buffer: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  @JSName("v4")
  def v4_String(): java.lang.String = js.native
  @JSName("v4")
  def v4_String(options: UUIDOptions): java.lang.String = js.native
}

