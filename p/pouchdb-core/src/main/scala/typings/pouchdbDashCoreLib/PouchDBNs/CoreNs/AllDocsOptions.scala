package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDocsOptions extends Options {
  /**
    * Include attachment data for each document.
    *
    * Requires `include_docs` to be `true`.
    *
    * By default, attachments are Base64-encoded.
    * @see binary
    */
  var attachments: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return attachments as Buffers.
    *
    * Requires `include_docs` to be `true`.
    * Requires `attachments` to be `true`.
    */
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Include conflict information for each document.
    *
    * Requires `include_docs` to be `true`.
    */
  var conflicts: js.UndefOr[scala.Boolean] = js.undefined
  /** Reverse ordering of results. */
  var descending: js.UndefOr[scala.Boolean] = js.undefined
  /** Include contents for each document. */
  var include_docs: js.UndefOr[scala.Boolean] = js.undefined
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of documents to skip before returning.
    *
    * Causes poor performance on IndexedDB and LevelDB.
    */
  var skip: js.UndefOr[scala.Double] = js.undefined
}

