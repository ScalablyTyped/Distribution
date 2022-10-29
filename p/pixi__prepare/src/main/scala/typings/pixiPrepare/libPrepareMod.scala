package typings.pixiPrepare

import typings.pixiCore.mod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiPrepare.libBasePrepareMod.BasePrepare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPrepareMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.pixiCore.libSystemIsystemMod.ISystem because var conflicts: destroy. Inlined init */ @JSImport("@pixi/prepare/lib/Prepare", "Prepare")
  @js.native
  open class Prepare protected () extends BasePrepare {
    /**
      * @param {PIXI.Renderer} renderer - A reference to the current renderer
      */
    def this(renderer: Renderer) = this()
    
    var init: js.UndefOr[js.Function1[/* options */ js.UndefOr[Null], Unit]] = js.native
  }
  /* static members */
  object Prepare {
    
    /** @ignore */
    @JSImport("@pixi/prepare/lib/Prepare", "Prepare.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
