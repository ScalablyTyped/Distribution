package typings.nodeDashUuid.nodeDashUuidMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-uuid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(id: String): Buffer = js.native
  def parse(id: String, buffer: js.Array[Double]): js.Array[Double] = js.native
  def parse(id: String, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def parse(id: String, buffer: Buffer): Buffer = js.native
  def parse(id: String, buffer: Buffer, offset: Double): Buffer = js.native
  @JSName("parse")
  def parse_Array(id: String): js.Array[Double] = js.native
  def unparse(buffer: js.Array[Double]): String = js.native
  def unparse(buffer: js.Array[Double], offset: Double): String = js.native
  def unparse(buffer: Buffer): String = js.native
  def unparse(buffer: Buffer, offset: Double): String = js.native
  def v1(): Buffer = js.native
  def v1(options: UUIDOptions): Buffer = js.native
  def v1(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
  def v1(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def v1(options: UUIDOptions, buffer: Buffer): Buffer = js.native
  def v1(options: UUIDOptions, buffer: Buffer, offset: Double): Buffer = js.native
  @JSName("v1")
  def v1_Array(): js.Array[Double] = js.native
  @JSName("v1")
  def v1_Array(options: UUIDOptions): js.Array[Double] = js.native
  @JSName("v1")
  def v1_String(): String = js.native
  @JSName("v1")
  def v1_String(options: UUIDOptions): String = js.native
  def v4(): Buffer = js.native
  def v4(options: UUIDOptions): Buffer = js.native
  def v4(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
  def v4(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def v4(options: UUIDOptions, buffer: Buffer): Buffer = js.native
  def v4(options: UUIDOptions, buffer: Buffer, offset: Double): Buffer = js.native
  @JSName("v4")
  def v4_Array(): js.Array[Double] = js.native
  @JSName("v4")
  def v4_Array(options: UUIDOptions): js.Array[Double] = js.native
  @JSName("v4")
  def v4_String(): String = js.native
  @JSName("v4")
  def v4_String(options: UUIDOptions): String = js.native
}

