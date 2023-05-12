package typings.postgres.mod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingQuery[TRow /* <: js.Array[MaybeRow] */]
  extends StObject
     with Promise[RowList[TRow]]
     with PendingQueryModifiers[TRow] {
  
  def describe(): js.Promise[Statement] = js.native
  
  def raw(): PendingRawQuery[TRow] = js.native
  
  def values(): PendingValuesQuery[TRow] = js.native
}
