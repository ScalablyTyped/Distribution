package typings.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.objection.anon.As
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountMethod[QB /* <: AnyQueryBuilder */] extends js.Object {
  def apply(): QB = js.native
  def apply(aliasToColumnDict: StringDictionary[String | js.Array[String]]): QB = js.native
  def apply(columns: ColumnRef*): QB = js.native
  def apply(column: ColumnRef): QB = js.native
  def apply(column: ColumnRef, options: As): QB = js.native
}

