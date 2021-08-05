package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Config")
@js.native
class Config ()
  extends typings.nodegit.configMod.Config
/* static members */
object Config {
  
  @JSImport("nodegit", "Config")
  @js.native
  val ^ : js.Any = js.native
  
  inline def findGlobal(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findGlobal")().asInstanceOf[js.Promise[String]]
  
  // the docs says it's a buff but it's actually a string
  inline def findProgramdata(): js.Promise[typings.nodegit.bufMod.Buf] = ^.asInstanceOf[js.Dynamic].applyDynamic("findProgramdata")().asInstanceOf[js.Promise[typings.nodegit.bufMod.Buf]]
  
  inline def findSystem(): js.Promise[typings.nodegit.bufMod.Buf] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSystem")().asInstanceOf[js.Promise[typings.nodegit.bufMod.Buf]]
  
  inline def findXdg(): js.Promise[typings.nodegit.bufMod.Buf] = ^.asInstanceOf[js.Dynamic].applyDynamic("findXdg")().asInstanceOf[js.Promise[typings.nodegit.bufMod.Buf]]
  
  inline def openDefault(): js.Promise[typings.nodegit.configMod.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDefault")().asInstanceOf[js.Promise[typings.nodegit.configMod.Config]]
  
  inline def openOndisk(path: String): js.Promise[typings.nodegit.configMod.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("openOndisk")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.configMod.Config]]
}
