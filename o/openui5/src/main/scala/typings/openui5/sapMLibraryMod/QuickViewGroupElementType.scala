package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QuickViewGroupElementType extends StObject
@JSImport("sap/m/library", "QuickViewGroupElementType")
@js.native
object QuickViewGroupElementType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QuickViewGroupElementType & String] = js.native
  
  /**
    * Displays an e-mail link
    */
  @js.native
  sealed trait email
    extends StObject
       with QuickViewGroupElementType
  /* "email" */ val email: typings.openui5.sapMLibraryMod.QuickViewGroupElementType.email & String = js.native
  
  /**
    * Displays a regular HTML link
    */
  @js.native
  sealed trait link
    extends StObject
       with QuickViewGroupElementType
  /* "link" */ val link: typings.openui5.sapMLibraryMod.QuickViewGroupElementType.link & String = js.native
  
  /**
    * Displays a phone number link for direct dialing and an icon for sending a text message
    */
  @js.native
  sealed trait mobile
    extends StObject
       with QuickViewGroupElementType
  /* "mobile" */ val mobile: typings.openui5.sapMLibraryMod.QuickViewGroupElementType.mobile & String = js.native
  
  /**
    * Displays a link for navigating to another QuickViewPage
    */
  @js.native
  sealed trait pageLink
    extends StObject
       with QuickViewGroupElementType
  /* "pageLink" */ val pageLink: typings.openui5.sapMLibraryMod.QuickViewGroupElementType.pageLink & String = js.native
  
  /**
    * Displays a phone number link for direct dialing
    */
  @js.native
  sealed trait phone
    extends StObject
       with QuickViewGroupElementType
  /* "phone" */ val phone: typings.openui5.sapMLibraryMod.QuickViewGroupElementType.phone & String = js.native
  
  /**
    * Displays text
    */
  @js.native
  sealed trait text
    extends StObject
       with QuickViewGroupElementType
  /* "text" */ val text: typings.openui5.sapMLibraryMod.QuickViewGroupElementType.text & String = js.native
}
