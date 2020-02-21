package typings.parse.mod._Global_.Parse.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.parse.parseStrings.String
  - typings.parse.parseStrings.Number
  - typings.parse.parseStrings.Boolean
  - typings.parse.parseStrings.Date
  - typings.parse.parseStrings.File
  - typings.parse.parseStrings.GeoPoint
  - typings.parse.parseStrings.Polygon
  - typings.parse.parseStrings.Array
  - typings.parse.parseStrings.Object
  - typings.parse.parseStrings.Pointer
  - typings.parse.parseStrings.Relation
*/
trait TYPE extends js.Object

object TYPE {
  @scala.inline
  def Array: typings.parse.parseStrings.Array = this.cast("Array")
  @scala.inline
  def Boolean: typings.parse.parseStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def Date: typings.parse.parseStrings.Date = this.cast("Date")
  @scala.inline
  def File: typings.parse.parseStrings.File = this.cast("File")
  @scala.inline
  def GeoPoint: typings.parse.parseStrings.GeoPoint = this.cast("GeoPoint")
  @scala.inline
  def Number: typings.parse.parseStrings.Number = this.cast("Number")
  @scala.inline
  def Object: typings.parse.parseStrings.Object = this.cast("Object")
  @scala.inline
  def Pointer: typings.parse.parseStrings.Pointer = this.cast("Pointer")
  @scala.inline
  def Polygon: typings.parse.parseStrings.Polygon = this.cast("Polygon")
  @scala.inline
  def Relation: typings.parse.parseStrings.Relation = this.cast("Relation")
  @scala.inline
  def String: typings.parse.parseStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

