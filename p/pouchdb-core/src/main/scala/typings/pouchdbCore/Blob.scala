package typings.pouchdbCore

import typings.pouchdbCore.PouchDB.Core._AttachmentData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blob extends _AttachmentData {
  
  val size: Double = js.native
  
  def slice(): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double, contentType: String): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: String): Blob = js.native
  
  val `type`: String = js.native
}
