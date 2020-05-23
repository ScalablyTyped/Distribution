package typings.minappEnv.DB

import typings.minappEnv.OQ
import typings.minappEnv.Promise
import typings.minappEnv.anon.RQIAddDocumentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionReference extends Query {
  val collectionName: String = js.native
  val database: Database = js.native
  // add(options: IAddDocumentOptions): Promise<IAddResult> | void
  def add(options: OQ[IAddDocumentOptions]): Unit = js.native
  def add(options: RQIAddDocumentOptions): Promise[IAddResult] = js.native
  def doc(docId: String): DocumentReference = js.native
  def doc(docId: Double): DocumentReference = js.native
}

