package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Priority extends StObject
@JSImport("sap/m/library", "Priority")
@js.native
object Priority extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Priority & String] = js.native
  
  /**
    * It displays high priority color for the GenericTag
    */
  @js.native
  sealed trait High
    extends StObject
       with Priority
  /* "High" */ val High: typings.openui5.sapMLibraryMod.Priority.High & String = js.native
  
  /**
    * It displays low priority color for the GenericTag
    */
  @js.native
  sealed trait Low
    extends StObject
       with Priority
  /* "Low" */ val Low: typings.openui5.sapMLibraryMod.Priority.Low & String = js.native
  
  /**
    * It displays medium priority color for the GenericTag
    */
  @js.native
  sealed trait Medium
    extends StObject
       with Priority
  /* "Medium" */ val Medium: typings.openui5.sapMLibraryMod.Priority.Medium & String = js.native
  
  /**
    * The priority is not set
    */
  @js.native
  sealed trait None
    extends StObject
       with Priority
  /* "None" */ val None: typings.openui5.sapMLibraryMod.Priority.None & String = js.native
  
  /**
    * It displays very high priority color for the GenericTag
    */
  @js.native
  sealed trait VeryHigh
    extends StObject
       with Priority
  /* "VeryHigh" */ val VeryHigh: typings.openui5.sapMLibraryMod.Priority.VeryHigh & String = js.native
}
