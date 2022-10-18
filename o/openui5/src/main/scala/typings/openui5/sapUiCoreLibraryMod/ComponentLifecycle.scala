package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComponentLifecycle extends StObject
@JSImport("sap/ui/core/library", "ComponentLifecycle")
@js.native
object ComponentLifecycle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ComponentLifecycle & String] = js.native
  
  /**
    * Application managed lifecycle means that the application takes care to destroy the components associated
    * with the `ComponentContainer`.
    */
  @js.native
  sealed trait Application
    extends StObject
       with ComponentLifecycle
  /* "Application" */ val Application: typings.openui5.sapUiCoreLibraryMod.ComponentLifecycle.Application & String = js.native
  
  /**
    * Container managed lifecycle means that the `ComponentContainer` takes care to destroy the components
    * associated with the `ComponentContainer` once the `ComponentContainer` is destroyed or a new component
    * is associated.
    */
  @js.native
  sealed trait Container
    extends StObject
       with ComponentLifecycle
  /* "Container" */ val Container: typings.openui5.sapUiCoreLibraryMod.ComponentLifecycle.Container & String = js.native
  
  /**
    * Legacy lifecycle means that the `ComponentContainer` takes care to destroy the component which is associated
    * with the `ComponentContainer` once the `ComponentContainer` is destroyed, but not when a new component
    * is associated.
    */
  @js.native
  sealed trait Legacy
    extends StObject
       with ComponentLifecycle
  /* "Legacy" */ val Legacy: typings.openui5.sapUiCoreLibraryMod.ComponentLifecycle.Legacy & String = js.native
}
