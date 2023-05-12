package typings.npmPacklist

import typings.ignoreWalk.mod.WalkerOptions
import typings.npmcliArborist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(tree: Node): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(tree: Node, options: Options): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply[T](tree: Node, options: Unit, callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def apply[T](tree: Node, options: Options, callback: js.Function1[/* result */ js.Array[String], T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].apply(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @JSImport("npm-packlist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with WalkerOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
}
