package typings.officeDashJsDashPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentPropertyType extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.DocumentPropertyType")
@js.native
object DocumentPropertyType extends js.Object {
  @js.native
  sealed trait boolean extends DocumentPropertyType
  
  @js.native
  sealed trait date extends DocumentPropertyType
  
  @js.native
  sealed trait number extends DocumentPropertyType
  
  @js.native
  sealed trait string extends DocumentPropertyType
  
  /* "Boolean" */ val boolean: typings.officeDashJsDashPreview.Word.DocumentPropertyType.boolean with String = js.native
  /* "Date" */ val date: typings.officeDashJsDashPreview.Word.DocumentPropertyType.date with String = js.native
  /* "Number" */ val number: typings.officeDashJsDashPreview.Word.DocumentPropertyType.number with String = js.native
  /* "String" */ val string: typings.officeDashJsDashPreview.Word.DocumentPropertyType.string with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyType with String] = js.native
}

