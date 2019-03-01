package typings
package pouchdbDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blob
  extends pouchdbDashCoreLib.PouchDBNs.CoreNs._AttachmentData {
  val size: scala.Double = js.native
  val `type`: java.lang.String = js.native
  def slice(): Blob = js.native
  def slice(start: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double, contentType: java.lang.String): Blob = js.native
}

