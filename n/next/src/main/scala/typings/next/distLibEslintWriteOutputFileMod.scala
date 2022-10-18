package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEslintWriteOutputFileMod {
  
  @JSImport("next/dist/lib/eslint/writeOutputFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeOutputFile(outputFile: String, outputData: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOutputFile")(outputFile.asInstanceOf[js.Any], outputData.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
