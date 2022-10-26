package typings.next.anon

import typings.next.distClientComponentsReactDevOverlayInternalContainerErrorsMod.SupportedErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<next.next/dist/client/components/react-dev-overlay/internal/error-overlay-reducer.OverlayState> */
trait ReadonlyOverlayState extends StObject {
  
  val buildError: js.UndefOr[String | Null] = js.undefined
  
  val errors: js.Array[SupportedErrorEvent]
  
  val nextId: Double
  
  val rootLayoutMissingTagsError: js.UndefOr[MissingTags] = js.undefined
}
object ReadonlyOverlayState {
  
  inline def apply(errors: js.Array[SupportedErrorEvent], nextId: Double): ReadonlyOverlayState = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], nextId = nextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyOverlayState]
  }
  
  extension [Self <: ReadonlyOverlayState](x: Self) {
    
    inline def setBuildError(value: String): Self = StObject.set(x, "buildError", value.asInstanceOf[js.Any])
    
    inline def setBuildErrorNull: Self = StObject.set(x, "buildError", null)
    
    inline def setBuildErrorUndefined: Self = StObject.set(x, "buildError", js.undefined)
    
    inline def setErrors(value: js.Array[SupportedErrorEvent]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: SupportedErrorEvent*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setNextId(value: Double): Self = StObject.set(x, "nextId", value.asInstanceOf[js.Any])
    
    inline def setRootLayoutMissingTagsError(value: MissingTags): Self = StObject.set(x, "rootLayoutMissingTagsError", value.asInstanceOf[js.Any])
    
    inline def setRootLayoutMissingTagsErrorUndefined: Self = StObject.set(x, "rootLayoutMissingTagsError", js.undefined)
  }
}
