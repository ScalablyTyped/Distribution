package typings.pouchdbCore

import typings.pouchdbCore.PouchDB.Core._AttachmentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blob extends _AttachmentData {
  val size: Double = js.native
  val `type`: String = js.native
  def slice(): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: String): Blob = js.native
}

