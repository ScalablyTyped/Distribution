package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MSBlobBuilder extends js.Object {
  def append(data: js.Any): scala.Unit = js.native
  def append(data: js.Any, endings: java.lang.String): scala.Unit = js.native
  def getBlob(): Blob = js.native
  def getBlob(contentType: java.lang.String): Blob = js.native
}

@JSGlobal("MSBlobBuilder")
@js.native
object MSBlobBuilder
  extends org.scalablytyped.runtime.Instantiable0[MSBlobBuilder]

