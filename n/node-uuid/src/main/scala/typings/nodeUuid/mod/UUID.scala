package typings.nodeUuid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UUID extends js.Object {
  
  def parse(id: String): js.Array[Double] = js.native
  def parse(id: String, buffer: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  def parse(id: String, buffer: js.Array[Double]): js.Array[Double] = js.native
  def parse(id: String, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  
  def unparse(buffer: js.Array[Double]): String = js.native
  def unparse(buffer: js.Array[Double], offset: Double): String = js.native
  
  def v1(): String = js.native
  def v1(options: js.UndefOr[scala.Nothing], buffer: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  def v1(options: js.UndefOr[scala.Nothing], buffer: js.Array[Double]): js.Array[Double] = js.native
  def v1(options: js.UndefOr[scala.Nothing], buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def v1(options: UUIDOptions): String = js.native
  def v1(options: UUIDOptions, buffer: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  def v1(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
  def v1(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  @JSName("v1")
  def v1_Array(): js.Array[Double] = js.native
  @JSName("v1")
  def v1_Array(options: UUIDOptions): js.Array[Double] = js.native
  
  def v4(): String = js.native
  def v4(options: js.UndefOr[scala.Nothing], buffer: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  def v4(options: js.UndefOr[scala.Nothing], buffer: js.Array[Double]): js.Array[Double] = js.native
  def v4(options: js.UndefOr[scala.Nothing], buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  def v4(options: UUIDOptions): String = js.native
  def v4(options: UUIDOptions, buffer: js.UndefOr[scala.Nothing], offset: Double): js.Array[Double] = js.native
  def v4(options: UUIDOptions, buffer: js.Array[Double]): js.Array[Double] = js.native
  def v4(options: UUIDOptions, buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
  @JSName("v4")
  def v4_Array(): js.Array[Double] = js.native
  @JSName("v4")
  def v4_Array(options: UUIDOptions): js.Array[Double] = js.native
}
