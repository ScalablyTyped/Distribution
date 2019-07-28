package typings.officeDashJs.WordNs

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
  
  /* "Bmp" */ val bmp: typings.officeDashJs.WordNs.ImageFormat.bmp with String = js.native
  /* "Emf" */ val emf: typings.officeDashJs.WordNs.ImageFormat.emf with String = js.native
  /* "Exif" */ val exif: typings.officeDashJs.WordNs.ImageFormat.exif with String = js.native
  /* "Gif" */ val gif: typings.officeDashJs.WordNs.ImageFormat.gif with String = js.native
  /* "Icon" */ val icon: typings.officeDashJs.WordNs.ImageFormat.icon with String = js.native
  /* "Jpeg" */ val jpeg: typings.officeDashJs.WordNs.ImageFormat.jpeg with String = js.native
  /* "Pdf" */ val pdf: typings.officeDashJs.WordNs.ImageFormat.pdf with String = js.native
  /* "Pict" */ val pict: typings.officeDashJs.WordNs.ImageFormat.pict with String = js.native
  /* "Png" */ val png: typings.officeDashJs.WordNs.ImageFormat.png with String = js.native
  /* "Svg" */ val svg: typings.officeDashJs.WordNs.ImageFormat.svg with String = js.native
  /* "Tiff" */ val tiff: typings.officeDashJs.WordNs.ImageFormat.tiff with String = js.native
  /* "Undefined" */ val undefined: typings.officeDashJs.WordNs.ImageFormat.undefined with String = js.native
  /* "Unsupported" */ val unsupported: typings.officeDashJs.WordNs.ImageFormat.unsupported with String = js.native
  /* "Wmf" */ val wmf: typings.officeDashJs.WordNs.ImageFormat.wmf with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageFormat with String] = js.native
}

