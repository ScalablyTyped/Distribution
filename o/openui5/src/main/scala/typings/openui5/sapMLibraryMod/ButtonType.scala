package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonType extends StObject
@JSImport("sap/m/library", "ButtonType")
@js.native
object ButtonType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonType & String] = js.native
  
  /**
    * Accept type
    */
  @js.native
  sealed trait Accept
    extends StObject
       with ButtonType
  /* "Accept" */ val Accept: typings.openui5.sapMLibraryMod.ButtonType.Accept & String = js.native
  
  /**
    * @since 1.77
    *
    * Attention type
    */
  @js.native
  sealed trait Attention
    extends StObject
       with ButtonType
  /* "Attention" */ val Attention: typings.openui5.sapMLibraryMod.ButtonType.Attention & String = js.native
  
  /**
    * Back type (back navigation button for header)
    */
  @js.native
  sealed trait Back
    extends StObject
       with ButtonType
  /* "Back" */ val Back: typings.openui5.sapMLibraryMod.ButtonType.Back & String = js.native
  
  /**
    * @since 1.73
    *
    * Critical type
    *
    * **Note:** To be used only in controls of type `sap.m.Button`. When the button opens a `sap.m.MessagePopover`
    * list, use this `ButtonType` if the message with the highest severity is `Warning` type.
    */
  @js.native
  sealed trait Critical
    extends StObject
       with ButtonType
  /* "Critical" */ val Critical: typings.openui5.sapMLibraryMod.ButtonType.Critical & String = js.native
  
  /**
    * Default type (no special styling)
    */
  @js.native
  sealed trait Default
    extends StObject
       with ButtonType
  /* "Default" */ val Default: typings.openui5.sapMLibraryMod.ButtonType.Default & String = js.native
  
  /**
    * Emphasized type
    */
  @js.native
  sealed trait Emphasized
    extends StObject
       with ButtonType
  /* "Emphasized" */ val Emphasized: typings.openui5.sapMLibraryMod.ButtonType.Emphasized & String = js.native
  
  /**
    * Ghost type
    */
  @js.native
  sealed trait Ghost
    extends StObject
       with ButtonType
  /* "Ghost" */ val Ghost: typings.openui5.sapMLibraryMod.ButtonType.Ghost & String = js.native
  
  /**
    * @since 1.73
    *
    * Negative type
    *
    * **Note:** To be used only in controls of type `sap.m.Button`. When the button opens a `sap.m.MessagePopover`
    * list, use this `ButtonType` if the message with the highest severity is `Error` type.
    */
  @js.native
  sealed trait Negative
    extends StObject
       with ButtonType
  /* "Negative" */ val Negative: typings.openui5.sapMLibraryMod.ButtonType.Negative & String = js.native
  
  /**
    * @since 1.73
    *
    * Neutral type
    *
    * **Note:** To be used only in controls of type `sap.m.Button`. When the button opens a `sap.m.MessagePopover`
    * list, use this `ButtonType` if the message with the highest severity is `Information` type.
    */
  @js.native
  sealed trait Neutral
    extends StObject
       with ButtonType
  /* "Neutral" */ val Neutral: typings.openui5.sapMLibraryMod.ButtonType.Neutral & String = js.native
  
  /**
    * Reject style
    */
  @js.native
  sealed trait Reject
    extends StObject
       with ButtonType
  /* "Reject" */ val Reject: typings.openui5.sapMLibraryMod.ButtonType.Reject & String = js.native
  
  /**
    * @since 1.73
    *
    * Success type
    *
    * **Note:** To be used only in controls of type `sap.m.Button`. When the button opens a `sap.m.MessagePopover`
    * list, use this `ButtonType` if the message with the highest severity is `Success` type.
    */
  @js.native
  sealed trait Success
    extends StObject
       with ButtonType
  /* "Success" */ val Success: typings.openui5.sapMLibraryMod.ButtonType.Success & String = js.native
  
  /**
    * Transparent type
    */
  @js.native
  sealed trait Transparent
    extends StObject
       with ButtonType
  /* "Transparent" */ val Transparent: typings.openui5.sapMLibraryMod.ButtonType.Transparent & String = js.native
  
  /**
    * Unstyled type (no styling)
    */
  @js.native
  sealed trait Unstyled
    extends StObject
       with ButtonType
  /* "Unstyled" */ val Unstyled: typings.openui5.sapMLibraryMod.ButtonType.Unstyled & String = js.native
  
  /**
    * Up type (up navigation button for header)
    */
  @js.native
  sealed trait Up
    extends StObject
       with ButtonType
  /* "Up" */ val Up: typings.openui5.sapMLibraryMod.ButtonType.Up & String = js.native
}
