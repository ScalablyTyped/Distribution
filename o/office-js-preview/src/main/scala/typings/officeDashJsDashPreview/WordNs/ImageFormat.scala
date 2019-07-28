package typings.officeDashJsDashPreview.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageFormat extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ImageFormat")
@js.native
object ImageFormat extends js.Object {
  @js.native
  sealed trait bmp extends ImageFormat
  
  @js.native
  sealed trait emf extends ImageFormat
  
  @js.native
  sealed trait exif extends ImageFormat
  
  @js.native
  sealed trait gif extends ImageFormat
  
  @js.native
  sealed trait icon extends ImageFormat
  
  @js.native
  sealed trait jpeg extends ImageFormat
  
  @js.native
  sealed trait pdf extends ImageFormat
  
  @js.native
  sealed trait pict extends ImageFormat
  
  @js.native
  sealed trait png extends ImageFormat
  
  @js.native
  sealed trait svg extends ImageFormat
  
  @js.native
  sealed trait tiff extends ImageFormat
  
  @js.native
  sealed trait undefined extends ImageFormat
  
  @js.native
  sealed trait unsupported extends ImageFormat
  
  @js.native
  sealed trait wmf extends ImageFormat
  
  /* "Bmp" */ val bmp: typings.officeDashJsDashPreview.WordNs.ImageFormat.bmp with String = js.native
  /* "Emf" */ val emf: typings.officeDashJsDashPreview.WordNs.ImageFormat.emf with String = js.native
  /* "Exif" */ val exif: typings.officeDashJsDashPreview.WordNs.ImageFormat.exif with String = js.native
  /* "Gif" */ val gif: typings.officeDashJsDashPreview.WordNs.ImageFormat.gif with String = js.native
  /* "Icon" */ val icon: typings.officeDashJsDashPreview.WordNs.ImageFormat.icon with String = js.native
  /* "Jpeg" */ val jpeg: typings.officeDashJsDashPreview.WordNs.ImageFormat.jpeg with String = js.native
  /* "Pdf" */ val pdf: typings.officeDashJsDashPreview.WordNs.ImageFormat.pdf with String = js.native
  /* "Pict" */ val pict: typings.officeDashJsDashPreview.WordNs.ImageFormat.pict with String = js.native
  /* "Png" */ val png: typings.officeDashJsDashPreview.WordNs.ImageFormat.png with String = js.native
  /* "Svg" */ val svg: typings.officeDashJsDashPreview.WordNs.ImageFormat.svg with String = js.native
  /* "Tiff" */ val tiff: typings.officeDashJsDashPreview.WordNs.ImageFormat.tiff with String = js.native
  /* "Undefined" */ val undefined: typings.officeDashJsDashPreview.WordNs.ImageFormat.undefined with String = js.native
  /* "Unsupported" */ val unsupported: typings.officeDashJsDashPreview.WordNs.ImageFormat.unsupported with String = js.native
  /* "Wmf" */ val wmf: typings.officeDashJsDashPreview.WordNs.ImageFormat.wmf with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageFormat with String] = js.native
}

