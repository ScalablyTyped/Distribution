package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScreenSize extends StObject
@JSImport("sap/m/library", "ScreenSize")
@js.native
object ScreenSize extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScreenSize & String] = js.native
  
  /**
    * 1024px wide
    */
  @js.native
  sealed trait Desktop
    extends StObject
       with ScreenSize
  /* "Desktop" */ val Desktop: typings.openui5.sapMLibraryMod.ScreenSize.Desktop & String = js.native
  
  /**
    * 768px wide
    */
  @js.native
  sealed trait Large
    extends StObject
       with ScreenSize
  /* "Large" */ val Large: typings.openui5.sapMLibraryMod.ScreenSize.Large & String = js.native
  
  /**
    * 560px wide
    */
  @js.native
  sealed trait Medium
    extends StObject
       with ScreenSize
  /* "Medium" */ val Medium: typings.openui5.sapMLibraryMod.ScreenSize.Medium & String = js.native
  
  /**
    * 240px wide
    */
  @js.native
  sealed trait Phone
    extends StObject
       with ScreenSize
  /* "Phone" */ val Phone: typings.openui5.sapMLibraryMod.ScreenSize.Phone & String = js.native
  
  /**
    * 480px wide
    */
  @js.native
  sealed trait Small
    extends StObject
       with ScreenSize
  /* "Small" */ val Small: typings.openui5.sapMLibraryMod.ScreenSize.Small & String = js.native
  
  /**
    * 600px wide
    */
  @js.native
  sealed trait Tablet
    extends StObject
       with ScreenSize
  /* "Tablet" */ val Tablet: typings.openui5.sapMLibraryMod.ScreenSize.Tablet & String = js.native
  
  /**
    * 960px wide
    */
  @js.native
  sealed trait XLarge
    extends StObject
       with ScreenSize
  /* "XLarge" */ val XLarge: typings.openui5.sapMLibraryMod.ScreenSize.XLarge & String = js.native
  
  /**
    * 320px wide
    */
  @js.native
  sealed trait XSmall
    extends StObject
       with ScreenSize
  /* "XSmall" */ val XSmall: typings.openui5.sapMLibraryMod.ScreenSize.XSmall & String = js.native
  
  /**
    * 1120px wide
    */
  @js.native
  sealed trait XXLarge
    extends StObject
       with ScreenSize
  /* "XXLarge" */ val XXLarge: typings.openui5.sapMLibraryMod.ScreenSize.XXLarge & String = js.native
  
  /**
    * 240px wide
    */
  @js.native
  sealed trait XXSmall
    extends StObject
       with ScreenSize
  /* "XXSmall" */ val XXSmall: typings.openui5.sapMLibraryMod.ScreenSize.XXSmall & String = js.native
}
