package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JPEGFormatOptions extends StObject
@JSImport("photoshop/dom/Constants", "JPEGFormatOptions")
@js.native
object JPEGFormatOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JPEGFormatOptions & String] = js.native
  
  /**
    * Optimized color and a slightly reduced file size.
    */
  @js.native
  sealed trait OPTIMIZEDBASELINE
    extends StObject
       with JPEGFormatOptions
  /* "optimizedbaseline" */ val OPTIMIZEDBASELINE: typings.photoshop.domConstantsMod.JPEGFormatOptions.OPTIMIZEDBASELINE & String = js.native
  
  /**
    * Displays a series of increasing detailed scans as the image downloads.
    */
  @js.native
  sealed trait PROGRESSIVE
    extends StObject
       with JPEGFormatOptions
  /* "progressive" */ val PROGRESSIVE: typings.photoshop.domConstantsMod.JPEGFormatOptions.PROGRESSIVE & String = js.native
  
  /**
    * Format recognized by most web browsers.
    */
  @js.native
  sealed trait STANDARDBASELINE
    extends StObject
       with JPEGFormatOptions
  /* "standardbaseline" */ val STANDARDBASELINE: typings.photoshop.domConstantsMod.JPEGFormatOptions.STANDARDBASELINE & String = js.native
}
