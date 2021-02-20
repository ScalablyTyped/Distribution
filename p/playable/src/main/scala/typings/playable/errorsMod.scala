package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("playable/dist/src/constants/errors", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Error with String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typings.playable.errorsMod.Error.CONTENT_LOAD with String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typings.playable.errorsMod.Error.CONTENT_PARSE with String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typings.playable.errorsMod.Error.LEVEL_LOAD with String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typings.playable.errorsMod.Error.MANIFEST_INCOMPATIBLE with String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typings.playable.errorsMod.Error.MANIFEST_LOAD with String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typings.playable.errorsMod.Error.MANIFEST_PARSE with String = js.native
    
    /* "error-media" */ val MEDIA: typings.playable.errorsMod.Error.MEDIA with String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typings.playable.errorsMod.Error.SRC_PARSE with String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typings.playable.errorsMod.Error.UNKNOWN with String = js.native
  }
  
  @js.native
  sealed trait Error extends StObject
  @JSImport("playable/dist/src/constants/errors", "Error")
  @js.native
  object Error extends StObject {
    
    @js.native
    sealed trait CONTENT_LOAD extends Error
    
    @js.native
    sealed trait CONTENT_PARSE extends Error
    
    @js.native
    sealed trait LEVEL_LOAD extends Error
    
    @js.native
    sealed trait MANIFEST_INCOMPATIBLE extends Error
    
    @js.native
    sealed trait MANIFEST_LOAD extends Error
    
    @js.native
    sealed trait MANIFEST_PARSE extends Error
    
    @js.native
    sealed trait MEDIA extends Error
    
    @js.native
    sealed trait SRC_PARSE extends Error
    
    @js.native
    sealed trait UNKNOWN extends Error
  }
}
