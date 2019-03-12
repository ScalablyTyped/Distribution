package typings
package mongrationLib.mongrationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongration", "Migration")
@js.native
class Migration protected () extends js.Object {
  def this(dbConfig: DbConfig) = this()
  def add(paths: java.lang.String): scala.Unit = js.native
  def add(paths: js.Array[java.lang.String]): scala.Unit = js.native
  def addAllFromPath(path: java.lang.String): scala.Unit = js.native
  def migrate(): scala.Unit = js.native
  def migrate(
    doneCb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* response */ js.Array[MigrationResponse], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

