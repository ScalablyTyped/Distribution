package typings.playable.withDashMod

import typings.playable.errorsMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/with-dash", "ERRORS")
@js.native
object ERRORS extends js.Object {
  
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
