package typings.placemarkioCheckGeojson

import typings.placemarkioCheckGeojson.typesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMemberValueMod {
  
  @JSImport("@placemarkio/check-geojson/dist/get_member_value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMemberValue(
    ctx: Ctx,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectNode */ Any,
    name: String
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_momoa.Node */ Any) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMemberValue")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_momoa.Node */ Any) | Null]
}
