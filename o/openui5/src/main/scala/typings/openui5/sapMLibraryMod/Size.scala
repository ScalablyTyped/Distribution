package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Size extends StObject
@JSImport("sap/m/library", "Size")
@js.native
object Size extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Size & String] = js.native
  
  /**
    * The size depends on the device it is running on. It is medium size for desktop and tablet and small size
    * for phone.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with Size
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.Size.Auto & String = js.native
  
  /**
    * Large size.
    */
  @js.native
  sealed trait L
    extends StObject
       with Size
  /* "L" */ val L: typings.openui5.sapMLibraryMod.Size.L & String = js.native
  
  /**
    * Medium size.
    */
  @js.native
  sealed trait M
    extends StObject
       with Size
  /* "M" */ val M: typings.openui5.sapMLibraryMod.Size.M & String = js.native
  
  /**
    * @since 1.44.0
    *
    * The width and height of the control are determined by the width and height of the container the control
    * is placed in. Please note: it is decided by the control whether or not sap.m.Size.Responsive is supported.
    */
  @js.native
  sealed trait Responsive
    extends StObject
       with Size
  /* "Responsive" */ val Responsive: typings.openui5.sapMLibraryMod.Size.Responsive & String = js.native
  
  /**
    * Small size.
    */
  @js.native
  sealed trait S
    extends StObject
       with Size
  /* "S" */ val S: typings.openui5.sapMLibraryMod.Size.S & String = js.native
  
  /**
    * Extra small size.
    */
  @js.native
  sealed trait XS
    extends StObject
       with Size
  /* "XS" */ val XS: typings.openui5.sapMLibraryMod.Size.XS & String = js.native
}
