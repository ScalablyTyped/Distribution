package typings.officeJs.OneNote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphType extends js.Object

/**
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.ParagraphType")
@js.native
object ParagraphType extends js.Object {
  @js.native
  sealed trait image extends ParagraphType
  
  @js.native
  sealed trait ink extends ParagraphType
  
  @js.native
  sealed trait other extends ParagraphType
  
  @js.native
  sealed trait richText extends ParagraphType
  
  @js.native
  sealed trait table extends ParagraphType
  
}

