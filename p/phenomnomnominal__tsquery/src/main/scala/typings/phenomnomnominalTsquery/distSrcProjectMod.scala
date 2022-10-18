package typings.phenomnomnominalTsquery

import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProjectMod {
  
  @JSImport("@phenomnomnominal/tsquery/dist/src/project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def project(configFilePath: String): js.Array[SourceFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("project")(configFilePath.asInstanceOf[js.Any]).asInstanceOf[js.Array[SourceFile]]
  
  inline def projectFiles(configFilePath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("projectFiles")(configFilePath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
