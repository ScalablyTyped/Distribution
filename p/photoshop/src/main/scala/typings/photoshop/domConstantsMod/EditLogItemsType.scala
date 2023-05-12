package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditLogItemsType extends StObject
@JSImport("photoshop/dom/Constants", "EditLogItemsType")
@js.native
object EditLogItemsType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EditLogItemsType & String] = js.native
  
  /**
    * Includes the text that appears in the History panel in addition to the Sessions information.
    */
  @js.native
  sealed trait CONCISE
    extends StObject
       with EditLogItemsType
  /* "concise" */ val CONCISE: typings.photoshop.domConstantsMod.EditLogItemsType.CONCISE & String = js.native
  
  /**
    * Includes the text that appears in the Actions panel in addition to the Concise information.
    * If you need a complete history of all changes made to files, choose Detailed.
    */
  @js.native
  sealed trait DETAILED
    extends StObject
       with EditLogItemsType
  /* "detailed" */ val DETAILED: typings.photoshop.domConstantsMod.EditLogItemsType.DETAILED & String = js.native
  
  /**
    * Keeps a record of each time you start or quit
    * Photoshop and each time you open and close files (each image’s filename is included).
    * Does not include any information about edits made to the file.
    */
  @js.native
  sealed trait SESSIONONLY
    extends StObject
       with EditLogItemsType
  /* "session" */ val SESSIONONLY: typings.photoshop.domConstantsMod.EditLogItemsType.SESSIONONLY & String = js.native
}
