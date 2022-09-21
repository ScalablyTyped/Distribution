package typings.nodal.mod

import typings.nodal.anon.Count
import typings.nodal.anon.Data
import typings.nodal.anon.Fields
import typings.nodal.anon.Meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "APIConstructor")
@js.native
open class APIConstructor () extends StObject {
  
  def error(message: String, details: String): Meta = js.native
  
  def format(obj: Any): Data = js.native
  def format(obj: Any, arrInterface: js.Array[String]): Data = js.native
  
  def meta(total: Double, count: Double, offset: Double, error: Any): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: Any, summary: String): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: Any, summary: String, resource: Any): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: Any, summary: Null, resource: Any): Count = js.native
  def meta(total: Double, count: Double, offset: Double, error: Any, summary: Unit, resource: Any): Count = js.native
  
  def resourceFromArray(arr: js.Array[Any]): Fields = js.native
  
  def resourceFromModelArray(modelArray: Any, arrInterface: Any): Any = js.native
  
  def response(itemArray: Any, arrInterface: Any): Data = js.native
  def response(itemArray: Any, arrInterface: Any, useResource: Boolean): Data = js.native
  
  def spoof(obj: Any): Data = js.native
  def spoof(obj: Any, useResource: Boolean): Data = js.native
}
