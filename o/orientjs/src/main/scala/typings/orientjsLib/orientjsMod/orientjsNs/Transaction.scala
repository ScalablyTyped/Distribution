package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var db: Db
  var id: scala.Double
  def commit(): bluebirdLib.bluebirdMod.namespaced[_]
  def create(record: Record): Transaction
  def delete(record: Record): Transaction
  def update(record: Record): Transaction
}

