package typings.ngtoolsWebpack

import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeIvyJitSupportCallsMod {
  
  @JSImport("@ngtools/webpack/src/transformers/remove-ivy-jit-support-calls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeIvyJitSupportCalls(classMetadata: Boolean, ngModuleScope: Boolean, getTypeChecker: js.Function0[TypeChecker]): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIvyJitSupportCalls")(classMetadata.asInstanceOf[js.Any], ngModuleScope.asInstanceOf[js.Any], getTypeChecker.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
