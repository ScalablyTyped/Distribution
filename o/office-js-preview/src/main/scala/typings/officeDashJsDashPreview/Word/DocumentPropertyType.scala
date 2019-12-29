package typings.officeDashJsDashPreview.Word

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DocumentPropertyType with String] = js.native
  /* "Boolean" */ @js.native
  object boolean extends TopLevel[boolean with String]
  
  /* "Date" */ @js.native
  object date extends TopLevel[date with String]
  
  /* "Number" */ @js.native
  object number extends TopLevel[number with String]
  
  /* "String" */ @js.native
  object string extends TopLevel[string with String]
  
}

