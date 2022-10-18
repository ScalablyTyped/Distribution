package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectMarkerVisibility extends StObject
@JSImport("sap/m/library", "ObjectMarkerVisibility")
@js.native
object ObjectMarkerVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ObjectMarkerVisibility & String] = js.native
  
  /**
    * Shows icon and text
    */
  @js.native
  sealed trait IconAndText
    extends StObject
       with ObjectMarkerVisibility
  /* "IconAndText" */ val IconAndText: typings.openui5.sapMLibraryMod.ObjectMarkerVisibility.IconAndText & String = js.native
  
  /**
    * Shows only icon
    */
  @js.native
  sealed trait IconOnly
    extends StObject
       with ObjectMarkerVisibility
  /* "IconOnly" */ val IconOnly: typings.openui5.sapMLibraryMod.ObjectMarkerVisibility.IconOnly & String = js.native
  
  /**
    * Shows only text
    */
  @js.native
  sealed trait TextOnly
    extends StObject
       with ObjectMarkerVisibility
  /* "TextOnly" */ val TextOnly: typings.openui5.sapMLibraryMod.ObjectMarkerVisibility.TextOnly & String = js.native
}
