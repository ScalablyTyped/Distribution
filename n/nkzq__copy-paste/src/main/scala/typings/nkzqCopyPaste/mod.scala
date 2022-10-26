package typings.nkzqCopyPaste

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nkzq/copy-paste", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy[T](content: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(content.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def copy[T](content: T, callback: CopyCallback): T = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def paste(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")().asInstanceOf[String]
  inline def paste(callback: PasteCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("paste")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CopyCallback = js.Function1[/* err */ js.Error, Unit]
  
  type PasteCallback = js.Function2[/* err */ js.Error, /* content */ String, Unit]
}
