package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to walk through a set of SODA documents returned from a find() getCursor() method.
  */
@js.native
trait SodaDocumentCursor extends js.Object {
  
  /**
    * This method closes a SodaDocumentCursor. It must be called when the cursor is no longer required.
    *
    * It releases resources in node-oracledb and Oracle Database.
    *
    * @since 3.0
    */
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * This method returns the next SodaDocument in the cursor returned by a find() terminal method read operation.
    *
    * If there are no more documents, the returned document parameter will be undefined.
    *
    * @since 3.0
    */
  def getNext(): js.Promise[js.UndefOr[SodaDocument]] = js.native
  def getNext(callback: js.Function2[/* error */ DBError, /* document */ js.UndefOr[SodaDocument], Unit]): Unit = js.native
}
