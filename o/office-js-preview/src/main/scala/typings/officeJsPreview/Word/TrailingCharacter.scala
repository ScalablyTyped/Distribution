package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TrailingCharacter extends StObject
/**
  * Represents the character inserted after the list item mark.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.TrailingCharacter")
@js.native
object TrailingCharacter extends StObject {
  
  /**
    * No character is inserted.
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait trailingNone
    extends StObject
       with TrailingCharacter
  
  /**
    * A space is inserted. Default.
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait trailingSpace
    extends StObject
       with TrailingCharacter
  
  /**
    * A tab is inserted.
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait trailingTab
    extends StObject
       with TrailingCharacter
}
