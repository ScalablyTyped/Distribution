package typings.metroTransformWorker

import typings.metroTransformWorker.srcMod.BytecodeFileType
import typings.metroTransformWorker.srcMod.JSFileType
import typings.metroTransformWorker.srcMod.Type
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
  sealed trait bytecodeSlashmodule
    extends StObject
       with BytecodeFileType
  inline def bytecodeSlashmodule: bytecodeSlashmodule = "bytecode/module".asInstanceOf[bytecodeSlashmodule]
  
  @js.native
  sealed trait bytecodeSlashmoduleSlashasset
    extends StObject
       with BytecodeFileType
  inline def bytecodeSlashmoduleSlashasset: bytecodeSlashmoduleSlashasset = "bytecode/module/asset".asInstanceOf[bytecodeSlashmoduleSlashasset]
  
  @js.native
  sealed trait bytecodeSlashscript
    extends StObject
       with BytecodeFileType
  inline def bytecodeSlashscript: bytecodeSlashscript = "bytecode/script".asInstanceOf[bytecodeSlashscript]
  
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
