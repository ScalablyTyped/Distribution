package typings.postgres.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionSql[TTypes /* <: Record[String, Any] */]
  extends StObject
     with Sql[TTypes] {
  
  def savepoint[T](cb: js.Function1[/* sql */ TransactionSql[TTypes], T | js.Promise[T]]): js.Promise[UnwrapPromiseArray[T]] = js.native
  def savepoint[T](name: String, cb: js.Function1[/* sql */ TransactionSql[TTypes], T | js.Promise[T]]): js.Promise[UnwrapPromiseArray[T]] = js.native
}
