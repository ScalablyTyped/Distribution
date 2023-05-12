package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.anon.Cwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFileMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def basename(f: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(f.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def basename(f: String, removeExtension: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(f.asInstanceOf[js.Any], removeExtension.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def bytesToKiloBytes(fileSizeInBytes: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToKiloBytes")(fileSizeInBytes.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def detectNewline(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectNewline")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def detectNewline(s: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("detectNewline")(s.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dirname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFileExtension(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileExtension")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRelativePath(source: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseGitIgnore(content: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGitIgnore")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def parseGitIgnore(content: String, options: Cwd): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseGitIgnore")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def pathJoin(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathJoin")(parts.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def slash(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slash")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def withFinalSlash(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withFinalSlash")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def withoutExtension(f: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withoutExtension")(f.asInstanceOf[js.Any]).asInstanceOf[String]
}
