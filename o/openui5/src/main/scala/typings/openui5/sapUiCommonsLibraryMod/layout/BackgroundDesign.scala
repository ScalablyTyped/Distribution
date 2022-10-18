package typings.openui5.sapUiCommonsLibraryMod.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundDesign extends StObject
/**
  * @deprecated (since 1.38)
  *
  * Background design (i.e. color), e.g. of a layout cell.
  */
@JSImport("sap/ui/commons/library", "layout.BackgroundDesign")
@js.native
object BackgroundDesign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BackgroundDesign & String] = js.native
  
  /**
    * A background design suitable for borders.
    */
  @js.native
  sealed trait Border
    extends StObject
       with BackgroundDesign
  /* "Border" */ val Border: typings.openui5.sapUiCommonsLibraryMod.layout.BackgroundDesign.Border & String = js.native
  
  /**
    * An opaque background design that looks dark filled.
    */
  @js.native
  sealed trait Fill1
    extends StObject
       with BackgroundDesign
  /* "Fill1" */ val Fill1: typings.openui5.sapUiCommonsLibraryMod.layout.BackgroundDesign.Fill1 & String = js.native
  
  /**
    * An opaque background design that looks medium filled.
    */
  @js.native
  sealed trait Fill2
    extends StObject
       with BackgroundDesign
  /* "Fill2" */ val Fill2: typings.openui5.sapUiCommonsLibraryMod.layout.BackgroundDesign.Fill2 & String = js.native
  
  /**
    * An opaque background design that looks light filled.
    */
  @js.native
  sealed trait Fill3
    extends StObject
       with BackgroundDesign
  /* "Fill3" */ val Fill3: typings.openui5.sapUiCommonsLibraryMod.layout.BackgroundDesign.Fill3 & String = js.native
  
  /**
    * A background design suitable for headers.
    */
  @js.native
  sealed trait Header
    extends StObject
       with BackgroundDesign
  /* "Header" */ val Header: typings.openui5.sapUiCommonsLibraryMod.layout.BackgroundDesign.Header & String = js.native
  
  /**
    * A plain but opaque background design.
    */
  @js.native
  sealed trait Plain
    extends StObject
       with BackgroundDesign
  /* "Plain" */ val Plain: typings.openui5.sapUiCommonsLibraryMod.layout.BackgroundDesign.Plain & String = js.native
  
  /**
    * A transparent background.
    */
  @js.native
  sealed trait Transparent
    extends StObject
       with BackgroundDesign
  /* "Transparent" */ val Transparent: typings.openui5.sapUiCommonsLibraryMod.layout.BackgroundDesign.Transparent & String = js.native
}
