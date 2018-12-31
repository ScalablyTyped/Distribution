package typings
package pouchdbDashUpsertLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  /**
    * Put a new document with the given docId, if it doesn't already exist. Returns a Promise.
    *
    * @param doc - the document to insert. Should contain an _id if docId is not specified
    * If the document already exists, then the Promise will just resolve immediately.
    */
  def putIfNotExists[Model](doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.Document[Content with Model]): js.Promise[UpsertResponse] = js.native
  //
  /**
    * Put a new document with the given docId, if it doesn't already exist.  If a callback is not provided,
    * the Promise based version of this function will be called.
    *
    * @param doc - the document to insert. Should contain an _id if docId is not specified
    * If the document already exists, then the Promise will just resolve immediately.
    * @param callback - called with the results after operation is completed.
    * If you don't specify a callback, then the Promise version of this function will be invoked and it
    * will return a Promise.
    */
  def putIfNotExists[Model](
    doc: pouchdbDashCoreLib.PouchDBNs.CoreNs.Document[Content with Model],
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[UpsertResponse]
  ): scala.Unit = js.native
  /**
    * Perform an upsert (update or insert) operation. Returns a Promise.
    *
    * @param docId - the _id of the document.
    * @param diffFun - function that takes the existing doc as input and returns an updated doc.
    * If this diffFunc returns falsey, then the update won't be performed (as an optimization).
    * If the document does not already exist, then {} will be the input to diffFunc.
    *
    */
  def upsert[Model](
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    diffFun: UpsertDiffCallback[Content with Model]
  ): js.Promise[UpsertResponse] = js.native
  /**
    * Perform an upsert (update or insert) operation. If a callback is not provided, the Promise based version
    * of this function will be called.
    *
    * @param docId - the _id of the document.
    * @param diffFun - function that takes the existing doc as input and returns an updated doc.
    * If this diffFunc returns falsey, then the update won't be performed (as an optimization).
    * If the document does not already exist, then {} will be the input to diffFunc.
    * @param callback - called with the results after operation is completed.
    */
  def upsert[Model](
    docId: pouchdbDashCoreLib.PouchDBNs.CoreNs.DocumentId,
    diffFun: UpsertDiffCallback[Content with Model],
    callback: pouchdbDashCoreLib.PouchDBNs.CoreNs.Callback[UpsertResponse]
  ): scala.Unit = js.native
}

