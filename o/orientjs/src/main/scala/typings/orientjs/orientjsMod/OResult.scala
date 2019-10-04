package typings.orientjs.orientjsMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "OResult")
@js.native
class OResult[R] protected () extends Readable {
  def this(db: ODatabase, pageSize: Double) = this()
  /**
    *
    * @return
    */
  def all(): js.Promise[js.Array[R]] = js.native
  def close(): js.Promise[Unit] = js.native
  def one(): js.Promise[R] = js.native
}

