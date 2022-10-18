package typings.placemarkioCheckGeojson

import typings.placemarkioCheckGeojson.distTypesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEnforceSamePositionMod {
  
  @JSImport("@placemarkio/check-geojson/dist/enforce_same_position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enforceSamePosition(
    ctx: Ctx,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayNode */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enforceSamePosition")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
