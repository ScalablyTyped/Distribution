package typings.officeJs.global.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the form of a break.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.BreakType")
@js.native
object BreakType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Word.BreakType with String] = js.native
  
  /* "Line" */ val line: typings.officeJs.Word.BreakType.line with String = js.native
  
  /* "Next" */ val next: typings.officeJs.Word.BreakType.next with String = js.native
  
  /* "Page" */ val page: typings.officeJs.Word.BreakType.page with String = js.native
  
  /* "SectionContinuous" */ val sectionContinuous: typings.officeJs.Word.BreakType.sectionContinuous with String = js.native
  
  /* "SectionEven" */ val sectionEven: typings.officeJs.Word.BreakType.sectionEven with String = js.native
  
  /* "SectionNext" */ val sectionNext: typings.officeJs.Word.BreakType.sectionNext with String = js.native
  
  /* "SectionOdd" */ val sectionOdd: typings.officeJs.Word.BreakType.sectionOdd with String = js.native
}
