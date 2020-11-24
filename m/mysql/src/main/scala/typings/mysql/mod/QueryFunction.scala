package typings.mysql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryFunction extends js.Object {
  
  def apply(options: String): Query = js.native
  def apply(options: String, callback: queryCallback): Query = js.native
  def apply(options: String, values: js.Any): Query = js.native
  def apply(options: String, values: js.Any, callback: queryCallback): Query = js.native
  def apply(options: QueryOptions): Query = js.native
  def apply(options: QueryOptions, callback: queryCallback): Query = js.native
  def apply(options: QueryOptions, values: js.Any): Query = js.native
  def apply(options: QueryOptions, values: js.Any, callback: queryCallback): Query = js.native
  def apply(query: Query): Query = js.native
}
