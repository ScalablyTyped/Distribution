package typings.minappEnv.DB

import typings.minappEnv.OQ
import typings.minappEnv.Promise
import typings.minappEnv.anon.RQIAddDocumentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionReference
  extends StObject
     with Query {
  
  // add(options: IAddDocumentOptions): Promise<IAddResult> | void
  def add(options: OQ[IAddDocumentOptions]): Unit = js.native
  def add(options: RQIAddDocumentOptions): Promise[IAddResult] = js.native
  
  val collectionName: String = js.native
  
  val database: Database = js.native
  
  def doc(docId: String): DocumentReference = js.native
  def doc(docId: Double): DocumentReference = js.native
}
