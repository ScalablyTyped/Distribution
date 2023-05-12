package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventSource extends StObject
/**
  * An enum that specifies an event's source. It can be local or remote (through coauthoring).
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.EventSource")
@js.native
object EventSource extends StObject {
  
  /**
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait local
    extends StObject
       with EventSource
  
  /**
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    */
  @js.native
  sealed trait remote
    extends StObject
       with EventSource
}
