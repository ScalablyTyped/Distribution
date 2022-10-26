package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFindConfigMod {
  
  @JSImport("next/dist/lib/find-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findConfig[T](directory: String, key: String): js.Promise[RecursivePartial[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfig")(directory.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecursivePartial[T] | Null]]
  inline def findConfig[T](directory: String, key: String, _returnFile: Boolean): js.Promise[RecursivePartial[T] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfig")(directory.asInstanceOf[js.Any], key.asInstanceOf[js.Any], _returnFile.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RecursivePartial[T] | Null]]
  
  inline def findConfigPath(dir: String, key: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigPath")(dir.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? next.next/dist/lib/find-config.RecursivePartial<T[P]>}
    }}}
    */
  @js.native
  trait RecursivePartial[T] extends StObject
}
