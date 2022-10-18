package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderLevel extends StObject
@JSImport("sap/m/library", "HeaderLevel")
@js.native
object HeaderLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HeaderLevel & String] = js.native
  
  /**
    * Header level 1
    */
  @js.native
  sealed trait H1
    extends StObject
       with HeaderLevel
  /* "H1" */ val H1: typings.openui5.sapMLibraryMod.HeaderLevel.H1 & String = js.native
  
  /**
    * Header level 2
    */
  @js.native
  sealed trait H2
    extends StObject
       with HeaderLevel
  /* "H2" */ val H2: typings.openui5.sapMLibraryMod.HeaderLevel.H2 & String = js.native
  
  /**
    * Header level 3
    */
  @js.native
  sealed trait H3
    extends StObject
       with HeaderLevel
  /* "H3" */ val H3: typings.openui5.sapMLibraryMod.HeaderLevel.H3 & String = js.native
  
  /**
    * Header level 4
    */
  @js.native
  sealed trait H4
    extends StObject
       with HeaderLevel
  /* "H4" */ val H4: typings.openui5.sapMLibraryMod.HeaderLevel.H4 & String = js.native
  
  /**
    * Header level 5
    */
  @js.native
  sealed trait H5
    extends StObject
       with HeaderLevel
  /* "H5" */ val H5: typings.openui5.sapMLibraryMod.HeaderLevel.H5 & String = js.native
  
  /**
    * Header level 6
    */
  @js.native
  sealed trait H6
    extends StObject
       with HeaderLevel
  /* "H6" */ val H6: typings.openui5.sapMLibraryMod.HeaderLevel.H6 & String = js.native
}
