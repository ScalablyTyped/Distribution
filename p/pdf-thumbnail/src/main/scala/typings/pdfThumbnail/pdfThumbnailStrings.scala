package typings.pdfThumbnail

import typings.pdfThumbnail.mod.Operations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pdfThumbnailStrings {
  @js.native
  sealed trait compress extends Operations
  
  @js.native
  sealed trait crop extends Operations
  
  @js.native
  sealed trait resize extends Operations
  
  @scala.inline
  def compress: compress = "compress".asInstanceOf[compress]
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
}

