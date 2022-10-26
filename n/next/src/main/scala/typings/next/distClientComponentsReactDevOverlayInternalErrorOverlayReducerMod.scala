package typings.next

import typings.next.anon.MissingTags
import typings.next.anon.ReadonlyOverlayState
import typings.next.distClientComponentsReactDevOverlayInternalContainerErrorsMod.SupportedErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReactDevOverlayInternalErrorOverlayReducerMod {
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/error-overlay-reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/error-overlay-reducer", "ACTION_BUILD_ERROR")
  @js.native
  val ACTION_BUILD_ERROR: /* "build-error" */ String = js.native
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/error-overlay-reducer", "ACTION_BUILD_OK")
  @js.native
  val ACTION_BUILD_OK: /* "build-ok" */ String = js.native
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/error-overlay-reducer", "ACTION_REFRESH")
  @js.native
  val ACTION_REFRESH: /* "fast-refresh" */ String = js.native
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/error-overlay-reducer", "ACTION_UNHANDLED_ERROR")
  @js.native
  val ACTION_UNHANDLED_ERROR: /* "unhandled-error" */ String = js.native
  
  @JSImport("next/dist/client/components/react-dev-overlay/internal/error-overlay-reducer", "ACTION_UNHANDLED_REJECTION")
  @js.native
  val ACTION_UNHANDLED_REJECTION: /* "unhandled-rejection" */ String = js.native
  
  inline def errorOverlayReducer(
    state: ReadonlyOverlayState,
    action: BuildOkAction | BuildErrorAction | FastRefreshAction | UnhandledErrorAction | UnhandledRejectionAction
  ): OverlayState = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOverlayReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[OverlayState]
  
  trait BuildErrorAction extends StObject {
    
    var message: String
    
    var `type`: /* "build-error" */ String
  }
  object BuildErrorAction {
    
    inline def apply(message: String, `type`: /* "build-error" */ String): BuildErrorAction = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildErrorAction]
    }
    
    extension [Self <: BuildErrorAction](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "build-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BuildOkAction extends StObject {
    
    var `type`: /* "build-ok" */ String
  }
  object BuildOkAction {
    
    inline def apply(`type`: /* "build-ok" */ String): BuildOkAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildOkAction]
    }
    
    extension [Self <: BuildOkAction](x: Self) {
      
      inline def setType(value: /* "build-ok" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastRefreshAction extends StObject {
    
    var `type`: /* "fast-refresh" */ String
  }
  object FastRefreshAction {
    
    inline def apply(`type`: /* "fast-refresh" */ String): FastRefreshAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastRefreshAction]
    }
    
    extension [Self <: FastRefreshAction](x: Self) {
      
      inline def setType(value: /* "fast-refresh" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverlayState extends StObject {
    
    var buildError: String | Null
    
    var errors: js.Array[SupportedErrorEvent]
    
    var nextId: Double
    
    var rootLayoutMissingTagsError: js.UndefOr[MissingTags] = js.undefined
  }
  object OverlayState {
    
    inline def apply(errors: js.Array[SupportedErrorEvent], nextId: Double): OverlayState = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], nextId = nextId.asInstanceOf[js.Any], buildError = null)
      __obj.asInstanceOf[OverlayState]
    }
    
    extension [Self <: OverlayState](x: Self) {
      
      inline def setBuildError(value: String): Self = StObject.set(x, "buildError", value.asInstanceOf[js.Any])
      
      inline def setBuildErrorNull: Self = StObject.set(x, "buildError", null)
      
      inline def setErrors(value: js.Array[SupportedErrorEvent]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: SupportedErrorEvent*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setNextId(value: Double): Self = StObject.set(x, "nextId", value.asInstanceOf[js.Any])
      
      inline def setRootLayoutMissingTagsError(value: MissingTags): Self = StObject.set(x, "rootLayoutMissingTagsError", value.asInstanceOf[js.Any])
      
      inline def setRootLayoutMissingTagsErrorUndefined: Self = StObject.set(x, "rootLayoutMissingTagsError", js.undefined)
    }
  }
  
  trait UnhandledErrorAction extends StObject {
    
    var frames: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
      ]
    
    var reason: js.Error
    
    var `type`: /* "unhandled-error" */ String
  }
  object UnhandledErrorAction {
    
    inline def apply(
      frames: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
        ],
      reason: js.Error,
      `type`: /* "unhandled-error" */ String
    ): UnhandledErrorAction = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnhandledErrorAction]
    }
    
    extension [Self <: UnhandledErrorAction](x: Self) {
      
      inline def setFrames(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
            ]
      ): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any)*
      ): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setReason(value: js.Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "unhandled-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnhandledRejectionAction extends StObject {
    
    var frames: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
      ]
    
    var reason: js.Error
    
    var `type`: /* "unhandled-rejection" */ String
  }
  object UnhandledRejectionAction {
    
    inline def apply(
      frames: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
        ],
      reason: js.Error,
      `type`: /* "unhandled-rejection" */ String
    ): UnhandledRejectionAction = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnhandledRejectionAction]
    }
    
    extension [Self <: UnhandledRejectionAction](x: Self) {
      
      inline def setFrames(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any
            ]
      ): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackFrame */ Any)*
      ): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setReason(value: js.Error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "unhandled-rejection" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
