package typings.openui5.sapUiUx3LibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShellDesignType extends StObject
@JSImport("sap/ui/ux3/library", "ShellDesignType")
@js.native
object ShellDesignType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShellDesignType & String] = js.native
  
  /**
    * An even lighter design. It borrows most of its properties from the Light design and just changes a few
    * details like the header colors in order to have a blue design within gold reflection.
    */
  @js.native
  sealed trait Crystal
    extends StObject
       with ShellDesignType
  /* "Crystal" */ val Crystal: typings.openui5.sapUiUx3LibraryMod.ShellDesignType.Crystal & String = js.native
  
  /**
    * A lighter design. Should be used in combination with the Standard header type.
    */
  @js.native
  sealed trait Light
    extends StObject
       with ShellDesignType
  /* "Light" */ val Light: typings.openui5.sapUiUx3LibraryMod.ShellDesignType.Light & String = js.native
  
  /**
    * The standard Shell design (dark).
    */
  @js.native
  sealed trait Standard
    extends StObject
       with ShellDesignType
  /* "Standard" */ val Standard: typings.openui5.sapUiUx3LibraryMod.ShellDesignType.Standard & String = js.native
}
