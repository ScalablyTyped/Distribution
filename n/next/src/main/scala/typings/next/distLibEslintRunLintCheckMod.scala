package typings.next

import typings.next.anon.EslintOptions
import typings.next.anon.EventInfo
import typings.next.anon.Formatter
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEslintRunLintCheckMod {
  
  @JSImport("next/dist/lib/eslint/runLintCheck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runLintCheck(baseDir: String, lintDirs: js.Array[String], hasAppDir: Boolean, opts: EslintOptions): ReturnType[
    js.Function6[
      /* baseDir */ String, 
      /* lintDirs */ js.Array[String], 
      /* eslintrcFile */ String | Null, 
      /* pkgJsonPath */ String | Null, 
      /* hasAppDir */ Boolean, 
      /* param5 */ Formatter, 
      js.Promise[String | Null | EventInfo]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("runLintCheck")(baseDir.asInstanceOf[js.Any], lintDirs.asInstanceOf[js.Any], hasAppDir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function6[
      /* baseDir */ String, 
      /* lintDirs */ js.Array[String], 
      /* eslintrcFile */ String | Null, 
      /* pkgJsonPath */ String | Null, 
      /* hasAppDir */ Boolean, 
      /* param5 */ Formatter, 
      js.Promise[String | Null | EventInfo]
    ]
  ]]
}
