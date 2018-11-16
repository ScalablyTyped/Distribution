package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "APIConstructor")
@js.native
class APIConstructor () extends js.Object {
  def error(message: java.lang.String, details: java.lang.String): nodalLib.Anon_DataMeta = js.native
  def format(obj: js.Any): nodalLib.Anon_Data = js.native
  def format(obj: js.Any, arrInterface: js.Array[java.lang.String]): nodalLib.Anon_Data = js.native
  def meta(total: scala.Double, count: scala.Double, offset: scala.Double, error: js.Any): nodalLib.Anon_Count = js.native
  def meta(
    total: scala.Double,
    count: scala.Double,
    offset: scala.Double,
    error: js.Any,
    summary: java.lang.String
  ): nodalLib.Anon_Count = js.native
  def meta(
    total: scala.Double,
    count: scala.Double,
    offset: scala.Double,
    error: js.Any,
    summary: java.lang.String,
    resource: js.Any
  ): nodalLib.Anon_Count = js.native
  def meta(
    total: scala.Double,
    count: scala.Double,
    offset: scala.Double,
    error: js.Any,
    summary: scala.Null,
    resource: js.Any
  ): nodalLib.Anon_Count = js.native
  def resourceFromArray(arr: js.Array[_]): nodalLib.Anon_Fields = js.native
  def resourceFromModelArray(modelArray: js.Any, arrInterface: js.Any): js.Any = js.native
  def response(itemArray: js.Any, arrInterface: js.Any): nodalLib.Anon_Data = js.native
  def response(itemArray: js.Any, arrInterface: js.Any, useResource: scala.Boolean): nodalLib.Anon_Data = js.native
  def spoof(obj: js.Any): nodalLib.Anon_Data = js.native
  def spoof(obj: js.Any, useResource: scala.Boolean): nodalLib.Anon_Data = js.native
}

