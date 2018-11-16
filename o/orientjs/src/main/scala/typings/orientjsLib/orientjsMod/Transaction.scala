package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Transaction")
@js.native
class Transaction ()
  extends orientjsLib.orientjsMod.orientjsNs.Transaction {
  /* CompleteClass */
  override var db: orientjsLib.orientjsMod.orientjsNs.Db = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  /* CompleteClass */
  override def commit(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /* CompleteClass */
  override def create(record: orientjsLib.orientjsMod.orientjsNs.Record): orientjsLib.orientjsMod.orientjsNs.Transaction = js.native
  /* CompleteClass */
  override def delete(record: orientjsLib.orientjsMod.orientjsNs.Record): orientjsLib.orientjsMod.orientjsNs.Transaction = js.native
  /* CompleteClass */
  override def update(record: orientjsLib.orientjsMod.orientjsNs.Record): orientjsLib.orientjsMod.orientjsNs.Transaction = js.native
}

