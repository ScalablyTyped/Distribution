package typings.pdfmake.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageSize extends js.Object

trait Pagesize extends js.Object {
  var height: Double
  var orientation: PageOrientation
  var width: Double
}

object Pagesize {
  @scala.inline
  def apply(height: Double, orientation: PageOrientation, width: Double): Pagesize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Pagesize]
  }
}

@JSImport("pdfmake/build/pdfmake", "PageSize")
@js.native
object PageSize extends js.Object {
  @js.native
  sealed trait A0_x_2 extends PageSize
  
  @js.native
  sealed trait A0_x_4 extends PageSize
  
  @js.native
  sealed trait A1 extends PageSize
  
  @js.native
  sealed trait A1O extends PageSize
  
  @js.native
  sealed trait A2 extends PageSize
  
  @js.native
  sealed trait A3 extends PageSize
  
  @js.native
  sealed trait A4 extends PageSize
  
  @js.native
  sealed trait A5 extends PageSize
  
  @js.native
  sealed trait A6 extends PageSize
  
  @js.native
  sealed trait A7 extends PageSize
  
  @js.native
  sealed trait A8 extends PageSize
  
  @js.native
  sealed trait A9 extends PageSize
  
  @js.native
  sealed trait AO extends PageSize
  
  @js.native
  sealed trait B1 extends PageSize
  
  @js.native
  sealed trait B1O extends PageSize
  
  @js.native
  sealed trait B2 extends PageSize
  
  @js.native
  sealed trait B3 extends PageSize
  
  @js.native
  sealed trait B4 extends PageSize
  
  @js.native
  sealed trait B5 extends PageSize
  
  @js.native
  sealed trait B6 extends PageSize
  
  @js.native
  sealed trait B7 extends PageSize
  
  @js.native
  sealed trait B8 extends PageSize
  
  @js.native
  sealed trait B9 extends PageSize
  
  @js.native
  sealed trait BO extends PageSize
  
  @js.native
  sealed trait C1 extends PageSize
  
  @js.native
  sealed trait C1O extends PageSize
  
  @js.native
  sealed trait C2 extends PageSize
  
  @js.native
  sealed trait C3 extends PageSize
  
  @js.native
  sealed trait C4 extends PageSize
  
  @js.native
  sealed trait C5 extends PageSize
  
  @js.native
  sealed trait C6 extends PageSize
  
  @js.native
  sealed trait C7 extends PageSize
  
  @js.native
  sealed trait C8 extends PageSize
  
  @js.native
  sealed trait C9 extends PageSize
  
  @js.native
  sealed trait CO extends PageSize
  
  @js.native
  sealed trait EXECUTIVE extends PageSize
  
  @js.native
  sealed trait FOLIO extends PageSize
  
  @js.native
  sealed trait LEGAL extends PageSize
  
  @js.native
  sealed trait LETTER extends PageSize
  
  @js.native
  sealed trait RA1 extends PageSize
  
  @js.native
  sealed trait RA2 extends PageSize
  
  @js.native
  sealed trait RA3 extends PageSize
  
  @js.native
  sealed trait RA4 extends PageSize
  
  @js.native
  sealed trait SRA1 extends PageSize
  
  @js.native
  sealed trait SRA2 extends PageSize
  
  @js.native
  sealed trait SRA3 extends PageSize
  
  @js.native
  sealed trait SRA4 extends PageSize
  
  @js.native
  sealed trait TABLOID extends PageSize
  
  /* "2A0" */ val A0_x_2: typings.pdfmake.buildPdfmakeMod.PageSize.A0_x_2 with String = js.native
  /* "4A0" */ val A0_x_4: typings.pdfmake.buildPdfmakeMod.PageSize.A0_x_4 with String = js.native
  /* "A1" */ val A1: typings.pdfmake.buildPdfmakeMod.PageSize.A1 with String = js.native
  /* "A10" */ val A1O: typings.pdfmake.buildPdfmakeMod.PageSize.A1O with String = js.native
  /* "A2" */ val A2: typings.pdfmake.buildPdfmakeMod.PageSize.A2 with String = js.native
  /* "A3" */ val A3: typings.pdfmake.buildPdfmakeMod.PageSize.A3 with String = js.native
  /* "A4" */ val A4: typings.pdfmake.buildPdfmakeMod.PageSize.A4 with String = js.native
  /* "A5" */ val A5: typings.pdfmake.buildPdfmakeMod.PageSize.A5 with String = js.native
  /* "A6" */ val A6: typings.pdfmake.buildPdfmakeMod.PageSize.A6 with String = js.native
  /* "A7" */ val A7: typings.pdfmake.buildPdfmakeMod.PageSize.A7 with String = js.native
  /* "A8" */ val A8: typings.pdfmake.buildPdfmakeMod.PageSize.A8 with String = js.native
  /* "A9" */ val A9: typings.pdfmake.buildPdfmakeMod.PageSize.A9 with String = js.native
  /* "A0" */ val AO: typings.pdfmake.buildPdfmakeMod.PageSize.AO with String = js.native
  /* "B1" */ val B1: typings.pdfmake.buildPdfmakeMod.PageSize.B1 with String = js.native
  /* "B10" */ val B1O: typings.pdfmake.buildPdfmakeMod.PageSize.B1O with String = js.native
  /* "B2" */ val B2: typings.pdfmake.buildPdfmakeMod.PageSize.B2 with String = js.native
  /* "B3" */ val B3: typings.pdfmake.buildPdfmakeMod.PageSize.B3 with String = js.native
  /* "B4" */ val B4: typings.pdfmake.buildPdfmakeMod.PageSize.B4 with String = js.native
  /* "B5" */ val B5: typings.pdfmake.buildPdfmakeMod.PageSize.B5 with String = js.native
  /* "B6" */ val B6: typings.pdfmake.buildPdfmakeMod.PageSize.B6 with String = js.native
  /* "B7" */ val B7: typings.pdfmake.buildPdfmakeMod.PageSize.B7 with String = js.native
  /* "B8" */ val B8: typings.pdfmake.buildPdfmakeMod.PageSize.B8 with String = js.native
  /* "B9" */ val B9: typings.pdfmake.buildPdfmakeMod.PageSize.B9 with String = js.native
  /* "B0" */ val BO: typings.pdfmake.buildPdfmakeMod.PageSize.BO with String = js.native
  /* "C1" */ val C1: typings.pdfmake.buildPdfmakeMod.PageSize.C1 with String = js.native
  /* "C10" */ val C1O: typings.pdfmake.buildPdfmakeMod.PageSize.C1O with String = js.native
  /* "C2" */ val C2: typings.pdfmake.buildPdfmakeMod.PageSize.C2 with String = js.native
  /* "C3" */ val C3: typings.pdfmake.buildPdfmakeMod.PageSize.C3 with String = js.native
  /* "C4" */ val C4: typings.pdfmake.buildPdfmakeMod.PageSize.C4 with String = js.native
  /* "C5" */ val C5: typings.pdfmake.buildPdfmakeMod.PageSize.C5 with String = js.native
  /* "C6" */ val C6: typings.pdfmake.buildPdfmakeMod.PageSize.C6 with String = js.native
  /* "C7" */ val C7: typings.pdfmake.buildPdfmakeMod.PageSize.C7 with String = js.native
  /* "C8" */ val C8: typings.pdfmake.buildPdfmakeMod.PageSize.C8 with String = js.native
  /* "C9" */ val C9: typings.pdfmake.buildPdfmakeMod.PageSize.C9 with String = js.native
  /* "C0" */ val CO: typings.pdfmake.buildPdfmakeMod.PageSize.CO with String = js.native
  /* "EXECUTIVE" */ val EXECUTIVE: typings.pdfmake.buildPdfmakeMod.PageSize.EXECUTIVE with String = js.native
  /* "FOLIO" */ val FOLIO: typings.pdfmake.buildPdfmakeMod.PageSize.FOLIO with String = js.native
  /* "LEGAL" */ val LEGAL: typings.pdfmake.buildPdfmakeMod.PageSize.LEGAL with String = js.native
  /* "LETTER" */ val LETTER: typings.pdfmake.buildPdfmakeMod.PageSize.LETTER with String = js.native
  /* "RA1" */ val RA1: typings.pdfmake.buildPdfmakeMod.PageSize.RA1 with String = js.native
  /* "RA2" */ val RA2: typings.pdfmake.buildPdfmakeMod.PageSize.RA2 with String = js.native
  /* "RA3" */ val RA3: typings.pdfmake.buildPdfmakeMod.PageSize.RA3 with String = js.native
  /* "RA4" */ val RA4: typings.pdfmake.buildPdfmakeMod.PageSize.RA4 with String = js.native
  /* "SRA1" */ val SRA1: typings.pdfmake.buildPdfmakeMod.PageSize.SRA1 with String = js.native
  /* "SRA2" */ val SRA2: typings.pdfmake.buildPdfmakeMod.PageSize.SRA2 with String = js.native
  /* "SRA3" */ val SRA3: typings.pdfmake.buildPdfmakeMod.PageSize.SRA3 with String = js.native
  /* "SRA4" */ val SRA4: typings.pdfmake.buildPdfmakeMod.PageSize.SRA4 with String = js.native
  /* "TABLOID" */ val TABLOID: typings.pdfmake.buildPdfmakeMod.PageSize.TABLOID with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PageSize with String] = js.native
}

