package typings.placemarkioCheckGeojson

import typings.placemarkioCheckGeojson.typesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkDuplicateKeysMod {
  
  @JSImport("@placemarkio/check-geojson/dist/check_duplicate_keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkDuplicateKeys(
    ctx: Ctx,
    parent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectNode */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDuplicateKeys")(ctx.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Any]
}
