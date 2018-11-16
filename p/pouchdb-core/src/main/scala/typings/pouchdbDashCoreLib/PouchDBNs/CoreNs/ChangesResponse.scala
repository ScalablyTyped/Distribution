package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangesResponse[Content /* <: js.Object */] extends js.Object {
  var last_seq: scala.Double | java.lang.String
  var results: js.Array[ChangesResponseChange[Content]]
  var status: java.lang.String
}

