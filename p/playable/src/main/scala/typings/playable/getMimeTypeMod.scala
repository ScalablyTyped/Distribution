package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMimeTypeMod {
  
  @JSImport("playable/dist/src/utils/get-mime-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getMimeByType(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeByType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getMimeByUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMimeByUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
