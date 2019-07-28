package typings.officeDashJsDashPreview.WordNs

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
  
  /* "Boolean" */ val boolean: typings.officeDashJsDashPreview.WordNs.DocumentPropertyType.boolean with String = js.native
  /* "Date" */ val date: typings.officeDashJsDashPreview.WordNs.DocumentPropertyType.date with String = js.native
  /* "Number" */ val number: typings.officeDashJsDashPreview.WordNs.DocumentPropertyType.number with String = js.native
  /* "String" */ val string: typings.officeDashJsDashPreview.WordNs.DocumentPropertyType.string with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyType with String] = js.native
}

