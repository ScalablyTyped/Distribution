package typings.officeJsPreview.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ListLevelType extends js.Object
/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.ListLevelType")
@js.native
object ListLevelType extends js.Object {
  
  @js.native
  sealed trait bullet extends ListLevelType
  
  @js.native
  sealed trait number extends ListLevelType
  
  @js.native
  sealed trait picture extends ListLevelType
}
