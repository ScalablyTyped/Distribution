package typings.pixiCore.mod

import typings.pixiCore.anon.AutoDensity
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "ViewSystem")
@js.native
open class ViewSystem protected ()
  extends typings.pixiCore.libSystemsMod.ViewSystem {
  def this(renderer: IRenderer[ICanvas]) = this()
}
/* static members */
object ViewSystem {
  
  @JSImport("@pixi/core", "ViewSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("@pixi/core", "ViewSystem.defaultOptions")
  @js.native
  def defaultOptions: AutoDensity = js.native
  inline def defaultOptions_=(x: AutoDensity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("@pixi/core", "ViewSystem.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
