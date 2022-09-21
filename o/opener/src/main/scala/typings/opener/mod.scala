package typings.opener

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(args: String): ChildProcess = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def apply(args: String, options: js.Object): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def apply(args: String, options: js.Object, callback: Callback): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def apply(args: String, options: Unit, callback: Callback): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def apply(args: js.Array[String]): ChildProcess = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  inline def apply(args: js.Array[String], options: js.Object): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def apply(args: js.Array[String], options: js.Object, callback: Callback): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  inline def apply(args: js.Array[String], options: Unit, callback: Callback): ChildProcess = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[ChildProcess]
  
  @JSImport("opener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
}
