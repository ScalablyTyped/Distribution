package typings
package officeDashJsLib.WordNs

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
  sealed trait bmp
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait emf
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait exif
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait gif
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait icon
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait jpeg
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait pdf
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait pict
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait png
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait svg
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait tiff
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait undefined
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait unsupported
    extends officeDashJsLib.WordNs.ImageFormat
  
  @js.native
  sealed trait wmf
    extends officeDashJsLib.WordNs.ImageFormat
  
  /* "Bmp" */ val bmp: bmp with java.lang.String = js.native
  /* "Emf" */ val emf: emf with java.lang.String = js.native
  /* "Exif" */ val exif: exif with java.lang.String = js.native
  /* "Gif" */ val gif: gif with java.lang.String = js.native
  /* "Icon" */ val icon: icon with java.lang.String = js.native
  /* "Jpeg" */ val jpeg: jpeg with java.lang.String = js.native
  /* "Pdf" */ val pdf: pdf with java.lang.String = js.native
  /* "Pict" */ val pict: pict with java.lang.String = js.native
  /* "Png" */ val png: png with java.lang.String = js.native
  /* "Svg" */ val svg: svg with java.lang.String = js.native
  /* "Tiff" */ val tiff: tiff with java.lang.String = js.native
  /* "Undefined" */ val undefined: undefined with java.lang.String = js.native
  /* "Unsupported" */ val unsupported: unsupported with java.lang.String = js.native
  /* "Wmf" */ val wmf: wmf with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.ImageFormat with java.lang.String] = js.native
}

