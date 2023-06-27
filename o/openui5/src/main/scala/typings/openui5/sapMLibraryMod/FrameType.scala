package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrameType extends StObject
@JSImport("sap/m/library", "FrameType")
@js.native
object FrameType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FrameType & String] = js.native
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The Auto frame type that adjusts the size of the control to the content. Support for this type in sap.m.GenericTile
    * is deprecated since 1.48.0.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with FrameType
  /* "Auto" */ val Auto: typings.openui5.sapMLibraryMod.FrameType.Auto & String = js.native
  
  /**
    * @since 1.83
    *
    * The 2x1 frame type. **Note:** The 2x1 frame type is currently only supported for Generic tile.
    */
  @js.native
  sealed trait OneByHalf
    extends StObject
       with FrameType
  /* "OneByHalf" */ val OneByHalf: typings.openui5.sapMLibraryMod.FrameType.OneByHalf & String = js.native
  
  /**
    * The 2x2 frame type.
    */
  @js.native
  sealed trait OneByOne
    extends StObject
       with FrameType
  /* "OneByOne" */ val OneByOne: typings.openui5.sapMLibraryMod.FrameType.OneByOne & String = js.native
  
  /**
    * @since 1.83
    *
    * The 4x1 frame type. **Note:** The 4x1 frame type is currently only supported for Generic tile.
    */
  @js.native
  sealed trait TwoByHalf
    extends StObject
       with FrameType
  /* "TwoByHalf" */ val TwoByHalf: typings.openui5.sapMLibraryMod.FrameType.TwoByHalf & String = js.native
  
  /**
    * The 4x2 frame type.
    */
  @js.native
  sealed trait TwoByOne
    extends StObject
       with FrameType
  /* "TwoByOne" */ val TwoByOne: typings.openui5.sapMLibraryMod.FrameType.TwoByOne & String = js.native
  
  /**
    * @deprecated (since 1.48.0)
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The 2/3 frame type.
    */
  @js.native
  sealed trait TwoThirds
    extends StObject
       with FrameType
  /* "TwoThirds" */ val TwoThirds: typings.openui5.sapMLibraryMod.FrameType.TwoThirds & String = js.native
}
