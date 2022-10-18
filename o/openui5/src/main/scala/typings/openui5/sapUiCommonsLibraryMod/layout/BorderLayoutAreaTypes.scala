package typings.openui5.sapUiCommonsLibraryMod.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderLayoutAreaTypes extends StObject
/**
  * @deprecated (since 1.38)
  *
  * The type (=position) of a BorderLayoutArea
  */
@JSImport("sap/ui/commons/library", "layout.BorderLayoutAreaTypes")
@js.native
object BorderLayoutAreaTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BorderLayoutAreaTypes & String] = js.native
  
  /**
    * Value to identify the begin area.
    */
  @js.native
  sealed trait begin
    extends StObject
       with BorderLayoutAreaTypes
  /* "begin" */ val begin: typings.openui5.sapUiCommonsLibraryMod.layout.BorderLayoutAreaTypes.begin & String = js.native
  
  /**
    * Value to identify the bottom area.
    */
  @js.native
  sealed trait bottom
    extends StObject
       with BorderLayoutAreaTypes
  /* "bottom" */ val bottom: typings.openui5.sapUiCommonsLibraryMod.layout.BorderLayoutAreaTypes.bottom & String = js.native
  
  /**
    * Value to identify the center area.
    */
  @js.native
  sealed trait center
    extends StObject
       with BorderLayoutAreaTypes
  /* "center" */ val center: typings.openui5.sapUiCommonsLibraryMod.layout.BorderLayoutAreaTypes.center & String = js.native
  
  /**
    * Value to identify the end area.
    */
  @js.native
  sealed trait end
    extends StObject
       with BorderLayoutAreaTypes
  /* "end" */ val end: typings.openui5.sapUiCommonsLibraryMod.layout.BorderLayoutAreaTypes.end & String = js.native
  
  /**
    * Value to identify the top area.
    */
  @js.native
  sealed trait top
    extends StObject
       with BorderLayoutAreaTypes
  /* "top" */ val top: typings.openui5.sapUiCommonsLibraryMod.layout.BorderLayoutAreaTypes.top & String = js.native
}
