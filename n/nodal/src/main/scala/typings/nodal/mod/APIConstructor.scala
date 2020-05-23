package typings.nodal.mod

import typings.nodal.anon.Count
import typings.nodal.anon.Data
import typings.nodal.anon.Fields
import typings.nodal.anon.Meta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "APIConstructor")
@js.native
class APIConstructor () extends js.Object {
  def error(message: String, details: String): Meta = js.native
  def format(obj: js.Any): Data = js.native
  def format(obj: js.Any, arrInterface: js.Array[String]): Data = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: String): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: String, resource: js.Any): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: js.Any, summary: Null, resource: js.Any): Count = js.native
  def resourceFromArray(arr: js.Array[_]): Fields = js.native
  def resourceFromModelArray(modelArray: js.Any, arrInterface: js.Any): js.Any = js.native
  def response(itemArray: js.Any, arrInterface: js.Any): Data = js.native
  def response(itemArray: js.Any, arrInterface: js.Any, useResource: Boolean): Data = js.native
  def spoof(obj: js.Any): Data = js.native
  def spoof(obj: js.Any, useResource: Boolean): Data = js.native
}

