package typings.placemarkioCheckGeojson

import typings.placemarkioCheckGeojson.distTypesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEnforceBboxMod {
  
  @JSImport("@placemarkio/check-geojson/dist/enforce_bbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enforceBbox(
    ctx: Ctx,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectNode */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforceBbox")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
