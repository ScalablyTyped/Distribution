package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GenericTagValueState extends StObject
@JSImport("sap/m/library", "GenericTagValueState")
@js.native
object GenericTagValueState extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GenericTagValueState & String] = js.native
  
  /**
    * Warning icon is rendered that overrides the control set in the `value` aggregation of the `GenericTag`
    * control.
    */
  @js.native
  sealed trait Error
    extends StObject
       with GenericTagValueState
  /* "Error" */ val Error: typings.openui5.sapMLibraryMod.GenericTagValueState.Error & String = js.native
  
  /**
    * The value is rendered in its normal state.
    */
  @js.native
  sealed trait None
    extends StObject
       with GenericTagValueState
  /* "None" */ val None: typings.openui5.sapMLibraryMod.GenericTagValueState.None & String = js.native
}
