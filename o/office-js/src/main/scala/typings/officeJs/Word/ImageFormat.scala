package typings.officeJs.Word

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ImageFormat with String] = js.native
  /* "Bmp" */ @js.native
  object bmp extends TopLevel[bmp with String]
  
  /* "Emf" */ @js.native
  object emf extends TopLevel[emf with String]
  
  /* "Exif" */ @js.native
  object exif extends TopLevel[exif with String]
  
  /* "Gif" */ @js.native
  object gif extends TopLevel[gif with String]
  
  /* "Icon" */ @js.native
  object icon extends TopLevel[icon with String]
  
  /* "Jpeg" */ @js.native
  object jpeg extends TopLevel[jpeg with String]
  
  /* "Pdf" */ @js.native
  object pdf extends TopLevel[pdf with String]
  
  /* "Pict" */ @js.native
  object pict extends TopLevel[pict with String]
  
  /* "Png" */ @js.native
  object png extends TopLevel[png with String]
  
  /* "Svg" */ @js.native
  object svg extends TopLevel[svg with String]
  
  /* "Tiff" */ @js.native
  object tiff extends TopLevel[tiff with String]
  
  /* "Undefined" */ @js.native
  object undefined extends TopLevel[undefined with String]
  
  /* "Unsupported" */ @js.native
  object unsupported extends TopLevel[unsupported with String]
  
  /* "Wmf" */ @js.native
  object wmf extends TopLevel[wmf with String]
  
}

