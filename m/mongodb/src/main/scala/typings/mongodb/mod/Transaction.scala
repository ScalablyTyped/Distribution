package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Transaction")
@js.native
open class Transaction () extends StObject {
  
  /**
    * @returns Whether this session is presently in a transaction
    */
  def isActive: Boolean = js.native
  
  def isCommitted: Boolean = js.native
  
  def isPinned: Boolean = js.native
  
  /** @returns Whether the transaction has started */
  def isStarting: Boolean = js.native
  
  /* Excluded from this release type: state */
  var options: TransactionOptions = js.native
  
  /* Excluded from this release type: _pinnedServer */
  /* Excluded from this release type: _recoveryToken */
  /* Excluded from this release type: __constructor */
  /* Excluded from this release type: server */
  def recoveryToken: js.UndefOr[Document] = js.native
}
