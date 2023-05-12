package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "WriteConcernError")
@js.native
open class WriteConcernError protected () extends StObject {
  /* Excluded from this release type: [kServerError] */
  def this(error: WriteConcernErrorData) = this()
  
  /** Write concern error code. */
  def code: js.UndefOr[scala.Double] = js.native
  
  /** Write concern error info. */
  def errInfo: js.UndefOr[Document] = js.native
  
  /** Write concern error message. */
  def errmsg: js.UndefOr[String] = js.native
  
  def toJSON(): WriteConcernErrorData = js.native
}
