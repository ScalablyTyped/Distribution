package typings.pixiSpine.global.PIXI.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.AtlasParser")
@js.native
class AtlasParser ()
  extends StObject
     with typings.pixiSpine.PIXI.spine.AtlasParser
object AtlasParser {
  
  @JSGlobal("PIXI.spine.AtlasParser")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def use(
    resource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PIXI.LoaderResource */ js.Any,
    next: js.Function0[js.Any]
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
