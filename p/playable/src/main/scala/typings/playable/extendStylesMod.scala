package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.playable.coreTypesMod.IStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendStylesMod {
  
  @JSImport("playable/dist/src/modules/ui/core/extendStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(sourceStyles: IStyles, partialStyles: IStyles): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sourceStyles.asInstanceOf[js.Any], partialStyles.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
}
