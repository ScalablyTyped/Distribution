package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SaveLogItemsType extends StObject
@JSImport("photoshop/dom/Constants", "SaveLogItemsType")
@js.native
object SaveLogItemsType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SaveLogItemsType & String] = js.native
  
  /**
    * Save history log in a text file.
    */
  @js.native
  sealed trait LOGFILE
    extends StObject
       with SaveLogItemsType
  /* "textFile" */ val LOGFILE: typings.photoshop.domConstantsMod.SaveLogItemsType.LOGFILE & String = js.native
  
  /**
    * Save history log in file metadata and a text file.
    */
  @js.native
  sealed trait LOGFILEANDMETADATA
    extends StObject
       with SaveLogItemsType
  /* "both" */ val LOGFILEANDMETADATA: typings.photoshop.domConstantsMod.SaveLogItemsType.LOGFILEANDMETADATA & String = js.native
  
  /**
    * Save history log in file metadata.
    */
  @js.native
  sealed trait METADATA
    extends StObject
       with SaveLogItemsType
  /* "metadata" */ val METADATA: typings.photoshop.domConstantsMod.SaveLogItemsType.METADATA & String = js.native
}
