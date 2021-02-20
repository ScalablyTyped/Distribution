package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFPromise[T] extends StObject {
  
  def isRejected(): Boolean = js.native
  
  def isResolved(): Boolean = js.native
  
  def reject(reason: String): Unit = js.native
  
  def resolve(value: T): Unit = js.native
  
  def `then`[U](onResolve: js.Function1[/* promise */ T, U]): PDFPromise[U] = js.native
  def `then`[U](onResolve: js.Function1[/* promise */ T, U], onReject: js.Function1[/* reason */ String, Unit]): PDFPromise[U] = js.native
}
