package typings.metroTransformWorker

import typings.metroTransformWorker.mod.JSFileType
import typings.metroTransformWorker.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metroTransformWorkerStrings {
  
  @js.native
  sealed trait asset
    extends StObject
       with Type
  inline def asset: asset = "asset".asInstanceOf[asset]
  
  @js.native
  sealed trait jsSlashmodule
    extends StObject
       with JSFileType
  inline def jsSlashmodule: jsSlashmodule = "js/module".asInstanceOf[jsSlashmodule]
  
  @js.native
  sealed trait jsSlashmoduleSlashasset
    extends StObject
       with JSFileType
  inline def jsSlashmoduleSlashasset: jsSlashmoduleSlashasset = "js/module/asset".asInstanceOf[jsSlashmoduleSlashasset]
  
  @js.native
  sealed trait jsSlashscript
    extends StObject
       with JSFileType
  inline def jsSlashscript: jsSlashscript = "js/script".asInstanceOf[jsSlashscript]
  
  @js.native
  sealed trait module
    extends StObject
       with Type
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait script
    extends StObject
       with Type
  inline def script: script = "script".asInstanceOf[script]
}
