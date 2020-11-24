package typings.pdfThumbnail

import typings.pdfThumbnail.mod.Operations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfThumbnailStrings {
  
  @scala.inline
  def compress: compress = "compress".asInstanceOf[compress]
  
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait compress extends Operations
  
  @js.native
  sealed trait crop extends Operations
  
  @js.native
  sealed trait resize extends Operations
}
