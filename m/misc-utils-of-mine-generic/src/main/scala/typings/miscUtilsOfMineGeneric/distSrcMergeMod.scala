package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMergeMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def merge(clone_ : Boolean, recursive: Boolean, argv: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")((scala.List(clone_.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).`++`(argv.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def mergeRecursive(base: Any, extend: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRecursive")(base.asInstanceOf[js.Any], extend.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def recursive(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("recursive")().asInstanceOf[Any]
  inline def recursive(clone: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("recursive")(clone.asInstanceOf[js.Any]).asInstanceOf[Any]
}
