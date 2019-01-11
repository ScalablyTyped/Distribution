package typings
package nodeDashUuidLib.nodeDashUuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-uuid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(id: java.lang.String): js.Array[scala.Double] = js.native
  def parse(id: java.lang.String, buffer: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def parse(id: java.lang.String, buffer: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  def parse(id: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def parse(id: java.lang.String, buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  @JSName("parse")
  def parse_Buffer(id: java.lang.String): nodeLib.Buffer = js.native
  def unparse(buffer: js.Array[scala.Double]): java.lang.String = js.native
  def unparse(buffer: js.Array[scala.Double], offset: scala.Double): java.lang.String = js.native
  def unparse(buffer: nodeLib.Buffer): java.lang.String = js.native
  def unparse(buffer: nodeLib.Buffer, offset: scala.Double): java.lang.String = js.native
  def v1(): js.Array[scala.Double] = js.native
  def v1(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions): js.Array[scala.Double] = js.native
  def v1(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions, buffer: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def v1(
    options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions,
    buffer: js.Array[scala.Double],
    offset: scala.Double
  ): js.Array[scala.Double] = js.native
  def v1(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def v1(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions, buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  @JSName("v1")
  def v1_Buffer(): nodeLib.Buffer = js.native
  @JSName("v1")
  def v1_Buffer(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions): nodeLib.Buffer = js.native
  @JSName("v1")
  def v1_String(): java.lang.String = js.native
  @JSName("v1")
  def v1_String(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions): java.lang.String = js.native
  def v4(): js.Array[scala.Double] = js.native
  def v4(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions): js.Array[scala.Double] = js.native
  def v4(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions, buffer: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def v4(
    options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions,
    buffer: js.Array[scala.Double],
    offset: scala.Double
  ): js.Array[scala.Double] = js.native
  def v4(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def v4(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions, buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  @JSName("v4")
  def v4_Buffer(): nodeLib.Buffer = js.native
  @JSName("v4")
  def v4_Buffer(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions): nodeLib.Buffer = js.native
  @JSName("v4")
  def v4_String(): java.lang.String = js.native
  @JSName("v4")
  def v4_String(options: nodeDashUuidLib.nodeDashUuidMod.UUIDOptions): java.lang.String = js.native
}

