package typings.mirada

import typings.mirada.distSrcTypesEmscriptenMod.FS
import typings.mirada.distSrcTypesMiradaMod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOpencvReadyMod {
  
  @JSImport("mirada/dist/src/opencvReady", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mirada/dist/src/opencvReady", "FS_ROOT")
  @js.native
  val FS_ROOT: /* "/work" */ String = js.native
  
  inline def getFS(): FS = ^.asInstanceOf[js.Dynamic].applyDynamic("getFS")().asInstanceOf[FS]
  
  inline def loadOpencv(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadOpencv")().asInstanceOf[js.Promise[Unit]]
  inline def loadOpencv(options: LoadOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadOpencv")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
