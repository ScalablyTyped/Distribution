package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeTrackingVersion extends StObject
/**
  * Specify the current version or the original version of the text.
  *
  * @remarks
  * [Api set: WordApiOnline 1.1]
  */
@JSGlobal("Word.ChangeTrackingVersion")
@js.native
object ChangeTrackingVersion extends StObject {
  
  /**
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  @js.native
  sealed trait current
    extends StObject
       with ChangeTrackingVersion
  
  /**
    * @remarks
    * [Api set: WordApiOnline 1.1]
    */
  @js.native
  sealed trait original
    extends StObject
       with ChangeTrackingVersion
}
