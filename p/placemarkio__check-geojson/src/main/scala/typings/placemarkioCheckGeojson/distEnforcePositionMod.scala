package typings.placemarkioCheckGeojson

import typings.placemarkioCheckGeojson.distTypesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEnforcePositionMod {
  
  @JSImport("@placemarkio/check-geojson/dist/enforce_position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enforcePosition(ctx: Ctx): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enforcePosition")(ctx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enforcePosition(
    ctx: Ctx,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayNode */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforcePosition")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
