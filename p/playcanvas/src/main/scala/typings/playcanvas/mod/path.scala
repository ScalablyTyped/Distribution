package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object path {
  
  @JSImport("playcanvas", "path")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("playcanvas", "path.delimiter")
  @js.native
  val delimiter: String = js.native
  
  inline def extractPath(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPath")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBasename(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBasename")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDirectory(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectory")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getExtension(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isRelativePath(pathname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativePath")(pathname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def normalize(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def split(pathname: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(pathname.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
