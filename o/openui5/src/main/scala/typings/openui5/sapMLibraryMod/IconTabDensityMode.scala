package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IconTabDensityMode extends StObject
@JSImport("sap/m/library", "IconTabDensityMode")
@js.native
object IconTabDensityMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IconTabDensityMode & String] = js.native
  
  /**
    * Compact. In this mode the tabs will be set explicitly to compact mode independent of what mode is applied
    * globally.
    */
  @js.native
  sealed trait Compact
    extends StObject
       with IconTabDensityMode
  /* "Compact" */ val Compact: typings.openui5.sapMLibraryMod.IconTabDensityMode.Compact & String = js.native
  
  /**
    * Cozy. In this mode the tabs will be set explicitly to compact mode independent of what mode is applied
    * globally.
    */
  @js.native
  sealed trait Cozy
    extends StObject
       with IconTabDensityMode
  /* "Cozy" */ val Cozy: typings.openui5.sapMLibraryMod.IconTabDensityMode.Cozy & String = js.native
  
  /**
    * Inherit. In this mode the global configuration of the density mode will be applied.
    */
  @js.native
  sealed trait Inherit
    extends StObject
       with IconTabDensityMode
  /* "Inherit" */ val Inherit: typings.openui5.sapMLibraryMod.IconTabDensityMode.Inherit & String = js.native
}
