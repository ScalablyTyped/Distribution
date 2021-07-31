package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WindowCreationReason extends StObject
@JSImport("openfin/_v2/shapes/Platform", "WindowCreationReason")
@js.native
object WindowCreationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WindowCreationReason & String] = js.native
  
  @js.native
  sealed trait APICall
    extends StObject
       with WindowCreationReason
  /* "api-call" */ val APICall: typings.openfin.shapesPlatformMod.WindowCreationReason.APICall & String = js.native
  
  @js.native
  sealed trait AppCreation
    extends StObject
       with WindowCreationReason
  /* "app-creation" */ val AppCreation: typings.openfin.shapesPlatformMod.WindowCreationReason.AppCreation & String = js.native
  
  @js.native
  sealed trait CreateViewWithoutTarget
    extends StObject
       with WindowCreationReason
  /* "create-view-without-target" */ val CreateViewWithoutTarget: typings.openfin.shapesPlatformMod.WindowCreationReason.CreateViewWithoutTarget & String = js.native
  
  @js.native
  sealed trait Restore
    extends StObject
       with WindowCreationReason
  /* "restore" */ val Restore: typings.openfin.shapesPlatformMod.WindowCreationReason.Restore & String = js.native
  
  @js.native
  sealed trait Tearout
    extends StObject
       with WindowCreationReason
  /* "tearout" */ val Tearout: typings.openfin.shapesPlatformMod.WindowCreationReason.Tearout & String = js.native
}
