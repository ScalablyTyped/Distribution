package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detectStreamTypeMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/utils/detect-stream-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExtFromPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getStreamType(url: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStreamType")(url.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
