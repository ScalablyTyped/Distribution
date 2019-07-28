package typings.nodal.nodalMod

import typings.nodal.Anon_Count
import typings.nodal.Anon_Data
import typings.nodal.Anon_DataMeta
import typings.nodal.Anon_Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "APIConstructor")
@js.native
class APIConstructor () extends js.Object {
  def error(message: String, details: String): Anon_DataMeta = js.native
  def format(obj: js.Any): Anon_Data = js.native
  def format(obj: js.Any, arrInterface: js.Array[String]): Anon_Data = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any): Anon_Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: String): Anon_Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: String, resource: js.Any): Anon_Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: Null, resource: js.Any): Anon_Count = js.native
  def resourceFromArray(arr: js.Array[_]): Anon_Fields = js.native
  def resourceFromModelArray(modelArray: js.Any, arrInterface: js.Any): js.Any = js.native
  def response(itemArray: js.Any, arrInterface: js.Any): Anon_Data = js.native
  def response(itemArray: js.Any, arrInterface: js.Any, useResource: Boolean): Anon_Data = js.native
  def spoof(obj: js.Any): Anon_Data = js.native
  def spoof(obj: js.Any, useResource: Boolean): Anon_Data = js.native
}

